package az.edu.ada.modules.module01.lecture03.payment;

public class ApplePayPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing Apple Pay: " + amount);
    }
}
