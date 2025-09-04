package stepdefinitions;


import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SequenceBYCP;
import util.ExcelReader;
import util.ExtentReportManager;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ByCharSequence {


    private SequenceBYCP tc = new SequenceBYCP(DriverFactory.getDriver());
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();


    @When("user creates sequence from excel \\{string} and sheet \\{string}")
    public void user_creates_sequence_from_excel_and_sheet() throws InterruptedException {
        tc.Sequence02();
        tc.Sequence03();
        tc.Sequence04();
        tc.Sequence05();
    }

    @Then("user enters actions for sequence{int}")
    public void userEntersActionsForSequence(int arg0) {
        tc.addSubgroups();

    }

    @Then("user enters actions for sequence{int} with carry forward")
    public void userEntersActionsForSequenceWithCarryForward(int arg0) {
        tc.addSubgroupsData();

    }

    @Then("user enters actions for sequence{int} with carry forward by characteristics")
    public void userEntersActionsForSequenceWithCarryForwardByCharacteristics(int arg0) throws InterruptedException {

        tc.addSubgroupsTally();
    }

    @Then("user enters actions for sequence{int} for chained sequence")
    public void userEntersActionsForSequenceForChainedSequence(int arg0) {
        tc.ChainSequence();
    }

    @Then("user enters actions for sequence{int} for para value to match")
    public void userEntersActionsForSequenceForParaValueToMatch(int arg0) {
      tc.ParaToMatch();

    }

    @When("user creates parts for bychar{int}")
    public void userCreatesPartsForBychar(int arg0) throws InterruptedException {
        tc.Partsecond();
    }
}