package az.edu.ada.modules.module02.lecture06;

public class AirLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
