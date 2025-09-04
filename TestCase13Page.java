package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestCase13Page {


	private WebDriver driver;
	private WebDriverWait wait;
	
	


    private By gettitle = By.xpath("//div[text()='Data Group Name']");
 private By addnew1 = By.id("new");
 private By addgrp = By.xpath("//a[text()='Add Data Group ']");
 private By enterGrpName = By.id("AddGroup");
 private By clickAdd = By.xpath("//button[text()=' Add ']");


//part
private By addnew = By.xpath("//img[@src=\"./assets/images/new.svg?v=1010108\"]");
private By clkpart = By.xpath("//a[text()='Add Part ']");
private By clickdrop = By.xpath("//div[@class='dx-dropdowneditor-icon']");
private By slctGrp = By.xpath("//div[text()='SPC_Attribute_Group']");
private By Enterpart = By.id("AddPart");
private By ClkADD = By.xpath("//button[text()=' Add ']");


//Char

private By  addchar= By.id("AddChar");
private By  charaaddbutton= By.xpath("//button[text()=' Add ']");
private By  dropdownatt = By.xpath("(//lib-devextreme-selectbox)[3]");
private By select1 = By.xpath("//div[contains(text(),'Attribute')]");
private By Defects = By.id("//a[text()='Defects']");

private By  add01= By.xpath("//span[@class=\"qual_plus\"]");
private By defect1 = By.id("defectName");
private By Save01= By.xpath("(//button[text()=' Save '])[2]");


private By  add02= By.xpath("//span[@class=\"qual_plus\"]");
private By defect2 = By.id("defectName");
private By Save02= By.xpath("(//button[text()=' Save '])[2]");


private By  add03= By.xpath("//span[@class=\"qual_plus\"]");
private By defect3 = By.id("defectName");
private By Save03= By.xpath("(//button[text()=' Save '])[2]");



private By  add04= By.xpath("//span[@class=\"qual_plus\"]");
private By defect4 = By.id("defectName");
private By Save04= By.xpath("(//button[text()=' Save '])[2]");


private By  add05= By.xpath("//span[@class=\"qual_plus\"]");
private By defect5 = By.id("defectName");
private By Save05= By.xpath("(//button[text()=' Save '])[2]");


private By saveAttribute = By.xpath("(//button[text()=' Save '])[1]");
private By  closechar= By.xpath("(//button[text()=' Close '])[1]");



//creating para01 numeric


private By clickconfiguration01 = By.xpath("(//img)[8]");
private By clickaddpara2 = By.xpath("(//img[@class='imgStyle1'])[1]");
private By sendparaname2 = By.xpath("(//input[@maxlength=\"40\"])[1]");
private By numericRD  = By.xpath("(//input[@type=\"radio\"])[9]");
private By save2 = By.xpath("//button[text()='Save']");
private By close2 = By.xpath("//button[text()='Close']");


//creating para02 password


private By clickaddpara4 = By.xpath("(//img[@class='imgStyle1'])[1]");
private By sendparaname4 = By.xpath("(//input[@maxlength=\"40\"])[1]");
private By password = By.xpath("//label[normalize-space()='Password Protected']//span[@class='checkmark']");
private By  ADDPARA1= By.id("addparaentry");
private By Enterpassword = By.xpath("(//input[@id='password'])[1]");
private By ReEnterpassword = By.xpath("(//input[@id='password'])[2]");
private By ppa1 = By.xpath("//img[@ngbtooltip=\"Add Parameter Entry\"]");


private By  ADDPARA2= By.id("addparaentry");
private By Enterpassword2 = By.xpath("(//input[@id='password'])[1]");
private By ReEnterpassword2 = By.xpath("(//input[@id='password'])[2]");
private By ppa2 = By.xpath("//img[@ngbtooltip=\"Add Parameter Entry\"]");

private By save4 = By.xpath("//button[text()='Save']");
private By close4 = By.xpath("//button[text()='Close']");


//Assign para to part



private By filesicon = By.xpath("//div[@class='iconpos-top']//div[1]//span[1]//img[1]");
 private By Addptp = By.id("new");
private By Assignparaicon = By.xpath("//a[text()='Assign Parameters to Part ']");
private By datadropdown= By.xpath("(//input[@role='combobox'])[1]");
private By selectgrp= By.xpath("//div[contains(text(),'SPC_Attribute_Group')]");
private By partdropdown = By.xpath("(//input[@role='combobox'])[2]");
private By selectpartpara = By.xpath("//div[contains(text(),'Car Brake parts')]");
private By checkallbox = By.xpath("(//span[@class='checkmark'])[4]");
private By kebabicon = By.xpath("//span[@class='layout-btn btn-more none']//img");
private By assignlink = By.xpath("//a[text()='Assign']");
private By saveassign = By.xpath("//button[text()=' Save ']");
private By closeassign = By.xpath("//button[text()=' Close ']");

//Add sequence


private By addseqlink = By.xpath("//img[@id=\"new\"]");
private By addsequece= By.xpath("//a[text()='Add Sequence ']");
private By clickdatagroup = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");
private By selectdatagrp = By.xpath("//div[text()='SPC_Attribute_Group']");
private By clickpart = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
private By selectpart = By.xpath("//div[text()='Car Brake parts']");
private By clickonadd = By.xpath("//button[text()=' Add ']");
private By EnterSequencename = By.xpath("//input[@maxlength=\"40\"]");
private By SelectallCB= By.xpath("(//span[@class=\"checkmark\"])[4]");
private By Kebab = By.xpath("//span[@class='layout-btn btn-more none']//img");
private By assign = By.xpath("//a[text()='Assign']");
private By save = By.xpath("//button[text()='Save']");
private By close1 = By.xpath("//button[text()=' Close ']");

//create satellite and page

private By network = By.xpath("(//img)[6]");
private By oknetwork = By.xpath("//button[text()='OK']");
private By addsatellite = By.id("new");
private By satellite= By.xpath("//span[text()='Add Satellite']");
private By Entersatellitename= By.xpath("//input[@id=\"AddGroup\"]");
private By Addsetellite = By.xpath("//button[text()='Add']");


private By Kebabsatellite = By.xpath("//span[@class='inline_svg svg_highlight moreimg']//img");
private By Addpage = By.xpath("(//span[text()='Add Page'])[2]");
private By Enterpagenamesatellite = By.xpath("//input[@placeholder=\"Page Name\"]");
private By Addsatellitepage = By.xpath("//button[text()=' Add ']");
private By Dragsequencname = By.xpath("//p[text()=' SPC_Attribute_Group ']");
private By savesatellitepage = By.xpath("(//button[text()=' Save '])[1]");
private By closesatellitepage = By.xpath("(//button[text()='Close'])[1]");
private By clickeditpage = By.xpath("(//div[@class=\"dl_dashrow\"])[2]");


//edit chart01
private By network1 = By.xpath("(//img)[6]");
private By clickvaripage = By.xpath("//h5[text()='Brake System']");
private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[1]");
private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By defectsub01= By.xpath("(//input[@cursorposition=\"2\"])[1]");
private By defectsub02= By.xpath("(//input[@cursorposition=\"2\"])[2]");
private By defectsub03= By.xpath("(//input[@cursorposition=\"2\"])[3]");
private By defectsub04= By.xpath("(//input[@cursorposition=\"2\"])[4]");
private By defectsub05= By.xpath("(//input[@cursorposition=\"2\"])[5]");
private By total01 = By.id("totSubgroup_0");
private By ppenter = By.xpath("//input[@type=\"password\"]");
private By validate = By.xpath("//button[text()=' Validate ']");
private By savechart = By.id("sequencebychartsave");
private By getText = By.id("linkheader");

//edit chart02

private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By defectsub11= By.xpath("(//input[@cursorposition=\"2\"])[1]");
private By defectsub12= By.xpath("(//input[@cursorposition=\"2\"])[2]");
private By defectsub13= By.xpath("(//input[@cursorposition=\"2\"])[3]");
private By defectsub14= By.xpath("(//input[@cursorposition=\"2\"])[4]");
private By defectsub15= By.xpath("(//input[@cursorposition=\"2\"])[5]");
private By total02 = By.id("totSubgroup_0");
private By parameterdp1= By.xpath("//select[@id='parameterEntry_4060_4114']");
private By ppenter1 = By.xpath("//input[@type=\"password\"]");
private By validate1 = By.xpath("//button[text()='Validate']");
private By subgroup11= By.id("Subgroup_0");
private By subgroup21= By.id("Subgroup_1");
private By savechart2 = By.id("sequencebychartsave");
private By getText2 = By.id("linkheader");


//edit chart03

private By time3= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By defectsub21= By.xpath("(//input[@cursorposition=\"2\"])[1]");
private By defectsub22= By.xpath("(//input[@cursorposition=\"2\"])[2]");
private By defectsub23= By.xpath("(//input[@cursorposition=\"2\"])[3]");
private By defectsub24= By.xpath("(//input[@cursorposition=\"2\"])[4]");
private By defectsub25= By.xpath("(//input[@cursorposition=\"2\"])[5]");
private By total03 = By.id("totSubgroup_0");;
private By NumricValu= By.xpath("//input[@cursorposition=\"1\"]");
private By savechart3 = By.id("sequencebychartsave");
private By getText3 = By.id("linkheader");


//edit chart04

private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By ppenter12 = By.xpath("//input[@type=\"password\"]");
private By validate12 = By.xpath("//button[text()='Validate']");
private By defectsub31= By.xpath("(//input[@cursorposition=\"2\"])[1]");
private By defectsub32= By.xpath("(//input[@cursorposition=\"2\"])[2]");
private By defectsub33= By.xpath("(//input[@cursorposition=\"2\"])[3]");
private By defectsub34= By.xpath("(//input[@cursorposition=\"2\"])[4]");
private By defectsub35= By.xpath("(//input[@cursorposition=\"2\"])[5]");
private By total04 = By.id("totSubgroup_0");
private By savechart4 = By.id("sequencebychartsave");
private By getText4 = By.id("linkheader");



//edit chart05

private By time5= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By defectsub41= By.xpath("(//input[@cursorposition=\"2\"])[1]");
private By defectsub42= By.xpath("(//input[@cursorposition=\"2\"])[2]");
private By defectsub43= By.xpath("(//input[@cursorposition=\"2\"])[3]");
private By defectsub44= By.xpath("(//input[@cursorposition=\"2\"])[4]");
private By defectsub45= By.xpath("(//input[@cursorposition=\"2\"])[5]");
private By total05 = By.id("totSubgroup_0");
private By savechart5 = By.id("sequencebychartsave");
private By getText5 = By.id("linkheader");

	

//edit chart06

	
	
	
	


public TestCase13Page(WebDriver driver) {
	 this.driver =  driver;
	 this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
}





public void addnew11() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    // Wait for the loader to disappear
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

    // Click on the element using JavaScript
    WebElement addLink = driver.findElement(By.id("new"));
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].click();", addLink);
}


    public void clickaddgrp() throws InterruptedException {
    	Thread.sleep(1000);
        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(addgrp));
        addGrpElement.click();
    }

    public void entergrpname() {
        WebElement grpNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(enterGrpName));
        grpNameElement.sendKeys("SPC_Attribute_Group");
    }

    public void clickaddbtn() {
        WebElement addBtnElement = wait.until(ExpectedConditions.elementToBeClickable(clickAdd));
        addBtnElement.click();
        try {
            // Wait for the popup to appear
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

            // Fetch the text from the popup element
            String popupText = popup.getText();
            System.out.println("Popup text: " + popupText);

            // Validate or use the text
//            String expectedText = "Your expected popup text here";
//            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

        } catch (Exception e) {
            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
        }
    }












//part


 public void addnew1() {
	 WebElement element = driver.findElement(By.id("new"));
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
 }

public void clickpart1() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(clkpart));
	 addpart.click();

}

public void selectdropdown() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(clickdrop));
	 addpart.click();

}
public void selectgroup() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(slctGrp));
	 addpart.click();

}

public void enterpartname() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(Enterpart));
	 addpart.sendKeys("Car Brake parts");

}

public void clickAdd() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(ClkADD));
	 addpart.click();
	 try {
            // Wait for the popup to appear
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

            // Fetch the text from the popup element
            String popupText = popup.getText();
            System.out.println("Popup text: " + popupText);

            // Validate or use the text
//            String expectedText = "Your expected popup text here";
//            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

        } catch (Exception e) {
            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
        }







}



//Char

public void addchar() throws InterruptedException {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(addchar));
	 Thread.sleep(1000);
	 addpart.sendKeys("No Status ");

}

public void charaaddbutton() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(charaaddbutton));
	 addpart.click();

}




public void dropdownatt() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(dropdownatt));
	 addpart.click();

}

public void select1() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(select1));
	 addpart.click();

}

public void Defects() {



	 WebElement element = driver.findElement(By.xpath("//a[@href=\"#defects\"]"));
 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
element.click();
}

public void add01() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add01));
	 addpart.click();

}

public void defect1() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect1));
	 addpart.sendKeys("Defect1");

}

public void Save01() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(Save01));
	 addpart.click();

}


public void add02() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add02));
	 addpart.click();

}

public void defect2() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect2));
	 addpart.sendKeys("Defect2");

}

public void Save02() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(Save02));
	 addpart.click();

}

public void add03() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add03));
	 addpart.click();

}

public void defect3() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect3));
	 addpart.sendKeys("Defect3");

}

public void Save03() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(Save03));
	 addpart.click();

}


public void add04() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add04));
	 addpart.click();

}

public void defect4() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect4));
	 addpart.sendKeys("Defect4");

}

public void Save04() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(Save04));
	 addpart.click();

}



public void add05() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add04));
	 addpart.click();

}

public void defect5() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect4));
	 addpart.sendKeys("Defect5");

}

public void Save05() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(Save04));
	 addpart.click();

}




public void saveAttribute() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(saveAttribute));
	 addpart.click();
	 try {
            // Wait for the popup to appear
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

            // Fetch the text from the popup element
            String popupText = popup.getText();
            System.out.println("Popup text: " + popupText);

            // Validate or use the text
//            String expectedText = "Your expected popup text here";
//            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

        } catch (Exception e) {
            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
        }}

	 public void closechar() throws InterruptedException {
Thread.sleep(1000);
		 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(closechar));
		 addpart.click();

	


}
	



//parameter numeric parameter

public void clickconfiguration01() throws InterruptedException {



	Thread.sleep(1000);
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickconfiguration01));
	 para.click();
}



public void clickaddpara2() throws InterruptedException {



	Thread.sleep(2000);
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickaddpara2));
	 para.click();
}


public void sendparaname2() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sendparaname2));
	 para.sendKeys("Number");
}


public void numericRD() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(numericRD));
	 para.click();
}


public void save2() {
	 WebElement save = wait.until(ExpectedConditions.elementToBeClickable(save2));
	 save.click();

	 try {
            // Wait for the popup to appear
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

            // Fetch the text from the popup element
            String popupText = popup.getText();
            System.out.println("Popup text: " + popupText);

            // Validate or use the text
//            String expectedText = "Your expected popup text here";
//            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

        } catch (Exception e) {
            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
        }


}

public void close2() {
	 WebElement close = wait.until(ExpectedConditions.elementToBeClickable(close2));
	 close.click();
}




////creating pra02
public void clickaddpara4() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickaddpara4));
	 para.click();
}


public void sendparaname4() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sendparaname4));
	 para.sendKeys("Password");
}


public void password() {
	
	 WebElement enterparaname =  driver.findElement(By.xpath("//label[normalize-space()='Password Protected']//span[@class='checkmark']"));
     Actions actions01 = new Actions(driver);
     actions01.scrollToElement(enterparaname).perform();
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(password));
	 para.click();
       
}


public void ADDPARA1() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ADDPARA1));
	 para.sendKeys("Medical");
      
}


public void Enterpassword() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Enterpassword));
	 para.sendKeys("123");
      
}

public void ReEnterpassword() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ReEnterpassword));
	 para.sendKeys("123");
      
}

public void ppa1() {
	WebElement element = driver.findElement(By.xpath("//img[@disabled=\"false\"]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	element.click();
}




public void ADDPARA2() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ADDPARA2));
	 para.sendKeys("industries");
      
}


public void Enterpassword2() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Enterpassword2));
	 para.sendKeys("123");
      
}

public void ReEnterpassword2() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ReEnterpassword2));
	 para.sendKeys("123");
      
}

public void ppa2() {
	WebElement element = driver.findElement(By.xpath("//img[@disabled=\"false\"]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	element.click();
     
}



public void save4() {
	 WebElement save = wait.until(ExpectedConditions.elementToBeClickable(save4));
	 save.click();


	 try {
            // Wait for the popup to appear
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

            // Fetch the text from the popup element
            String popupText = popup.getText();
            System.out.println("Popup text: " + popupText);

            // Validate or use the text
//            String expectedText = "Your expected popup text here";
//            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

        } catch (Exception e) {
            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
        }
}


public void close4() {
	 WebElement close = wait.until(ExpectedConditions.elementToBeClickable(close4));
	 close.click();
}
	
//assigh para to part


public void filesicon() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(filesicon));
	 para.click();
}


public void Addptp() {
	 WebElement element = driver.findElement(By.id("new"));
   	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
}


public void Assignparaicon() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Assignparaicon));
	 para.click();
}

public void datadropdown() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(datadropdown));
	 para.click();
}

public void selectgrp() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(selectgrp));
	 para.click();
}



public void partdropdown() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(partdropdown));
	 para.click();
}


public void selectpartpara() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(selectpartpara));
	 para.click();
}



public void checkallbox() {
//	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
//	 para.click();
	 WebElement para = driver.findElement(By.xpath("//p[text()=' Numeric ']"));
		WebElement test = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
		  Actions actions02 = new Actions(driver);
		  actions02.clickAndHold(para).moveToElement(test).release().build().perform();
		  
		  WebElement para1 = driver.findElement(By.xpath("//p[text()=' PasswordProtection ']"));
			WebElement test1 = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
			  Actions actions021 = new Actions(driver);
			  actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();
			  
		  
		  
}






public void kebabicon() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(kebabicon));
	 para.click();
}



public void assignlink() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(assignlink));
	 para.click();
}



public void saveassign() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(saveassign));
	 para.click();
}



public void closeassign() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(closeassign));
	 para.click();

	 try {
           // Wait for the popup to appear
           WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

           // Fetch the text from the popup element
           String popupText = popup.getText();
           System.out.println("Popup text: " + popupText);

           // Validate or use the text
//           String expectedText = "Your expected popup text here";
//           Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

       } catch (Exception e) {
           System.err.println("Failed to fetch text from the popup: " + e.getMessage());
       }
	 
	 
}
	//seq


		 public void addseqlink() {
			 WebElement addLink = driver.findElement(By.id("new"));
			    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			    jsExecutor.executeScript("arguments[0].click();", addLink);
		 }


			public void addsequece() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(addsequece));
				 para.click();
			}


			public void clickdatagroup() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickdatagroup));
				 para.click();
			}

			public void selectdatagrp() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(selectdatagrp));
				 para.click();
			}


			public void clickpart() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickpart));
				 para.click();
			}



			public void selectpart() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(selectpart));
				 para.click();
			}



			public void clickonadd() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickonadd));
				 para.click();
			}




			public void EnterSequencename() throws InterruptedException {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(EnterSequencename));
				 para.sendKeys("Combination Codes");
			}


			public void draganddrop() {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=' No Status ']")));
				WebElement test = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=' Characteristics in Sequence ']")));

				// Scroll elements into view
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", para);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", test);

				// Try JavaScript drag-and-drop
				String script = "function createEvent(typeOfEvent) { " +
				                "var event = document.createEvent(\"CustomEvent\");" +
				                "event.initCustomEvent(typeOfEvent, true, true, null);" +
				                "return event; } " +
				                "function dispatchEvent(element, event, transferData) { " +
				                "if (transferData !== undefined) { event.dataTransfer = transferData; }" +
				                "element.dispatchEvent(event); } " +
				                "function simulateHTML5DragAndDrop(element, destination) { " +
				                "var dragStartEvent = createEvent('dragstart');" +
				                "dispatchEvent(element, dragStartEvent);" +
				                "var dropEvent = createEvent('drop');" +
				                "dispatchEvent(destination, dropEvent);" +
				                "var dragEndEvent = createEvent('dragend');" +
				                "dispatchEvent(element, dragEndEvent); } " +
				                "simulateHTML5DragAndDrop(arguments[0], arguments[1]);";

				((JavascriptExecutor) driver).executeScript(script, para, test);

			}


			
			
			
			
			
			
			public void save() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(save));
				 para.click();

				 try {
			            // Wait for the popup to appear
			            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

			            // Fetch the text from the popup element
			            String popupText = popup.getText();
			            System.out.println("Popup text: " + popupText);

			            // Validate or use the text
//			            String expectedText = "Your expected popup text here";
//			            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

			        } catch (Exception e) {
			            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
			        }
			}

			public void close1() {
				
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(close1));
				 para.click();
			}



//		creating satellite


			public void network() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(network));
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
				jsExecutor.executeScript("arguments[0].click();", para);
				 
			}

			
			public void oknetwork() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(oknetwork));
				 para.click();
				 
			}
			
			
			
			
			public void addsatellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(addsatellite));
				 para.click();
			}

			public void satellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(satellite));
				 para.click();
			}
			
			
			public void Addpaegsatellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addpage));
				 para.click();
			}
			
			

			public void Entersatellitename() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Entersatellitename));
				 para.sendKeys("Communication Satellites");
			}


			public void Addsetellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addsetellite));
				 para.click();
			}



			public void Kebabsatellite() {
//				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Kebabsatellite));
//				 para.click();
				 WebElement kebabIcon = driver.findElement(By.xpath("//a[@class='moreimg']//img"));

				// Click the element using JavaScript
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", kebabIcon);

			}

			
			public void Enterpagenamesatellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Enterpagenamesatellite));
				 para.sendKeys("Brake System");
			}
			

				

			public void Addsatellitepage() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addsatellitepage));
				 para.click();
			}

			

			public void Dragsequencname() {

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Dragsequencname));
				WebElement test = driver.findElement(By.xpath("(//p[text()=' Brake System '])[1]"));
				  Actions actions02 = new Actions(driver);
				  actions02.clickAndHold(para).moveToElement(test).release().build().perform();

			}

			public void savesatellitepage() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savesatellitepage));
				 para.click();
			}



			public void network1() throws InterruptedException {
	Thread.sleep(1000);
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(network1));
				 para.click();
			}


			public void clickvaripage() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickvaripage));
				 para.click();
			} 
	 

			public void editpencil() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(editpencil));
				 para.click();
			}



			public void date() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(date));
				 para.click();
			}



			public void time() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time));
				 para.click();
			}

			public void parameterdp() {
				WebElement para = driver.findElement(By.xpath("//select[@cursorposition=\"1\"]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", para);

				 WebElement para1 =  driver.findElement(By.xpath("//option[text()=' industries ']"));
				 para.click();
				 para1.click();

			}


			public void ppenter() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ppenter));
				 para.sendKeys("123");
			}


			public void validate() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(validate));
				 para.click();
			}
			
		

			public void defectsub01() {
			    WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub01));

			    String expectedValue = "1";
			    para.sendKeys(expectedValue);

			    // Wait for the attribute to be updated
			  
			}

			public void defectsub02() {
			    WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub02));

			    String expectedValue = "1";
			    para.sendKeys(expectedValue);

			   
			}

			
			
			public void defectsub04() {
			    WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub04));

			    String expectedValue = "1";
			    para.sendKeys(expectedValue);

			   
			}

			
			
			
			public void total01() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(total01));
				 para.sendKeys("30");
			}



			public void savechart() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart));
				 para.click();
			}


			@SuppressWarnings("deprecation")
			public void getText() {
			    // Wait for the element to be clickable and get its text
			    WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText));
			    String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

			    // Define the expected result
			    String expectedResults = "No Status!";

			    // Log both results for debugging
			    System.out.println("Expected: '" + expectedResults + "'");
			    System.out.println("Actual: '" + actualResults + "'");

			    // Assert the actual result matches the expected result
			    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);
			}


			
			
			

//			editchart02

	// private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
		  


			public void time2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time2));
				 para.click();
			}
			
			
			
			
			
			
			public void parameterdp1() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp1));
				 WebElement para1 =  driver.findElement(By.xpath("//option[text()='Medical']"));
				 para.click();
				 para1.click();

			}


			public void ppenter1() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ppenter1));
				 para.sendKeys("123");
			}


			public void validate1() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(validate1));
				 para.click();
			}
			
		

			public void defectsub11() {
				WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub11));

				String expectedValue = "1";
				para.sendKeys(expectedValue);

				// Fetch the value from the UI using getAttribute("value")


			}


				public void defectsub12() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub12));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);


			}
			

			public void defectsub13() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub13));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);


			}



			public void defectsub14() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub14));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);

			}
			
			

			
			
			
			public void total02() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(total02));
				 para.sendKeys("30");
			}
			
			
			
			
			
			
			
			public void savechart2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart2));
				 para.click();
			}


			@SuppressWarnings("deprecation")
			public void getText2() {
			    // Wait for the element to be clickable and get its text
			    WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText2));
			    String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

			    // Define the expected result
			    String expectedResults = "Process in Control";

			    // Log both results for debugging
			    System.out.println("Expected: '" + expectedResults + "'");
			    System.out.println("Actual: '" + actualResults + "'");

			    // Assert the actual result matches the expected result
			    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);
			}


public void validateDataValues01() {
				
			    try {
			        // Array of XPaths
			        String[] xpaths = {
			            "(//div[@class=\"card_content_data stat_col\"])[1]",
			            "(//div[@class=\"card_content_data stat_col\"])[2]",
			            "(//div[@class=\"card_content_data stat_col\"])[3]",
			            "(//div[@class=\"card_content_data stat_col\"])[4]",
			            "(//div[@class=\"card_content_data stat_col\"])[5]",
			            "(//div[@class=\"card_content_data stat_col\"])[6]",
			            "(//div[@class=\"card_content_data stat_col\"])[7]",
			            "(//div[@class=\"card_content_data stat_col\"])[8]",
			            "(//div[@class=\"card_content_data stat_col\"])[9]",
			            "(//div[@class=\"card_content_data stat_col\"])[11]",
			            "(//div[@class=\"card_content_data stat_col\"])[12]",
			        };

			        // Array of expected values
			        String[] expectedValues = {
			            "7.0000", "7.0000", "7.0000", 
			            "0.0000", "0.0000", "0.0000", 
			            "99.99", "99.99", "9999.00 %",
			            "7.0000", "0.0000"
			        };

			        // Loop through the XPaths and validate
			        for (int i = 0; i < xpaths.length; i++) {
			            // Locate the web element
			            WebElement element = driver.findElement(By.xpath(xpaths[i]));

			            // Get the actual text
			            String actualText = element.getText();

			            // Validate the text
			            if (actualText.equals(expectedValues[i])) {
			                System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value."+ actualText);
			            } else {
			                System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "error");
			            }
			        }
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		



			//edit03


			public void time3() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time3));
				 para.click();
			}



			public void defectsub21() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub21));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);


			}

			

			public void defectsub22() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub22));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);


			}
			

			


			public void defectsub24() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub24));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);


			}
			
			

			public void defectsub25() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub25));
		
				 String expectedValue = "2";
				    para.sendKeys(expectedValue);


			}

			
			public void total03() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(total03));
				 para.sendKeys("30");
			}

			public void savechart3() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart3));
				 para.click();
			}
			
			
			public void NumricValu() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(NumricValu));
				 para.sendKeys("TestPara1234");
			}
			
			public void getText3() {
				  WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText2));
				    String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

				    // Define the expected result
				    String expectedResults = "Process in Control";

				    // Log both results for debugging
				    System.out.println("Expected: '" + expectedResults + "'");
				    System.out.println("Actual: '" + actualResults + "'");

				    // Assert the actual result matches the expected result
				    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


			}

public void validateDataValues02() {
				
			    try {
			        // Array of XPaths
			        String[] xpaths = {
			            "(//div[@class=\"card_content_data stat_col\"])[1]",
			            "(//div[@class=\"card_content_data stat_col\"])[2]",
			            "(//div[@class=\"card_content_data stat_col\"])[3]",
			            "(//div[@class=\"card_content_data stat_col\"])[4]",
			            "(//div[@class=\"card_content_data stat_col\"])[5]",
			            "(//div[@class=\"card_content_data stat_col\"])[6]",
			            "(//div[@class=\"card_content_data stat_col\"])[7]",
			            "(//div[@class=\"card_content_data stat_col\"])[8]",
			            "(//div[@class=\"card_content_data stat_col\"])[9]",
			            "(//div[@class=\"card_content_data stat_col\"])[11]",
			            "(//div[@class=\"card_content_data stat_col\"])[12]",
			        };

			        // Array of expected values
			        String[] expectedValues = {
			            "6.9862", "7.0050", "7.0238", 
			            "0.0000", "0.0100", "0.0327", 
			            "150.40", "0.19", "0.66 %",
			            "7.0100", "0.0200"
			        };

			        // Loop through the XPaths and validate
			        for (int i = 0; i < xpaths.length; i++) {
			            // Locate the web element
			            WebElement element = driver.findElement(By.xpath(xpaths[i]));

			            // Get the actual text
			            String actualText = element.getText();

			            // Validate the text
			            if (actualText.equals(expectedValues[i])) {
			                System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value."+ actualText);
			            } else {
			                System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "error");
			            }
			        }
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}
			

		//  edit chart04




			public void time4() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time4));
				 para.click();
			}

			
			public void parameterdp13() {
				WebElement para = driver.findElement(By.xpath("//select[@cursorposition=\"1\"]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", para);

				 WebElement para1 =  driver.findElement(By.xpath("//option[text()=' industries ']"));
				 para.click();
				 para1.click();

			}
			
			public void ppenter12() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ppenter12));
				 para.sendKeys("123");
			}


			public void validate12() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(validate12));
				 para.click();
			}

			public void defectsub31() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub31));
		
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);


			}

			

			public void defectsub32() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub32));
		
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);


			}
			

			

			public void total04() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(total04));
				 para.sendKeys("30");
			}

			public void savechart4() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart4));
				 para.click();
			}

			public void getText4() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText4));
				 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

				    // Define the expected result
				 String expectedResults = "Process in Control";

				    // Log both results for debugging
				    System.out.println("Expected: '" + expectedResults + "'");
				    System.out.println("Actual: '" + actualResults + "'");

				    // Assert the actual result matches the expected result
				    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);

				    

			}
public void validateDataValues03() {
				
			    try {
			        // Array of XPaths
			        String[] xpaths = {
			            "(//div[@class=\"card_content_data stat_col\"])[1]",
			            "(//div[@class=\"card_content_data stat_col\"])[2]",
			            "(//div[@class=\"card_content_data stat_col\"])[3]",
			            "(//div[@class=\"card_content_data stat_col\"])[4]",
			            "(//div[@class=\"card_content_data stat_col\"])[5]",
			            "(//div[@class=\"card_content_data stat_col\"])[6]",
			            "(//div[@class=\"card_content_data stat_col\"])[7]",
			            "(//div[@class=\"card_content_data stat_col\"])[8]",
			            "(//div[@class=\"card_content_data stat_col\"])[9]",
			            "(//div[@class=\"card_content_data stat_col\"])[11]",
			            "(//div[@class=\"card_content_data stat_col\"])[12]",
			        };

			        // Array of expected values
			        String[] expectedValues = {
			            "6.9908", "7.0033", "7.0159", 
			            "0.0000", "0.0067", "0.0218", 
			            "225.60", "0.19", "0.44 %",
			            "7.0000", "0.0000"
			        };

			        // Loop through the XPaths and validate
			        for (int i = 0; i < xpaths.length; i++) {
			            // Locate the web element
			            WebElement element = driver.findElement(By.xpath(xpaths[i]));

			            // Get the actual text
			            String actualText = element.getText();

			            // Validate the text
			            if (actualText.equals(expectedValues[i])) {
			                System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value."+ actualText);
			            } else {
			                System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "error");
			            }
			        }
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}
			


		//  edit chart05


			public void time5() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time5));
				 para.click();
			}




			public void defectsub41() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub41));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);

			}

			

		
			public void defectsub43() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub43));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);


			}



			public void defectsub44() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub44));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);


			}
			
			

			public void defectsub45() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub45));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);


			}
			public void total05() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(total05));
				 para.sendKeys("30");
			}

			public void savechart5() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart5));
				 para.click();
			}

			public void getText5() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText5));
				 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

				    // Define the expected result
				 String expectedResults = "Process in Control";

				    // Log both results for debugging
				    System.out.println("Expected: '" + expectedResults + "'");
				    System.out.println("Actual: '" + actualResults + "'");

				    // Assert the actual result matches the expected result
				    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


			}
public void validateDataValues04() {
				
			    try {
			        // Array of XPaths
			        String[] xpaths = {
			            "(//div[@class=\"card_content_data stat_col\"])[1]",
			            "(//div[@class=\"card_content_data stat_col\"])[2]",
			            "(//div[@class=\"card_content_data stat_col\"])[3]",
			            "(//div[@class=\"card_content_data stat_col\"])[4]",
			            "(//div[@class=\"card_content_data stat_col\"])[5]",
			            "(//div[@class=\"card_content_data stat_col\"])[6]",
			            "(//div[@class=\"card_content_data stat_col\"])[7]",
			            "(//div[@class=\"card_content_data stat_col\"])[8]",
			            "(//div[@class=\"card_content_data stat_col\"])[9]",
			            "(//div[@class=\"card_content_data stat_col\"])[11]",
			            "(//div[@class=\"card_content_data stat_col\"])[12]",
			        };

			        // Array of expected values
			        String[] expectedValues = {
			            "6.9862", "7.0050", "7.0238", 
			            "0.0000", "0.0100", "0.0327", 
			            "150.40", "0.19", "0.66 %",
			            "7.0100", "0.0200"
			        };

			        // Loop through the XPaths and validate
			        for (int i = 0; i < xpaths.length; i++) {
			            // Locate the web element
			            WebElement element = driver.findElement(By.xpath(xpaths[i]));

			            // Get the actual text
			            String actualText = element.getText();

			            // Validate the text
			            if (actualText.equals(expectedValues[i])) {
			                System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value."+ actualText);
			            } else {
			                System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "error");
			            }
			        }
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}
			


}



