package az.edu.ada.modules.module02.lecture05;

public class Connection {

    private static volatile Connection INSTANCE;

    private Connection() {
        throw new IllegalStateException("Cannot instantiate");
    }

    public static Connection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Connection();
        }
        return INSTANCE;
    }

    public static synchronized Connection getInstanceV2() {
        if (INSTANCE == null) {
            INSTANCE = new Connection();
        }
        return INSTANCE;
    }

    public static Connection getInstanceV3() {
        if (INSTANCE == null) {
            synchronized (Connection.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Connection();
                }
            }
        }
        return INSTANCE;
    }
}
