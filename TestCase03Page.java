package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.GregorianCalendar.AD;


public class TestCase03Page {

	
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	 private By addnew1 = By.id("new");
	 private By AddCharLink = By.xpath("//a[text()='Add Characteristic ']");
	 private By DDN = By.xpath("(//input[@role='combobox'])[1]");
	 private By DG = By.xpath("//div[contains(text(),'SPC_Control_Group')]");
	 private By PN = By.xpath("(//input[@role='combobox'])[2]");
	 private By PART = By.xpath("//div[contains(text(),'Car Spare parts')]");
	 private By Char = By.id("AddChar");


	private By charaaddbutton = By.xpath("//button[text()=' Add ']");
	 private By upperspec = By.id("upperlmt");
	 private By  lowerspec= By.id("lowerspec");
	 private By subsize = By.id("subgroupsize");
	private By savechar = By.xpath("//button[normalize-space()='Save']");
	 private By actiontab = By.xpath("//img[@id=\"AN\"]");
	private By addicon = By.xpath("(//img[@class='imgStyle1'])[1]");
	private By Enteraction = By.xpath("//input[@id='AddCauseAction']");
	private By saveaction = By.xpath("//button[@class=\"btn add\"]");

	 private By controlcahrt = By.xpath("//img[@id='CCP']");
	 private By Analisys = By.xpath("(//a[normalize-space()='Analysis'])[1]");
	 private By DefieRun = By.xpath("//select[@formcontrolname=\"DefineRunValue\"]");
	 private By DefineTrend = By.xpath("//select[@formcontrolname=\"DefineTrendValue\"]");
	private By saveDD = By.xpath("(//button[normalize-space()='Save'])[1]");
	private By alarmstab = By.xpath("(//img[@id='AR'])[1]");
	private By restication = By.xpath("//p[contains(text(),'Force action note on out of control or alarm condi')]");
	private By  savechar1= By.xpath("(//button[@type='submit'])[1]");
	private By  closechar= By.xpath("//div[@class='modal-footer none']//button[@type='button'][normalize-space()='Close']");

	 
	 //creating parameter 01
	 

		private By clickconfiguration01 = By.xpath("(//img)[8]");
		private By clickaddpara1 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname01 = By.xpath("(//input[@maxlength=\"40\"])[1]");
	    private By Highlites = By.xpath("//label[normalize-space()='Highlight Contents on Entry']//span[@class='checkmark']");
	    private By save01 = By.xpath("//button[normalize-space()='Save']");
		private By close01 = By.xpath("//button[normalize-space()='Close']");
	
	
		 //creating parameter 02

		private By clickaddpara2 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname41 = By.xpath("(//input[@maxlength=\"40\"])[1]");
	    private By incrementradio = By.xpath("(//input[@type=\"radio\"])[2]");
	    private By go = By.xpath("//button[text()=' Go ']");
	    private By Prefix = By.xpath("//div[@class='increment_input']//div[1]//input[1]");
	    private By StartValue = By.xpath("//div[@class='increment_input']//div[2]//input[1]");
	    private By Increment = By.xpath("//lib-npopup//div[3]//input[1]");
	    private By Suffix = By.xpath("//lib-npopup//div[4]//input[1]");
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
		private By assignlink = By.xpath("//a[text()='Assign']");
		private By saveassign = By.xpath("//button[text()=' Save ']");
		private By closeassign = By.xpath("(//button[text()=' Close '])[2]");
	
	
		
		//sequence

	    private By addseqlink = By.xpath("//img[@id=\"new\"]");
	    private By expand= By.xpath("//span[@class='right-round']//img[@class='imgsize']");
	   private By DDG1 =By.xpath("(//p[text()=' SPC_Control_Group '])[2]");
	   private By DDd =By.xpath("//span[@id='showBy']//img");
	   private By Sequenc =By.xpath("//a[text()=' Sequences']");
	   private By editsequence =By.xpath("//span[text()='Edit Sequence']");
	   private By drag =By.xpath("//p[text()='Engine ']");
	   private By drop =By.xpath("//p[text()='Characteristics in Sequence']");
	   private By save = By.xpath("//button[text()='Save']");
	   private By close1 = By.xpath("(//button[text()='Close'])[2]");

		    
		    
		    
		    //edit 01
		    
		    private By network1 = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");
		    private By clickvaripage = By.xpath("(//div[@class='col-lg-10'])[1]");
		    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[3]");
		    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
		    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
		    private By subgroup01= By.id("Subgroup_0");
		    private By subgroup02= By.id("Subgroup_1");
		    private By subgroup03= By.id("Subgroup_2");
		    private By subgroup04= By.id("Subgroup_3");
		    private By Highlites01 = By.xpath("(//input[@triggers=\"manual\"])[1]");
		    private By mouse = By.xpath("//input[@id='parameterEntry_5130_4206']");
		    private By getdom1 = By.xpath("parameterEntry_5147_4228");
		    private By savechart01 = By.id("sequencebychartsave");
		    private By getText = By.id("linkheader");



		//  edit chart02

		    private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
		    private By subgroup11= By.id("Subgroup_0");
		    private By subgroup12= By.id("Subgroup_1");
		    private By subgroup113= By.id("Subgroup_2");
		    private By subgroup14= By.id("Subgroup_3");
		    private By parameterdp3= By.xpath("(//input[@cursorposition=\"1\"])[2]");
		    private By getdom2 = By.xpath("parameterEntry_5147_4228");
		    private By savechart2 = By.id("sequencebychartsave");
		    private By getText2 = By.id("linkheader");
		    
		    
		    

			//  edit chart03

			    private By time3= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
			    private By subgroup21= By.id("Subgroup_0");
			    private By subgroup22= By.id("Subgroup_1");
			    private By subgroup23= By.id("Subgroup_2");
			    private By subgroup24= By.id("Subgroup_3");
			    private By getdom3 = By.xpath("parameterEntry_5147_4228");
			    private By savechart3 = By.id("sequencebychartsave");
			    private By getText3 = By.id("linkheader");    
		    
		    

				//  edit chart04

				    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
				    private By subgroup31= By.id("Subgroup_0");
				    private By subgroup32= By.id("Subgroup_1");
				    private By subgroup33= By.id("Subgroup_2");
				    private By subgroup34= By.id("Subgroup_3");
				    private By getdom4 = By.xpath("parameterEntry_5147_4228");
				    private By savechart4 = By.id("sequencebychartsave");
				    private By getText4 = By.id("linkheader");
		    
		    
		    
		    

					//  edit chart05

					    private By time5= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
					    private By subgroup41= By.id("Subgroup_0");
					    private By subgroup42= By.id("Subgroup_1");
					    private By subgroup43= By.id("Subgroup_2");
					    private By subgroup444= By.id("Subgroup_3");
					    private By getdom5 = By.xpath("parameterEntry_5147_4228");
					    private By savechart5 = By.id("sequencebychartsave");
	                    private By okbutton = By.xpath("(//button[@id=\"btn0\"])[1]");
	                    private By submitcauses = By.xpath("//button[@id=\"noteSave\"]");
	                    private By Actionselect = By.xpath("(//select[@id='Action'])[2]");
					    private By getText05 = By.id("linkheader");
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	//char	    
		    

		    public TestCase03Page(WebDriver driver) {
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
		    
		    
		    public void Char() throws InterruptedException {
		        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(Char));
		        addGrpElement.sendKeys("Tyre");

		    	}

		    
		    
		    

		    public void AD() throws InterruptedException {
		    	Thread.sleep(1000);
		        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(charaaddbutton));
		        addGrpElement.click();
		    }
		    

		    public void upperspec() throws InterruptedException {
		    	 WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(upperspec));
			        addGrpElement.sendKeys("8.00");
		    }
		    

		    public void lowerspec() throws InterruptedException {
		    	 WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(lowerspec));
			        addGrpElement.sendKeys("2.00");
		    }
		    

		    public void subsize() throws InterruptedException {
		    	 WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(subsize));
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




	public void actiontab() throws InterruptedException {
				Thread.sleep(1000);
		WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(actiontab));
		addGrpElement.click();
	}

	public void addicon() throws InterruptedException {
		Thread.sleep(1000);
		WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(addicon));
		addGrpElement.click();
	}

	public void Enteraction() throws InterruptedException {

		WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(Enteraction));
		addGrpElement.sendKeys("Action");
	}

	public void saveaction() throws InterruptedException {

		WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(saveaction));
		addGrpElement.click();
	}

		    
		    public void controlcahrt() throws InterruptedException {
		    	Thread.sleep(1000);
		        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(controlcahrt));
		        addGrpElement.click();
		    }
		    
		    
		    public void Analisys() throws InterruptedException {
		    	Thread.sleep(1000);

		   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

			 WebElement analysisTab = driver.findElement(By.xpath("//a[text()='Analysis']"));
			 analysisTab.click();
}
		    
		    
		    
		    public void DefieRun() throws InterruptedException {
		    	Thread.sleep(1000);
		        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(DefieRun));
		        addGrpElement.click();
		        

				 Select select = new Select(addGrpElement);
				 select.selectByIndex(1);
		    }
		    
		    
		    
		    public void DefineTrend() throws InterruptedException {
		    	Thread.sleep(1000);
		        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(DefineTrend));
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


	public void alarmstab() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("(//img[@id='AR'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public void restication() throws InterruptedException {
     Thread.sleep(1000);
		WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(restication));
		addGrpElement.click();
	}
	public void saverr() throws InterruptedException {

		WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(savechar1));
		addGrpElement.click();
	}



		    public void closechar() throws InterruptedException {
		    	Thread.sleep(1000);
		    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
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
				WebElement addParameterButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='imgStyle1'])[1]")));
				addParameterButton.click();
				System.out.println("Is displayed: " + addParameterButton.isDisplayed());
				System.out.println("Is enabled: " + addParameterButton.isEnabled());



			}
			
			public void sendparaname01() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sendparaname01));
				 para.sendKeys("Highlight Contents on Entry");
			}
			
			
			public void Highlites() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Highlites));
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
			
			
		

			public void clickaddpara2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickaddpara2));
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		        jsExecutor.executeScript("arguments[0].click();", para);
			}
			
			public void sendparaname41() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sendparaname01));
				 para.sendKeys("Increment");
			}
			
			
			public void incrementradio() throws InterruptedException {
				Thread.sleep(1000);
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(incrementradio));
				 para.click();
			}
			
			
			public void go() throws InterruptedException {
				Thread.sleep(1000);

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(go));
				 para.click();
				 
				
		
			}
			

			public void Prefix() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Prefix));
				 para.sendKeys("LOt ");
			}
			
		    	

			public void StartValue() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(StartValue));
				 para.sendKeys("1");
			}
			
			
			public void Increment() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Increment));
				 para.sendKeys("1");
			}
			
			
			public void Suffix() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Suffix));
				 para.sendKeys("No");
			}
			
			
			public void saveP() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(saveP));
				 para.click();
			}
		    
			
			public void closeC() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(closeC));
				 para.click();
			}
			
			
			
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



			public void checkallbox() {
//				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
//				 para.click();
				 WebElement para = driver.findElement(By.xpath("//p[@title='Use in Function (Numeric)']"));
					WebElement test = driver.findElement(By.xpath("//p[text()=' Parameters ']"));
					  Actions actions02 = new Actions(driver);
					  actions02.clickAndHold(para).moveToElement(test).release().build().perform();
					  
					  WebElement para1 = driver.findElement(By.xpath("//p[text()=' Require Parameter Entry ']"));
						WebElement test1 = driver.findElement(By.xpath("//p[text()=' Parameters ']"));
						  Actions actions021 = new Actions(driver);
						  actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();
			}



			public void checkallbox1() {
//				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
//				 para.click();
				 WebElement para = driver.findElement(By.xpath("//p[@title='Highlight Contents on Entry']"));
					WebElement test = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
					  Actions actions02 = new Actions(driver);
					  actions02.clickAndHold(para).moveToElement(test).release().build().perform();
					  
					  WebElement para1 = driver.findElement(By.xpath("//p[@title='Increment']"));
						WebElement test1 = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
						  Actions actions021 = new Actions(driver);
						  actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();
			}



			public void assignlink() throws InterruptedException {
				Thread.sleep(2000);
				WebElement assignButton = driver.findElement(By.xpath("//button[text()=' Assign ']"));
				assignButton.click();

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
					int attempts = 0;
					boolean clicked = false;
					while(attempts < 3 && !clicked) {
					    try {
					        WebElement groupElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[text()=' SPC_Control_Group '])[2]")));
					        groupElement.click();
					        clicked = true;
					    } catch (StaleElementReferenceException e) {
					        System.out.println("Attempt " + (attempts + 1) + ": Encountered stale element. Retrying...");
					    }
					    attempts++;
					}
					if (!clicked) {
					    throw new RuntimeException("Unable to click on the element after several attempts due to stale element issues.");
					}

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

					WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=' Tyre ']")));
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(close1));
					 para.click();
				}
			
			
			//edit01
				
				public void network1() {
					//div[@class='iconpos-top']//div[2]//span[1]//img[1]
					
					WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img)[6]")));

				        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
				        jsExecutor.executeScript("arguments[0].click();", element);
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
					    WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup01));
					    
					    // Enter the value into the text field
					    String expectedValue = "5.00";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup02));
					
					  String expectedValue = "5.00";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup03));
				
					  String expectedValue = "5.00";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup04));
					
					  String expectedValue = "5.00";
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
				            "5.0000", "5.0000", "5.0000", 
				            "0.0000", "0.0000", "0.0000", 
				            "99.99", "99.99", "9999.00 %",
				            "5.0000", "0.0000"
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
					
					 WebElement inputField = driver.findElement(By.id("idTime"));
					 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);

				}
				
				public void subgroup11() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup11));
				
					  String expectedValue = "5.10";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup12));
					
					 String expectedValue = "5.10";
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
				

				public void subgroup113() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup113));
					
					 String expectedValue = "5.10";
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

				public void subgroup14() throws InterruptedException {
					Thread.sleep(1000);
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup14));
					
					 String expectedValue = "5.10";
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
				
				
				

				public void getText2() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText2));
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
				            "5.0500", "5.0500", "5.0500", 
				            "0.0000", "0.0000", "0.8010", 
				            "99.99", "99.99", "9999.00 %",
				            "5.1000", "0.0000"
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
					
					 WebElement inputField = driver.findElement(By.id("idTime"));
					 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
				}



				public void subgroup21() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup21));
					
					 String expectedValue = "5.20";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup22));
					
					 String expectedValue = "5.20";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup23));
					
					 String expectedValue = "5.20";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup24));
					
					 String expectedValue = "5.20";
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
				            "5.1000", "5.1000", "5.1000", 
				            "0.0000", "0.0000", "0.0000", 
				            "99.99", "99.99", "9999.00 %",
				            "5.2000", "0.0000"
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
					
					 WebElement inputField = driver.findElement(By.id("idTime"));
					 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
				}



				public void subgroup31() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup31));
					
					 String expectedValue = "5.30";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup32));
				
					 String expectedValue = "5.30";
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
					
					 String expectedValue = "5.30";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup34));
					
					 String expectedValue = "5.30";
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
				            "5.1500", "5.1500", "5.1500", 
				            "0.0000", "0.0000", "0.0000", 
				            "99.99", "99.99", "9999.00 %",
				            "5.3000", "0.0000"
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
					
					 WebElement inputField = driver.findElement(By.id("idTime"));
					 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
				}



				public void subgroup41() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup41));
					
					 String expectedValue = "5.40";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup42));
					
					 String expectedValue = "5.40";
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
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup43));
					
					 String expectedValue = "5.40";
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




				public void subgroup444() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup444));
					
					 String expectedValue = "5.40";
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

	 public void okbutton() throws InterruptedException {

			WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(okbutton));
			addGrpElement.click();
	}
	public void Actionselect() throws InterruptedException {

		WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(Actionselect));
		Select select = new Select(addGrpElement);
		select.selectByIndex(1);
	}
	public void submitcauses() throws InterruptedException {

		WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(submitcauses));

		addGrpElement.click();
	}


	public void getText05() {
					
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText05));
					 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

					   
					    String expectedResults = "Avg Trend Up";
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
				            "5.2000", "5.2000", "5.2000", 
				            "0.0000", "0.0000", "0.0000", 
				            "99.99", "99.99", "9999.00 %",
				            "5.4000", "0.0000"
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
