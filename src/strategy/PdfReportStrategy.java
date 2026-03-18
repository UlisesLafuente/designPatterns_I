package strategy;

public class PdfReportStrategy implements ReportStrategy {
    @Override
    public void generateReport(String data) {
        System.out.println("El informe se ha generado en PDF");
    }
}
