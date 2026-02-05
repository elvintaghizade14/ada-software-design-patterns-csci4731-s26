package az.edu.ada.modules.module01.lecture03;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("PayPal for: " + amount);
    }
}

