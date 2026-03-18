package strategy;

public class JsonReportStrategy implements ReportStrategy {
    @Override
    public void generateReport(String data) {
        System.out.println("El informe se ha generado en JSON");
    }
}
