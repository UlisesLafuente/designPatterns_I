package strategy;

public class HtmlReportStrategy implements ReportStrategy {
    @Override
    public void generateReport(String data) {
        System.out.println("El informe se ha generado en HTML");
    }
}
