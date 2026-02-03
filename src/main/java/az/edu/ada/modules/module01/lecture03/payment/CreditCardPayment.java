package az.edu.ada.modules.module01.lecture03.payment;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}
