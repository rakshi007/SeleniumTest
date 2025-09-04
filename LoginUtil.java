package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.LoginPage1;

public class LoginUtil {

    public static void loginWithPopupHandling(WebDriver driver, String username, String password) throws InterruptedException {
        util.LoginPage1 loginPage = new util.LoginPage1(driver);
        ConfigReader configReader = new ConfigReader();
        String loginUrl = configReader.getAppUrl();
        driver.get(loginUrl);

        Thread.sleep(2000);
        loginPage.enterusername(username);
        Thread.sleep(1000);
        loginPage.enterpassword(password);
        Thread.sleep(1000);
        loginPage.loginbtn();
        Thread.sleep(2000);

        // Handle session timeout popup
        if (loginPage.isElementPresent(By.xpath("//h5[text()='Session Timed Out']"))) {
            loginPage.continuebtn();
            Thread.sleep(1000);

            // Handle "No Satellite Found" popup
            if (loginPage.isElementPresent(By.xpath("//div[contains(text(),'No Satellite Found')]"))) {
                loginPage.oksatellite();
                Thread.sleep(1000);
            }

            loginPage.UserIcon();
            Thread.sleep(1000);
            loginPage.stw();
            Thread.sleep(1000);
        }
    }
}
