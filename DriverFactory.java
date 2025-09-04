package DriverFactory;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public static WebDriver initDriver(String browser, ChromeOptions options) {
        if (browser == null) {
            System.out.println("Browser value is null. Please provide a valid browser name.");
            return null;
        }

        browser = browser.toLowerCase(); // Normalize input
        System.out.println("Browser value is: " + browser);

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();

                ChromeOptions chromeOptions = new ChromeOptions();

                Map<String, Object> prefs = new HashMap<>();
                prefs.put("credentials_enable_service", false);
                prefs.put("profile.password_manager_enabled", false);
                options.setExperimentalOption("prefs", prefs);

                chromeOptions.addArguments("--force-device-scale-factor=0.8");
                chromeOptions.addArguments("--start-maximized");

                ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
                tlDriver.set(chromeDriver);
                break;


            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                tlDriver.set(new FirefoxDriver());
                break;

            case "safari":
                tlDriver.set(new SafariDriver());
                break;

            default:
                System.out.println("Invalid browser name: " + browser);
                return null;
        }

        WebDriver driver = getDriver();
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        }

        return driver;
    }

    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }
}
