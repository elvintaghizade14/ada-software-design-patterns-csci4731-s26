package az.edu.ada.modules.module02.lecture05;

public class Dragon {

    private final String name;
    private final String color;
    private final String texture;
    private final String sound;

    public Dragon(String name, String color) throws InterruptedException {
        this.name = name;
        this.color = color;
        this.texture = loadTexture();
        this.sound = loadSound();
    }

    private Dragon(String name, String color, String texture, String sound) {
        this.name = name;
        this.color = color;
        this.texture = texture;
        this.sound = sound;
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

    public Dragon clone() {
        return new Dragon(this.name, this.color, this.texture, this.sound);
    }

    @Override
    public String toString() {
        return "Dragon{name='%s', color='%s', texture='%s', sound='%s'}"
                .formatted(name, color, texture, sound);
    }
}
