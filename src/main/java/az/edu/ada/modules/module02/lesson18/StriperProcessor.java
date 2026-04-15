package az.edu.ada.modules.module02.lesson18;

public class StriperProcessor implements PaymentProcessor {

    @Override
    public void processPayment() {
        System.out.println("StriperProcessor processPayment");
    }
}
