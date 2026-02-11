package az.edu.ada.modules.module02.lecture06;

 public class RoadLogistics extends Logistics {
     @Override
     public Transport createTransport() {
         return new Truck();
     }
 }

