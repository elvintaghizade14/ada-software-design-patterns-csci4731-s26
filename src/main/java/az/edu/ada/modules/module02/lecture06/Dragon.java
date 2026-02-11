package az.edu.ada.modules.module02.lecture06;

import java.util.ArrayList;
import java.util.List;

public class Dragon implements Cloneable {

    private final String name;
    private final String color;
    private final String texture;
    private final String sound;
    private List<String> treasureChest;

    public Dragon(String name, String color, List<String> treasureChest) throws InterruptedException {
        this.name = name;
        this.color = color;
        this.treasureChest = treasureChest;
        this.texture = loadTexture();
        this.sound = loadSound();
    }

    private Dragon(String name, String color, String texture, String sound, List<String> treasureChest) {
        this.name = name;
        this.color = color;
        this.texture = texture;
        this.sound = sound;
        this.treasureChest = treasureChest;
    }

    private String loadTexture() throws InterruptedException {
        System.out.println("Loading texture... I/O operation here");
        Thread.sleep(2000);
        return "Texture";
    }

    private String loadSound() throws InterruptedException {
        System.out.println("Loading sound... I/O operation here");
        Thread.sleep(3000);
        return "Sound";
    }

    public Dragon clone() throws CloneNotSupportedException {
        return (Dragon) super.clone();
        // return new Dragon(this.name, this.color, this.texture, this.sound, this.treasureChest);
    }

    public Dragon cloneV2() {
        try {
            Dragon clone = (Dragon) super.clone();
            clone.treasureChest = new ArrayList<>(this.treasureChest);

            return clone;
        } catch (CloneNotSupportedException e) { return null; }
    }

    @Override
    public String toString() {
        return "Dragon{name='%s', color='%s', texture='%s', sound='%s', treasureChest=%s}"
                .formatted(name, color, texture, sound, treasureChest);
    }

    public List<String> getTreasureChest() {
        return treasureChest;
    }
}
