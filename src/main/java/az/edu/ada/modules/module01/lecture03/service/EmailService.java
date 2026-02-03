package az.edu.ada.modules.module01.lecture03.service;

public class EmailService {

    public void sendReceipt(String email, String orderId, double total) {

        System.out.println("Sending email receipt to: " + email);
        System.out.println("Order: " + orderId);
        System.out.println("Total: " + total);
    }
}
