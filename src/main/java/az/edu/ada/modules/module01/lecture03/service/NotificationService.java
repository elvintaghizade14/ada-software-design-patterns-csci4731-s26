package az.edu.ada.modules.module01.lecture03.service;

import az.edu.ada.modules.module01.lecture03.model.Order;

public class NotificationService {
    public void sendEmailReceipt(Order order, double total) {
        System.out.println("Sending email to: " + order.getCustomerEmail());
        System.out.println("Subject: Your order #" + order.getId());
        System.out.println("Body: Total charged: " + total);
    }
}
