package az.edu.ada.modules.module02.lesson14;

public class ObserverApp {

    public static void main(String[] args) {
        OrderServiceV2 amazonCheckout = new OrderServiceV2();

        // Register the listeners
        amazonCheckout.subscribe(new OrderObserver.EmailService());
        amazonCheckout.subscribe(new OrderObserver.InventorySystem());
        amazonCheckout.subscribe(new OrderObserver.LoyaltyService());

        // amazonCheckout.subscribe(new ShippingDepartment());

        // The Event happens
        amazonCheckout.placeOrder(new Order("MacBook Pro", "elvin@ada.edu.az", "order-123"));
    }
}
