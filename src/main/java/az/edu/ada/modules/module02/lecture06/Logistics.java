package az.edu.ada.modules.module02.lecture06;

public abstract class Logistics {

    public abstract Transport createTransport();

    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}
