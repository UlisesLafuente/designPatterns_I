package strategy;

public class WordReportStrategy implements ReportStrategy {
    @Override
    public void generateReport(String data) {
        System.out.println("El informe se ha generado en Word");
    }
}
