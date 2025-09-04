package util;

import com.aventstack.extentreports.ExtentTest;
import java.io.IOException;
import java.util.logging.*;

public class LoggerUtil {

    private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());
    private static final String LOG_FILE_PATH = "logs/automation-log.log";
     static ExtentTest extentTest;

    static {
        try {
            java.nio.file.Files.createDirectories(java.nio.file.Paths.get("logs"));

            logger.setLevel(Level.ALL);
            logger.setUseParentHandlers(false);

            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            consoleHandler.setFormatter(new SimpleFormatter());

            FileHandler fileHandler = new FileHandler(LOG_FILE_PATH, true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());

            logger.addHandler(consoleHandler);
            logger.addHandler(fileHandler);

        } catch (IOException e) {
            System.err.println("Logger initialization failed: " + e.getMessage());
        }
    }

    // Setter for ExtentTest
    public static void setExtentTest(ExtentTest test) {
        extentTest = test;
    }

    public static void logPass(String message) {
        String formatted = "✅ PASS: " + message;
        System.out.println(formatted);
        logger.info(formatted);
        if (extentTest != null) extentTest.pass(message);
    }

    public static void logFail(String message, Exception e) {
        String formatted = "❌ FAIL: " + message;
        System.err.println(formatted);
        e.printStackTrace();
        logger.severe(formatted + " | Exception: " + e.getMessage());
        if (extentTest != null) extentTest.fail(message + " | Exception: " + e.getMessage());
    }

    public static void info(String message) {
        String formatted = "ℹ️ INFO: " + message;
        System.out.println(formatted);
        logger.info(formatted);
        if (extentTest != null) extentTest.info(message);
    }

    public static void warning(String message) {
        String formatted = "⚠️ WARNING: " + message;
        System.out.println(formatted);
        logger.warning(formatted);
        if (extentTest != null) extentTest.warning(message);
    }

    public static void error(String message) {
        String formatted = "🔴 ERROR: " + message;
        System.err.println(formatted);
        logger.severe(formatted);
        if (extentTest != null) extentTest.fail(message);
    }
}
