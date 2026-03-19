package az.edu.ada.modules.module02.lesson14;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceV2 {

    // The Megaphone List
    private final List<OrderObserver> observers = new ArrayList<>();

    public void subscribe(OrderObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(OrderObserver observer) {
        observers.remove(observer);
    }

    public void placeOrder(Order order) {
        System.out.println("\n--- Order Processed in Database ---");

        // Notify everyone who is listening!
        for (OrderObserver obs : observers) {
            obs.onOrderPlaced(order);
        }
    }
}
