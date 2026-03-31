package az.edu.ada.modules.module02.lesson15;

public class RemoteControl {

    private SmartTV tv;
    private SmartLights lights;

    public void pressButtonA() { tv.turnOn(); }
    public void undoButtonA() { tv.turnOff(); }
    public void pressButtonB() { lights.dim(); }
}
