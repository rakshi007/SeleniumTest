package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.UIActions;

public class LoginPage {
	UIActions actions;

	private WebDriver driver;
	private WebDriverWait wait;
	//
	private By patch = By.xpath("//button[text()='Yes'] ");
	private By usernamefield = By.id("username");
	private By passwordfield = By.id("password");
	private By Loginbtn = By.xpath("//button[text()=' Login ']");
	private By continuebtn = By.xpath("//button[text()=' Continue ']");
	private By oksatellite = By.xpath("//button[text()=' OK ']");
	private By UserIcon = By.xpath("(//img)[27]");
	private By STA = By.xpath("//div[text()='Switch to Hub/Admin']");

	public LoginPage(WebDriver driver) {
	 this.driver =  driver;
	 this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.actions = new UIActions(driver);

	}




	  public boolean isElementPresent(By locator) {
	        try {
	            driver.findElement(locator);
	            return true; // Element found
	        } catch (NoSuchElementException e) {
	            return false; // Element not found
	        }
	    }
	public void patch()
	{
		driver.findElement(patch).click();
	}

	public void enterusername(String username)
	{
		driver.findElement(usernamefield).sendKeys(username);
	}

	public void enterpassword(String password) {
			driver.findElement(passwordfield).sendKeys(password);
	}

	public void loginbtn() {

		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(Loginbtn));
		login.click();


}
	public void oksatellite() {

		actions.waitForVisibility(oksatellite);
		actions.jsClick(oksatellite);

}

	public void continuebtn() {
		WebElement conbtn = wait.until(ExpectedConditions.elementToBeClickable(continuebtn));
		conbtn.click();
}







	public void UserIcon() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		   // Wait for the loader to disappear


		   // Scroll into view and click the element
		   WebElement element = driver.findElement(By.xpath("(//img)[27]"));
		   JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		    jsExecutor.executeScript("arguments[0].click();", element);
		}




	public void stw() throws InterruptedException {

		WebElement swt = wait.until(ExpectedConditions.elementToBeClickable(STA));
		swt.click();
}


}




