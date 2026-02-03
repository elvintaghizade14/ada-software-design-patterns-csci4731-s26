package az.edu.ada.modules.module01.lecture03.service;

import az.edu.ada.modules.module01.lecture03.model.Order;

public class OrderCalculator {

    public double calculate(Order order) {

        double total = order.getItems()
                .stream()
                .mapToDouble(item -> item.getPrice())
                .sum();

        if ("VIP".equals(order.getCustomerType())) {
            total *= 0.9;
        }

        System.out.println("Order total calculated: " + total);

        return total;
    }
}
