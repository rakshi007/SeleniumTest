package pages;

import Locators.AdminLocators;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.CustomDropdownUtils;
import util.ExcelReader;
import util.ExtentReportManager;
import util.UIActions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class SequenceBYCP {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private final AdminLocators loc;// for admin-related locators

    private Map<String, String> testData;
    UIActions actions;

    private ExtentTest test;

    {
        // Initialize a new test
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();

    public SequenceBYCP(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.actions = new UIActions(driver);
        new CustomDropdownUtils(driver);

        this.loc = new AdminLocators();

    }


    public void createDataGroup(String dataGroup) throws InterruptedException {


        actions.strongClick(loc.AddIcon);
        actions.clickAndWait(loc.DataGroup_AddButton, "User clicked Add Data Group");
        actions.clearAndType(loc.DataGroup_NameInput, dataGroup, "Entered Data Group");
        actions.clickAndWait(loc.DataGroup_SaveButton, "Saved Data Group");

    }

    public void createPart(String dataGroup, String partName) {
        String groupName = "Engine Assembly";
        actions.strongClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "User clicked Add Part");
        actions.clickAndWait(loc.DataGroup_Dropdown, "Clicked Data Group Dropdown");
        actions.clickAndWait(loc.getDataGroupByName(groupName), "Selected Data Group");
        actions.clearAndType(loc.Part_NameInput, partName, "Entered Part Name");
        actions.clickAndWait(loc.Part_SaveButton, "Saved Part");
    }

    public void createCharacteristic(String charName) throws InterruptedException {
        actions.clearAndType(loc.AddChar_NameInput, charName, "Entered Characteristic");
        actions.clickAndWait(loc.Char_AddButton, "Added Characteristic");

        actions.clearAndType(loc.upperSpecInput, "10", "Entered Upper Spec");
        actions.clearAndType(loc.lowerSpecInput, "5", "Entered Lower Spec");
        actions.clearAndType(loc.subgroupSizeInput, "1", "Entered Subgroup Size");
        actions.clickAndWait(loc.saveCharacteristicButton, "Saved Characteristic");
        Thread.sleep(1000);
        actions.clickAndWait(loc.CloseCharacteristicButton, "Closed Characteristic Dialog");
        // Get the actual name displayed in the UI (last created characteristic)
    }


    public void addDefect(int rowIndex) {


        String groupname = "Engine Assembly";
        String partname = "Engine block";

        List<Map<String, String>> testData = ExcelReader.readExcelData("Test.xlsx", "DataGroup");

        // Get the row by index
        Map<String, String> row = testData.get(rowIndex);

        String groupName = row.get("Datagroup");
        String partName = row.get("Partname");
        String charName = row.get("Charname");
        String defectNames = row.get("Defect Name"); // can be multiple: "Crack,Dent,Scratch"

        // ✅ Character creation part (run only once per row)
        actions.strongClick(loc.AddIcon);
        actions.clickAndWait(loc.Add_CharButton, "user clicked on save char button");
        actions.clickAndWait(loc.Char_DatGroupButton, "");
        actions.clickAndWait(loc.getDataGroupByName(groupname), "");
        actions.clickAndWait(loc.Part_Button, "");
        actions.clickAndWait(loc.getDataGroupByName(partname), "");
        actions.clearAndType(loc.AddChar_NameInput, charName, "");
        actions.clickAndWait(loc.CharType_Dropdown, "");
        actions.clickAndWait(loc.Attribute_Type, "");
        actions.clickAndWait(loc.Add_charButton, "");
        actions.clearAndType(loc.inspectionUnit, "100", "");
        actions.clickAndWait(loc.defects_Tab, "");

        // ✅ Defect creation part (repeatable)
        if (defectNames != null && !defectNames.isEmpty()) {
            String[] defectList = defectNames.split(","); // Example: "Crack, Dent, Scratch"

            for (String defect : defectList) {
                defect = defect.trim(); // remove spaces
                actions.clickAndWait(loc.addDefect_Button, "Clicked Add Defect");
                actions.clearAndType(loc.defectName_Input, defect, "Entered defect name: " + defect);
                actions.clickAndWait(loc.savedefect, "Clicked Save Defect");
            }
        } else {
            System.out.println(" No defect names found in Excel for row index: " + rowIndex);
        }
    }





    public void Partsecond() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Cylinder Block";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.DataGroup_Dropdown,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clearAndType(loc.Part_NameInput, "Cylinder Block","");
        actions.clickAndWait(loc.Part_SaveButton, "");
        actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
        actions.waitForVisibility(loc.AddChar_NameInput);
        actions.clickAndWait(loc.AddChar_NameInput,"user clicked on input id field");

        actions.clearAndType(loc.AddChar_NameInput,"Variable03","");
        actions.clickAndWait(loc.Char_AddButton, "");
        actions.clearAndType(loc.upperSpecInput,"10.00","Variable01");
        actions.clearAndType(loc.lowerSpecInput,"5.00","Variable01");
        actions.clearAndType(loc.subgroupSizeInput,"3","Variable01");
        actions.clickAndWait(loc.saveCharacteristicButton,"");
        actions.waitForVisibility(loc.CloseCharacteristicButton);
        Thread.sleep(1000);
        actions.clickAndWait(loc.CloseCharacteristicButton,"");
        //
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Add_CharButton,"");
        actions.clickAndWait(loc.Char_DatGroupButton,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.Part_Button,"");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");

        actions.clearAndType(loc.AddChar_NameInput,"AttribuiteP","");
        actions.clickAndWait(loc.CharType_Dropdown,"");
        actions.clickAndWait(loc.Attribute_Type,"");
        actions.clickAndWait(loc.Add_charButton,"");
        actions.clearAndType(loc.inspectionUnit,"100","");
        actions.clickAndWait(loc.defects_Tab,"");

        String[] defectNames = {
                "Wheel Arch",
                "Engine Block",
                "Brake Pad",
                "Gear Shaft",
                "Suspension Arm"
        };

        for (String defectName : defectNames) {
            actions.clickAndWait(loc.addDefect_Button, "User clicked on add");
            actions.clearAndType(loc.defectName_Input, defectName, "User entered defect name: " + defectName);
            actions.clickAndWait(loc.savedefect, "User clicked on save button");
        }

        actions.clickAndWait(loc.saveDefect_Button, "User clicked on save button");
        Thread.sleep(2000);
        actions.clickAndWait(loc.closeButton, "User clicked on save button");



        actions.clickAndWait(loc.filesicon, "User clicked on file button");
        actions.clickAndWait(loc.Addptp, "User clicked on add button");
        actions.clickAndWait(loc.Assignparaicon, "User clicked assign parameter button");
        actions.clickAndWait(loc.datadropdown, "User clicked on dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partdropdown, "User clicked partdrop button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.waitForVisibility(loc.source01);
        actions.dragAndDrop(loc.source01, loc.Targetsource);
        actions.dragAndDrop(loc.allowall, loc.Targetsource);
        actions.clickAndWait(loc.saveassign, "User clicked on save button");
        actions.clickAndWait(loc.closeassign, "User clicked on close button");

    }


    public void Partthird() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Crankshaft";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.DataGroup_Dropdown,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clearAndType(loc.Part_NameInput, "Crankshaft","");
        actions.clickAndWait(loc.Part_SaveButton, "");
        actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
        actions.clearAndType(loc.AddChar_NameInput,"Variable05","");
        actions.clickAndWait(loc.Char_AddButton, "");
        actions.clearAndType(loc.upperSpecInput,"10.00","Variable01");
        actions.clearAndType(loc.lowerSpecInput,"5.00","Variable01");
        actions.clearAndType(loc.subgroupSizeInput,"5","Variable01");
        actions.clickAndWait(loc.saveCharacteristicButton,"");
        actions.waitForVisibility(loc.CloseCharacteristicButton);
        Thread.sleep(1000);
        actions.clickAndWait(loc.CloseCharacteristicButton,"");
        //
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Add_CharButton,"");
        actions.clickAndWait(loc.Char_DatGroupButton,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.Part_Button,"");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");

        actions.clearAndType(loc.AddChar_NameInput,"AttribuiteTally","");
        actions.clickAndWait(loc.CharType_Dropdown,"");
        actions.clickAndWait(loc.Attribute_Type,"");
        actions.clickAndWait(loc.Add_charButton,"");
        actions.clickAndWait(loc.Tally,"");
        actions.clickAndWait(loc.defects_Tab,"");

        String[] defectNames = {
                "Wheel Arch",
                "Engine Block",
                "Brake Pad",
                "Gear Shaft",
                "Suspension Arm"
        };

        for (String defectName : defectNames) {
            actions.clickAndWait(loc.addDefect_Button, "User clicked on add");
            actions.clearAndType(loc.defectName_Input, defectName, "User entered defect name: " + defectName);
            actions.clickAndWait(loc.savedefect, "User clicked on save button");
        }

        actions.clickAndWait(loc.saveDefect_Button, "User clicked on save button");
        Thread.sleep(1000);
        actions.waitForVisibility(loc.closeButton);
        actions.clickAndWait(loc.closeButton, "User clicked on save button");

        actions.clickAndWait(loc.filesicon, "User clicked on file button");
        actions.clickAndWait(loc.Addptp, "User clicked on add button");
        actions.clickAndWait(loc.Assignparaicon, "User clicked assign parameter button");
        actions.clickAndWait(loc.datadropdown, "User clicked on dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partdropdown, "User clicked partdrop button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"user selects part");
        actions.waitForVisibility(loc.source01);
        actions.dragAndDrop(loc.source01, loc.Targetsource);
        actions.dragAndDrop(loc.allowall, loc.Targetsource);
        actions.clickAndWait(loc.saveassign, "User clicked on save button");
        actions.clickAndWait(loc.closeassign, "User clicked on close button");

    }


    public void Partfourth() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Camshaft";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.DataGroup_Dropdown,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clearAndType(loc.Part_NameInput, "Camshaft","");
        actions.clickAndWait(loc.Part_SaveButton, "");
        actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
        actions.clearAndType(loc.AddChar_NameInput,"Variable10","");
        actions.clickAndWait(loc.Char_AddButton, "");
        actions.clearAndType(loc.upperSpecInput,"10.00","Variable01");
        actions.clearAndType(loc.lowerSpecInput,"5.00","Variable01");
        actions.clearAndType(loc.subgroupSizeInput,"10","Variable01");
        actions.clickAndWait(loc.saveCharacteristicButton,"");
        actions.waitForVisibility(loc.CloseCharacteristicButton);
        Thread.sleep(1000);
        actions.clickAndWait(loc.CloseCharacteristicButton,"");
        //
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Add_CharButton,"");
        actions.clickAndWait(loc.Char_DatGroupButton,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.Part_Button,"");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");

        actions.clearAndType(loc.AddChar_NameInput,"Attribuiteu","");
        actions.clickAndWait(loc.CharType_Dropdown,"");
        actions.clickAndWait(loc.Attribute_Type,"");
        actions.clickAndWait(loc.Add_charButton,"");
        actions.clickAndWait(loc.defects_Tab,"");

        String[] defectNames = {
                "Wheel Arch",
                "Engine Block",
                "Brake Pad",
                "Gear Shaft",
                "Suspension Arm"
        };

        for (String defectName : defectNames) {
            actions.clickAndWait(loc.addDefect_Button, "User clicked on add");
            actions.clearAndType(loc.defectName_Input, defectName, "User entered defect name: " + defectName);
            actions.clickAndWait(loc.savedefect, "User clicked on save button");
        }

        actions.clickAndWait(loc.saveDefect_Button, "User clicked on save button");
        Thread.sleep(1000);
        actions.waitForVisibility(loc.closeButton);
        actions.clickAndWait(loc.closeButton, "User clicked on save button");


        actions.clickAndWait(loc.filesicon, "User clicked on file button");
        actions.clickAndWait(loc.Addptp, "User clicked on add button");
        actions.clickAndWait(loc.Assignparaicon, "User clicked assign parameter button");
        actions.clickAndWait(loc.datadropdown, "User clicked on dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partdropdown, "User clicked partdrop button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.waitForVisibility(loc.source01);
        actions.dragAndDrop(loc.source01, loc.Targetsource);
        actions.dragAndDrop(loc.allowall, loc.Targetsource);
        actions.clickAndWait(loc.saveassign, "User clicked on save button");
        actions.clickAndWait(loc.closeassign, "User clicked on save button");

    }



    public void PartFifth() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Piston";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.DataGroup_Dropdown,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clearAndType(loc.Part_NameInput, "Piston","");
        actions.clickAndWait(loc.Part_SaveButton, "");
        actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
        actions.clearAndType(loc.AddChar_NameInput,"Variable15","");
        actions.clickAndWait(loc.Char_AddButton, "");
        actions.clearAndType(loc.upperSpecInput,"10.00","Variable01");
        actions.clearAndType(loc.lowerSpecInput,"5.00","Variable01");
        actions.clearAndType(loc.subgroupSizeInput,"15","Variable01");
        actions.clickAndWait(loc.saveCharacteristicButton,"");
        actions.waitForVisibility(loc.CloseCharacteristicButton);
        Thread.sleep(1000);
        actions.clickAndWait(loc.CloseCharacteristicButton,"");
        //
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Add_CharButton,"");
        actions.clickAndWait(loc.Char_DatGroupButton,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.Part_Button,"");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");

        actions.clearAndType(loc.AddChar_NameInput,"cheeksheet","");
        actions.clickAndWait(loc.CharType_Dropdown,"");
        actions.clickAndWait(loc.Attribute_Type,"");
        actions.clickAndWait(loc.Add_charButton,"");
        actions.clickAndWait(loc.operationatb,"user clicked on operations tab");
        actions.clickAndWait(loc.Cheecksheet,"user clicked on checksheet checkbox");
        actions.selectByIndex(loc.dropdownsheet,1);

        actions.clickAndWait(loc.defects_Tab,"");

        String[] defectNames = {
                "Wheel Arch",
                "Engine Block",
                "Brake Pad",
                "Gear Shaft",
                "Suspension Arm"
        };

        for (String defectName : defectNames) {
            actions.clickAndWait(loc.addDefect_Button, "User clicked on add");
            actions.clearAndType(loc.defectName_Input, defectName, "User entered defect name: " + defectName);
            actions.clickAndWait(loc.savedefect, "User clicked on save button");
        }

        actions.clickAndWait(loc.saveDefect_Button, "User clicked on save button");
        Thread.sleep(1000);
        actions.waitForVisibility(loc.closeButton);
        actions.clickAndWait(loc.closeButton, "User clicked on save button");


        actions.clickAndWait(loc.filesicon, "User clicked on file button");
        actions.clickAndWait(loc.Addptp, "User clicked on add button");
        actions.clickAndWait(loc.Assignparaicon, "User clicked assign parameter button");
        actions.clickAndWait(loc.datadropdown, "User clicked on dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partdropdown, "User clicked partdrop button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.waitForVisibility(loc.source03);
        actions.dragAndDrop(loc.source03, loc.Targetsource);
        actions.dragAndDrop(loc.source04, loc.Targetsource);
        actions.clickAndWait(loc.saveassign, "User clicked on save button");
        actions.clickAndWait(loc.closeassign, "User clicked on save button");


    }

    public void Partsixth() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Pagepart";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.DataGroup_Dropdown,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clearAndType(loc.Part_NameInput, "Pagepart","");
        actions.clickAndWait(loc.Part_SaveButton, "");
        actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
        actions.clearAndType(loc.AddChar_NameInput,"Variable15","");
        actions.clickAndWait(loc.Char_AddButton, "");
        actions.clearAndType(loc.upperSpecInput,"10.00","Variable01");
        actions.clearAndType(loc.lowerSpecInput,"5.00","Variable01");
        actions.clearAndType(loc.subgroupSizeInput,"3","Variable01");
        actions.clickAndWait(loc.saveCharacteristicButton,"");
        actions.waitForVisibility(loc.CloseCharacteristicButton);
        Thread.sleep(1000);
        actions.clickAndWait(loc.CloseCharacteristicButton,"");
        //
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Add_CharButton,"");
        actions.clickAndWait(loc.Char_DatGroupButton,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.Part_Button,"");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");

        actions.clearAndType(loc.AddChar_NameInput,"cheeksheet","");
        actions.clickAndWait(loc.CharType_Dropdown,"");
        actions.clickAndWait(loc.Attribute_Type,"");
        actions.clickAndWait(loc.Add_charButton,"");
        actions.clickAndWait(loc.operationatb,"user clicked on operations tab");
        actions.clickAndWait(loc.Cheecksheet,"user clicked on checksheet checkbox");
        actions.selectByIndex(loc.dropdownsheet,1);

        actions.clickAndWait(loc.defects_Tab,"");

        String[] defectNames = {
                "Wheel Arch",
                "Engine Block",
                "Brake Pad",
                "Gear Shaft",
                "Suspension Arm"
        };

        for (String defectName : defectNames) {
            actions.clickAndWait(loc.addDefect_Button, "User clicked on add");
            actions.clearAndType(loc.defectName_Input, defectName, "User entered defect name: " + defectName);
            actions.clickAndWait(loc.savedefect, "User clicked on save button");
        }

        actions.clickAndWait(loc.saveDefect_Button, "User clicked on save button");
        Thread.sleep(1000);
        actions.waitForVisibility(loc.closeButton);
        actions.clickAndWait(loc.closeButton, "User clicked on save button");


        actions.clickAndWait(loc.filesicon, "User clicked on file button");
        actions.clickAndWait(loc.Addptp, "User clicked on add button");
        actions.clickAndWait(loc.Assignparaicon, "User clicked assign parameter button");
        actions.clickAndWait(loc.datadropdown, "User clicked on dropdown button");
        actions.clickAndWait(loc.selectgrp, "User selects datagroup ");
        actions.clickAndWait(loc.partdropdown, "User clicked partdrop button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.waitForVisibility(loc.source03);
        actions.dragAndDrop(loc.source03, loc.Targetsource);
        actions.dragAndDrop(loc.source04, loc.Targetsource);
        actions.clickAndWait(loc.saveassign, "User clicked on save button");
        actions.clickAndWait(loc.closeassign, "User clicked on save button");


    }



    public void Sequence01() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Roof Panel";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.AddSequence_Button, "User clicked on add sequence button");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.dataGroupDropdown,"User clicked on add datagroup dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partDropdown, "User clicked on add part dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.clickAndWait(loc.SequenceAddButton, "");
        actions.clearAndType(loc.sequenceNameInput,"Cylinder Block Inspection","user entered sequence name");
        actions.clickAndWait(loc.Parametertype,"user clicked on parameter type dropdown");
        actions.clickAndWait(loc.selectypepara,"user clicked on clear as parameter");
        actions.clickAndWait(loc.selectAllCheckbox,"user clicked on all check box");
        actions.clickAndWait(loc.kebabMenu,"user clicked on kebeb menu");
        actions.clickAndWait(loc.assignOption,"user clicked on assign link");
        actions.strongClick(loc.SequenceSaveButton);
        actions.clickAndWait(loc.General_Operation,"user clicked on general option ");
        actions.clickAndWait(loc.AutomaticallyRepeatSequence,"user clicked AutomaticallyRepeatSequence radio button");
        actions.clickAndWait(loc.Part_Name,"user clicked part radio button");
        actions.clickAndWait(loc.Parameter01,"user clicked parameter radio button");
        actions.clickAndWait(loc.SequenceSaveButton,"user clicked save button");
        actions.clickAndWait(loc.SequenceCloseButton,"user clicked close button");

    }


    public void Sequence02() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Cylinder Block";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.AddSequence_Button, "User clicked on add sequence button");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.dataGroupDropdown,"User clicked on add datagroup dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partDropdown, "User clicked on add part dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.clickAndWait(loc.SequenceAddButton, "");
        actions.clearAndType(loc.sequenceNameInput,"Piston Bore Clearance","user entered sequence name");
        actions.clickAndWait(loc.TimeManualDP,"user clicked on time dropdown");
        actions.clickAndWait(loc.TimeManual,"user select manual options");
        actions.clickAndWait(loc.Parametertype,"user clicked on parameter type dropdown");
        actions.clickAndWait(loc.selectypecarryforward,"user clicked on carry forward as parameter");
        actions.clickAndWait(loc.selectAllCheckbox,"user clicked on all check box");
        actions.clickAndWait(loc.kebabMenu,"user clicked on kebeb menu");
        actions.clickAndWait(loc.assignOption,"user clicked on assign link");

        actions.waitForVisibility(loc.SequenceSaveButton);
        actions.forceClick(loc.SequenceSaveButton);
        actions.clickAndWait(loc.General_Operation,"user clicked on general option ");
        actions.clickAndWait(loc.CompleteHandsfreeOperation,"user clicked CompleteHandsfreeOperation radio button");
        actions.clickAndWait(loc.Header_Name,"user clicked part radio button");
        actions.clickAndWait(loc.date,"user clicked date radio button");
        actions.clickAndWait(loc.SequenceSaveButton,"user clicked save button");
        actions.clickAndWait(loc.SequenceCloseButton,"user clicked close button");

    }



    public void Sequence03() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Crankshaft";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.AddSequence_Button, "User clicked on add sequence button");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.dataGroupDropdown,"User clicked on add datagroup dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partDropdown, "User clicked on add part dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.clickAndWait(loc.SequenceAddButton, "");
        actions.clearAndType(loc.sequenceNameInput,"Valve Seat Width","user entered sequence name");
        actions.clickAndWait(loc.Parametertype,"user clicked on parameter type dropdown");
        actions.clickAndWait(loc.carryforwardby,"user clicked on clear as parameter");
        actions.clickAndWait(loc.selectAllCheckbox,"user clicked on all check box");
        actions.clickAndWait(loc.kebabMenu,"user clicked on kebeb menu");
        actions.clickAndWait(loc.assignOption,"user clicked on assign link");
        actions.strongClick(loc.SequenceSaveButton);
        actions.clickAndWait(loc.General_Operation,"user clicked on general option ");
        actions.clickAndWait(loc.HandsfreeOperationStopForNotes,"user clicked AutomaticallyRepeatSequence radio button");
        actions.clickAndWait(loc.Samples,"user clicked parameter radio button");
        actions.clickAndWait(loc.SequenceSaveButton,"user clicked save button");
        actions.clickAndWait(loc.SequenceCloseButton,"user clicked close button");

    }



    public void Sequence04() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Camshaft";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.AddSequence_Button, "User clicked on add sequence button");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.dataGroupDropdown,"User clicked on add datagroup dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partDropdown, "User clicked on add part dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.clickAndWait(loc.SequenceAddButton, "");
        actions.clearAndType(loc.sequenceNameInput,"Final Engine Leak Test","user entered sequence name");
        actions.clickAndWait(loc.EntryMode,"user clicked entrymode dropdown");
        actions.clickAndWait(loc.selectypepara,"user clicked on clear as parameter");
        actions.clickAndWait(loc.selectAllCheckbox,"user clicked on all check box");
        actions.clickAndWait(loc.kebabMenu,"user clicked on kebeb menu");
        actions.clickAndWait(loc.assignOption,"user clicked on assign link");
        actions.strongClick(loc.SequenceSaveButton);
        actions.clickAndWait(loc.General_Operation,"user clicked on general option ");
        actions.clickAndWait(loc.sequencechained,"user clicked chaine dropdown radio button");
        actions.clickAndWait(loc.chainesequencevalue2,"user clicked chaine sequence value button");
        actions.clickAndWait(loc.SequenceSaveButton,"user clicked save button");
        actions.clickAndWait(loc.SequenceCloseButton,"user clicked close button");

    }



    public void Sequence05() throws InterruptedException {


        String groupName = "Engine Assembly";
        String part01 = "Piston";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.AddSequence_Button, "User clicked on add sequence button");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.dataGroupDropdown,"User clicked on add datagroup dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partDropdown, "User clicked on add part dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.clickAndWait(loc.SequenceAddButton, "");
        actions.clearAndType(loc.sequenceNameInput,"Frame Welding Inspection","user entered sequence name");
        actions.clickAndWait(loc.EntryMode,"user clicked entrymode dropdown");
        actions.clickAndWait(loc.SelectMode,"user select entry mode as bypart");
        actions.clickAndWait(loc.Parametertype,"user clicked on parameter type dropdown");
        actions.clickAndWait(loc.selectypepara,"user clicked on clear as parameter");
        actions.clickAndWait(loc.selectAllCheckbox,"user clicked on all check box");
        actions.clickAndWait(loc.kebabMenu,"user clicked on kebeb menu");
        actions.clickAndWait(loc.assignOption,"user clicked on assign link");
        actions.strongClick(loc.SequenceSaveButton);
        actions.clickAndWait(loc.General_Operation,"user clicked on general option ");
        actions.clickAndWait(loc.parasearch,"user clicked part radio button");
        actions.clickAndWait(loc.value2match,"user clicked parameter radio button");
        actions.clickAndWait(loc.SequenceSaveButton,"user clicked save button");
        actions.clickAndWait(loc.SequenceCloseButton,"user clicked close button");

    }






    public void addSubgroups() {
        actions.strongClick(loc.NetworkIcon);
        actions.clickAndWait(loc.SequencePage,"user clicked on sequence page");   // ✅ direct use
        actions.clickAndWait(loc.RunSequence,"user clicked on run sequence");

        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.assertElementFocused(loc.Para01);
        actions.clearAndType(loc.Subgroup0, "10","user entered value to subgroupsize");
        actions.validateClearedParameter(loc.Para01);
        actions.validateClearedParameter(loc.Para02);
        actions.clearAndType(loc.Para01,"12","user entered numeric values ");
        actions.clearAndType(loc.Para02,"Abc12$%","user entered allow all values ");
        actions.assertHeaderLabel(loc.Header,"Part Name : Engine block",3);
        actions.assertInputDisabled(loc.Subgroup0);

        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);
        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.assertHeaderLabel(loc.Header,"Part Name : Engine block",3);

        actions.clearAndType(loc.Subgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup40, "10","user entered value to subgroupsize");
        actions.validateClearedParameter(loc.Para01);
        actions.validateClearedParameter(loc.Para02);
        actions.clearAndType(loc.Para01,"10","user entered numeric values ");
        actions.clearAndType(loc.Para02,"Abc***12$%","user entered allow all values ");
        actions.clearAndType(loc.TotalSubgroup0, "32","user entered value to subgroupsize");
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);


    }


    public void addSubgroupsData() {
        actions.strongClick(loc.NetworkIcon);
        actions.clickAndWait(loc.SequencePage1,"user clicked on sequence page");   // ✅ direct use
        actions.clickAndWait(loc.RunSequence,"user clicked on run sequence");

        actions.assertDateTimeEmpty(loc.AutomaticData,loc.AutomaticTime);
        actions.assertElementFocused(loc.AutomaticData);
        actions.clearAndType(loc.Subgroup0, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup02, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup03, "2","user entered value to subgroupsize");
        actions.assertHeaderLabel(loc.Header1,"Part Number :",3);
        actions.clearAndType(loc.Para01,"12","user entered numeric values ");
        actions.clearAndType(loc.Para02,"Abc12$%","user entered allow all values ");
        actions.clickAndWait(loc.SubmitBtn,"clicked on save button");
        actions.clickAndWait(loc.SubmitBtn,"");
        actions.assertDynamicCountdown(loc.timeCount);


        ///
        actions.assertHeaderLabel(loc.Header1,"Part Number :",3);
        actions.clearAndType(loc.Subgroup00, "2","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup40, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.TotalSubgroup0, "32","user entered value to subgroupsize");
        actions.getText(loc.Para01);
        actions.getText(loc.Para02);
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);

//
        actions.clickAndWait(loc.RunSequence,"user clicked on run sequence");
        actions.clearAndType(loc.Subgroup0, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup02, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup03, "2","user entered value to subgroupsize");
        actions.getText(loc.Para01);
        actions.getText(loc.Para02);
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");



        actions.clearAndType(loc.Subgroup00, "2","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup40, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.TotalSubgroup0, "32","user entered value to subgroupsize");
        actions.getText(loc.Para01);
        actions.getText(loc.Para02);
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);
        actions.clickAndWait(loc.editIcon,"user clicked on edit icon");
        actions.clickAndWait(loc.LeftEdit,"user clicked left edit icon");
        actions.clickAndWait(loc.NoteIcon,"user clicked on note icon");
        actions.getText(loc.UserNote);
        actions.clickAndWait(loc.closeSequence,"user clicked on edit icon");
        actions.clickAndWait(loc.yes,"user clicked left edit icon");



        actions.clickAndWait(loc.editIcon01,"user clicked on edit icon");
        actions.clickAndWait(loc.LeftEdit,"user clicked left edit icon");
        actions.clickAndWait(loc.NoteIcon,"user clicked on note icon");
        actions.getText(loc.UserNote);



    }




    public void addSubgroupsTally() throws InterruptedException {
        actions.strongClick(loc.NetworkIcon);
        actions.clickAndWait(loc.SequencePage2,"user clicked on sequence page");   // ✅ direct use
        actions.clickAndWait(loc.RunSequence,"user clicked on run sequence");
        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.assertElementFocused(loc.Subgroup0);
        actions.clearAndType(loc.Subgroup0, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup02, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup03, "2","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup04, "2","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup05, "2","user entered value to subgroupsize");

        actions.clearAndType(loc.Para01,"12","user entered numeric values ");
        actions.clearAndType(loc.Para02,"Abc1234","user entered allow all values ");
        actions.clickAndWait(loc.SubmitBtn,"clicked on save button");
        actions.clickAndWait(loc.NoteOK,"user clicked on ok button");
        actions.clearAndType(loc.EnterNote,"Test","user entered Note");
        actions.clickAndWait(loc.SubmitNote,"user clicked on ok button");
        actions.assertDynamicCountdown(loc.timeCount);


        ///
        actions.clickAndWait(loc.Tally01, "user clicked on add icon for 1st defect");
        actions.clickAndWait(loc.Tally02, "user clicked on add icon for 2nd defect");
        actions.clickAndWait(loc.Tally03, "user clicked on add icon for 3rd defect");
        actions.clickAndWait(loc.Tally04, "user clicked on add icon for 4th defect");
        actions.clickAndWait(loc.Tally05, "user clicked on add icon for 5th defect");
       ;
        actions.clearAndType(loc.TotalSubgroup0, "10","user entered value to subgroupsize");
        actions.getText(loc.Para01);
        actions.getText(loc.Para02);
        actions.clearAndType(loc.Para01,"1997","user entered numeric values ");
        actions.clearAndType(loc.Para02,"Test09912","user entered allow all values ");
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        Thread.sleep(3000);
        actions.forceClick(loc.continueButton);


        actions.clickAndWait(loc.RunSequence,"user clicked on run sequence");
        actions.clearAndType(loc.Subgroup0, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup02, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup03, "2","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup04, "2","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup05, "2","user entered value to subgroupsize");
        actions.getText(loc.Para01);
        actions.getText(loc.Para02);
        actions.safeClick(loc.SubmitBtn);
        actions.clickAndWait(loc.NoteOK,"user clicked on ok button");
        actions.clickAndWait(loc.Subgroup00, "user clicked on add icon for 1st defect");
        actions.clickAndWait(loc.Subgroup10, "user clicked on add icon for 2nd defect");
        actions.clickAndWait(loc.Subgroup20, "user clicked on add icon for 3rd defect");
        actions.clickAndWait(loc.Subgroup30, "user clicked on add icon for 4th defect");
        actions.clickAndWait(loc.Subgroup40, "user clicked on add icon for 5th defect");
        actions.clearAndType(loc.TotalSubgroup0, "10","user entered value to subgroupsize");
        actions.getText(loc.Para01);
        actions.getText(loc.Para02);
        actions.safeClick(loc.SubmitBtn);
        actions.clickAndWait(loc.NoteOK,"user clicked on ok button");
        actions.clearAndType(loc.EnterNote,"Test","user entered Note");
        actions.clickAndWait(loc.SubmitNote,"user clicked on ok button");
    }




    public void ChainSequence() {
        actions.strongClick(loc.NetworkIcon);
        actions.clickAndWait(loc.SequencePage3,"user clicked on sequence page");   // ✅ direct use
        actions.clickAndWait(loc.RunSequence,"user clicked on run sequence");
        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.clearAndType(loc.Subgroup0, "7","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup02, "45","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup03, "7","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup04, "102","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup05, "100","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup06, "7","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup07, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup08, "7","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup09, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup10, "7","user entered value to subgroupsize");


        actions.clearAndType(loc.Para01,"12","user entered numeric values ");
        actions.clearAndType(loc.Para02,"Abc1234","user entered allow all values ");
        actions.clickAndWait(loc.SubmitBtn,"clicked on save button");
        actions.clickAndWait(loc.NoteOK,"user clicked on ok button");
        actions.clearAndType(loc.EnterNote,"Test","user entered Note");
        actions.clickAndWait(loc.SubmitNote,"user clicked on ok button");
        actions.clickAndWait(loc.SubmitBtn,"clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);




        actions.clearAndType(loc.Subgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup40, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.TotalSubgroup0, "32","user entered value to subgroupsize");

        actions.getText(loc.Para01);
        actions.getText(loc.Para02);
        actions.clickAndWait(loc.SubmitBtn,"clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);


       /// chained sequence

        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.assertElementFocused(loc.Para01);
        actions.clearAndType(loc.Subgroup0, "10","user entered value to subgroupsize");
        actions.validateClearedParameter(loc.Para01);
        actions.validateClearedParameter(loc.Para02);
        actions.clearAndType(loc.Para01,"12","user entered numeric values ");
        actions.clearAndType(loc.Para02,"Abc12$%","user entered allow all values ");
        actions.assertHeaderLabel(loc.Header,"Part Name : Engine block",3);
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);
        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.assertHeaderLabel(loc.Header,"Part Name : Engine block",3);

        actions.clearAndType(loc.Subgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup40, "10","user entered value to subgroupsize");
        actions.validateClearedParameter(loc.Para01);
        actions.validateClearedParameter(loc.Para02);
        actions.clearAndType(loc.Para01,"10","user entered numeric values ");
        actions.clearAndType(loc.Para02,"Abc***12$%","user entered allow all values ");
        actions.clearAndType(loc.TotalSubgroup0, "32","user entered value to subgroupsize");
        actions.clickAndWait(loc.SubmitBtn,"user clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);
    }




    public void ParaToMatch() {
        actions.strongClick(loc.NetworkIcon);
        actions.clickAndWait(loc.SequencePage4,"user clicked on sequence page");   // ✅ direct use
        actions.clickAndWait(loc.RunSequence,"user clicked on run sequence");
        actions.isPopupDisplayed(loc.popuppara);
        actions.clearAndType(loc.ParaToMatch, "Test01","user entered para to value in inputtextfield");
        actions.clickAndWait(loc.ParaToMatchOk, "Test01");

        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.clearAndType(loc.Subgroup0, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup02, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup03, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup04, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup05, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup06, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup07, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup08, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup09, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup10, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.Para01,"Test01","user entered numeric values ");
        actions.clearAndType(loc.subgroup11, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup12, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup13, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup14, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup15, "10","user entered value to subgroupsize");



        actions.forceClick(loc.SubmitBtn);
        actions.getText(loc.Para02);

        actions.clickAndWait(loc.canpopup,"");




        actions.clickAndWait(loc.RadioButton01, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton02, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton03, "user clicked on defect rado button");
        actions.clearAndType(loc.Para01,"Test02","user entered value for operator");
        actions.clickAndWait(loc.RadioButton04, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton05, "user clicked on defect rado button");
        actions.clearAndType(loc.TotalSubgroup0, "99","user entered value to subgroupsize");
        actions.getText(loc.Para02);
        actions.clickAndWait(loc.SubmitBtn,"clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);



    }




    public void PageToMatch() {
        actions.strongClick(loc.NetworkIcon);
        actions.clickAndWait(loc.SequencePage5,"user clicked on sequence page");
        actions.clickAndWait(loc.RunSequence,"user clicked on run sequence");
        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.clearAndType(loc.Subgroup0, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.Subgroup02, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.subgroup03, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.Para01,"Test01","user entered numeric values ");

        actions.forceClick(loc.SubmitBtn);
        actions.getText(loc.Para02);

        actions.clickAndWait(loc.canpopup,"");




        actions.clickAndWait(loc.RadioButton01, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton02, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton03, "user clicked on defect rado button");
        actions.clearAndType(loc.Para01,"Test02","user entered value for operator");
        actions.clickAndWait(loc.RadioButton04, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton05, "user clicked on defect rado button");
        actions.clearAndType(loc.TotalSubgroup0, "99","user entered value to subgroupsize");
        actions.getText(loc.Para02);
        actions.clickAndWait(loc.SubmitBtn,"clicked on save button");
        actions.assertDynamicCountdown(loc.timeCount);



    }



}




