package strategy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ReportServiceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testCsvStrategy() {
        ReportService service = new ReportService(new CsvReportStrategy());
        service.generate("test data");
        assertTrue(outContent.toString().contains("CSV"));
    }

    @Test
    void testJsonStrategy() {
        ReportService service = new ReportService(new JsonReportStrategy());
        service.generate("test data");
        assertTrue(outContent.toString().contains("JSON"));
    }

    @Test
    void testXmlStrategy() {
        ReportService service = new ReportService(new XmlReportStrategy());
        service.generate("test data");
        assertTrue(outContent.toString().contains("XML"));
    }

    @Test
    void testPdfStrategy() {
        ReportService service = new ReportService(new PdfReportStrategy());
        service.generate("test data");
        assertTrue(outContent.toString().contains("PDF"));
    }

    @Test
    void testHtmlStrategy() {
        ReportService service = new ReportService(new HtmlReportStrategy());
        service.generate("test data");
        assertTrue(outContent.toString().contains("HTML"));
    }

    @Test
    void testExcelStrategy() {
        ReportService service = new ReportService(new ExcelReportStrategy());
        service.generate("test data");
        assertTrue(outContent.toString().contains("Excel"));
    }

    @Test
    void testWordStrategy() {
        ReportService service = new ReportService(new WordReportStrategy());
        service.generate("test data");
        assertTrue(outContent.toString().contains("Word"));
    }

    @Test
    void testServiceWithDifferentStrategies() {
        ReportService service = new ReportService(new CsvReportStrategy());
        
        outContent.reset();
        service.generate("data1");
        assertTrue(outContent.toString().contains("CSV"));
        
        service.setStrategy(new JsonReportStrategy());
        outContent.reset();
        service.generate("data2");
        assertTrue(outContent.toString().contains("JSON"));
        
        service.setStrategy(new PdfReportStrategy());
        outContent.reset();
        service.generate("data3");
        assertTrue(outContent.toString().contains("PDF"));
    }
}
