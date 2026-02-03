package az.edu.ada.modules.module01.lecture03.service;

import az.edu.ada.modules.module01.lecture03.model.Order;
import az.edu.ada.modules.module01.lecture03.payment.PaymentStrategy;
import az.edu.ada.modules.module01.lecture03.repository.OrderRepository;

public class OrderService {

    private final OrderCalculator calculator;
    private final PaymentStrategy payment;
    private final OrderRepository repository;
    private final EmailService emailService;

    public OrderService(OrderCalculator calculator,
                        PaymentStrategy payment,
                        OrderRepository repository,
                        EmailService emailService) {
        this.calculator = calculator;
        this.payment = payment;
        this.repository = repository;
        this.emailService = emailService;
    }

    public void process(Order order) {

        double total = calculator.calculate(order);

        payment.pay(total);

        repository.save(order);

        emailService.sendReceipt(order.getCustomerEmail(),
                order.getId(),
                total);
    }
}
