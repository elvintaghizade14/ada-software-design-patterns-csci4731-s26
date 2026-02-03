package az.edu.ada.modules.module01.lecture03;

import java.util.Arrays;

import az.edu.ada.modules.module01.lecture03.model.*;
import az.edu.ada.modules.module01.lecture03.payment.*;
import az.edu.ada.modules.module01.lecture03.repository.OrderRepository;
import az.edu.ada.modules.module01.lecture03.service.*;

public class Main {

    public static void main(String[] args) {

        Item mouse = new Item("Logitech Mouse", 50);
        Item keyboard = new Item("Keyboard", 150);

        Order order = new Order(
                "ORD-2026-001",
                Arrays.asList(mouse, keyboard),
                "VIP",
                "student@ada.edu.az"
        );

        OrderCalculator calculator = new OrderCalculator();
        PaymentStrategy payment = new PayPalPayment();
        OrderRepository repository = new OrderRepository();
        EmailService email = new EmailService();

        OrderService service =
                new OrderService(calculator, payment, repository, email);

        service.process(order);
    }
}
