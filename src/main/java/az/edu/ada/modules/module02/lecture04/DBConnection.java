package az.edu.ada.modules.module02.lecture04;

public class DBConnection {

    private DBConnection() {
        System.out.println("Connected to the DB!");
    }

    // Bill Pugh Singleton
    private static class Holder {
        private static final DBConnection INSTANCE = new DBConnection();
    }

    public static DBConnection getInstance() {
        return Holder.INSTANCE;
    }
}
