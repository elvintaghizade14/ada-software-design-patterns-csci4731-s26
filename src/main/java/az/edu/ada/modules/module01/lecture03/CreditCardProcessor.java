package az.edu.ada.modules.module01.lecture03;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void process(double amount) {
        System.out.println("Credit Card for: " + amount);
    }
}
