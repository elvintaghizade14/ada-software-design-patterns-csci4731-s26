package az.edu.ada.modules.module01.lecture03.payment;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Please pay cash at counter: " + amount);
    }
}
