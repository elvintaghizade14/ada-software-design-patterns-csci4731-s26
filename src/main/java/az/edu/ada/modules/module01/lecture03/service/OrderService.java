package az.edu.ada.modules.module01.lecture03.service;


import az.edu.ada.modules.module01.lecture03.PaymentProcessor;
import az.edu.ada.modules.module01.lecture03.model.Item;
import az.edu.ada.modules.module01.lecture03.model.Order;
import az.edu.ada.modules.module01.lecture03.repository.OrderRepository;

import java.util.Map;

public class OrderService {
    private final Map<String, PaymentProcessor> paymentMethods;
    private final DiscountService discountService;
    private final OrderRepository repository;
    private final NotificationService notificationService;

    public OrderService(Map<String, PaymentProcessor> paymentMethods,
                        DiscountService discountService,
                        OrderRepository repository,
                        NotificationService notificationService) {
        this.paymentMethods = paymentMethods;
        this.discountService = discountService;
        this.repository = repository;
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        double total = order.getItems().stream()
                .mapToDouble(Item::getPrice)
                .sum();
        total = discountService.applyDiscount(order.getCustomerType(), total);

        PaymentProcessor processor = paymentMethods.get(order.getPaymentType().name());
        if (processor == null) {
            throw new IllegalArgumentException("Unsupported payment: " + order.getPaymentType());
        }
        processor.process(total);

        repository.save(order);

        notificationService.sendEmailReceipt(order, total);
    }
}
