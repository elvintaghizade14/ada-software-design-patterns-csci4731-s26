package az.edu.ada.modules.module02.lecture04;

public class LibraryApp {

    public void saveBook() {
        DBConnection connection = DBConnection.getInstance();

        // fetch from db
        System.out.println("Fetching book...");

        // process
        System.out.println("Processing...");

        // save
        System.out.println("Saving...");
    }

    public static void main(String[] args) {

        DBConnection connection1 = DBConnection.getInstance();

        connection1 = null; // doesn't destroy singleton

        System.out.println("Did some work");

        DBConnection connection2 = DBConnection.getInstance();

        System.out.println("Did more work");
    }
}
