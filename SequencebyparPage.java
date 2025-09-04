package pages;

import Locators.AdminLocators;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.CustomDropdownUtils;
import util.ExtentReportManager;
import util.UIActions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SequencebyparPage {




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

    public SequencebyparPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.actions = new UIActions(driver);
        new CustomDropdownUtils(driver);

        this.loc = new AdminLocators();

    }


    public void createDataGroup() throws InterruptedException {

        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.DataGroup_AddButton, "User clicked Add Data Group");
        actions.clearAndType(loc.DataGroup_NameInput, "BYPartGroup", "Entered Data Group");
        actions.clickAndWait(loc.DataGroup_SaveButton, "Saved Data Group");


            String groupName = "BYPartGroup";
            String part01 = "Roof Panel";

            Thread.sleep(2000);
            actions.safeClick(loc.AddIcon);
            actions.clickAndWait(loc.Part_AddButton, "");
            actions.waitForVisibility(loc.DataGroup_Dropdown);
            actions.clickAndWait(loc.DataGroup_Dropdown,"");
            actions.clickAndWait(loc.getDataGroupByName(groupName),"");
            actions.clearAndType(loc.Part_NameInput, "Roof Panel","");
            actions.clickAndWait(loc.Part_SaveButton, "");
            actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
            actions.clearAndType(loc.AddChar_NameInput,"Variable01","");
            actions.clickAndWait(loc.Char_AddButton, "");
            actions.clearAndType(loc.upperSpecInput,"15.00","Variable01");
            actions.clearAndType(loc.lowerSpecInput,"7.00","Variable01");
            actions.clearAndType(loc.subgroupSizeInput,"1","Variable01");
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

            actions.clearAndType(loc.AddChar_NameInput,"AttribuiteC","");
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
            actions.waitForVisibility(loc.closeButton);
            actions.clickAndWait(loc.closeButton, "User clicked on save button");


        actions.clickAndWait(loc.filesicon, "User clicked on file button");
        actions.clickAndWait(loc.Addptp, "User clicked on add button");
        actions.clickAndWait(loc.Assignparaicon, "User clicked assign parameter button");
        actions.clickAndWait(loc.datadropdown, "User clicked on dropdown button");
        actions.clickAndWait(loc.selectgrp, "User selects datagroup ");
        actions.clickAndWait(loc.partdropdown, "User clicked partdrop button");
        actions.clickAndWait(loc.selectpartpara, "User clicked on save button");
        actions.waitForVisibility(loc.source01);
        actions.dragAndDrop(loc.source01, loc.Targetsource);
        actions.dragAndDrop(loc.source02, loc.Targetsource);
        actions.clickAndWait(loc.saveassign, "User clicked on save button");
        actions.clickAndWait(loc.closeassign, "User clicked on close button");

    }




    public void Partsecond() throws InterruptedException {


        String groupName = "BYPartGroup";
        String part01 = "Side Body Frame";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.DataGroup_Dropdown,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clearAndType(loc.Part_NameInput, "Side Body Frame","");
        actions.clickAndWait(loc.Part_SaveButton, "");
        actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
        actions.waitForVisibility(loc.AddChar_NameInput);
        actions.clickAndWait(loc.AddChar_NameInput,"user clicked on input id field");

        actions.clearAndType(loc.AddChar_NameInput,"Variable03","");
        actions.clickAndWait(loc.Char_AddButton, "");
        actions.clearAndType(loc.upperSpecInput,"15.00","Variable01");
        actions.clearAndType(loc.lowerSpecInput,"7.00","Variable01");
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
        actions.clickAndWait(loc.selectgrp, "User selects datagroup ");
        actions.clickAndWait(loc.partdropdown, "User clicked partdrop button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.waitForVisibility(loc.source01);
        actions.dragAndDrop(loc.source01, loc.Targetsource);
        actions.dragAndDrop(loc.source02, loc.Targetsource);
        actions.clickAndWait(loc.saveassign, "User clicked on save button");
        actions.clickAndWait(loc.closeassign, "User clicked on close button");

    }


    public void Partthird() throws InterruptedException {


        String groupName = "BYPartGroup";
        String part01 = "Painted Hood";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.DataGroup_Dropdown,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clearAndType(loc.Part_NameInput, "Painted Hood","");
        actions.clickAndWait(loc.Part_SaveButton, "");
        actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
        actions.clearAndType(loc.AddChar_NameInput,"Variable05","");
        actions.clickAndWait(loc.Char_AddButton, "");
        actions.clearAndType(loc.upperSpecInput,"15.00","Variable01");
        actions.clearAndType(loc.lowerSpecInput,"7.00","Variable01");
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
        actions.clickAndWait(loc.selectgrp, "User selects datagroup ");
        actions.clickAndWait(loc.partdropdown, "User clicked partdrop button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"user selects part");
        actions.waitForVisibility(loc.source01);
        actions.dragAndDrop(loc.source01, loc.Targetsource);
        actions.dragAndDrop(loc.source02, loc.Targetsource);
        actions.clickAndWait(loc.saveassign, "User clicked on save button");
        actions.clickAndWait(loc.closeassign, "User clicked on close button");

    }


    public void Partfourth() throws InterruptedException {


        String groupName = "BYPartGroup";
        String part01 = "Cylinder Head Cover";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.DataGroup_Dropdown,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clearAndType(loc.Part_NameInput, "Cylinder Head Cover","");
        actions.clickAndWait(loc.Part_SaveButton, "");
        actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
        actions.clearAndType(loc.AddChar_NameInput,"Variable10","");
        actions.clickAndWait(loc.Char_AddButton, "");
        actions.clearAndType(loc.upperSpecInput,"15.00","Variable01");
        actions.clearAndType(loc.lowerSpecInput,"7.00","Variable01");
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
        actions.clickAndWait(loc.selectgrp, "User selects datagroup ");
        actions.clickAndWait(loc.partdropdown, "User clicked partdrop button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.waitForVisibility(loc.source01);
        actions.dragAndDrop(loc.source01, loc.Targetsource);
        actions.dragAndDrop(loc.source02, loc.Targetsource);
        actions.clickAndWait(loc.saveassign, "User clicked on save button");
        actions.clickAndWait(loc.closeassign, "User clicked on save button");

    }



    public void PartFifth() throws InterruptedException {


        String groupName = "BYPartGroup";
        String part01 = "Front Axle";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.Part_AddButton, "");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.DataGroup_Dropdown,"");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clearAndType(loc.Part_NameInput, "Front Axle","");
        actions.clickAndWait(loc.Part_SaveButton, "");
        actions.waitForElementToBeClickable(loc.AddChar_NameInput,3,"");
        actions.clearAndType(loc.AddChar_NameInput,"Variable15","");
        actions.clickAndWait(loc.Char_AddButton, "");
        actions.clearAndType(loc.upperSpecInput,"15.00","Variable01");
        actions.clearAndType(loc.lowerSpecInput,"7.00","Variable01");
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


        String groupName = "BYPartGroup";
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
        actions.clearAndType(loc.sequenceNameInput,"Stamping Line","user entered sequence name");
        actions.clickAndWait(loc.EntryMode,"user clicked entrymode dropdown");
        actions.clickAndWait(loc.SelectMode,"user select entry mode as bypart");
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


        String groupName = "BYPartGroup";
        String part01 = "Side Body Frame";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.AddSequence_Button, "User clicked on add sequence button");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.dataGroupDropdown,"User clicked on add datagroup dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partDropdown, "User clicked on add part dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.clickAndWait(loc.SequenceAddButton, "");
        actions.clearAndType(loc.sequenceNameInput,"Welding Line","user entered sequence name");
        actions.clickAndWait(loc.EntryMode,"user clicked entrymode dropdown");
        actions.clickAndWait(loc.SelectMode,"user select entry mode as bypart");
        actions.clickAndWait(loc.Parametertype,"user clicked on parameter type dropdown");
        actions.clickAndWait(loc.selectypecarryforward,"user clicked on carry forward as parameter");
        actions.clickAndWait(loc.selectAllCheckbox,"user clicked on all check box");
        actions.clickAndWait(loc.kebabMenu,"user clicked on kebeb menu");
        actions.clickAndWait(loc.assignOption,"user clicked on assign link");
        actions.strongClick(loc.SequenceSaveButton);
        actions.clickAndWait(loc.General_Operation,"user clicked on general option ");
        actions.clickAndWait(loc.CompleteHandsfreeOperation,"user clicked CompleteHandsfreeOperation radio button");
        actions.clickAndWait(loc.Part_Name,"user clicked part radio button");
        actions.clickAndWait(loc.date,"user clicked date radio button");
        actions.clickAndWait(loc.SequenceSaveButton,"user clicked save button");
        actions.clickAndWait(loc.SequenceCloseButton,"user clicked close button");

    }



    public void Sequence03() throws InterruptedException {


        String groupName = "BYPartGroup";
        String part01 = "Painted Hood";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.AddSequence_Button, "User clicked on add sequence button");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.dataGroupDropdown,"User clicked on add datagroup dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partDropdown, "User clicked on add part dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.clickAndWait(loc.SequenceAddButton, "");
        actions.clearAndType(loc.sequenceNameInput,"Paint Shop","user entered sequence name");
        actions.clickAndWait(loc.EntryMode,"user clicked entrymode dropdown");
        actions.clickAndWait(loc.SelectMode,"user select entry mode as bypart");
        actions.clickAndWait(loc.Parametertype,"user clicked on parameter type dropdown");
        actions.clickAndWait(loc.selectypepara,"user clicked on clear as parameter");
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


        String groupName = "BYPartGroup";
        String part01 = "Cylinder Head Cover";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.AddSequence_Button, "User clicked on add sequence button");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.dataGroupDropdown,"User clicked on add datagroup dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partDropdown, "User clicked on add part dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.clickAndWait(loc.SequenceAddButton, "");
        actions.clearAndType(loc.sequenceNameInput,"Powertrain Assembly","user entered sequence name");
        actions.clickAndWait(loc.EntryMode,"user clicked entrymode dropdown");
        actions.clickAndWait(loc.SelectMode,"user select entry mode as bypart");
        actions.clickAndWait(loc.Parametertype,"user clicked on parameter type dropdown");
        actions.clickAndWait(loc.selectypepara,"user clicked on clear as parameter");
        actions.clickAndWait(loc.selectAllCheckbox,"user clicked on all check box");
        actions.clickAndWait(loc.kebabMenu,"user clicked on kebeb menu");
        actions.clickAndWait(loc.assignOption,"user clicked on assign link");
        actions.strongClick(loc.SequenceSaveButton);
        actions.clickAndWait(loc.General_Operation,"user clicked on general option ");
        actions.clickAndWait(loc.sequencechained,"user clicked chaine dropdown radio button");
        actions.clickAndWait(loc.chainesequencevalue,"user clicked chaine sequence value button");
        actions.clickAndWait(loc.SequenceSaveButton,"user clicked save button");
        actions.clickAndWait(loc.SequenceCloseButton,"user clicked close button");

    }



    public void Sequence05() throws InterruptedException {


        String groupName = "BYPartGroup";
        String part01 = "Front Axle";

        Thread.sleep(2000);
        actions.safeClick(loc.AddIcon);
        actions.clickAndWait(loc.AddSequence_Button, "User clicked on add sequence button");
        actions.waitForVisibility(loc.DataGroup_Dropdown);
        actions.clickAndWait(loc.dataGroupDropdown,"User clicked on add datagroup dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(groupName),"");
        actions.clickAndWait(loc.partDropdown, "User clicked on add part dropdown button");
        actions.clickAndWait(loc.getDataGroupByName(part01),"");
        actions.clickAndWait(loc.SequenceAddButton, "");
        actions.clearAndType(loc.sequenceNameInput,"Chassis Assembly","user entered sequence name");
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

    public void Addpages() throws InterruptedException {

        // Click on network icon first
        actions.jsClick(loc.NetworkIcon);
        Thread.sleep(2000);

        // Define satellites with their name, source, and target locators for drag-and-drop
        class Satellite {
            String name;
            By source;
            By target;

            Satellite(String name, By source, By target) {
                this.name = name;
                this.source = source;
                this.target = target;
            }
        }

        List<Satellite> satellites = Arrays.asList(
                new Satellite("BYPART01", loc.Sequence01, loc.Target01),
                new Satellite("BYPART02", loc.Sequence02, loc.Target02),
                new Satellite("BYPART03", loc.Sequence03, loc.Target03),
                new Satellite("BYPART04", loc.Sequence04, loc.Target04),
                new Satellite("BYPART05", loc.Sequence05, loc.Target05)
        );

        // Loop through each satellite and perform the actions
        for (Satellite sat : satellites) {
            actions.clickAndWait(loc.Kebabsatellite, "");
            actions.clickAndWait(loc.Addpaegsatellite, "");
            actions.clearAndType(loc.Enterpagenamesatellite, sat.name, "user entered sat name");
            actions.clickAndWait(loc.Addsatellitepage, "User clicked on Addsatellite page");
            actions.dragAndDrop(sat.source, sat.target);
            actions.clickAndWait(loc.savesatellitepage, "User clicked on save page button");
        }
    }










    public void ByPart01() throws InterruptedException {


        String BYpart = "BYPART01";

        actions.jsClick(loc.NetworkIcon);
        actions.clickAndWait(loc.getDataGroupByName01(BYpart),"");
        actions.clickAndWait(loc.RunSequence, "user clicked on run sequence button");
        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.assertElementFocused(loc.Para01);
        actions.clearAndType(loc.BYpartvariable, "10","user entered value to subgroupsize");

        actions.clickAndWait(loc.BYPartAttribute, "user entered value to subgroupsize");

        actions.clearAndType(loc.BySubgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup40, "10","user entered value to subgroupsize");

        actions.clearAndType(loc.ByTotalSubgroup0, "50","user entered value to subgroupsize");
        actions.strongClick1(loc.partok);
        actions.clickAndWait(loc.Bypartsave,"user clicked save button");


    }



    public void ByPart02() throws InterruptedException {


        String BYpart = "BYPART02";

        actions.jsClick(loc.NetworkIcon);
        actions.clickAndWait(loc.getDataGroupByName01(BYpart),"");
        actions.clickAndWait(loc.RunSequence, "user clicked on run sequence button");
        actions.assertDateTimeEmpty(loc.AutomaticData,loc.AutomaticTime);
        actions.assertElementFocused(loc.AutomaticData);
        actions.clickAndWait(loc.AutomaticData, "user entered value to subgroupsize");
        actions.clickAndWait(loc.AutomaticTime, "user entered value to subgroupsize");

        actions.clearAndType(loc.BYpartvariable, "7.00","user entered value to subgroupsize");

        actions.clickAndWait(loc.BYPartAttribute, "user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup40, "10","user entered value to subgroupsize");


        actions.clearAndType(loc.BYpartvariable02, "10.00","user entered value to subgroupsize");
        actions.clickAndWait(loc.BYPartAttribute02, "user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup40, "10","user entered value to subgroupsize");



        actions.clearAndType(loc.BYpartvariable03, "15.00","user entered value to subgroupsize");
        actions.clickAndWait(loc.BYPartAttribute, "user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup40, "10","user entered value to subgroupsize");
        actions.clickAndWait(loc.BYPartAttribute, "user entered value to subgroupsize");

        actions.clearAndType(loc.BySubgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup40, "10","user entered value to subgroupsize");

        actions.clearAndType(loc.ByTotalSubgroup0, "50","user entered value to subgroupsize");
        actions.strongClick1(loc.partok);
        actions.clickAndWait(loc.Bypartsave,"user clicked save button");
        actions.clickAndWait(loc.closebypart,"user clicked on close button");
        actions.clickAndWait(loc.yesbypart,"user clicked on close button");



        actions.clickAndWait(loc.RunSequence, "user clicked on run sequence button");
        actions.clickWithRetry(loc.AutomaticData, 3);
        actions.clickWithRetry(loc.AutomaticTime, 3);

        actions.clearAndType(loc.BYpartvariable, "5.00","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable02, "10.00","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable03, "15.00","user entered value to subgroupsize");

        actions.clickAndWait(loc.BYPartAttribute03, "user entered value to subgroupsize");

        actions.clearAndType(loc.BySubgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup40, "10","user entered value to subgroupsize");

        actions.clearAndType(loc.ByTotalSubgroup0, "50","user entered value to subgroupsize");
        actions.strongClick1(loc.partok);
        actions.clickAndWait(loc.Bypartsave,"user clicked save button");


    }


    public void ByPart03() throws InterruptedException {


        String BYpart = "BYPART03";

        actions.jsClick(loc.NetworkIcon);
        actions.clickAndWait(loc.getDataGroupByName01(BYpart),"");
        actions.clickAndWait(loc.RunSequence, "user clicked on run sequence button");
        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.assertElementFocused(loc.Para01);
        actions.clearAndType(loc.BYpartvariable, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable02, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable03, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable04, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable05, "10","user entered value to subgroupsize");


        actions.clickAndWait(loc.BYPartAttribute, "user entered value to subgroupsize");

        actions.clickAndWait(loc.Tally01, "user clicked on ");
        actions.clickAndWait(loc.Tally01, "user clicked on ");
        actions.clickAndWait(loc.Tally01, "user clicked on ");
        actions.clearAndType(loc.BySubgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup40, "10","user entered value to subgroupsize");

        actions.clearAndType(loc.ByTotalSubgroup0, "50","user entered value to subgroupsize");
        actions.strongClick1(loc.partok);
        actions.clickAndWait(loc.Bypartsave,"user clicked save button");


    }



    public void ByPart04() throws InterruptedException {


        String BYpart = "BYPART04";

        actions.jsClick(loc.NetworkIcon);
        actions.clickAndWait(loc.getDataGroupByName01(BYpart),"");
        actions.clickAndWait(loc.RunSequence, "user clicked on run sequence button");
        actions.clickAndWait(loc.RunSequence, "user clicked on run sequence button");
        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.assertElementFocused(loc.Para01);
        actions.clearAndType(loc.BYpartvariable, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable02, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable03, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable04, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable05, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable06, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable07, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable08, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable09, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable10, "10","user entered value to subgroupsize");


        actions.clickAndWait(loc.BYPartAttribute, "user entered value to subgroupsize");

        actions.clearAndType(loc.BySubgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup40, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.ByTotalSubgroup0, "50","user entered value to subgroupsize");
        actions.strongClick1(loc.partok);
        actions.clickAndWait(loc.Bypartsave,"user clicked save button");

        actions.clearAndType(loc.BYpartvariable, "10","user entered value to subgroupsize");
        actions.clickAndWait(loc.BYPartAttribute, "user entered value to subgroupsize");

        actions.clearAndType(loc.BySubgroup00, "4","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup10, "6","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup20, "8","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup30, "12","user entered value to subgroupsize");
        actions.clearAndType(loc.BySubgroup40, "10","user entered value to subgroupsize");

        actions.clearAndType(loc.ByTotalSubgroup0, "50","user entered value to subgroupsize");
        actions.strongClick1(loc.partok);
        actions.clickAndWait(loc.Bypartsave,"user clicked save button");

    }




    public void ByPart05() throws InterruptedException {


        String BYpart = "BYPART05";

        actions.jsClick(loc.NetworkIcon);
        actions.clickAndWait(loc.getDataGroupByName01(BYpart),"");
        actions.clickAndWait(loc.RunSequence, "user clicked on run sequence button");
        actions.clearAndType(loc.ParaToMatch, "Test01","user entered para to value in inputtextfield");
        actions.clickAndWait(loc.inputlistpartok, "user clicked on run sequence button");
        actions.printDateAndTime(loc.AutomaticData,loc.AutomaticTime);
        actions.clearAndType(loc.BYpartvariable, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable02, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable03, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable04, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable05, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable06, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable07, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable08, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable09, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable10, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable11, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable12, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable13, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable14, "10","user entered value to subgroupsize");
        actions.clearAndType(loc.BYpartvariable15, "10","user entered value to subgroupsize");


        actions.clickAndWait(loc.BYPartAttribute, "user entered value to subgroupsize");


        actions.clickAndWait(loc.RadioButton01, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton02, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton03, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton04, "user clicked on defect rado button");
        actions.clickAndWait(loc.RadioButton05, "user clicked on defect rado button");

        actions.clickAndWait(loc.TotalInput, "user clicked on defect rado button");
        actions.clearAndType(loc.TotalInput, "99","user entered value to subgroupsize");
        actions.strongClick1(loc.partok);
        actions.clickAndWait(loc.Bypartsave,"user clicked save button");


    }


}