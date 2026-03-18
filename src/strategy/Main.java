package strategy;

public class Main {
    public static void main(String[] args) {

        //sencilla demostración patrón strategy
        ReportService newReportService = new ReportService(new CsvReportStrategy());
        newReportService.generate("a");
    }
}
