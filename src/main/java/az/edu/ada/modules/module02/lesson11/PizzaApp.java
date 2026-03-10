package az.edu.ada.modules.module02.lesson11;

import static az.edu.ada.modules.module02.lesson11.ToppingContainer.Cheese;
import static az.edu.ada.modules.module02.lesson11.ToppingContainer.Pepperoni;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PizzaApp {

    public static void main(String[] args) {
        Pizza myOrder =
                new Cheese(
                        new Pepperoni(
                                new Pepperoni(
                                        new Cheese(
                                                new DefaultPizza()
                                        )
                                )
                        )
                );

        System.out.println("Description: " + myOrder.getDescription());
        System.out.println("Total: $" + myOrder.getCost());

//        File abc = new File("abc");
//        FileInputStream fileInputStream = new FileInputStream(abc);
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//        new ObjectInputStream(
//                new BufferedInputStream(
//                        new FileInputStream(
//                                new File()
//                        )
//                )
//        )
    }

    public static void mainv2(String[] args) {
        System.out.print(0.2 + 0.2 + 0.2);
    }
}
