package stepdefinitions;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Datagroup;
import pages.LoginPage;
import util.ConfigReader;
import util.ExcelReader;

import java.util.List;
import java.util.Map;

public class datagroupsteps {
	private Datagroup datagroup = new Datagroup(DriverFactory.getDriver());
	 ConfigReader configReader = new ConfigReader();

	@Given("when user is on home page")
	public void when_user_is_on_home_page() {
	   
	}

	@When("user click on add link")
	public void user_click_on_add_link() {
		datagroup.addnew();
	}

	@When("users click on add data group")
	public void users_click_on_add_data_group() {
		datagroup.clickaddgrp();
	}

	@When("users enter data group name")
	public void users_enter_data_group_name() {
		List<Map<String, String>> data = ExcelReader.readExcelData("Test.xlsx", "DataGroup");
		String groupName = data.get(0).get("Datagroup");
		datagroup.entergrpnameFromExcel(groupName);
	}


	@Then("user click on add button")
	public void user_click_on_add_button() {
	    datagroup.clickaddbtn();
	}

}
