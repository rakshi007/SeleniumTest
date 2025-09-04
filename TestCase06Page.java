package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.UIActions;
public class TestCase06Page {

	private WebDriver driver;
	private WebDriverWait wait;

	UIActions actions;
	
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



	 private By controlchart = By.xpath("//img[@id='CCP']");
	 private By Analisys = By.xpath("//a[text()='Analysis']");
	 private By DefieRun = By.xpath("//select[@formcontrolname=\"DefineRunValue\"]");
	 private By DefineTrend = By.xpath("//select[@formcontrolname=\"DefineTrendValue\"]");
	 private By Hugging  = By.xpath("//select[@formcontrolname=\"HuggingAverageValue\"]");
	 private By Control   = By.xpath("//select[@formcontrolname=\"HuggingControlLimit\"]");
	 private By saveDD = By.xpath("(//button[text()=' Save '])[1]");
		 private By  closechar= By.xpath("(//button[text()=' Close '])[1]");
	 
	 
	 //para01
		private By clickconfiguration01 = By.xpath("(//img)[8]");
	    private By clickaddpara2 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname41 = By.xpath("(//input[@maxlength=\"40\"])[1]");
		private By Identity = By.xpath("(//input[@type=\"radio\"])[5]");
	    private By saveP = By.xpath("//button[normalize-space()='Save']");
	    private By closeC = By.xpath("//button[normalize-space()='Close']");
	


	    

	    
	    
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
		private By saveassign = By.xpath("//button[text()=' Save ']");
		private By closeassign = By.xpath("(//button[text()=' Close '])[2]");
	
	
		//add sequence



	private By addseqlink = By.xpath("//img[@id=\"new\"]");
	private By expand= By.xpath("//span[@class='right-round']//img[@class='imgsize']");
	private By down = By.xpath("//img[@class=\"dropdown_icon\"]");
	private By DDG =By.xpath("(//p[text()=' SPC_Control_Group '])[2]");
	private By okg =By.xpath("//button[text()='OK']");
	private By DDG1 =By.xpath("(//p[text()=' SPC_Control_Group '])[2]");
	private By DDd =By.xpath("//span[@id='showBy']//img");
	private By Sequenc =By.xpath("//a[text()=' Sequences']");
	private By right = By.xpath("");
	private By editsequence =By.xpath("//span[text()='Edit Sequence']");
	private By drag =By.xpath("//p[text()=' Air Filter ']");
	private By drop =By.xpath("//p[text()=' Characteristics in Sequence ']");
	private By save = By.xpath("//button[text()='Save']");
	private By close1 = By.xpath("(//button[text()=' Close '])[2]");




	//edit 01

		    private By network1 = By.xpath("(//img)[6]");
		    private By clickvaripage = By.xpath("(//div[@class='col-lg-10'])[1]");
		    private By editpencil1 = By.xpath("(//img[@class='EDIT_BLUE'])[6]");
		    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
		    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
		    private By subgroup01= By.id("Subgroup_0");
		    private By subgroup02= By.id("Subgroup_1");
		    private By subgroup03= By.id("Subgroup_2");
		    private By subgroup04= By.id("Subgroup_3");
		    private By sourceA = By.xpath("(//input[@cursorposition=\"1\"])[1]");
		    private By sourceAget = By.xpath("(//input[@cursorposition=\"1\"])[2]");
		    private By savechart01 = By.id("sequencebychartsave");
		    private By getText = By.id("linkheader");



		//  edit chart02

		    private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
		    private By subgroup11= By.id("Subgroup_0");
		    private By subgroup12= By.id("Subgroup_1");
		    private By subgroup13= By.id("Subgroup_2");
		    private By subgroup14= By.id("Subgroup_3");
		    private By sourceB = By.xpath("(//input[@cursorposition=\"1\"])[1]");
		    private By sourceBget = By.xpath("(//input[@cursorposition=\"1\"])[2]");
		    private By GetText = By.xpath("(//div[@class=\"errormsg\"])[1]");
		    private By Savechart02 = By.id("sequencebychartsave");
		    private By GetText02 = By.id("linkheader");
		    

			//  edit chart03

			    private By time03= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
			    private By subgroup21= By.id("Subgroup_0");
			    private By subgroup22= By.id("Subgroup_1");
			    private By subgroup23= By.id("Subgroup_2");
			    private By subgroup24= By.id("Subgroup_3");
			    private By sourceC = By.xpath("(//input[@cursorposition=\"1\"])[1]");
			    private By sourceCget = By.xpath("(//input[@cursorposition=\"1\"])[2]");
			    private By savechart331 = By.id("sequencebychartsave");
			    private By getText3 = By.id("linkheader");  
		    
		    

				//  edit chart04

				    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
				    private By subgroup31= By.id("Subgroup_0");
				    private By subgroup32= By.id("Subgroup_1");
				    private By subgroup33= By.id("Subgroup_2");
				    private By subgroup34= By.id("Subgroup_3");
				    private By sourceD = By.xpath("(//input[@cursorposition=\"1\"])[1]");
				    private By sourceDget = By.xpath("(//input[@cursorposition=\"1\"])[2]");
				    private By savechart4 = By.id("sequencebychartsave");
				    private By getText4 = By.id("linkheader");

		    
		    
		    
		    

					//  edit chart05

					    private By time5= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
					    private By subgroup41= By.id("Subgroup_0");
					    private By subgroup42= By.id("Subgroup_1");
					    private By subgroup43= By.id("Subgroup_2");
					    private By subgroup44= By.id("Subgroup_3");
					    private By savechart5 = By.id("sequencebychartsave");
					    private By OKCause= By.xpath("(//button[@id=\"btn0\"])[1]");
					    private By CauseDropdown= By.xpath("(//select[@id=\"Cause\"])[2]");
					    private By Causeclick= By.xpath("(//option[text()='High Manufacturing Costs'])[1]");
					    private By submit01 = By.xpath("//button[text()='Submit']");
					    private By getText5 = By.id("linkheader");
		    
					 
					    
					    
					    

					    
					    //edit 06
					    
					  
					    private By time6= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
					    private By subgroup61= By.id("Subgroup_0");
					    private By subgroup62= By.id("Subgroup_1");
					    private By subgroup63= By.id("Subgroup_2");
					    private By subgroup64= By.id("Subgroup_3");
					    private By savechart6 = By.id("sequencebychartsave");
					  

					    private By getText6 = By.id("linkheader");


					//  edit chart07

					    private By time71= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
					    private By subgroup71= By.id("Subgroup_0");
					    private By subgroup72= By.id("Subgroup_1");
					    private By subgroup73= By.id("Subgroup_2");
					    private By subgroup74= By.id("Subgroup_3");
					    private By savechart71 = By.id("sequencebychartsave");
					    private By getText7 = By.id("linkheader");
					    
					    
					    

						//  edit chart08

						    private By time81= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
						    private By subgroup81= By.id("Subgroup_0");
						    private By subgroup82= By.id("Subgroup_1");
						    private By subgroup83= By.id("Subgroup_2");
						    private By subgroup84= By.id("Subgroup_3");
						    private By savechart81 = By.id("sequencebychartsave");
						    private By Cancel8 = By.xpath("(//button[text()='Cancel'])[1]");
						    private By getText8 = By.id("linkheader");    
					    
					    
					    
					    
					      
		   
		   
		   
		   
		// create satellite and page

		    private By network = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");
	
		    
		    public TestCase06Page(WebDriver driver) {
		   	 this.driver =  driver;
		   	 this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				this.actions = new UIActions(driver);
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
		        addGrpElement.sendKeys("Oil Filter");

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
			        addGrpElement.sendKeys("4");
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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

		        } catch (Exception e) {
		            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
		        }
		        
		    }
		    
		   
		    
		    
		    
		    public void controlchart() throws InterruptedException {
				Thread.sleep(2000);
		    	WebElement element = driver.findElement(By.id("CCP"));
		    	element.click();




		    }
		    
		    
		    public void Analisys() throws InterruptedException {
		    	
			 
			 WebElement element = driver.findElement(By.xpath("//a[text()='Analysis']"));
			 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		
			 
}
		    
		    
		    public void shiftyup() throws InterruptedException {
		    	Thread.sleep(1000);
			 
			 WebElement element = driver.findElement(By.xpath("//label[normalize-space()='4 of 10 in zone A']//span[@class='checkmark']"));
			 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		
			 
}   
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    public void DefieRun() throws InterruptedException {
		    	Thread.sleep(1000);
		        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(DefieRun));
		        addGrpElement.click();
		        

				 Select select = new Select(addGrpElement);
				 select.selectByVisibleText("None");
		    }
		 

		    public void DefineTrend() throws InterruptedException {
		    	Thread.sleep(1000);
		        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(DefineTrend));
		        addGrpElement.click();
		        Select select = new Select(addGrpElement);
		        select.selectByVisibleText("None");
		        
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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

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

			public void clickaddpara1() throws InterruptedException {
				
			        Thread.sleep(2000);

					WebElement para = driver.findElement(By.xpath("(//img[@class='imgStyle1'])[1]"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", para);
					para.click();
			        
			        
			        
			}
			
			public void sendparaname01() {
				 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(sendparaname41));
				 para.sendKeys("Identity");
			}
			
			
			
			public void identity() throws InterruptedException {
				Thread.sleep(1000);
				 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(Identity));
				 para.click();
			}
			
			
			
			
			public void save01() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(saveP));
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
			

			public void close01() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(closeC));
				 para.click();
			}


	//assign para to part
			
			
			public void filesicon() throws InterruptedException {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(filesicon));

				 actions.performClick(para,"");
			}


			 public void Addptp() {
				 WebElement element = driver.findElement(By.xpath("//a[text()='Add Part ']"));
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
			    try {
			        // Locate the first set of elements
			        WebElement para = driver.findElement(By.xpath("//p[@title=\"Allow All\"]"));
			        WebElement test = driver.findElement(By.xpath("//p[text()=' Parameters ']"));

			        // Check if both elements are displayed before performing the action
			        if (para.isDisplayed() && test.isDisplayed()) {
			            Actions actions02 = new Actions(driver);
			            actions02.clickAndHold(para).moveToElement(test).release().build().perform();
			            System.out.println("Action performed for 'Parameter Entry Restricted' to 'Parameters'.");
			        } else {
			            System.out.println("Elements for 'Parameter Entry Restricted' or 'Parameters' are not displayed.");
			        }

			        // Locate the second set of elements
			        WebElement para1 = driver.findElement(By.xpath("//p[@title=\"Date/Time\"]"));
			        WebElement test1 = driver.findElement(By.xpath("//p[text()=' Parameters ']"));

			        // Check if both elements are displayed before performing the action
			        if (para1.isDisplayed() && test1.isDisplayed()) {
			            Actions actions021 = new Actions(driver);
			            actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();
			            System.out.println("Action performed for 'Function' to 'Parameters'.");
			        } else {
			            System.out.println("Elements for 'Function' or 'Parameters' are not displayed.");
			        }
			    } catch (NoSuchElementException e) {
			        System.out.println("One or more elements were not found: " + e.getMessage());
			    } catch (Exception e) {
			        System.out.println("An error occurred: " + e.getMessage());
			    }
			}

			
			
			
			
			
			
			


			public void checkallbox() {
//				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
//				 para.click();
				 WebElement para = driver.findElement(By.xpath("//p[@title=\"Identity\"]"));
					WebElement test = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
					  Actions actions02 = new Actions(driver);
					  actions02.clickAndHold(para).moveToElement(test).release().build().perform();
			
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
//			            String expectedText = "Your expected popup text here";
//			            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

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
					WebElement element = driver.findElement(By.xpath("(//img)[52]"));
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click();", element);


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

					WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=' Oil Filter ']")));
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
//				            String expectedText = "Your expected popup text here";
//				            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

				        } catch (Exception e) {
				            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
				        }
				}

				public void close1() {
					WebElement closeButton = driver.findElement(By.xpath("(//button[text()=' Close '])[2]"));
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click();", closeButton);
					closeButton.click();
				}

			
			
			
	//creating sat and page
				
				
				
				

				public void network1() throws InterruptedException {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(network1));
					actions.performClick(para,"");
				}

				
				public void clickvaripage() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickvaripage));
					 para.click();
				}


	public void editoilfilter() {
		WebElement editIcon = driver.findElement(editpencil1);
		editIcon.click();
	}


				public void date() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(date));
					 para.click();
				}



				public void time() 	 {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
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

			
				

				public void subgroup03() {
					
				    // Wait until the element is clickable
				    WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup03));
				    
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
				
				public void subgroup04() {
					
				    // Wait until the element is clickable
				    WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup04));
				    
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
				
				
				public void sourceA() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sourceA));
					 para.sendKeys("A");
					 
					 
					 
				}
				
				
				public void sourceAget() {
				    try {
				        // Wait for the element to be visible using the locator
				        WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(sourceAget));
				        
				        // Get the text from the element
				        String elementText = para.getText();
				        
			
				        // Print the text to the console
				        System.out.println("The text of the sourceAget element is: " + elementText);
				    } catch (TimeoutException e) {
				        System.out.println("Element was not visible within the specified wait time: " + e.getMessage());
				    } catch (Exception e) {
				        System.out.println("An unexpected error occurred: " + e.getMessage());
				    }
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
				    String expectedResults = "No !";

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
				
				
				
				
				
				
				
				
				
				
				
				


//				editchart02

		// private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
			  


				public void time2() 	 {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}

				   
				   
				
				public void subgroup11() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup11));
				
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

				public void subgroup12() throws InterruptedException {
					Thread.sleep(1000);
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup12));
					
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
				

				public void subgroup13() {
					
				    // Wait until the element is clickable
				    WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup13));
				    
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
				public void subgroup14() {
					
				    // Wait until the element is clickable
				    WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup14));
				    
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
				
				public void sourceB() {
					
					
					
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sourceB));
					 para.clear();
					 para.sendKeys("B");
					 
				}
				
				public void sourceBget() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sourceBget));
					 para.getText();
					 
					 
					 
				}
				
				
				
				public void Savechart02() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Savechart02));
					 para.click();
				}
				
				
						

				public void GetText02() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(GetText02));
					 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

					    // Define the expected result
//					    String expectedResults = "Process in Control ";
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


				public void time3() 	 {
						
						  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

					        // Now find and click the input field
					        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
					        inputField.click();
					}


				public void subgroup21() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup21));
					
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




				public void subgroup22() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup22));
					
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
				

				public void subgroup23() {
					
				    // Wait until the element is clickable
				    WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup23));
				    
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
				
				public void subgroup24() {
					
				    // Wait until the element is clickable
				    WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup24));
				    
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
				
				
				
				
				public void sourceC() {
					
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sourceC));
					 para.clear();
					 para.sendKeys("C");
					 
				}
				
				public void sourceCget() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sourceCget));
					 para.getText();
					 
					 
					 
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




				public void time4() 	 {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}


				public void subgroup31() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup31));
					
					 String expectedValue = "7.10";
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





				public void subgroup32() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup32));
				
					 String expectedValue = "7.10";
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
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup33));
				
					 String expectedValue = "7.10";
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
				public void subgroup34() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup34));
				
					 String expectedValue = "7.10";
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
				

				
				
				
				public void sourceD() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sourceD));
					 para.clear();
					 para.sendKeys("D");
					 
					 
					 
				}
				
				public void sourceDget() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sourceDget));
					 para.getText();
					 
					 
					 
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
				        		 "7.0500", "7.0500", "7.1000", 
						         "0.0000", "0.0000", "0.0000", 
						         "99.99", "99.99", "9999.00 %",
						         "7.2000", "0.0000"
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
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}

				public void subgroup41() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup41));
					
					 String expectedValue = "7.11";
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




				public void subgroup42() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup42));
					
					 String expectedValue = "7.11";
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


				public void subgroup43() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup43));
					
					 String expectedValue = "7.11";
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
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup44));
					
					 String expectedValue = "7.11";
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

				

				
				public void savechart5() throws InterruptedException {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart5));
					 para.click();
					 
					
				}
				
				public void OKCause() throws InterruptedException {
					Thread.sleep(2000);
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(OKCause));
					 para.click();
				
				}
				
				public void CauseDropdown() throws InterruptedException {
					 WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(CauseDropdown));
				        addGrpElement.click();
				        

						 Select select = new Select(addGrpElement);
						 select.selectByIndex(1);}
				
				public void submit01() throws InterruptedException {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(submit01));
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
				        		 "7.8000", "7.8000", "7.8000", 
						            "0.0000", "0.0000", "0.0000", 
						            "99.99", "99.99", "9999.00 %",
						            "7.2000", "0.0000"
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

				
				public void time6() 	 {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}


					public void subgroup61() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup61));
						
						 String expectedValue = "7.11";
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




					public void subgroup62() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup62));
						
						 String expectedValue = "7.11";
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

					public void subgroup63() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup63));
						
						 String expectedValue = "7.11";
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

					public void subgroup64() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup64));
						
						 String expectedValue = "7.11";
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


					
					public void savechart6() throws InterruptedException {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart6));
						 para.click();
						 
						 
					}
					
					
					
					
					
					
					public void getText6() {
						
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText6));
						 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

						   
						 String expectedResults = "Process in Control";
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
					            "7.1000", "7.1000", "7.1000", 
					            "0.0000", "0.0000", "0.0000", 
					            "99.99", "99.99", "9999.00 %",
					            "7.2000", "0.0000"
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

					
				
				
				

					//  edit chart07
					public void time7() 	 {
						
						  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

					        // Now find and click the input field
					        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
					        inputField.click();
					}

					public void subgroup71() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup71));
						
						 String expectedValue = "7.11";
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





					public void subgroup72() {
						WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup72));
						
						 String expectedValue = "7.11";
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

					
					
					public void subgroup73() {
						WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup73));
						
						 String expectedValue = "7.11";
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




					public void subgroup74() {
						WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup74));
						
						 String expectedValue = "7.11";
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
					


					public void savechart71() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(savechart71));
						 para.click();
					}
						 
						 
					

					public void getText7() {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText7));
						 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

						    // Define the expected result
						 String expectedResults = "Process in Control";
						    // Log both results for debugging
						    System.out.println("Expected: '" + expectedResults + "'");
						    System.out.println("Actual: '" + actualResults + "'");

						    // Assert the actual result matches the expected result
						    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


					}
			
					public void validateDataValues07() {
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
					            "7.1000", "7.1000", "7.1000", 
					            "0.0000", "0.0000", "0.0000", 
					            "99.99", "99.99", "9999.00 %",
					            "7.1000", "0.0000"
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

				
				

						//  edit chart08


					public void time8() 	 {
						
						  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

					        // Now find and click the input field
					        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
					        inputField.click();
					}


							public void subgroup81() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup81));
								
								 String expectedValue = "7.11";
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




							public void subgroup82() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup82));
								
								 String expectedValue = "7.11";
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


							public void subgroup83() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup83));
								
								 String expectedValue = "7.11";
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

							public void subgroup84() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup84));
								
								 String expectedValue = "7.11";
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
	
							
							
							
							
							
							
							
							
							
							
							
							
							

							
							public void savechart81() throws InterruptedException {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart81));
								 para.click();
								 
								 Thread.sleep(2000);
								
							}
							
							

							public void Cancel8() throws InterruptedException {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Cancel8));
								 para.click();
							}
							
							
							
							
							public void getText8() {
								
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText8));
								 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

								   
								    String expectedResults = "Process in Control";
									System.out.println("Expected: '" + expectedResults + "'");
								    System.out.println("Actual: '" + actualResults + "'");

								    // Assert the actual result matches the expected result
								    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);



							}
							
							public void validateDataValues08() {
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
							            "7.1013", "7.1013", "7.1013", 
							            "0.0000", "0.0000", "0.0000", 
							            "99.99", "99.99", "9999.00 %",
							            "7.1100", "0.0000"
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

							

							public void time9() {
							    try {
							        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
							        
							        // Wait for the element to be present in the DOM
							        WebElement inputField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("idTime")));

							        // Scroll into view (if needed)
							        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);

							        // Click using JavaScript Executor
							        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
							        
							        System.out.println("Clicked successfully on the Time input field.");

							    } catch (StaleElementReferenceException e) {
							        System.out.println("StaleElementReferenceException occurred, retrying...");
							        time2(); // Retry once
							    } catch (TimeoutException e) {
							        System.out.println("TimeoutException: Element not found within the wait time.");
							    } catch (Exception e) {
							        System.out.println("An unexpected error occurred: " + e.getMessage());
							    }
							}


									public void subgroup91() {
										 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup81));
										
										 String expectedValue = "7.12";
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




									public void subgroup92() {
										 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup82));
										
										 String expectedValue = "7.12";
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


									public void subgroup93() {
										 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup83));
										
										 String expectedValue = "7.12";
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

									public void subgroup94() {
										 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup84));
										
										 String expectedValue = "7.12";
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
			
									
									
									
									
									public void savechart9() throws InterruptedException {
										 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart81));
										 para.click();
										 
										 Thread.sleep(2000);
										
									}
									
									

									public void Cancel9() throws InterruptedException {
										 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Cancel8));
										 para.click();
									}
									
									
									
									
									public void getText9() {
										
										 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText8));
										 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

										   
										    String expectedResults = "Shift 4/10 Up";
											System.out.println("Expected: '" + expectedResults + "'");
										    System.out.println("Actual: '" + actualResults + "'");

										    // Assert the actual result matches the expected result
										    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);



									}
									
									public void validateDataValues09() {
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
									            "7.1013", "7.1013", "7.1013", 
									            "0.0000", "0.0000", "0.0000", 
									            "99.99", "99.99", "9999.00 %",
									            "7.1100", "0.0000"
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