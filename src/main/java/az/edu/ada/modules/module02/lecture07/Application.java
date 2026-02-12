package az.edu.ada.modules.module02.lecture07;

import az.edu.ada.modules.module02.lecture07.Element.Button;
import az.edu.ada.modules.module02.lecture07.Element.Checkbox;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
