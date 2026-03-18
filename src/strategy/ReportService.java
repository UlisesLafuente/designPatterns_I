package strategy;

public class ReportService {
    private ReportStrategy strategy;

    public ReportService(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public void generate(String data) {
        strategy.generateReport(data);
    }
}
