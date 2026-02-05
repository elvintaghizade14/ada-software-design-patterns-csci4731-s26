package az.edu.ada.modules.module02.lecture05;

public class Connection {

    private Connection() {
        throw new IllegalStateException("Cannot Instantiate");
    }

//    public static Connection getInstance()
//    {
//        if (instance == null) {
//            synchronized (Connection.class) {
//                if (instance == null) {
//                    instance = new Connection();
//                }
//            }
//        }
//        return instance;
//    }
    private static class Holder {
        private static final Connection INSTANCE = new Connection();
    }
    public static Connection getInstance() {
        return Holder.INSTANCE;
    }

    // go to documentation and class loading, how java works deals with object creation
    // go to atomicity and thread safety in java because in atomicity we will see how to make it thread safe



}
