package az.edu.ada.modules.module02.lesson15;

public class RemoteControlV2 {

    private final Command[] buttons = new Command[4];

    public void setCommand(int slot, Command c) {
        buttons[slot] = c;
    }

    public void pressButton(int slot) {
        if (buttons[slot] != null) {
            buttons[slot].execute();
        }
    }
}
