package az.edu.ada.modules.module02.lesson15;

public interface Command {

    void execute();
    void undo();

    class TurnOnLightCommand implements Command {

        private final SmartLight light;

        public TurnOnLightCommand(SmartLight light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.turnOn();
        }

        @Override
        public void undo() {
            light.turnOf();
        }
    }

}
