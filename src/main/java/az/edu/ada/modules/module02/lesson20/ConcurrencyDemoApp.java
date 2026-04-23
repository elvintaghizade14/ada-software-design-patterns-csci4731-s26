package az.edu.ada.modules.module02.lesson20;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class ConcurrencyDemoApp {

    // demo #1: Synchronous (Blocking)
    public String orderCoffee() {
        System.out.println("1. Order placed.");

        // THE BOTTLENECK: The main thread freezes right here for 5 seconds.
        Coffee coffee = database.fetchCoffee();
        Thread.sleep(5000);

        System.out.println("2. Coffee received.");
        return coffee.serve();
    }

    // demo #2: Asynchronous (Non-Blocking)
    public CompletableFuture<String> orderCoffeeAsync() {
        System.out.println("1. Order placed.");

        // The main thread instantly moves to the next line of code.
        // A background thread takes over the brewing.
        CompletableFuture<String> futureCoffee = CompletableFuture.supplyAsync(() -> {
            Coffee coffee = database.fetchCoffee();
            return coffee.serve();
        });

        System.out.println("2. I am reading a book while I wait!");
        return futureCoffee;
    }

    // demo #3: Reactive (Streams + Backpressure)
    public Flux<Coffee> streamUnlimitedCoffee() {
        // Returning a 'Flux' means an ongoing stream of 0 to N items.
        return coffeeRepository.findAll()
                // Sends a new coffee every 1 second continuously.
                .delayElements(Duration.ofSeconds(1))
                // If the client's memory fills up, Spring stops pulling from the DB.
                .onBackpressureDrop();
    }

    // demo #4: Concurrent (Java 21 Virtual Threads)
    public void serveMassiveCrowd() {
        // Java 21 Magic: These threads are "virtual", meaning they are practically free.
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < 10000; i++) {
                // We submit 10,000 tasks. The JVM juggles them concurrently.
                executor.submit(() -> brewCoffee());
            }

        } // The executor waits here until all 10,000 virtual threads finish.
    }

    // demo #5: Parallel (Simultaneous Hardware Execution)
    public void brewAllOrdersAtOnce(List<Order> morningRushOrders) {

        // .parallelStream() splits the list into chunks.
        // Core 1 processes the first half, Core 2 processes the second half simultaneously.
        morningRushOrders.parallelStream().forEach(order -> {
            brew(order);
        });

    }

    // demo Bonus: The synchronized Keyword (Thread Safety)
    private int beansInStock = 1;
    // The lock on the bathroom door. Only one thread can enter at a time.
    public synchronized void takeBeans() {
        if (beansInStock > 0) {
            System.out.println("Taking beans!");
            beansInStock--;
        } else {
            System.out.println("Out of stock!");
        }
    }
}
