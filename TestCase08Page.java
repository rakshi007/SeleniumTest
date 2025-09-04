package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase08Page {


	private WebDriver driver;
	private WebDriverWait wait;
	

	
	 private By addnew1 = By.id("new");
	 private By AddCharLink = By.xpath("//a[text()='Add Characteristic ']");
	 private By DDN = By.xpath("(//input[@role='combobox'])[1]");
	 private By DG = By.xpath("//div[contains(text(),'SPC_Control_Group')]");
	 private By PN = By.xpath("(//input[@role='combobox'])[2]");
	 private By PART = By.xpath("//div[contains(text(),'Car Spare parts')]");
	 private By Char = By.id("AddChar");
	 private By AD = By.xpath("//button[text()=' Add ']");
	 private By upperspec = By.id("upperlmt");
	 private By  lowerspec= By.id("lowerspec");
	 private By subsize = By.id("subgroupsize");
	 
	 
	 private By  savechar= By.xpath("//button[text()=' Save ']");

	 
	 private By controlcahrt = By.xpath("//img[@id='CCP']");
	 private By Analisys = By.xpath("//a[text()='Analysis']");
	 private By DefieRun = By.xpath("//select[@formcontrolname=\"DefineRunValue\"]");
	 private By DefineTrend = By.xpath("//select[@formcontrolname=\"DefineTrendValue\"]");
	 private By Hugging  = By.xpath("//select[@formcontrolname=\"HuggingAverageValue\"]");
	 private By Control   = By.xpath("//select[@formcontrolname=\"HuggingControlLimit\"]");
	 private By saveDD = By.xpath("//button[text()=' Save ']");
	 private By  closechar= By.xpath("(//button[text()=' Close '])[1]");
	 
	 
	 //para01

		private By clickconfiguration01 = By.xpath("(//img)[8]");
	    private By clickaddpara2 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname41 = By.xpath("(//input[@maxlength=\"40\"])[1]");
		private By defaultname = By.xpath("(//input[@maxlength=\"40\"])[2]");
	    private By saveP = By.xpath("//button[normalize-space()='Save']");
	    private By closeC = By.xpath("//button[text()=' Close ']");
	
	    
	   
	    
	    //para02
	    
	 
	    
		

	
		private By clickaddpara1 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname01 = By.xpath("(//input[@maxlength=\"40\"])[1]");
	    private By alwaysclear = By.xpath("(//span[@class=\"checkmark\"])[2]");
	    private By save01 = By.xpath("//button[normalize-space()='Save']");
		private By close01 = By.xpath("//button[text()=' Close ']");
	
	    
	    
		//Assign para to part

	    
	    private By filesicon = By.xpath("//div[@class='iconpos-top']//div[1]//span[1]//img[1]");
		private By Addptp = By.id("new");
		private By Assignparaicon = By.xpath("//a[text()='Assign Parameters to Part ']");
		private By datadropdown= By.xpath("(//input[@role='combobox'])[1]");
		private By selectgrp= By.xpath("//div[contains(text(),'SPC_Control_Group')]");
		private By partdropdown = By.xpath("(//input[@role='combobox'])[2]");
		private By selectpartpara = By.xpath("//div[contains(text(),'Car Spare parts')]");
		private By DND = By.xpath("(//span[@class='checkmark'])[4]");
		private By kebabicon = By.xpath("//span[@class='layout-btn btn-more none']//img");
		private By assignlink = By.xpath("//button[text()=' Assign ']");
		private By saveassign = By.xpath(" //button[text()=' Save ']");
		private By closeassign = By.xpath("(//button[text()=' Close '])[2]");
	
	
		//add sequence
		
		
	
		    private By addseqlink = By.xpath("//img[@id=\"new\"]");
		    private By expand= By.xpath("//span[@class='right-round']//img[@class='imgsize']");
		   private By down = By.xpath("//img[@class=\"dropdown_icon\"]");
		   private By DDG =By.xpath("//p[text()='SPC_Control_Group']");
		   private By okg =By.xpath("//button[text()='OK']");
		   private By DDG1 =By.xpath("(//p[text()=' SPC_Control_Group '])[2]");
		   private By DDd =By.xpath("//span[@id='showBy']//img");
		   private By Sequenc =By.xpath("//a[text()=' Sequences']");
		   private By right = By.xpath("");
		   private By editsequence =By.xpath("//span[text()='Edit Sequence']");
		   private By drag =By.xpath("//p[text()='Air Filter ']");
		   private By drop =By.xpath("//p[text()='Characteristics in Sequence']");
		   private By save = By.xpath("//button[text()='Save']");
		   private By close1 = By.xpath("(//button[text()=' Close '])[2]");
		   
		   
		   

		    
		    //edit 01
		    
		    private By network1 = By.xpath("(//img)[6]");
		    private By clickvaripage = By.xpath("(//div[@class='col-lg-10'])[1]");
		    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[8]");
		    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
		    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
		    private By subgroup01= By.id("Subgroup_0");
		    private By subgroup02= By.id("Subgroup_1");
		    private By default01= By.xpath("(//input[@cursorposition=\"1\"])[1]");
		    private By savechart01 = By.id("sequencebychartsave");
		    private By getText = By.id("linkheader");



		//  edit chart02

		    private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
		    private By subgroup11= By.id("Subgroup_0");
		    private By subgroup12= By.id("Subgroup_1");
		    private By ALL1= By.xpath("(//input[@cursorposition=\"1\"])[2]");
		    private By GetText = By.xpath("(//div[@class=\"errormsg\"])[1]");
		    private By Savechart02 = By.id("sequencebychartsave");
		    private By GetText02 = By.id("linkheader");
		    
		    
		    

			//  edit chart03

			    private By time03= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
			    private By subgroup21= By.id("Subgroup_0");
			    private By subgroup22= By.id("Subgroup_1");
			    private By savechart331 = By.id("sequencebychartsave");
			    private By ALL2= By.xpath("(//input[@cursorposition=\"1\"])[2]");
			    private By getText3 = By.id("linkheader");  
		    
		    

				//  edit chart04

				    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
				    private By subgroup31= By.id("Subgroup_0");
				    private By subgroup32= By.id("Subgroup_1");
				    private By default02= By.xpath("(//input[@cursorposition=\"1\"])[1]");
				    private By savechart4 = By.id("sequencebychartsave");
				    private By getText4 = By.id("linkheader");

		    
		    
		    
		    

					//  edit chart05

					    private By time5= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
					    private By subgroup41= By.id("Subgroup_0");
					    private By subgroup42= By.id("Subgroup_1");
					    private By ALL3= By.xpath("(//input[@cursorposition=\"1\"])[2]");
					    private By savechart5 = By.id("sequencebychartsave");
					    private By submit01 = By.xpath("//button[text()='Submit']");
					    private By getText5 = By.id("linkheader");
		    
					 
					    
					    
					    

					    
					    //edit 06
					    
					  
					    private By time6= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
					    private By subgroup61= By.id("Subgroup_0");
					    private By subgroup62= By.id("Subgroup_1");
					    private By ALL4= By.xpath("(//input[@cursorposition=\"1\"])[2]");
					    private By savechart6 = By.id("sequencebychartsave");
						private By ok = By.xpath("//lib-alertbox//button[@id='btn0']");
	                    private By user01 = By.xpath("(//input[@id=\"User\"])[2]");
                    	private By cause = By.xpath("(//select[@id=\"Cause\"])[2]");
						private By action = By.xpath("(//select[@id='Action'])[2]");
						private By usernote  = By.xpath("(//textarea[@id='Postnote'])[1]");

                        private By add01 = By.xpath("(//img[@style=\"opacity: 0.7;\"])[2]");
	                    private By user02 = By.xpath("(//input[@id=\"User\"])[2]");
	                    private By cause2 = By.xpath("(//select[@id=\"Cause\"])[2]");
	                    private By action2 = By.xpath("(//select[@id='Action'])[2]");
						private By usernote2 = By.xpath("(//textarea[@id='Postnote'])[1]");

	                    private By add02 = By.xpath("(//img[@style=\"opacity: 0.7;\"])[2]");
                    	private By user03 = By.xpath("(//input[@id=\"User\"])[2]");
                    	private By cause3 = By.xpath("(//select[@id=\"Cause\"])[2]");
	                    private By action3 = By.xpath("(//select[@id='Action'])[2]");
                     	private By usernote3 = By.xpath("(//textarea[@id='Postnote'])[1]");
						private By submitnote = By.xpath("(//button[normalize-space()='Submit'])[1]");
	                    private By getText6 = By.id("linkheader");

	                    private By note = By.xpath("//img[@class=\"NOTE\"]");
	                    private By left = By.xpath("(//span[@class=\"subgroup_edit_left\"])[3]");

	                    private By delete = By.xpath("//span[@class='iconsright']//span[2]//img[1]");
	                    private By oknote = By.xpath("(//button[text()=' OK '])[1]");
	                    private By edituser = By.xpath("//input[@id=\"User\"]");
	                    private By cause4 = By.xpath("//select[@id=\"Cause\"]");
	                    private By action4 = By.xpath("//select[@id=\"Action\"]");
	                    private By usernote4 = By.xpath("//textarea[@formcontrolname=\"Note\"]");
	                    private By savechart7 = By.id("sequencebychartsave");
					    private By network = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");
						private By Remeasure = By.xpath("(//button[normalize-space()='Remeasure'])[1]");
	                    private By Add01 = By.xpath("(//input[@id='RemNewSg_0'])[1]");
						private By Add02 = By.xpath("(//input[@id='RemNewSg_1'])[1]");
	                    private By Calculate = By.xpath("(//button[normalize-space()='Calculate'])[1]");
	                    private By SavereMeasure = By.xpath("(//button[@id='remSave'])[1]");
                    	private By Submit = By.xpath("(//button[normalize-space()='Submit'])[1]");

	                   private By add03 = By.xpath("(//img[@style=\"opacity: 0.7;\"])[2]");
				
					    
					    public TestCase08Page(WebDriver driver) {
					   	 this.driver =  driver;
					   	 this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
					    }

					    
					    
					    
					    public void addnew1() {
					        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

					        // Wait for the loader to disappear
					        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

					        // Click on the element using JavaScript
					        WebElement addLink = driver.findElement(By.id("new"));
					        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
					        jsExecutor.executeScript("arguments[0].click();", addLink);
					    }
					    
					    
					    
					    public void AddCharLink() throws InterruptedException {
					    	
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
					    
					    
					    public void Char() throws InterruptedException {
					        WebElement addGrpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Char));
					        addGrpElement.sendKeys("Engine Mounts");

					    	}

					    
					    
					    

					    public void AD() throws InterruptedException {
					    	Thread.sleep(1000);
					        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(AD));
					        addGrpElement.click();
					    }
					    

					    public void upperspec() throws InterruptedException {
					    	 WebElement addGrpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(upperspec));
						        addGrpElement.sendKeys("15.00");
					    }
					    

					    public void lowerspec() throws InterruptedException {
					    	 WebElement addGrpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(lowerspec));
						        addGrpElement.sendKeys("7.00");
					    }
					    

					    public void subsize() throws InterruptedException {
					    	 WebElement addGrpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(subsize));
						        addGrpElement.sendKeys("2");
					    }
					  
					    
					    
					    
					    public void savechar() throws InterruptedException {
					    	Thread.sleep(1000);
					        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(savechar));
					        addGrpElement.click();
					        
					        try {
					            // Wait for the popup to appear
					            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

					            // Fetch the text from the popup element
					            String popupText = popup.getText();
					            System.out.println("Popup text: " + popupText);

					            // Validate or use the text
//					            String expectedText = "Your expected popup text here";
//					            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

					        } catch (Exception e) {
					            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
					        }
					        
					    }
					    
					   
					    
					    
					    
					    public void controlcahrt() throws InterruptedException {
					    	Thread.sleep(1000);
					    	JavascriptExecutor js = (JavascriptExecutor) driver;
					    	WebElement element = driver.findElement(By.xpath("//img[@id='CCP']"));
					    	js.executeScript("arguments[0].scrollIntoView(true);", element);
					    	element.click();


					    }
					    
					    
					    public void Analisys() throws InterruptedException {
					    	Thread.sleep(1000);

					   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
						 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

						 WebElement analysisTab = driver.findElement(By.xpath("//a[text()='Analysis']"));
						 analysisTab.click();
			}
					    
					    
					    
					    public void DefieRun() throws InterruptedException {
					    	Thread.sleep(1000);
					        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(DefieRun));
					        addGrpElement.click();
					        

							 Select select = new Select(addGrpElement);
							 select.selectByVisibleText("9");
					    }
					 

					    public void DefineTrend() throws InterruptedException {
					    	Thread.sleep(1000);
					        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(DefineTrend));
					        addGrpElement.click();
					        Select select = new Select(addGrpElement);
					        select.selectByVisibleText("9");
					        
					    }
					    
					    
					    public void Hugging() throws InterruptedException {
					    	Thread.sleep(1000);
					        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(Hugging));
					        addGrpElement.click();
					        Select select = new Select(addGrpElement);
							 select.selectByIndex(1);
					        
					    }
					    
					    
					    public void Control() throws InterruptedException {
					    	Thread.sleep(1000);
					        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(Control));
					        addGrpElement.click();
					        

							 Select select = new Select(addGrpElement);
							 select.selectByIndex(1);
					    }
					    
					    
					    
					    
					    
					    
					    
					    
					    
					    
					    
					    
					    
					    
					    
					    
					    public void saveDD() throws InterruptedException {
					    	Thread.sleep(1000);
					        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(saveDD));
					        addGrpElement.click();
					        
					        try {
					            // Wait for the popup to appear
					            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

					            // Fetch the text from the popup element
					            String popupText = popup.getText();
					            System.out.println("Popup text: " + popupText);

					            // Validate or use the text
//					            String expectedText = "Your expected popup text here";
//					            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

					        } catch (Exception e) {
					            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
					        }
					    }
					    
					    
					    
					    public void closechar() throws InterruptedException {
					    	Thread.sleep(1000);
					    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
					    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loader")));

					    	WebElement closeButton = driver.findElement(By.xpath("(//button[text()=' Close '])[1]"));
					    	closeButton.click();

							 
				    }    
					    
					    
					    
					    
					    //para01
					    
					    public void clickconfiguration01() {
							 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickconfiguration01));
							
							
						        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
						        jsExecutor.executeScript("arguments[0].click();", para);
							 
							 
							 
							 
							 
						}

						public void clickaddpara1() {
							
						        

								WebElement para = driver.findElement(By.xpath("//img[@class=\"imgStyle1\"]"));
								((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", para);
								para.click();
						        
						        
						        
						}
						
						public void sendparaname01() {
							 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(sendparaname01));
							 para.sendKeys("Default Value");
						}
						
						
						public void defaultname() {
							 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(defaultname));
							 para.sendKeys("TESTER");
						}
						
						
						
						
						
						
						public void save01() {
							 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(save01));
							 para.click();
							 
							 try {
						            // Wait for the popup to appear
						            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

						            // Fetch the text from the popup element
						            String popupText = popup.getText();
						            System.out.println("Popup text: " + popupText);

						            // Validate or use the text
//						            String expectedText = "Your expected popup text here";
//						            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

						        } catch (Exception e) {
						            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
						        }
							 
							 
							 
						}
						

						public void close01() {
							 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(close01));
							 para.click();
						}
						
					    
						
						
			//para02	
						
						
					

						public void clickaddpara12() {
							
					        

							WebElement para = driver.findElement(By.xpath("//img[@class=\"imgStyle1\"]"));
							((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", para);
				    
					}
						
						public void sendparaname41() {
							 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(sendparaname01));
							 para.sendKeys("Always Clear Field");
						}
						
				
						public void alwaysclear() {
							 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(alwaysclear));
							 para.click();
						}
						

						
						
						public void saveP() {
							 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(saveP));
							 para.click();
						}
					    
						
						public void closeC() {
							 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(closeC));
							 para.click();
						}
						
						//para2
						


						
						//assign para to part
						
						
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

						
						public void checkAndExecute() {
						    try {
						        if (isElementPresent("//p[text()='Parameter Entry Restricted ']") || isElementPresent("//p[text()='Function ']")) {
						            checkallbox1();
						        } else {
						            checkallbox();
						        }
						    } catch (Exception e) {
						        System.out.println("Exception occurred: " + e.getMessage());
						    }
						}

						private boolean isElementPresent(String xpath) {
						    return !driver.findElements(By.xpath(xpath)).isEmpty();
						}

						public void checkallbox1() {
						    try {
						        if (isElementPresent("//p[text()=' lookUP_Source ']")) {
						            WebElement para = driver.findElement(By.xpath("//p[text()=' lookUP_Source ']"));
						            WebElement test = driver.findElement(By.xpath("//p[text()=' Parameters ']"));
						            Actions actions02 = new Actions(driver);
						            actions02.clickAndHold(para).moveToElement(test).release().build().perform();
						        }

						        if (isElementPresent("//p[text()=' Lookup_Table ']")) {
						            WebElement para1 = driver.findElement(By.xpath("//p[text()=' Lookup_Table ']"));
						            WebElement test1 = driver.findElement(By.xpath("//p[text()=' Parameters ']"));
						            Actions actions021 = new Actions(driver);
						            actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();
						        }
						    } catch (Exception e) {
						        System.out.println("Exception in checkallbox1(): " + e.getMessage());
						    }
						}

						public void checkallbox() {
						    try {
						        if (isElementPresent("//p[text()=' Default Value ']")) {
						            WebElement para = driver.findElement(By.xpath("//p[text()=' Default Value ']"));
						            WebElement test = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
						            Actions actions02 = new Actions(driver);
						            actions02.clickAndHold(para).moveToElement(test).release().build().perform();
						        }

						        if (isElementPresent("//p[text()=' Always Clear Field ']")) {
						            WebElement para1 = driver.findElement(By.xpath("//p[text()=' Always Clear Field ']"));
						            WebElement test1 = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
						            Actions actions021 = new Actions(driver);
						            actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();
						        }
						    } catch (Exception e) {
						        System.out.println("Exception in checkallbox(): " + e.getMessage());
						    }
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
							 try {
						            // Wait for the popup to appear
						            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

						            // Fetch the text from the popup element
						            String popupText = popup.getText();
						            System.out.println("Popup text: " + popupText);

						            // Validate or use the text
//						            String expectedText = "Your expected popup text here";
//						            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

						        } catch (Exception e) {
						            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
						        }
							
						}



						public void closeassign() {
							
							
							WebElement element = driver.findElement(By.xpath("//button[text()=' Assign ']"));
							element.click();

							 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(closeassign));
							 para.click();

							 
						}



			//seq			
						
						

						 public void addseqlink() {
							 WebElement element = driver.findElement(By.xpath("//span[@class='active']//img"));
						    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
						 }


							public void expand() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(expand));
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
			;

							}




							public void Sequenc() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Sequenc));
								 para.click();
							

							
							}
							public void Sequenc1() throws InterruptedException	 {
								Thread.sleep(2000);
								 WebElement elementToRightClick = driver.findElement(By.xpath("//td[text()='Function-Based Names']"));

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

								WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=' Engine Mounts ']")));
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
//							            String expectedText = "Your expected popup text here";
//							            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

							        } catch (Exception e) {
							            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
							        }
							}

							public void close1() {
								WebElement closeButton = driver.findElement(By.xpath("(//button[text()=' Close '])[2]"));
								JavascriptExecutor js = (JavascriptExecutor) driver;
								js.executeScript("arguments[0].click();", closeButton);

							}

						
						
						
				//creating sat and page




							public void network1() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(network1));
								((JavascriptExecutor) driver).executeScript("arguments[0].click();", para);
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

							



							public void subgroup01() {
								
								    // Wait until the element is clickable
								    WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup01));
								    
								    // Enter the value into the text field
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

							

							


							public void subgroup02() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup02));
								
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

						
							
							
							public void default01() {
								 String para = wait.until(ExpectedConditions.elementToBeClickable(default01)).getText();
								
								
								 
								 
							}
							
							
							
							
							
							public void savechart01() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart01));
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
							
							
							
							
							
							
							
							
							
							
							
							


//							editchart02

					// private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
						  


							public void time2() {
								
								 WebElement inputField = driver.findElement(By.id("idTime"));
								 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
								 inputField.click();
							}
							
							public void subgroup11() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup11));
							
								  String expectedValue = "7.00";
								    para.sendKeys(expectedValue);
//
//								    // Fetch the value from the UI using getAttribute("value")
//								    String actualValue = para.getDomAttribute("data-value");
//
//								    // Verify the entered value matches the displayed value
//								    if (actualValue.equals(expectedValue)) {
//								        System.out.println("Value entered and displayed matches: " + actualValue);
//								    } else {
//								        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//								    }
//								
							}

							public void subgroup12() throws InterruptedException {
								Thread.sleep(1000);
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup12));
								
								 String expectedValue = "7.01";
								    para.sendKeys(expectedValue);

//								    // Fetch the value from the UI using getAttribute("value")
//								    String actualValue = para.getDomAttribute("data-value");
//
//								    // Verify the entered value matches the displayed value
//								    if (actualValue.equals(expectedValue)) {
//								        System.out.println("Value entered and displayed matches: " + actualValue);
//								    } else {
//								        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//								    }
								
							}
							


							
							
							public void ALL1() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ALL1));
								 para.clear();
								 para.sendKeys("Shift");
							}
							
							
							
							
							
							public void Savechart02() throws InterruptedException {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Savechart02));
								 para.click();
								 Thread.sleep(2000);
							}
							
							
									

							public void GetText02() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(GetText02));
								 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

								    // Define the expected result
//								    String expectedResults = "Process in Control ";
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
							            "6.9931", "7.0025", "7.0119", 
							            "0.0000", "0.0050", "0.0163", 
							            "300.80", "0.19", "0.33 %",
							            "7.0050", "0.0100"
							        };

							        // Loop through the XPaths and validate
							        for (int i = 0; i < xpaths.length; i++) {
							            // Locate the web element
							            WebElement element = driver.findElement(By.xpath(xpaths[i]));

							            // Get the actual text
							            String actualText = element.getText();

							            // Validate the text
							            if (actualText.equals(expectedValues[i])) {
							                System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value." + actualText);
							            } else {
							                System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "'.");
							            }
							        }
							    } catch (Exception e) {
							        e.printStackTrace();
							    }
							}
							
							
							
							
							
							
							
							
							

							//edit03


							public void time3() {
								
								 WebElement inputField = driver.findElement(By.id("idTime"));
								 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
								 inputField.click();
							}



							public void subgroup21() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup21));
								
								 String expectedValue = "7.00";
								    para.sendKeys(expectedValue);

//								    // Fetch the value from the UI using getAttribute("value")
//								    String actualValue = para.getDomAttribute("data-value");
//
//								    // Verify the entered value matches the displayed value
//								    if (actualValue.equals(expectedValue)) {
//								        System.out.println("Value entered and displayed matches: " + actualValue);
//								    } else {
//								        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//								    }
								
							}




							public void subgroup22() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup22));
								
								 String expectedValue = "7.02";
								    para.sendKeys(expectedValue);
//
//								    // Fetch the value from the UI using getAttribute("value")
//								    String actualValue = para.getDomAttribute("data-value");
//
//								    // Verify the entered value matches the displayed value
//								    if (actualValue.equals(expectedValue)) {
//								        System.out.println("Value entered and displayed matches: " + actualValue);
//								    } else {
//								        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//								    }
								
							}
							


							public void ALL2() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ALL2));
								 para.sendKeys("Operator");
							}
							

							public void savechart331() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart331));
								 para.click();
							}

							public void getText3() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText3));
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
							            "6.9816", "7.0067", "7.0317", 
							            "0.0000", "0.0133", "0.0436", 
							            "112.80", "0.19", "0.89 %",
							            "7.0150", "0.0300"
							        };

							        // Loop through the XPaths and validate
							        for (int i = 0; i < xpaths.length; i++) {
							            // Locate the web element
							            WebElement element = driver.findElement(By.xpath(xpaths[i]));

							            // Get the actual text
							            String actualText = element.getText();

							            // Validate the text
							            if (actualText.equals(expectedValues[i])) {
							                System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value." + actualText);
							            } else {
							                System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "'.");
							            }
							        }
							    } catch (Exception e) {
							        e.printStackTrace();
							    }
							}


						//  edit chart04




							public void time4() {
								
								 WebElement inputField = driver.findElement(By.id("idTime"));
								 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);

							}



							public void subgroup31() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup31));
								
								 String expectedValue = "7.00";
								    para.sendKeys(expectedValue);

//								    // Fetch the value from the UI using getAttribute("value")
//								    String actualValue = para.getDomAttribute("data-value");
//
//								    // Verify the entered value matches the displayed value
//								    if (actualValue.equals(expectedValue)) {
//								        System.out.println("Value entered and displayed matches: " + actualValue);
//								    } else {
//								        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//								    }
								
							}





							public void subgroup32() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup32));
							
								 String expectedValue = "7.03";
								    para.sendKeys(expectedValue);
//
//								    // Fetch the value from the UI using getAttribute("value")
//								    String actualValue = para.getDomAttribute("data-value");
//
//								    // Verify the entered value matches the displayed value
//								    if (actualValue.equals(expectedValue)) {
//								        System.out.println("Value entered and displayed matches: " + actualValue);
//								    } else {
//								        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//								    }
								
							}
							
							
							
							public void default02() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(default02));
								 para.clear();
								 para.sendKeys("Devalopr");
								
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
								    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
								   

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
							            "6.9724", "7.0100", "7.0476", 
							            "0.0000", "0.0200", "0.0653", 
							            "75.20", "0.19", "1.33 %",
							            "7.0200", "0.0400"
							        };

							        // Loop through the XPaths and validate
							        for (int i = 0; i < xpaths.length; i++) {
							            // Locate the web element
							            WebElement element = driver.findElement(By.xpath(xpaths[i]));

							            // Get the actual text
							            String actualText = element.getText();

							            // Validate the text
							            if (actualText.equals(expectedValues[i])) {
							                System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value." + actualText);
							            } else {
							                System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "'.");
							            }
							        }
							    } catch (Exception e) {
							        e.printStackTrace();
							    }
							}




						//  edit chart05


							public void time5() 	 {
								
								 WebElement inputField = driver.findElement(By.id("idTime"));
								 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
								 inputField.click();
							}



							public void subgroup41() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup41));
								
								 String expectedValue = "7.00";
								    para.sendKeys(expectedValue);

								    // Fetch the value from the UI using getAttribute("value")
//								    String actualValue = para.getDomAttribute("data-value");
//
//								    // Verify the entered value matches the displayed value
//								    if (actualValue.equals(expectedValue)) {
//								        System.out.println("Value entered and displayed matches: " + actualValue);
//								    } else {
//								        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//								    }
								
							}




							public void subgroup42() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup42));
								
								 String expectedValue = "7.04";
								    para.sendKeys(expectedValue);

//								    // Fetch the value from the UI using getAttribute("value")
//								    String actualValue = para.getDomAttribute("data-value");
//
//								    // Verify the entered value matches the displayed value
//								    if (actualValue.equals(expectedValue)) {
//								        System.out.println("Value entered and displayed matches: " + actualValue);
//								    } else {
//								        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//								    }
								
							}

							
							
							public void ALL3() throws InterruptedException {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ALL3));
								
								 para.clear();
								 para.sendKeys("owner");
								 
								
							}
							
							public void savechart5() throws InterruptedException {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart5));
								 para.click();
								 
								
							}
							
							
							
							
							
							
							public void getText5() {
								
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText5));
								 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

								   
								 String expectedResults = "Process in Control";
									System.out.println("Expected: '" + expectedResults + "'");
								    System.out.println("Actual: '" + actualResults + "'");

								    // Assert the actual result matches the expected result
								    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);



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
							            "6.9669", "7.0120", "7.0571", 
							            "0.0000", "0.0240", "0.0784", 
							            "62.67", "0.19", "1.60 %",
							            "7.0200", "0.0400"
							        };

							        // Loop through the XPaths and validate
							        for (int i = 0; i < xpaths.length; i++) {
							            // Locate the web element
							            WebElement element = driver.findElement(By.xpath(xpaths[i]));

							            // Get the actual text
							            String actualText = element.getText();

							            // Validate the text
							            if (actualText.equals(expectedValues[i])) {
							                System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value." + actualText);
							            } else {
							                System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "'.");
							            }
							        }
							    } catch (Exception e) {
							        e.printStackTrace();
							    }
							}

							
							
							

							//  edit chart06


								public void time6() {
									
									 WebElement inputField = driver.findElement(By.id("idTime"));
									 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
									 inputField.click();
								}



								public void subgroup61() {
									 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup61));
									
									 String expectedValue = "18.00";
									    para.sendKeys(expectedValue);

//									    // Fetch the value from the UI using getAttribute("value")
//									    String actualValue = para.getDomAttribute("data-value");
//
//									    // Verify the entered value matches the displayed value
//									    if (actualValue.equals(expectedValue)) {
//									        System.out.println("Value entered and displayed matches: " + actualValue);
//									    } else {
//									        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//									    }
									
								}




								public void subgroup62() {
									 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup62));
									
									 String expectedValue = "6.00";
									    para.sendKeys(expectedValue);
//
//									    // Fetch the value from the UI using getAttribute("value")
//									    String actualValue = para.getDomAttribute("data-value");
//
//									    // Verify the entered value matches the displayed value
//									    if (actualValue.equals(expectedValue)) {
//									        System.out.println("Value entered and displayed matches: " + actualValue);
//									    } else {
//									        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//									    }
									
								}


								
								
								
								public void ALL4() throws InterruptedException {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ALL4));
									 para.clear();
									 para.sendKeys("Floor Shop");
									 
									 
								}
								
								public void savechart6() throws InterruptedException {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart6));
									 para.click();
									 
								}



                      	public void ok() throws InterruptedException {
							Thread.sleep(2000);
	                	WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ok));
                  		para.click();
						}

	public void user01() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(user01));
		para.sendKeys("User 01");

	}

	public void cause() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(cause));
		Select dropdown = new Select(para);
		dropdown.selectByIndex(2);

	}


	public void action() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(action));
		Select dropdown = new Select(para);
		dropdown.selectByIndex(2);

	}


	public void usernote() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(usernote));
		para.sendKeys("user note01");
	}


	public void add01() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(add01));
		para.click();
	}




	public void user02() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(user02));
		para.sendKeys("User 02");

	}

	public void cause2() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(cause2));
		Select dropdown = new Select(para);
		dropdown.selectByIndex(3);

	}


	public void action2() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(action2));
		Select dropdown = new Select(para);
		dropdown.selectByIndex(3);

	}


	public void usernote2() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(usernote2));
		para.sendKeys("user note02");
	}


	public void add02() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(add02));
		para.click();
	}




	public void user03() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(user03));
		para.sendKeys("User 03");

	}

	public void cause3() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(cause3));
		Select dropdown = new Select(para);
		dropdown.selectByIndex(4);

	}


	public void action3() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(action3));
		Select dropdown = new Select(para);
		dropdown.selectByIndex(4);

	}


	public void usernote3() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(usernote3));
		para.sendKeys("user note03");
	}


	public void add03() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(add03));
		para.click();
	}

	public void Remeasure() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Remeasure));
		para.click();
	}
	public void Add01() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Add01));
		para.sendKeys("10");
	}

	public void Add02() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Add02));
		para.sendKeys("15");
	}

	public void Calculate() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Calculate));
		para.click();
	}

	public void SavereMeasure() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(SavereMeasure));
		para.click();
	}

	public void Submit() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Submit));
		para.click();
	}

	public void submitnote() {
		WebElement submitButton = driver.findElement(
				By.xpath("(//button[normalize-space()='Submit'])[1]")
		);
		submitButton.click();
	}
	public void closebutton() {
		WebElement submitButton = driver.findElement(
				By.xpath("//button[text()=' Close ']")
		);
		submitButton.click();
	}


	public void yesbutton() {
		WebElement submitButton = driver.findElement(
				By.xpath("//button[text()=' Yes ']")
		);
		submitButton.click();
	}


	public void Edit08() {
		WebElement submitButton = driver.findElement(
				By.xpath("(//img[@class='EDIT_BLUE'])[8]")
		);
		submitButton.click();
	}


	public void backward() throws InterruptedException {
							Thread.sleep(2000);
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(left));
		para.click();
	}

	public void note() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(note));
		para.click();
	}
	public void deletenote() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(delete));
		para.click();
	}

	public void oknote() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(oknote));
		para.click();
	}


	public void user04() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(edituser));
		para.clear();
		para.sendKeys("User 04");
	}


	public void cause4() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(cause4));
		Select dropdown = new Select(para);
		dropdown.selectByIndex(3);

	}


	public void action4() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(action4));
		Select dropdown = new Select(para);
		dropdown.selectByIndex(3);

	}


	public void usernote4() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(usernote4));
		para.clear();
		para.sendKeys("user note02");
	}





	public void savechart7() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart6));
		para.click();

	}

	public void getText6()
										{
									
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText6));
									 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

									   
									 String expectedResults = "Rng Pt Out";
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
								            "4.0457", "7.8433", "11.6409", 
								            "0.0000", "2.0200", "6.5993", 
								            "0.74", "0.16", "134.31 %",
								            "12.0000", "12.0000"
								        };

								        // Loop through the XPaths and validate
								        for (int i = 0; i < xpaths.length; i++) {
								            // Locate the web element
								            WebElement element = driver.findElement(By.xpath(xpaths[i]));

								            // Get the actual text
								            String actualText = element.getText();

								            // Validate the text
								            if (actualText.equals(expectedValues[i])) {
								                System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value." + actualText);
								            } else {
								                System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "'.");
								            }
								        }
								    } catch (Exception e) {
								        e.printStackTrace();
								    }
								}

								
							
						

							
							
			}
 
					    
					    
					    
					    
					    
					    
					    
					    


