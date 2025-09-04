package stepdefinitions;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import util.ConfigReader;

public class loginsteps {

	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	 ConfigReader configReader = new ConfigReader();

	@Given("when user is on login page")
	public void when_user_is_on_login_page() {
		
	}
	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginpage.enterusername(username);
	}
	@When("users enters password {string}")
	public void users_enters_password(String password) {
		loginpage.enterpassword(password);
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
		loginpage.loginbtn();
	}
	@Then("user click on continue button")
	public void user_click_on_continue_button() {
		loginpage.continuebtn();
	}
	@Then("user click on user icon")
	public void user_click_on_user_icon() {
		loginpage.UserIcon();
	}
	@Then("user click on switch to hub")
	public void user_click_on_switch_to_hub() throws InterruptedException {
		loginpage.stw();
	}



	
	
}
