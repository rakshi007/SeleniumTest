package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.util.List;
import java.util.Arrays;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();
    private static List<String> excludedTests = Arrays.asList("TestName1", "TestName2"); // List of tests to exclude

    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/test-output/HtmlReport/extentReport.html";

            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            sparkReporter.config().setDocumentTitle("Automation Test Report");
            sparkReporter.config().setReportName("Selenium Test Report");
            sparkReporter.config().setTheme(Theme.STANDARD);

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("Tester", "Rakshith");
        }
        return extent;
    }

    public static ExtentTest createTest(String testName, String description) {
        // Skip creating test if the test name is in the exclusion list
        if (excludedTests.contains(testName)) {
            return null; // Skip this test and do not include it in the report
        }

        // Create and return the test if not excluded
        ExtentTest test = getInstance().createTest(testName, description);
        testThread.set(test);
        return test;
    }

    public static ExtentTest getTest() {
        return testThread.get();
    }

    public static void flush() {
        if (extent != null) {
            extent.flush();
            testThread.remove();  // Clean up the thread-local storage
        }
    }
}
