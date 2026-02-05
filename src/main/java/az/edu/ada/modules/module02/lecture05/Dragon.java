package az.edu.ada.modules.module02.lecture05;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dragon {
    private String name;
    private int age;
    private String color;


    public void loadFromDisk() {
        System.out.println("Loading dragon from disk");
    }

    public void saveToDisk() {
        System.out.println("Saving dragon to disk");
    }

}
