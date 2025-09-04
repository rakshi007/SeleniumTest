package pages;

import java.text.DecimalFormat;
import java.time.Duration;
import java.text.DecimalFormat;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.UIActions;

public class TestCase05Page {

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

	 
	 private By controlcahrt = By.xpath("//img[@id='CCP']");
	 private By Analisys = By.xpath("//a[text()='Analysis']");
	 private By DefieRun = By.xpath("//select[@formcontrolname=\"DefineRunValue\"]");
	 private By DefineTrend = By.xpath("//select[@formcontrolname=\"DefineTrendValue\"]");
	 private By Hugging  = By.xpath("//select[@formcontrolname=\"HuggingAverageValue\"]");
	 private By Control   = By.xpath("//select[@formcontrolname=\"HuggingControlLimit\"]");
	 private By saveDD = By.xpath("//button[text()=' Save ']");
	 private By  closechar= By.xpath("(//button[text()='Close'])[1]");
	 
	 
	 //para01
		private By clickconfiguration01 = By.xpath("(//img)[8]");
	 private By clickaddpara2 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname41 = By.xpath("(//input[@maxlength=\"40\"])[1]");
		 private By datatime = By.xpath("(//input[@type=\"radio\"])[6]");
	    private By go = By.xpath("//button[text()=' Go ']");
	    private By data = By.id("datetimeFormat");
	    private By Test = By.xpath("(//button[@class=\"btn save\"])[1]");
	    private By saveP = By.xpath("//button[normalize-space()='Save']");
	    private By closeC = By.xpath("//button[normalize-space()='Close']");
	
	    
	    
	   
	    
	    //para03
	    
	  
		 private By clickaddpara07 = By.xpath("(//img[@class='imgStyle1'])[1]");
		 private By sendparaname07 = By.xpath("(//input[@maxlength=\"40\"])[1]");
		 private By datatime07 = By.xpath("(//input[@type=\"radio\"])[6]");
		 private By go07 = By.xpath("//button[text()=' Go ']");
		 private By data07 = By.id("datetimeFormat");
		 private By Test07 = By.xpath("(//button[@class=\"btn save\"])[1]");
		 private By saveP07 = By.xpath("//button[normalize-space()='Save']");
		 private By closeC07 = By.xpath("//button[normalize-space()='Close']");

	    
	    
	    
		 //creating parameter 03

		

	
		private By clickaddpara1 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname01 = By.xpath("(//input[@maxlength=\"40\"])[1]");
	    private By allowall = By.xpath("(//input[@type=\"radio\"])[7]");
	    private By save01 = By.xpath("//button[normalize-space()='Save']");
		private By close01 = By.xpath("//button[normalize-space()='Close']");
	
	    
	    
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
		   private By close1 = By.xpath("(//button[text()='Close'])[2]");
		   
		   

		    //edit 01
		    
		    private By network1 = By.xpath("(//img)[6]");
		    private By clickvaripage = By.xpath("(//div[@class='col-lg-10'])[1]");
		    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[5]");
		    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
		    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
		    private By subgroup01= By.id("Subgroup_0");
		    private By subgroup02= By.id("Subgroup_1");
		    private By savechart01 = By.id("sequencebychartsave");
		    private By getText = By.id("linkheader");



		//  edit chart02

		    private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
		    private By subgroup11= By.id("Subgroup_0");
		    private By subgroup12= By.id("Subgroup_1");
		    private By parameterdp3= By.xpath("(//input[@cursorposition=\"1\"])[1]");
		    private By GetText = By.xpath("(//div[@class=\"errormsg\"])[1]");
		    private By Savechart02 = By.id("sequencebychartsave");
		    private By GetText02 = By.id("linkheader");
		    
		    
		    

			//  edit chart03

			    private By time03= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
			    private By subgroup21= By.id("Subgroup_0");
			    private By subgroup22= By.id("Subgroup_1");
			    private By savechart331 = By.id("sequencebychartsave");
			    private By getText3 = By.id("linkheader");  
		    
		    

				//  edit chart04

				    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
				    private By subgroup31= By.id("Subgroup_0");
				    private By subgroup32= By.id("Subgroup_1");
				    private By savechart4 = By.id("sequencebychartsave");
				    private By getText4 = By.id("linkheader");

		    
		    
		    
		    

					//  edit chart05

					    private By time5= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
					    private By subgroup41= By.id("Subgroup_0");
					    private By subgroup42= By.id("Subgroup_1");
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
					    private By savechart6 = By.id("sequencebychartsave");
					    private By OKAction= By.xpath("(//button[text()='OK'])[1]");
					    private By ActionDropdown= By.xpath("(//select[@formcontrolname=\"ActionID\"])[2]");
					    private By Actionclick= By.xpath("(//option[text()='Supplier Quality Management'])[1]");

					    private By getText6 = By.id("linkheader");


					//  edit chart07

					    private By time71= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
					    private By subgroup71= By.id("Subgroup_0");
					    private By subgroup72= By.id("Subgroup_1");
					    private By savechart71 = By.id("sequencebychartsave");
					    private By getText7 = By.id("linkheader");
					    
					    
					    

						//  edit chart08

						    private By time81= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
						    private By subgroup81= By.id("Subgroup_0");
						    private By subgroup82= By.id("Subgroup_1");
						    private By savechart81 = By.id("sequencebychartsave");
						    private By Cancel8 = By.xpath("(//button[text()='Cancel'])[1]");
						    private By getText8 = By.id("linkheader");    
					    
					    
					    
					    
					      
		   
		   
		   
		   
		// create satellite and page

		    private By network = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");
	
		    
		    public TestCase05Page(WebDriver driver) {
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
		        addGrpElement.sendKeys("Spark Plugs");

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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

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

			public void clickaddpara1() {
				
			        

					WebElement para = driver.findElement(By.xpath("(//img[@class='imgStyle1'])[1]"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", para);
					para.click();
			        
			        
			        
			}
			
			public void sendparaname01() {
				 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(sendparaname01));
				 para.sendKeys("Allow All");
			}
			
			public void allowall() {
				 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(allowall));
				 para.click();
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
//			            String expectedText = "Your expected popup text here";
//			            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

			        } catch (Exception e) {
			            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
			        }
				 
				 
				 
			}
			

			public void close01() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(close01));
				 para.click();
			}
			
		    
			
			
//para02	
			
			
		

			public void clickaddpara2() throws InterruptedException {
				Thread.sleep(1000);
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickaddpara2));
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		        jsExecutor.executeScript("arguments[0].click();", para);
			}
			
			public void sendparaname41() {
				 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(sendparaname01));
				 para.sendKeys("Date/Time");
			}
			
			
			public void datatime() throws InterruptedException {
				Thread.sleep(1000);
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(datatime));
				 para.click();
			}
			
			
			public void go() throws InterruptedException {
				Thread.sleep(1000);

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(go));
				 para.click();
				 
				
		
			}
			
			
			
			public void data() throws InterruptedException {
				Thread.sleep(1000);

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(data));
				para.sendKeys("MM-DD-YYYY");
				 
				
		
			}
			
			
			
			
			

			public void Test() throws InterruptedException {
				Thread.sleep(1000);

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Test));
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
			

			public void clickaddpara07() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickaddpara07));
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		        jsExecutor.executeScript("arguments[0].click();", para);
			}
			
			public void sendparaname07() {
				 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(sendparaname07));
				 para.sendKeys("Date/Time");
			}
			
			
			public void datatime07() throws InterruptedException {
				Thread.sleep(1000);
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(datatime07));
				 para.click();
			}
			
			
			public void go07() throws InterruptedException {
				Thread.sleep(1000);

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(go07));
				 para.click();
				 
				
		
			}
			
			
			
			public void data07() throws InterruptedException {
				Thread.sleep(1000);

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(data07));
				para.sendKeys("MM/DD/YYYY");
				 
				
		
			}
			
			
			
			
			

			public void Test07() throws InterruptedException {
				Thread.sleep(1000);

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Test07));
				para.click();
				 
				
		
			}
			
			
			
			
			
			public void saveP07() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(saveP07));
				 para.click();
			}
		    
			
			public void closeC07() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(closeC07));
				 para.click();
			}
			
			
			
			//assign para to part
			
			
			public void filesicon() throws InterruptedException {
				Thread.sleep(1000);
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
//				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
//				 para.click();
				 WebElement para = driver.findElement(By.xpath("//p[text()=' Parameter Entry Restricted ']"));
					WebElement test = driver.findElement(By.xpath("//p[text()=' Parameters ']"));
					  Actions actions02 = new Actions(driver);
					  actions02.clickAndHold(para).moveToElement(test).release().build().perform();
					  
					  WebElement para1 = driver.findElement(By.xpath("//p[text()=' Function ']"));
						WebElement test1 = driver.findElement(By.xpath("//p[text()=' Parameters ']"));
						  Actions actions021 = new Actions(driver);
						  actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();
			}
			
			
			
			
			
			
			
			


			public void checkallbox() {
//				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
//				 para.click();
				 WebElement para = driver.findElement(By.xpath("//p[text()=' Date/Time ']"));
					WebElement test = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
					  Actions actions02 = new Actions(driver);
					  actions02.clickAndHold(para).moveToElement(test).release().build().perform();
					  
					  WebElement para1 = driver.findElement(By.xpath("//p[text()=' Allow All ']"));
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

					WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=' Spark Plugs ']")));
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


				public void editpencil() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(editpencil));
					 para.click();
				}



				public void date() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(date));
					 para.click();
				}



				public void time1() {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}

				



				public void subgroup01() throws InterruptedException {
					WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup01));
					actions.clearAndType2(para,"7.00","");

					// Fetch the value from the UI using getAttribute("value")
					String actualValue = para.getDomAttribute("data-value");

				}
				public void subgroup02() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup02));
					actions.clearAndType2(para,"7.00","");
					
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
				
				


//				editchart02

		// private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
			  


				public void time2() {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}
				
				public void subgroup11() throws InterruptedException {
					Thread.sleep(1000);
					WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup11));

					String expectedValue = "7.00";
					para.sendKeys(expectedValue);


				}

				public void subgroup12() throws InterruptedException {
					Thread.sleep(1000);
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup12));
					
					 String expectedValue = "7.01";
					    para.sendKeys(expectedValue);

					
				}
				


				
				public void parameterdp3() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp3));
					 para.sendKeys("ABC123@%#$");
					 
					
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


				public void time3() {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}



				public void subgroup21() {
					WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup21));
					String expectedValue = "7.02";



				}

					public void subgroup22() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup22));
					
					 String expectedValue = "7.02";
					    para.sendKeys(expectedValue);

					
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




				public void time4() {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}



				public void subgroup31() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup31));
					
					 String expectedValue = "7.00";
					    para.sendKeys(expectedValue);


					
				}





				public void subgroup32() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup32));
				
					 String expectedValue = "7.03";
					    para.sendKeys(expectedValue);


					
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
				            "6.9793", "7.0070", "7.0357", 
				            "0.0000", "0.0150", "0.0490", 
				            "100.27", "0.19", "1.00 %",
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




			//  edit chart05


				public void time5() {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}



				public void subgroup41() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup41));
					
					 String expectedValue = "7.00";
					    para.sendKeys(expectedValue);


					
				}




				public void subgroup42() {
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup42));
					
					 String expectedValue = "7.04";
					    para.sendKeys(expectedValue);


					
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

				
				
				

				//  edit chart06


				public void time6() {
					
					  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

				        // Now find and click the input field
				        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
				        inputField.click();
				}



					public void subgroup61() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup61));
						
						 String expectedValue = "7.00";
						    para.sendKeys(expectedValue);
						
					}




					public void subgroup62() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup62));
						
						 String expectedValue = "7.05";
						    para.sendKeys(expectedValue);

						
					}


					
					public void savechart6() throws InterruptedException {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart6));
						 para.click();
						 
						 
					}
					
					public void OKAction() throws InterruptedException {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(OKAction));
						 para.click();
					
					}
					
					public void ActionDropdown() throws InterruptedException {
						 WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(ActionDropdown));
					        addGrpElement.click();
					        

							 Select select = new Select(addGrpElement);
							 select.selectByIndex(1);
					
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
					            "6.9655", "7.0125", "7.0595", 
					            "0.0000", "0.0250", "0.0817", 
					            "60.16", "0.19", "1.66 %",
					            "7.0250", "0.0500"
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


					public void time7() {
						
						  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

					        // Now find and click the input field
					        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
					        inputField.click();
					}



					public void subgroup71() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup71));
						 para.sendKeys("7.00");
					}




					public void subgroup72() {
						 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup72));
						 para.sendKeys("7.06");
					}
					
					


					public void savechart71() throws InterruptedException {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart71));
						 para.click();
						 
						 Thread.sleep(2000);
						 
						 
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
					            "6.9586", "7.0150", "7.0714", 
					            "0.0000", "0.0300", "0.0980", 
					            "50.13", "0.19", "1.99 %",
					            "7.0300", "0.0600"
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


							public void time8() {
								
								 WebElement inputField = driver.findElement(By.id("idTime"));
								 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
							}



							public void subgroup81() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup81));
								
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




							public void subgroup82() {
								 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup82));
								
								 String expectedValue = "7.07";
								    para.sendKeys(expectedValue);

								
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

								   
								    String expectedResults = "8 Hug Avg";
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
							            "6.9517", "7.0175", "7.0833", 
							            "0.0000", "0.0350", "0.1143", 
							            "42.97", "0.19", "2.33 %",
							            "7.0350", "0.0700"
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
