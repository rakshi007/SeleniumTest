package stepdefinitions;

import DriverFactory.DriverFactory;
import Hooks.LoginUtil;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import pages.MultiNotePage;
import util.ConfigReader;
import util.ExtentReportManager;

import java.util.Properties;

public class MultipleNote {

    private MultiNotePage tc = new MultiNotePage(DriverFactory.getDriver());
    ConfigReader configReader = new ConfigReader();
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();

    @Given("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String usernameKey, String passwordKey) {
        Properties prop = configReader.init_prop();

        String username = prop.getProperty(usernameKey);
        String password = prop.getProperty(passwordKey);

        // Avoid switching hub for Roja user
        boolean shouldSwitchHub = !username.equalsIgnoreCase("roja");

        System.out.println("Logging in with: " + username + " (SwitchHub: " + shouldSwitchHub + ")");
        LoginUtil.loginAs(username, password, shouldSwitchHub);
    }

    @Given("user performs {string} for Subgroupdata01")
    public void user_performs_for_subgroupdata01(String action) {
        if (action.equalsIgnoreCase("add note")) {
            tc.edit01();
        } else if (action.equalsIgnoreCase("edit note")) {

        } else {
            throw new IllegalArgumentException("Unsupported action: " + action);
        }
    }

    @Given("user performs {string} for Subgroupdata02")
    public void user_performs_for_subgroupdata02(String action) {
        if (action.equalsIgnoreCase("add note")) {
            tc.edit02();
        } else if (action.equalsIgnoreCase("edit note")) {

        } else {
            throw new IllegalArgumentException("Unsupported action: " + action);
        }
    }

    @Given("user performs {string} for Subgroupdata03")
    public void user_performs_for_subgroupdata03(String action) {
        if (action.equalsIgnoreCase("add note")) {
            tc.edit01();
        } else if (action.equalsIgnoreCase("edit note")) {
           tc.edit03();
        } else {
            throw new IllegalArgumentException("Unsupported action: " + action);
        }
    }
}
