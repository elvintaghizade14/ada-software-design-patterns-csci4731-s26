package az.edu.ada.modules.module02.lecture06;

public class FastCargoApp {
//    public void deliver(String[] args) {
//
//        //...
//
//        Truck truck = new Truck();
//
//        //...
//
//        Truck truck1 = new Truck();
//
//        // N = 100
//        //...
//
//        String type = "SEA";
//        if (type.equals("SEA")) {
//            // new Ship();
//        } else if (type.equals("TRUCK")) {
//            // new Truck();
//        }
//    }
public static void main(String[] args) {
    Logistics logistics = new AirLogistics();

    System.out.println("App: Launched with Air Logistics.");
    logistics.planDelivery();
}

}
