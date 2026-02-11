package az.edu.ada.modules.module01.lecture03.service;

import az.edu.ada.modules.module01.lecture03.model.enums.CustomerType;

public class DiscountService {
    public double applyDiscount(CustomerType customerType, double total) {
        if (CustomerType.VIP.equals(customerType)) {
            return total * 0.9;
        } else {
            return total;
        }
    }
}
