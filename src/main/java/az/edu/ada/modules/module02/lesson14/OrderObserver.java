package az.edu.ada.modules.module02.lesson14;

public interface OrderObserver {

    void onOrderPlaced(Order order); // The "Push" model

    class EmailService implements OrderObserver {
        public void onOrderPlaced(Order order) {
            System.out.println("Sending receipt to " + order.customerEmail());
        }
    }

    class InventorySystem implements OrderObserver {
        public void onOrderPlaced(Order order) {
            System.out.println("Deducting items from warehouse...");
        }
    }

    class LoyaltyService implements OrderObserver {
        public void onOrderPlaced(Order order) {
            System.out.println("Bonus calculated...");
        }
    }

}
