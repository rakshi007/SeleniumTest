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


public class TestCase15Page {


	private WebDriver driver;
	private WebDriverWait wait;
	
	 private By addnew1 = By.id("new");
	 private By AddCharLink = By.xpath("//a[text()='Add Characteristic ']");
	 private By DDN = By.xpath("(//input[@role='combobox'])[1]");
	private By DG= By.xpath("//div[contains(text(),'SPC_Attribute_Group')]");
	private By PN = By.xpath("(//input[@role='combobox'])[2]");
	private By PART = By.xpath("//div[contains(text(),'Car Brake parts')]");

//Cha

private By  addchar= By.id("AddChar");
private By  charaaddbutton= By.xpath("//button[text()=' Add ']");
private By  dropdownatt = By.xpath("(//lib-devextreme-selectbox)[3]");
private By select1 = By.xpath("(//div[contains(text(),'Attribute')])[2]");
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
private By Save05= By.xpath("(//button[text()='Save'])[2]");


private By saveAttribute = By.xpath("(//button[text()=' Save '])[1]");
private By  closechar= By.xpath("(//button[text()=' Close '])[1]");




//Assign para to part



private By filesicon = By.xpath("//div[@class='iconpos-top']//div[1]//span[1]//img[1]");
 private By Addptp = By.id("new");
private By Assignparaicon = By.xpath("//a[text()='Assign Parameters to Part ']");
private By datadropdown= By.xpath("(//input[@role='combobox'])[1]");
private By selectgrp= By.xpath("//div[contains(text(),'SPC_Attribute_Group')]");
private By partdropdown = By.xpath("(//input[@role='combobox'])[2]");
private By selectpartpara = By.xpath("//div[contains(text(),'Car Brake parts')]");
private By saveassign = By.xpath("//button[text()=' Save ']");
private By closeassign = By.xpath("//button[text()=' Close ']");


//updating sequence
    private By addseqlink = By.xpath("//img[@id=\"new\"]");
	private By expand= By.xpath("//span[@class='right-round']//img[@class='imgsize']");
	private By down = By.xpath("//img[@class=\"dropdown_icon\"]");
	private By DDG =By.xpath("(//p[text()=' SPC_Attribute_Group '])[1]");
	private By okg =By.xpath("//button[text()=' OK ']");
	private By DDG1 =By.xpath("(//p[text()=' SPC_Attribute_Group '])[2]");
	private By DDd =By.xpath("//span[@id='showBy']//img");
	private By Sequenc =By.xpath("//a[text()=' Sequences']");
	private By editsequence =By.xpath("//span[text()='Edit Sequence']");
	private By drag =By.xpath("//p[text()='Engine ']");
	private By drop =By.xpath("//p[text()='Characteristics in Sequence']");
	private By save = By.xpath("//button[text()='Save']");
	private By close1 = By.xpath("(//button[text()=' Close '])[1]");


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
private By Highlites01 = By.xpath("(//input[@triggers=\"manual\"])[1]");

private By total01 = By.id("totSubgroup_0");
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
private By cancel = By.xpath("(//button[text()='Cancel'])[1]");
private By getText5 = By.id("linkheader");

	

//edit chart06

	
	
	
	


public TestCase15Page(WebDriver driver) {
	 this.driver =  driver;
	 this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
}





 public void addnew1() {
	 WebElement element = driver.findElement(By.id("new"));
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
 }

 public void AddCharLink() throws InterruptedException {
		Thread.sleep(1000);
	    WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(AddCharLink));
	    addGrpElement.click();
	}


	public void DDN() throws InterruptedException {
		Thread.sleep(1000);
	    WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(DDN));
	    addGrpElement.click();
	}


	public void DG() throws InterruptedException {
		Thread.sleep(1000);
	    WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(DG));
	    addGrpElement.click();
	}


	public void PN() throws InterruptedException {
		Thread.sleep(1000);
	    WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(PN));
	    addGrpElement.click();
	}


	public void PART() throws InterruptedException {
		Thread.sleep(1000);
	    WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(PART));
	    addGrpElement.click();
	}





//Char

public void addchar() throws InterruptedException {

	 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(addchar));
	 Thread.sleep(1000);
	 addpart.sendKeys("Avg Trend Up");

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


public void checkallbox1() {
//	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
//	 para.click();
	 WebElement para = driver.findElement(By.xpath("//p[text()='Numeric Only ']"));
		WebElement test = driver.findElement(By.xpath("//p[text()='Assigned for part']"));
		  Actions actions02 = new Actions(driver);
		  actions02.clickAndHold(para).moveToElement(test).release().build().perform();
		  
		  WebElement para1 = driver.findElement(By.xpath("//p[text()='Password Protected ']"));
			WebElement test1 = driver.findElement(By.xpath("//p[text()='Assigned for part']"));
			  Actions actions021 = new Actions(driver);
			  actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();
			  
		  
		  
}




public void checkallbox() {
//	 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
//	 para.click();
	 WebElement para = driver.findElement(By.xpath("//p[text()='Numeric Only ']"));
		WebElement test = driver.findElement(By.xpath("//p[text()='Assigned for part']"));
		  Actions actions02 = new Actions(driver);
		  actions02.clickAndHold(para).moveToElement(test).release().build().perform();
		  
		  WebElement para1 = driver.findElement(By.xpath("//p[text()='Password Protected ']"));
			WebElement test1 = driver.findElement(By.xpath("//p[text()='Assigned for part']"));
			  Actions actions021 = new Actions(driver);
			  actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();
			  
		  
		  
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
	

//updating sequence


public void addseqlink() {
	 WebElement element = driver.findElement(By.xpath("//span[@class='active']//img"));
  	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
}


	public void expand() {
		 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(expand));
		 para.click();
	}


	public void down() {
		 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(down));
		 para.click();
	}

	public void DDG() {
		 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(DDG));
		 para.click();
	}


	public void okg() {
		 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(okg));
		 para.click();
	}



	public void DDG1() {
		 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(DDG1));
		 para.click();
	}




	public void DDd() {
		WebElement element = driver.findElement(By.xpath("//img[contains(@src, 'dropdown.svg')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);


	}





	public void Sequenc() {
		 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Sequenc));
		 para.click();
	

	
	}
	public void Sequenc1() throws InterruptedException	 {
		Thread.sleep(2000);
		 WebElement elementToRightClick = driver.findElement(By.xpath("//td[text()='Combination Codes']"));

	        // Perform right-click (context click)
	        Actions actions = new Actions(driver);
	        actions.contextClick(elementToRightClick).perform();
	
	
				
	}
	

	public void editsequence() {
		 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(editsequence));
		 para.click();
	
	}
	
	
	
	
	

	public void draganddrop() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=' Avg Trend Up ']")));
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



//


			public void network1() {
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

			public void defectsub05() {
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
			    String expectedResults = "No !";

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
			
			
			
			
			
			
	
		

			public void defectsub11() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub11));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);

				   
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
			
			
			public void defectsub15() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub14));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);
			}

			
			
			
			public void total02() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(total02));
				 para.sendKeys("30");
			}
			
			public void Highlites01() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Highlites01));
				 para.sendKeys("Testspc");
			}
			
			public void mouse() {
				
				   WebElement hoverElement = driver.findElement(By.xpath("(//input[@cursorposition=\"1\"])[1]"));
				Actions action = new Actions(driver);
				action.moveToElement(hoverElement).build().perform();
			
		        System.out.println("Mouse hover action performed successfully!");

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

				    // Fetch the value from the UI using getAttribute("value")
				   
			}

			

			public void defectsub22() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub22));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);

				  
			}
			
			public void defectsub23() {
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
		
				 String expectedValue = "3";
				    para.sendKeys(expectedValue);

				    // Fetch the value from the UI using getAttribute("value")
				    
			}

			
			public void total03() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(total03));
				 para.sendKeys("30");
			}

			public void savechart3() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart3));
				 para.click();
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

				 WebElement para1 =  driver.findElement(By.xpath("//option[text()='industries']"));
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
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);

				    
			}

			

			public void defectsub32() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub32));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);

				   
			}
			public void defectsub33() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub32));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);

				   
			}
			public void defectsub34() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub32));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);

				   
			}
			public void defectsub35() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub32));
		
				 String expectedValue = "4";
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

			public void defectsub42() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub41));
		
				 String expectedValue = "1";
				    para.sendKeys(expectedValue);
	 
			}
			

		
			public void defectsub43() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(defectsub43));
		
				 String expectedValue = "2";
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
			
			public void cancel() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(cancel));
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



