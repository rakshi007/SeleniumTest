package util;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class StepHelper {

    private ExtentTest test;

    // Constructor to set the ExtentTest
    public StepHelper(ExtentTest test) {
        if (test == null) {
            throw new IllegalArgumentException("ExtentTest cannot be null");
        }
        this.test = test;
    }

    // Generic method to run any step with exception handling
    public void executeStep(String description, Runnable step) {
        if (test == null) {
            throw new IllegalStateException("ExtentTest is not initialized");
        }

        try {
            test.log(Status.INFO, "Starting step: " + description);
            step.run();  // Execute the actual step
            test.log(Status.PASS, "Step passed: " + description);
        } catch (Exception e) {
            test.log(Status.FAIL, "Step failed: " + description + ". Exception: " + e.getMessage());
            throw new RuntimeException("Step execution failed", e); // Rethrow to fail the test
        }
    }
}
