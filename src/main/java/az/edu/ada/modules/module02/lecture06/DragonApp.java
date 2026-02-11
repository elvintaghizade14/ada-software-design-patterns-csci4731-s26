package az.edu.ada.modules.module02.lecture06;

import java.util.ArrayList;
import java.util.Arrays;

public class DragonApp {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Dragon blackDragon = new Dragon("dragon #1", "black", new ArrayList<>(Arrays.asList("1", "2")));

        Dragon blackDragon2 = blackDragon.cloneV2();

        System.out.println(blackDragon);
        System.out.println(blackDragon2);

        System.out.println(blackDragon == blackDragon2);
        System.out.println(blackDragon.equals(blackDragon2));

        System.out.println(blackDragon.getTreasureChest() == blackDragon2.getTreasureChest());
        System.out.println(blackDragon.getTreasureChest().equals(blackDragon2.getTreasureChest()));

        blackDragon2.getTreasureChest().add("#12345");
        System.out.println(blackDragon);
        System.out.println(blackDragon2);
    }
}
