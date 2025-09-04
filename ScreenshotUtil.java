package util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String screenshotName) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";

        try {
            Files.copy(screenshot.toPath(), new File(screenshotPath).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return screenshotPath;
    }
}
