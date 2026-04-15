package az.edu.ada.modules.module02.lesson18;

public class CheckoutServiceV2 {

    private final PaymentProcessor paymentProcessor;

    public CheckoutServiceV2(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder() {
        // validate order, etc.
        // bla bla bla
        paymentProcessor.processPayment();
    }
}
