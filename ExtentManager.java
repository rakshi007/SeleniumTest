package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentReports getExtent() {
        if (extent == null) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
            spark.config().setReportName("Automation Test Report");
            spark.config().setDocumentTitle("Test Execution Report");
            extent.attachReporter(spark);
        }
        return extent;
    }

    public static ExtentTest createTest(String testName) {
        ExtentTest t = getExtent().createTest(testName);
        test.set(t);
        return t;
    }

    public static ExtentTest getTest() {
        return test.get();
    }
}

