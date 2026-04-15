package az.edu.ada.modules.module02.lesson18;

public class CheckoutApp {

    public static void main(String[] args) {


        PaymentProcessor striperProcessor = new StriperProcessor();
        CheckoutServiceV2 checkoutServiceV2 = new CheckoutServiceV2(striperProcessor);
        checkoutServiceV2.processOrder();
    }
}
