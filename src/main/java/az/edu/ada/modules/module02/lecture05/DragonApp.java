package az.edu.ada.modules.module02.lecture05;

public class DragonApp {

    public static void main(String[] args) throws InterruptedException {

        Dragon yellowToyuq = new Dragon("Toyuq?", "yellow");
        for (int i = 0; i < 100; i++) {
            yellowToyuq.clone();
            System.out.println(yellowToyuq);
        }
    }
}
