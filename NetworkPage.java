package pages;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.CustomDropdownUtils;
import util.ExtentReportManager;
import util.UIActions;

import java.time.Duration;
import java.util.Map;

public class NetworkPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private Map<String, String> testData;

    UIActions actions;


    private ExtentTest test;

    {
        // Initialize a new test
        {
            this.test = ExtentReportManager.getTest();
        }
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();


//add
    private final By network = By.xpath("(//img)[6]");
    private final By addnetwork = By.id("new");
    private final By addsatelllite = By.xpath("//span[contains(text(),'Add Satellite')]");
    private final By entername = By.xpath("//input[@id=\"AddGroup\"]");
    private final By addsatname = By.xpath("//button[contains(text(),\"Add\")]");

    private final By next = By.xpath("//img[@class=\"rgticn NEXT_BLUE\"]");
    private final By kebebicon = By.xpath("//a[@class=\"moreimg\"]");
    private final By editsatellite = By.xpath("//span[contains(text(), \"Edit Satellite\")]");
    private final By editname  = By.xpath("//input[@id=\"AddGroup\"]");
    private final By save  = By.xpath("(//button[contains(text(),\"Save\")])[1]");
    private final By deletesate  = By.xpath("(//span[contains(text(),'Delete Satellite')])[1]");
    private final By delete  = By.xpath("(//button[normalize-space()='Delete'])[1]");



//edit page

    private final By  addpage= By.xpath("(//span[@class='drop_text'][normalize-space()='Add Page'])[2]");
    private final By  pagename= By.xpath("//input[@placeholder=\"Page Name\"]");
    private final By  addbutton = By.xpath("//button[contains(text(),\" Add \")]");
    private final By  drag = By.xpath("//p[contains(text(),\" SPC_Control_Group \")]");
    private final By drop = By.xpath("//p[text()=' DataLyzer ']");
    private final By  submit= By.xpath("(//button[@type='submit'])[1]");

    private final By  kebeb1 = By.xpath("(//a[@class=\"dotsthr\"])[2]");
    private final By editpage = By.xpath("(//span[text()='Edit Page'])[2]");
    private final By drag1 = By.xpath("//p[text()=' SPC_Control_Group ']");
    private final By drop1 = By.xpath("//p[text()=' Available Sequences ']");


    private final By deletepage = By.xpath("(//span[@class='drop_text'][normalize-space()='Delete Page'])[2]");
    private final By deletesubmit  = By.xpath("(//button[normalize-space()='Delete'])[1]");


    //rearrenge satellite

    private final By rearrenge  = By.xpath("(//span[normalize-space()='Rearrange Satellite'])[1]");
    private final By drag2  = By.xpath("//p[text()=' Weather Satellites ']  ");
    private final By drop2  = By.xpath("//p[text()=' Communication Satellites ']  ");
    private final By saver  = By.xpath("(//button[contains(text(),\" Save \")])[1]");
    private final By dropdown  = By.xpath("//span[@class=\"satdrop\"]");
    private final By second = By.xpath("(//span[contains(text(),'Add Satellite')])[2]");


//rearrange page
    private final By kebabpage  = By.xpath("//a[@class=\"moreimg\"]");
    private final By repage  = By.xpath("//span[contains(text(),\"Rearrange Page\")]");
    private final By drag3  = By.xpath("//p[contains(text(),\" Body Parts \")]");
    private final By drop3  = By.xpath("//p[contains(text(),\" Engine Parts \")]");
    private final By savere  = By.xpath("(//button[@type='button'][normalize-space()='Save'])[1]");
    private final By popup = By.xpath("//span[text()='Rearrangements of Pages saved successfully']");


    //cause


    private final By configuration  = By.xpath("(//img)[7]");
    private final By extend  = By.xpath("(//img[@class=\"imgsize\"])[3]");
    private final By dropdowncause  = By.xpath("(//img[@class='tree_dropdown_icon'])[1]");
    private final By dropdown3  = By.xpath("(//img[@class='tree_dropdown_icon'])[2]");
    private final By cause  = By.xpath("//img[@src=\"./assets/svg_icons/cause_note_white.svg\"]");
    private final By addcauseicon  = By.xpath("(//img[@id='new'])[1]");
    private final By addcause  = By.xpath("(//a[normalize-space()='Add Cause'])[1]");
    private final By input  = By.xpath("(//input[@id='AddGroup'])[1]  ");
    private final By savecause  = By.xpath("(//button[@class='btn add'])[1]");
    private final By causegroup  = By.xpath("(//a[normalize-space()='Add Cause Group'])[1]");
    private final By savegroup  = By.xpath("(//button[@class='btn add'])[1]");
    private final By checkbox = By.xpath("(//span[@class=\"checkmark\"])[3]");
    private final By Drag4 = By.xpath("//p[text()=' Delayed Production Schedules ']");
    private final By drag4 = By.xpath("//p[text()=' Cause Group ']");
    private final By savepage  = By.xpath("(//button[@class='btn save allow-save-click'])[1]");

//action link global

    private final By Win  = By.xpath("(//p[normalize-space()='Actions'])[1]");





    // dashbaord


    private final By we  = By.xpath("xpath=//div[4]/span/img");
    private final By re  = By.xpath("//div[@id='show-icon']/span/img");
    private final By ee  = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='User Mapping'])[1]/following::span[2]");
    private final By tr  = By.xpath("//p[text()=' Test1 ']");
    private final By ferf  = By.xpath("//p[text()=' Test3 ']");







    public NetworkPage(WebDriver driver) {
        this.driver = driver;
        CustomDropdownUtils dropdownUtils;

        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);
        dropdownUtils = new CustomDropdownUtils(driver);
    }

  public void AddAED() {
      try {
          //  General
          actions.clickAndWait(network, "User clicked on Add button");
          Thread.sleep(2000);
          actions.clickAndWait(addnetwork, "User clicked on Add Data Group link");
          actions.clickAndWait(addsatelllite, "user clicked on add button");
          actions.clearAndType(entername, "communication satellite", "User entered Data Group name");
          actions.clickAndWait(addsatname, "user clicked on add satellite name");
          Thread.sleep(2000);
          actions.clickAndWait(next,"user clicked on next icon");
          actions.clickAndWait(kebebicon, "User clicked kebeb link");
          actions.clickAndWait(editsatellite, "user clicked on edit satellite");
          actions.clearAndType(editname, "production satellite", "user renamed satellite name");
          actions.clickAndWait(save, "user clicked on save button");
          actions.clickAndWait(kebebicon, "User clicked on kebeb icon");
          actions.clickAndWait(deletesate, "user clicked on delete link button");
          actions.clickAndWait(delete, "user clicked on delete button");


      } catch (Exception e) {
          System.out.println(" Error reading Excel file or executing actions:");
          e.printStackTrace();
      }

  }
      public void Editpage() {
          try {
              //  General
              actions.clickAndWait(network, "User clicked on Add button");
              actions.clickAndWait(kebebicon, "User clicked on Add Kebeb icon");
              actions.clickAndWait(addpage, "user clicked on addpage link");
              actions.clearAndType(pagename, "DataLyzer", "user enter pagename");
              actions.clickAndWait(addbutton, "user clicked on save button");
              actions.dragAndDrop(drag, drop);
              actions.clickAndWait(submit, "user clicked submit button");

              actions.clickAndWait(kebeb1, "User clicked on Add Kebeb icon");

              actions.clickAndWait(editpage, "user clicked on edit page");
              actions.dragAndDrop(drag1, drop1);
              actions.clickAndWait(submit, "user clicked on submit button");
              Thread.sleep(2000);
              actions.clickAndWait(kebeb1, "User clicked on Add Kebeb icon");
              actions.clickAndWait(deletepage, "user clicked on delete page");
              actions.clickAndWait(deletesubmit, "user clicked on delete button");


          } catch (Exception e) {
              System.out.println(" Error reading Excel file or executing actions:");
              e.printStackTrace();
          }

      }
          public void rearranger() {
              try {


                  actions.clickAndWait(network, "User clicked on Add button");
                  Thread.sleep(2000);
                  actions.clickAndWait(addnetwork, "User clicked on Add Data Group link");
                  actions.clickAndWait(addsatelllite, "user clicked on add button");
                  actions.clearAndType(entername, "Navigation Satellites", "User entered Data Group name");
                  actions.clickAndWait(addsatname, "user clicked on add satellite name");

                  actions.clickAndWait(addnetwork, "User clicked on Add Data Group link");
                  actions.clickAndWait(second, "user clicked on add button");
                  actions.clearAndType(entername, "Weather Satellites", "User entered Data Group name");
                  actions.clickAndWait(addsatname, "user clicked on add satellite name");


                  actions.clickAndWait(addnetwork, "User clicked on Add Data Group link");
                  actions.clickAndWait(second, "user clicked on add button");
                  actions.clearAndType(entername, "Military Satellites", "User entered Data Group name");
                  actions.clickAndWait(addsatname, "user clicked on add satellite name");


                  actions.clickAndWait(addnetwork, "User clicked on Add Data Group link");
                  actions.clickAndWait(second, "user clicked on add button");
                  actions.clearAndType(entername, "Space Station Modules", "User entered Data Group name");
                  actions.clickAndWait(addsatname, "user clicked on add satellite name");

                  actions.clickAndWait(addnetwork, "");
                  actions.clickAndWait(rearrenge, "");
                  actions.dragAndDrop(drag2, drop2);
                  actions.clickAndWait(saver, "");
                  actions.clickAndWait(dropdown, "");



              } catch (Exception e) {
                  System.out.println(" Error reading Excel file or executing actions:");
                  e.printStackTrace();
              }


          }

              public void rearrangepage () {
                  try {


                      actions.clickAndWait(network, "User clicked on Add button");
                      Thread.sleep(2000);
                      actions.clickAndWait(kebabpage, "User clicked on Add button");

                      actions.clickAndWait(repage, "User clicked on Add button");

                      actions.dragAndDrop(drag3, drop3);

                      actions.clickAndWait(savere, "User clicked on Add button");


                      actions.getPopupText(popup, "Rearrangements of Pages saved successfully");


                  } catch (Exception e) {
                      System.out.println(" Error reading Excel file or executing actions:");
                      e.printStackTrace();
                  }

              }
                  public void cause () {
                      try {


                          actions.strongClick(configuration);
                          Thread.sleep(1000);
                          actions.clickAndWait(extend, "User clicked on Add button");
                          actions.clickAndWait(dropdowncause, "User clicked on Add button");
                          actions.clickAndWait(dropdown3, "User clicked on Add button");
                          actions.clickAndWait(cause, "User clicked on Add button");

                          actions.clickAndWait(addcauseicon, "User clicked on Add button");
                          actions.clickAndWait(addcause, "User clicked on Add button");
                          actions.clearAndType(input, "Low Product Quality", "user entered cause ");
                          actions.clickAndWait(savecause, "User clicked on Add button");

                          actions.clickAndWait(addcauseicon, "User clicked on Add button");
                          actions.clickAndWait(addcause, "User clicked on Add button");
                          actions.clearAndType(input, "Workplace Accidents", "user entered cause ");
                          actions.clickAndWait(savecause, "User clicked on Add button");

                          actions.clickAndWait(addcauseicon, "User clicked on Add button");
                          actions.clickAndWait(addcause, "User clicked on Add button");
                          actions.clearAndType(input, "Safety Incidents", "user entered cause ");
                          actions.clickAndWait(savecause, "User clicked on Add button");

                          actions.clickAndWait(addcauseicon, "User clicked on Add button");
                          actions.clickAndWait(addcause, "User clicked on Add button");
                          actions.clearAndType(input, "High Manufacturing Costs", "user entered cause ");
                          actions.clickAndWait(savecause, "User clicked on Add button");

                          actions.clickAndWait(addcauseicon, "User clicked on Add button");
                          actions.clickAndWait(addcause, "User clicked on Add button");
                          actions.clearAndType(input, "Delayed Production Schedules", "user entered cause ");
                          actions.clickAndWait(savecause, "User clicked on Add button");

                          actions.clickAndWait(addcauseicon, "User clicked on Add button");
                          actions.clickAndWait(causegroup, "User clicked on Add button");
                          actions.clearAndType(input, "Cause Group", "");
                          actions.clickAndWait(savegroup, "User clicked on Add button");
                          Thread.sleep(1000);
                          actions.clickAndWait(checkbox, "");
                          actions.dragAndDrop(Drag4, drag4);
                          actions.clickAndWait(savepage, "");


                      } catch (Exception e) {
                          System.out.println(" Error reading Excel file or executing actions:");
                          e.printStackTrace();
                      }
                  }

                      public void Action () {
                          try {


                              actions.strongClick(configuration);
                              Thread.sleep(1000);
                              actions.clickAndWait(extend, "User clicked on Add button");
                              actions.clickAndWait(dropdowncause, "User clicked on Add button");
                              actions.clickAndWait(dropdown3, "User clicked on Add button");
                              actions.clickAndWait(cause, "User clicked on Add button");

                              actions.clickAndWait(addcauseicon, "User clicked on Add button");
                              actions.clickAndWait(addcause, "User clicked on Add button");
                              actions.clearAndType(input,"Low Product Quality","user entered cause ");
                              actions.clickAndWait(savecause, "User clicked on Add button");

                              actions.clickAndWait(addcauseicon, "User clicked on Add button");
                              actions.clickAndWait(addcause, "User clicked on Add button");
                              actions.clearAndType(input,"Workplace Accidents","user entered cause ");
                              actions.clickAndWait(savecause, "User clicked on Add button");

                              actions.clickAndWait(addcauseicon, "User clicked on Add button");
                              actions.clickAndWait(addcause, "User clicked on Add button");
                              actions.clearAndType(input,"Safety Incidents","user entered cause ");
                              actions.clickAndWait(savecause, "User clicked on Add button");

                              actions.clickAndWait(addcauseicon, "User clicked on Add button");
                              actions.clickAndWait(addcause, "User clicked on Add button");
                              actions.clearAndType(input,"High Manufacturing Costs","user entered cause ");
                              actions.clickAndWait(savecause, "User clicked on Add button");

                              actions.clickAndWait(addcauseicon, "User clicked on Add button");
                              actions.clickAndWait(addcause, "User clicked on Add button");
                              actions.clearAndType(input,"Delayed Production Schedules","user entered cause ");
                              actions.clickAndWait(savecause, "User clicked on Add button");

                              actions.clickAndWait(addcauseicon, "User clicked on Add button");
                              actions.clickAndWait(causegroup, "User clicked on Add button");
                              actions.clearAndType(input, "Cause Group","");
                              actions.clickAndWait(savegroup, "User clicked on Add button");
                              Thread.sleep(1000);
                              actions.clickAndWait(checkbox,"");
                              actions.dragAndDrop(Drag4, drag4);
                              actions.clickAndWait(savepage,"");




                          } catch (Exception e) {
                              System.out.println(" Error reading Excel file or executing actions:");
                              e.printStackTrace();
                          }


                  }}