package az.edu.ada.modules.module01.lecture03.payment;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Redirecting to PayPal: " + amount);
    }
}
