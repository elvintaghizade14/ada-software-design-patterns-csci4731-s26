package az.edu.ada.modules.module02.lesson16;

public class Generator {

    public static class PdfReportGenerator {
        public void generateReport() {
            System.out.println("Connecting to Database...");
            System.out.println("Running SQL Query...");
            System.out.println("Formatting data as PDF...");
            System.out.println("Closing Database Connection...");
        }
    }

    public static class ExcelReportGenerator {
        public void generateReport() {
            System.out.println("Connecting to Database...");
            System.out.println("Running SQL Query...");
            System.out.println("Formatting data as Excel...");
            System.out.println("Closing Database Connection...");
        }
    }
}
