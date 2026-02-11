package az.edu.ada.modules.module02.lecture06;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by Ship");
    }
}
