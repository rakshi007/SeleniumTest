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


public class Testcase01page {


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
private By slctGrp = By.xpath("//div[text()='SPC_Control_Group']");
private By Enterpart = By.id("AddPart");
private By ClkADD = By.xpath("//button[text()=' Add ']");


//Char

private By  addchar= By.id("AddChar");
private By  charaaddbutton= By.xpath("//button[text()=' Add ']");
private By upperspec = By.id("upperlmt");
private By  lowerspec= By.id("lowerspec");
private By subsize = By.id("subgroupsize");
private By  savechar= By.xpath("//button[text()=' Save ']");
private By controlcahrt = By.xpath("//img[@id='CCP']");
private By Analisys = By.xpath("//a[text()='Analysis']");
private By DefieRun = By.xpath("//select[@formcontrolname=\"DefineRunValue\"]");
private By DefineTrend = By.xpath("//select[@formcontrolname=\"DefineTrendValue\"]");
private By saveDD = By.xpath("//button[text()=' Save ']");
private By ar = By.id("AR");
private By FUNCC = By.xpath("//label[@for='forceUserNoteOnOOC']//span[@class='checkmark']");
private By  savechar1= By.xpath("//button[text()=' Save ']");
private By  closechar= By.xpath("(//button[text()=' Close '])[1]");



//creating para01 numeric


private By clickconfiguration01 = By.xpath("(//img)[8]");
private By clickaddpara2 = By.xpath("(//img[@class='imgStyle1'])[1]");
private By sendparaname2 = By.xpath("(//input[@maxlength=\"40\"])[1]");
private By numericRD  = By.xpath("(//input[@type=\"radio\"])[9]");
private By save2 = By.xpath("//button[text()=' Save ']");
private By close2 = By.xpath("//button[text()=' Close ']");


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

private By save4 = By.xpath("//button[text()=' Save ']");
private By close4 = By.xpath("//button[text()=' Close ']");


//Assign para to part



private By filesicon = By.xpath("//div[@class='iconpos-top']//div[1]//span[1]//img[1]");
 private By Addptp = By.id("new");
private By Assignparaicon = By.xpath("//a[text()='Assign Parameters to Part ']");
private By datadropdown= By.xpath("(//input[@role='combobox'])[1]");
private By selectgrp= By.xpath("//div[contains(text(),'SPC_Control_Group')]");
private By partdropdown = By.xpath("(//input[@role='combobox'])[2]");
private By selectpartpara = By.xpath("//div[contains(text(),'Car Spare parts')]");
private By checkallbox = By.xpath("(//span[@class='checkmark'])[4]");
private By kebabicon = By.xpath("//span[@class='layout-btn btn-more none']//img");
private By assignlink = By.xpath("//a[text()='Assign']");
private By saveassign = By.xpath("//button[text()=' Save ']");
private By closeassign = By.xpath("//button[text()=' Close ']");

//Add sequence


private By addseqlink = By.xpath("//img[@id=\"new\"]");
private By addsequece= By.xpath("//a[text()='Add Sequence ']");
private By clickdatagroup = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");
private By selectdatagrp = By.xpath("//div[text()='SPC_Control_Group']");
private By clickpart = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
private By selectpart = By.xpath("//div[text()='Car Spare parts']");
private By clickonadd = By.xpath("//button[text()=' Add ']");
private By EnterSequencename = By.xpath("//input[@maxlength=\"40\"]");
private By SelectallCB= By.xpath("(//span[@class=\"checkmark\"])[4]");
private By Kebab = By.xpath("//span[@class='layout-btn btn-more none']//img");
private By assign = By.xpath("//a[text()='Assign']");
private By save = By.xpath("//button[text()='Save']");
private By close1 = By.xpath("//button[text()=' Close ']");

//create satellite and page

private By network = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");
private By oknetwork = By.xpath("//button[text()=' OK ']");
private By addsatellite = By.id("new");
private By satellite= By.xpath("//span[text()='Add Satellite']");
private By Entersatellitename= By.xpath("//input[@id=\"AddGroup\"]");
private By Addsetellite = By.xpath("//button[text()='Add']");
private By Kebabsatellite = By.xpath("//span[@class='inline_svg svg_highlight moreimg']//img");

private By Addpaegsatellite = By.xpath("(//span[text()='Add Page'])[2]");
private By Enterpagenamesatellite = By.xpath("(//input[@placeholder='Page Name'])[1]");
private By Addsatellitepage = By.xpath("//button[text()=' Add ']");
private By Dragsequencname = By.xpath("//p[text()=' Function-Based Names ']");
private By savesatellitepage = By.xpath("(//button[text()=' Save '])[1]");
private By closesatellitepage = By.xpath("(//button[text()=' Close '])[2]");
private By clickeditpage = By.xpath("(//div[@class=\"dl_dashrow\"])[2]");

//edit chart01

private By clickvaripage = By.xpath("//h5[text()='Engine Parts']");
private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[1]");
private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By parameterdp= By.xpath("//select[@cursorposition=\"1\"]");
private By ppenter = By.xpath("//input[@type=\"password\"]");
private By validate = By.xpath("//button[text()=' Validate ']");
private By subgroup1= By.id("Subgroup_0");
private By subgroup2= By.id("Subgroup_1");
private By savechart = By.id("sequencebychartsave");
private By getText = By.id("linkheader");


//edit chart02

private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By subgroup22= By.id("Subgroup_0");
private By subgroup3= By.id("Subgroup_1");
private By parameterdp1= By.xpath("//select[@id='parameterEntry_4060_4114']");
private By ppenter1 = By.xpath("//input[@type=\"password\"]");
private By validate1 = By.xpath("//button[text()=' Validate ']");
private By subgroup11= By.id("Subgroup_0");
private By subgroup21= By.id("Subgroup_1");
private By savechart2 = By.id("sequencebychartsave");
private By getText2 = By.id("linkheader");


//edit chart03

private By time3= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By subgroup13= By.id("Subgroup_0");
private By subgroup33= By.id("Subgroup_1");
private By NumricValu= By.xpath("//input[@cursorposition=\"1\"]");
private By savechart3 = By.id("sequencebychartsave");
private By getText3 = By.id("linkheader");


//edit chart04

private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By subgroup4= By.id("Subgroup_0");
private By subgroup44= By.id("Subgroup_1");
private By savechart4 = By.id("sequencebychartsave");
private By getText4 = By.id("linkheader");



//edit chart05

private By time5= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By subgroup5= By.id("Subgroup_0");
private By subgroup55= By.id("Subgroup_1");
private By savechart5 = By.id("sequencebychartsave");
private By getText5 = By.id("linkheader");

	

//edit chart06


private By time6= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
private By subgroup66= By.id("Subgroup_0");
private By subgroup6= By.id("Subgroup_1");
private By savechar6 = By.id("sequencebychartsave");
private By okUN =By.xpath("(//button[@id='btn0'])[1]");
private By UNA = By.id("Postnote");
private By notesave = By.id("noteSave");
private By getText6 = By.id("linkheader");

	
	
	
	


public Testcase01page(WebDriver driver) {
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
        grpNameElement.sendKeys("SPC_Control_Group");
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
	 addpart.sendKeys("Car Spare parts");

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
	 addpart.sendKeys("Wheel");

}

public void charaaddbutton() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(charaaddbutton));
	 addpart.click();

}



public void upperspec() {



	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(upperspec));
	 addpart.click();


	 addpart.sendKeys("15.00");

}

public void lowerspec() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(lowerspec));
	 addpart.sendKeys("7.00");

}

public void subsize() {

	 WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(subsize));
	 addpart.sendKeys("2");

}



public void savechar() {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(savechar));
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


	public void alram() throws InterruptedException {
		Thread.sleep(1000);
		WebElement alarms = wait.until(ExpectedConditions.visibilityOfElementLocated(ar));
		alarms.click();

}

public void Ac() throws InterruptedException {
	Thread.sleep(1000);
	WebElement alarms = wait.until(ExpectedConditions.visibilityOfElementLocated(ar));
	alarms.click();
}





	public void funcation1() throws InterruptedException {
		Thread.sleep(1000);
		WebElement alarms = wait.until(ExpectedConditions.visibilityOfElementLocated(FUNCC));
		alarms.click();
		// Locate the checkbox element


// Check if it is selected
		if (alarms.isSelected()) {
			System.out.println("Checkbox is checked");
		} else {
			System.out.println("Checkbox is NOT checked");
		}


	}
	public void savechar1() throws InterruptedException {
		Thread.sleep(1000);
		WebElement alarms = wait.until(ExpectedConditions.visibilityOfElementLocated(savechar1));
		alarms.click();

	}



	public void closechar() throws InterruptedException {
		Thread.sleep(1000);
		WebElement alarms = wait.until(ExpectedConditions.visibilityOfElementLocated(closechar));
		alarms.click();

	}


//parameter numeric parameter

public void clickconfiguration01() throws InterruptedException {


	try {
		Thread.sleep(1000);
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickconfiguration01));
		para.click();
		System.out.println("Successfully clicked on configuration element.");
	} catch (Exception e) {
		System.out.println("Not able to click on configuration element: " + e.getMessage());
	}


}



public void clickaddpara2() throws InterruptedException {



	Thread.sleep(2000);
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickaddpara2));
	 para.click();
}


public void sendparaname2() {
	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sendparaname2));
	 para.sendKeys("Numeric");
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
	 para.sendKeys("PasswordProtection");
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
			 WebElement element = driver.findElement(By.id("new"));
		    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
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




			public void EnterSequencename() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(EnterSequencename));
				 para.sendKeys("Function-Based Names");
			}

			public void SelectallCB() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(SelectallCB));
				 para.click();
			}


			public void Kebab() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Kebab));
				 para.click();
			}


			public void assign() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(assign));
				 para.click();
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
				 para.click();
				 
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
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addpaegsatellite));
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		try {
			// First refresh the page to ensure kebab icon loads
			driver.navigate().refresh();
			System.out.println("🔄 Page refreshed to load kebab icon");

			// Wait until the kebab icon is clickable
			WebElement kebabIcon = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//a[@class='moreimg']//img")
			));

			// Scroll into view just in case
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", kebabIcon);

			// Try normal click
			kebabIcon.click();
			System.out.println(" Kebab satellite icon clicked using normal click");

		} catch (Exception e) {
			System.out.println("⚠ Normal click failed, trying JS click: " + e.getMessage());

			try {
				// After refresh, wait for presence again
				WebElement kebabIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
						By.xpath("//a[@class='moreimg']//img")
				));

				((JavascriptExecutor) driver).executeScript("arguments[0].click();", kebabIcon);
				System.out.println(" Kebab satellite icon clicked using JS click");

			} catch (Exception ex) {
				throw new RuntimeException(" Could not click kebab satellite icon after refresh and retries", ex);
			}
		}
	}









	public void Enterpagenamesatellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Enterpagenamesatellite));
				 para.sendKeys("Engine Parts");
			}

			public void Addsatellitepage() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addsatellitepage));
				 para.click();
			}


			public void Dragsequencname() {

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Dragsequencname));
				WebElement test = driver.findElement(By.xpath("(//p[text()=' Engine Parts '])[1]"));
				  Actions actions02 = new Actions(driver);
				  actions02.clickAndHold(para).moveToElement(test).release().build().perform();

			}

			public void savesatellitepage() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savesatellitepage));
				 para.click();
			}
//
//			public void closesatellitepage() {
//				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(closesatellitepage));
//				 para.click();
//			}




//			    private By clickvaripage = By.xpath("(//div[@class='col-lg-10'])[2]");

//			    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
//			    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
//			    private By parameterdp= By.id("parameterEntry_39_1084");
//			    private By alphavalid = By.xpath("//input[@id='parameterEntry_39_1085']");
//			    private By subgroup1= By.id("Subgroup_0");
//			    private By subgroup2= By.id("Subgroup_1");
//			    private By savechart = By.id("sequencebychartsave");
	//



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
			
		

			public void subgroup1() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup1));
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
			}



			public void subgroup2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup2));
		
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
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
				 WebElement para1 =  driver.findElement(By.xpath("//option[text()=' Medical ']"));
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
			
		

			public void subgroup22() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup11));
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
			}



			public void subgroup3() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup21));
				
				 String expectedValue = "7.02";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
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



			public void subgroup13() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup13));
				
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
			}




			public void subgroup33() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup33));
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
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



			public void subgroup4() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup4));
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
			}




			public void subgroup44() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup44));
				 String expectedValue = "7.02";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
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



			public void subgroup5() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup5));
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }

			}




			public void subgroup55() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup55));
				 String expectedValue = "7.00";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
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
			


	//06
			
			public void time6() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time6));
				 para.click();
			}



			public void subgroup66() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup66));
				
				 String expectedValue = "8.00";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
			}

public void validateDataValues05() {
				
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
			            "6.9890", "7.0040", "7.0190", 
			            "0.0000", "0.0080", "0.0261", 
			            "188.00", "0.19", "0.53 %",
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
			


			public void subgroup6() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup6));
			
				 String expectedValue = "8.02";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    String actualValue = para.getDomAttribute("data-value");

				    // Verify the entered value matches the displayed value
				    if (actualValue.equals(expectedValue)) {
				        System.out.println("Value entered and displayed matches: " + actualValue);
				    } else {
				        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
				    }
			}


			public void savechar6() throws InterruptedException {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechar6));
				 Thread.sleep(1000);
				 
				 
				
				 para.click();
				
				 
			}

			
				public void okUN() {
					WebElement para = wait.until(ExpectedConditions.elementToBeClickable(okUN));
					para.click();

				}

	public void UNA() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(UNA));
		para.sendKeys("User note");
	}


	public void notesave() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(notesave));
		para.click();
	}


			public void getText6() {
				
				
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText6));
				 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

				    // Define the expected result
				 String expectedResults = "Avg Pt Out";

				    // Log both results for debugging
				    System.out.println("Expected: '" + expectedResults + "'");
				    System.out.println("Actual: '" + actualResults + "'");

				    // Assert the actual result matches the expected result
				    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


			}


public void validateDataValues06() {
				
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
			            "7.1575", "7.1700", "7.1825", 
			            "0.0000", "0.0067", "0.0218", 
			            "225.60", "9.59", "0.44 %",
			            "8.0000", "0.0000"
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




















