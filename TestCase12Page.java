package pages;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase12Page {


	private WebDriver driver;
	private WebDriverWait wait;
	

	
	private By addnew1 = By.id("new");
	 private By AddCharLink = By.xpath("//a[text()='Add Characteristic ']");
	 private By DDN = By.xpath("(//input[@role='combobox'])[1]");
	 private By DG = By.xpath("//div[contains(text(),'SPC_Control_Group')]");
	 private By PN = By.xpath("(//input[@role='combobox'])[2]");
	 private By PART = By.xpath("//div[contains(text(),'Car Spare parts')]");
	 private By Char = By.id("AddChar");
	 private By AD = By.xpath("//button[text()='Add']");
	 private By upperspec = By.id("upperlmt");
	 private By  lowerspec= By.id("lowerspec");
	 private By subsize = By.id("subgroupsize");
	 private By upperlimit = By.xpath("//input[@class=\"col-7 ng-pristine ng-valid ng-touched\"]");
	 private By lowerlimit = By.xpath("//input[@class=\"col-7 ng-valid ng-dirty ng-touched\"]");
	 
	 private By  savechar= By.xpath("//button[text()=' Save ']");

	 private By closechar = By.xpath("(//button[text()=' Close '])[1]");
	
		//add sequence
		
		

		    private By addseqlink = By.xpath("//img[@id=\"new\"]");
		    private By expand= By.xpath("//span[@class='right-round']//img[@class='imgsize']");
		   private By down = By.xpath("//img[@class=\"dropdown_icon\"]");
		   private By DDG =By.xpath("//p[text()='SPC_Control_Group']");
		   private By okg =By.xpath("//button[text()='OK']");
		   private By DDG1 =By.xpath("//p[text()=' SPC_Control_Group']");
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
		    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[12]");
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
		    private By allowuser01= By.xpath("(//input[@cursorposition=\"1\"])[1]");
		    private By GetText = By.xpath("(//div[@class=\"errormsg\"])[1]");
		    private By Savechart02 = By.id("sequencebychartsave");
		    private By GetText02 = By.id("linkheader");
		    
		    
		    

			//  edit chart03

			    private By time03= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
			    private By subgroup21= By.id("Subgroup_0");
			    private By subgroup22= By.id("Subgroup_1");
			    private By savechart331 = By.id("sequencebychartsave");
			    private By allowuser02= By.xpath("(//input[@cursorposition=\"1\"])[1]");
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
					    private By orderlist= By.xpath("(//input[@cursorposition=\"1\"])[2]");
					    private By getText5 = By.id("linkheader");
		    
					 
					    public TestCase12Page(WebDriver driver) {
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
						        addGrpElement.sendKeys("Rng Pnt Out");

						    	}

						    
						    
						    

						    public void AD() throws InterruptedException {
						    	Thread.sleep(1000);
						        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(AD));
						        addGrpElement.click();
						    }
						    

						    public void upperspec() throws InterruptedException {
						    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
						    	 WebElement addGrpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(upperspec));
							        addGrpElement.sendKeys("10.00");
						    }
						    

						    public void lowerspec() throws InterruptedException {
						    	 WebElement addGrpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(lowerspec));
							        addGrpElement.sendKeys("5.00");
						    }
						    

						    public void subsize() throws InterruptedException {
						    	 WebElement addGrpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(subsize));
							        addGrpElement.sendKeys("2");
						    }
						  
				    
						    
							 
							  public void upperlimit() throws InterruptedException {
							    	 WebElement addGrpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(upperlimit));
								        addGrpElement.sendKeys("17");
							    }
							 
							 
							  public void lowerlimit() throws InterruptedException {
							    	 WebElement addGrpElement = wait.until(ExpectedConditions.visibilityOfElementLocated(lowerlimit));
								        addGrpElement.sendKeys("5");
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
//						            String expectedText = "Your expected popup text here";
//						            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

						        } catch (Exception e) {
						            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
						        }
						        
						    }
						    

							public void closechar() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(closechar));
								 para.click();
							}

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

									WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='PPK ']")));
									WebElement test = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Characteristics in Sequence']")));

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
//								            String expectedText = "Your expected popup text here";
//								            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

								        } catch (Exception e) {
								            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
								        }
								}

								public void close1() {
									WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
									JavascriptExecutor js = (JavascriptExecutor) driver;
									js.executeScript("arguments[0].click();", closeButton);

								}
 
								//creating sat and page
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

								



								public void subgroup01() {
									
									    // Wait until the element is clickable
									    WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup01));
									    
									    // Enter the value into the text field
									    String expectedValue = "9.00";
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
									
									  String expectedValue = "6.00";
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
								
								
								
								
								
								
								
								
								
								
								
								


//								editchart02

						// private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
							  


								public void time2() {
									
									  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

								        // Now find and click the input field
								        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
								        inputField.click();
								}
								
								public void subgroup11() {
									 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup11));
								
									  String expectedValue = "9.00";
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
//									
								}

								public void subgroup12() throws InterruptedException {
									Thread.sleep(1000);
									 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup12));
									
									 String expectedValue = "6.01";
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
								


								
								
								public void allowuser01() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(allowuser01));
									 para.sendKeys("User04");
								}
								
								
								
								
								
								public void Savechart02() throws InterruptedException {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Savechart02));
									 para.click();
									 Thread.sleep(2000);
								}
								
								public void cancel01() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[text()='Cancel'])[1]"))));
														 para.click();	 
														 
													}
										

								public void GetText02() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(GetText02));
									 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

									    // Define the expected result
//									    String expectedResults = "Process in Control ";
									 String expectedResults = "PPK less than 1";
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
									
									 String expectedValue = "9.00";
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




								public void subgroup22() {
									 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup22));
									
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
								

								public void allowuserclear() {
									
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(allowuser02));
									para.clear();
								}


								public void allowuser02() {
									
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(allowuser02));
									
									 para.sendKeys("User05");
								}
								

								public void savechart331() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart331));
									 para.click();
								}
								
								
								
								public void cancel02() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[text()='Cancel'])[1]"))));
														 para.click();	 
														 
													}

								public void getText3() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText3));
									 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

									    // Define the expected result
									 String expectedResults = "PPK less than 1";

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
									
									  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

								        // Now find and click the input field
								        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
								        inputField.click();
								}



								public void subgroup31() {
									 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup31));
									
									 String expectedValue = "9.00";
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





								public void subgroup32() {
									 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup32));
								
									 String expectedValue = "8.00";
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
								
								
								
								public void default02() {
									 WebElement dropdownElement = driver.findElement(By.xpath("(//select[@cursorposition='1'])[1]"));

								        // Create Select object
								        Select dropdown = new Select(dropdownElement);

								        // Fetch all dropdown values and store them in a list
								        List<String> dropdownValues = dropdown.getOptions().stream()
								                .map(e -> e.getText().trim()) // Trim spaces
								                .filter(e -> !e.isEmpty())    // Remove empty values (if any)
								                .collect(Collectors.toList());

								        // Print all dropdown values in the console
								        System.out.println("Dropdown Values:");
								        dropdownValues.forEach(System.out::println);
									
								}
								
								
								public void savechart4() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart4));
									 para.click();
									
								}

								
								public void cancel03() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[text()='Cancel'])[1]"))));
														 para.click();	 
														 
													}
								public void getText4() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText4));
									 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

									    // Define the expected result
									 String expectedResults = "PPK less than 1";

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
									
									  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

								        // Now find and click the input field
								        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("idTime")));
								        inputField.click();
								}



								public void subgroup41() {
									 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup41));
									
									 String expectedValue = "9.00";
									    para.sendKeys(expectedValue);

									    // Fetch the value from the UI using getAttribute("value")
//									    String actualValue = para.getDomAttribute("data-value");
	//
//									    // Verify the entered value matches the displayed value
//									    if (actualValue.equals(expectedValue)) {
//									        System.out.println("Value entered and displayed matches: " + actualValue);
//									    } else {
//									        System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
//									    }
									
								}




								public void subgroup42() {
									 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup42));
									
									 String expectedValue = "8.00";
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

								
								
								
								
								
								   
							    public void orderdropdown() throws InterruptedException {
							    
							    	WebElement dropdown = driver.findElement(By.xpath("(//select[@cursorposition=\"1\"])[2]"));
							    	Select select = new Select(dropdown);
							    	select.selectByContainsVisibleText("Order Edit");  // Select by value
							    }
							 
								
								public void savechart5() throws InterruptedException {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart5));
									 para.click();
									 
									
								}
								
								public void cancel04() {
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[text()='Cancel'])[1]"))));
														 para.click();	 
														 
													}
								
								
								
								
								public void getText5() {
									
									 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText5));
									 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

									   
									 String expectedResults = "PPK less than 1";
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
								            "3.7688", "7.9010", "12.0332", 
								            "0.0000", "2.1980", "7.1809", 
								            "0.43", "0.36j", "1.60 %",
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

								
								
}    
						    
						    
						    
						    
						    
						    
						    



								
								




