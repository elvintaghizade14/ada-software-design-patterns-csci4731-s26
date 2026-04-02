package az.edu.ada.modules.module02.lesson16;

public abstract class GeneratorV2 {

    public final void generateReport() {
        connectToDatabase();
        runSqlQuery();
        formatData();
        closeConnection();
    }

    // Shared Concrete Methods (Eliminates duplication)
    private void connectToDatabase() {
        System.out.println("Connecting to Database...");
    }

    private void runSqlQuery() {
        System.out.println("Running SQL Query...");
    }

    private void closeConnection() {
        System.out.println("Closing Database Connection...");
    }

    // Abstract Method (Forces subclasses to implement their specific behavior)
    protected abstract void formatData();

    public class PdfReportGenerator extends GeneratorV2 {
        @Override
        protected void formatData() {
            System.out.println("Formatting data as PDF...");
        }
    }

    public class ExcelReportGenerator extends GeneratorV2 {
        @Override
        protected void formatData() {
            System.out.println("Formatting data as Excel...");
        }
    }
}
