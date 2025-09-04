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

	public class rgw {



		private WebDriver driver;
		private WebDriverWait wait;


	       private By gettitle = By.xpath("//div[text()='Data Group Name']");
		 private By addlink = By.id("new");
		    private By addgrp = By.xpath("//a[text()='Add Data Group ']");
		    private By enterGrpName = By.id("AddGroup");
		    private By clickAdd = By.xpath("//button[text()='Add']");


	//part
		private By addnew = By.xpath("//img[@src=\"./assets/images/new.svg?v=1010108\"]");
		private By clkpart = By.xpath("//a[text()='Add Part ']");
		private By clickdrop = By.xpath("//div[@class='dx-dropdowneditor-icon']");
		private By slctGrp = By.xpath("//div[text()='test']");
		private By Enterpart = By.id("AddPart");
		private By ClkADD = By.xpath("//button[text()='Add']");


	//Char

		private By  addchar= By.id("AddChar");
		private By  charaaddbutton= By.xpath("//button[text()=' Add ']");		private By upperspec = By.id("upperlmt");
		private By  lowerspec= By.id("lowerspec");
		private By subsize = By.id("subgroupsize");
		private By  savechar= By.xpath("//button[text()='Save']");
		private By controlcahrt = By.xpath("//img[@id='CCP']");
		private By Analisys = By.xpath("//a[text()='Analysis']");
		private By DefieRun = By.xpath("//select[@formcontrolname=\"DefineRunValue\"]");
		private By DefineTrend = By.xpath("//select[@formcontrolname=\"DefineTrendValue\"]");
		private By saveDD = By.xpath("//button[text()='Save']");
		private By  closechar= By.xpath("(//button[text()='Close'])[1]");



		//creating para01 force selection from list


		private By clickconfiguration01 = By.xpath("(//img)[8]");
		private By clickaddpara2 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname2 = By.xpath("(//input[@maxlength=\"40\"])[1]");
	    private By Identity = By.xpath("(//input[@name=\"automatedradio\"])[5]");
	    private By save2 = By.xpath("//button[text()='Save']");
		private By close2 = By.xpath("//button[text()='Close']");


		//creating para02 force selection from list


		private By clickaddpara4 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname4 = By.xpath("(//input[@maxlength=\"40\"])[1]");
		private By selectfromlist = By.xpath("(//span[@class=\"checkmark\"])[11]");
		private By  ADDPARA1= By.id("addparaentry");
		private By addparaentries1 = By.xpath("(//img[@class=\"disablePlus\"])[1]");
		private By  ADDPARA2= By.id("addparaentry");
		private By addparaentries2 = By.xpath("(//img[@class=\"disablePlus\"])[1]");
		private By  ADDPARA3= By.id("addparaentry");
		private By addparaentries3 = By.xpath("(//img[@class=\"disablePlus\"])[1]");
		private By save4 = By.xpath("//button[text()='Save']");
		private By close4 = By.xpath("//button[text()='Close']");

		//creating para03 Alpha


		private By clickaddpara5 = By.xpath("(//img[@class='imgStyle1'])[1]");
		private By sendparaname5 = By.xpath("(//input[@maxlength=\"40\"])[1]");
		 private By alpha = By.xpath("(//input[@type=\"radio\"])[7]");
	    private By save5 = By.xpath("//button[text()='Save']");
		private By close5 = By.xpath("//button[text()='Close']");


		//Assign para to part



		private By filesicon = By.xpath("//div[@class='iconpos-top']//div[1]//span[1]//img[1]");
		 private By Addptp = By.id("new");
		private By Assignparaicon = By.xpath("//a[text()='Assign Parameters to Part ']");
		private By datadropdown= By.xpath("(//input[@role='combobox'])[1]");
		private By selectgrp= By.xpath("//div[contains(text(),'test')]");
		private By partdropdown = By.xpath("(//input[@role='combobox'])[2]");
		private By selectpartpara = By.xpath("//div[contains(text(),'VariablePart')]");
		private By checkallbox = By.xpath("(//span[@class='checkmark'])[4]");
		private By kebabicon = By.xpath("//span[@class='layout-btn btn-more none']//img");
		private By assignlink = By.xpath("//a[text()='Assign']");
		private By saveassign = By.xpath("//button[text()='Save']");
		private By closeassign = By.xpath("//button[text()='Close']");

//		Add sequence


	    private By addseqlink = By.xpath("//img[@id=\"new\"]");
	    private By addsequece= By.xpath("//a[text()='Add Sequence ']");
	    private By clickdatagroup = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");
	    private By selectdatagrp = By.xpath("//div[text()='test']");
	    private By clickpart = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
	    private By selectpart = By.xpath("//div[text()='VariablePart']");
	    private By clickonadd = By.xpath("//button[text()='Add']");
	    private By EnterSequencename = By.xpath("//input[@maxlength=\"40\"]");
	    private By SelectallCB= By.xpath("(//span[@class=\"checkmark\"])[4]");
	    private By Kebab = By.xpath("//span[@class='layout-btn btn-more none']//img");
	    private By assign = By.xpath("//a[text()='Assign']");
	    private By save = By.xpath("//button[text()='Save']");
	    private By close1 = By.xpath("//button[text()='Close']");

	// create satellite and page

	    private By network = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");
	    private By addsatellite = By.id("new");
	    private By satellite= By.xpath("//span[text()='Add Satellite']");
	    private By Entersatellitename= By.id("AddGroup");
	    private By Addsetellite = By.xpath("//button[text()='Add']");
	    private By Kebabsatellite = By.xpath("//span[@class='inline_svg svg_highlight moreimg']//img");
	    private By Addpaegsatellite = By.xpath("(//span[text()='Add Page'])[2]");
	    private By Enterpagenamesatellite = By.xpath("(//input[@placeholder='Page Name'])[1]");
	    private By Addsatellitepage = By.xpath("//button[text()='Add']");
	    private By Dragsequencname = By.xpath("//p[text()='MasterSequence']");
	    private By savesatellitepage = By.xpath("(//button[text()='Save'])[1]");
	    private By closesatellitepage = By.xpath("(//button[text()='Close'])[1]");


//		edit chart01

	    private By clickvaripage = By.xpath("(//div[@class='col-lg-10'])[2]");
	    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[1]");
	    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
	    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	    private By parameterdp= By.xpath("//select[@cursorposition=\"1\"]");
	    private By alphavalid = By.xpath("(//input[@cursorposition=\"1\"])[2]");
	    private By subgroup1= By.id("Subgroup_0");
	    private By subgroup2= By.id("Subgroup_1");
	    private By savechart = By.id("sequencebychartsave");
	    private By getText = By.id("linkheader");



	//  edit chart02

	    private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	    private By parameterdp2= By.xpath("//select[@cursorposition=\"1\"]");
	    private By alphavalid2 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
	    private By subgroup12= By.id("Subgroup_0");
	    private By subgroup3= By.id("Subgroup_1");
	    private By savechart2 = By.id("sequencebychartsave");
	    private By getText2 = By.id("linkheader");


	//  edit chart03

	    private By time3= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	    private By subgroup13= By.id("Subgroup_0");
	    private By subgroup33= By.id("Subgroup_1");
	    private By savechart3 = By.id("sequencebychartsave");
	    private By getText3 = By.id("linkheader");


	//  edit chart04

	    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	    private By subgroup4= By.id("Subgroup_0");
	    private By subgroup44= By.id("Subgroup_1");
	    private By savechart4 = By.id("sequencebychartsave");
	    private By getText4 = By.id("linkheader");



	//  edit chart05

	    private By time5= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	    private By subgroup5= By.id("Subgroup_0");
	    private By subgroup55= By.id("Subgroup_1");
	    private By savechart5 = By.id("sequencebychartsave");
	    private By getText5 = By.id("linkheader");




	//  edit chart06

	    private By time6= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");

	    private By subgroup66= By.id("Subgroup_0");
	    private By subgroup6= By.id("Subgroup_1");
	    private By savechar6 = By.id("sequencebychartsave");
	    private By getText6 = By.id("linkheader");




	//  edit chart07

	    private By time7= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");

	    private By subgroup77= By.id("Subgroup_0");
	    private By subgroup7= By.id("Subgroup_1");
	    private By savechart7 = By.id("sequencebychartsave");
	    private By getText7 = By.id("linkheader");



	//  edit chart08

	    private By time8= By.id("idDate");

	    private By subgroup88= By.id("Subgroup_0");
	    private By subgroup8= By.id("Subgroup_1");
	    private By savechart8 = By.id("sequencebychartsave");
	    private By getText8 = By.id("linkheader");





	//  edit chart09

	    private By time9= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	    private By subgroup99= By.id("Subgroup_0");
	    private By subgroup9= By.id("Subgroup_1");
	    private By savechart9 = By.id("sequencebychartsave");
	    private By getText9 = By.id("linkheader");








	//  edit chart10

	    private By time10= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	    private By subgroup100= By.id("Subgroup_0");
	    private By subgroup10= By.id("Subgroup_1");
	    private By savechart10 = By.id("sequencebychartsave");
	    private By getText10 = By.id("linkheader");







	//  edit chart11

	    private By time11= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");

	    private By subgroup111= By.id("Subgroup_0");
	    private By subgroup11= By.id("Subgroup_1");
	    private By savechart11 = By.id("sequencebychartsave");
	    private By getText11 = By.id("linkheader");





	//  edit chart12

	    private By time12= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");

	    private By subgroup122= By.id("Subgroup_0");
	    private By subgroup22= By.id("Subgroup_1");
	    private By savechart12 = By.id("sequencebychartsave");
	    private By getText12 = By.id("linkheader");






	//  edit chart13

	    private By time13= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	    private By subgroup133= By.id("Subgroup_0");
	    private By subgroup1333= By.id("Subgroup_1");
	    private By savechart13 = By.id("sequencebychartsave");
	    private By getText13 = By.id("linkheader");





	//  edit chart14

	    private By time14= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");

	    private By subgroup144= By.id("Subgroup_0");
	    private By subgroup14= By.id("Subgroup_1");
	    private By savechart14 = By.id("sequencebychartsave");
	    private By getText14 = By.id("linkheader");







	//  edit chart15

	    private By time15= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");

	    private By subgroup155= By.id("Subgroup_0");
	    private By subgroup15= By.id("Subgroup_1");
	    private By savechart15 = By.id("sequencebychartsave");
	    private By cancelpp = By.xpath("(//button[text()='Cancel'])[1]");
	    private By getText15 = By.id("linkheader");



















		public rgw(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    }








		    public void addlink() throws InterruptedException {



		    	WebElement element = driver.findElement(By.id("new"));
		    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		    	wait.until(ExpectedConditions.elementToBeClickable(element));
		    	driver.getTitle();
		    }

		    public void clickaddgrp() throws InterruptedException {
		    	Thread.sleep(1000);
		        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(addgrp));
		        addGrpElement.click();
		    }

		    public void entergrpname() {
		        WebElement grpNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(enterGrpName));
		        grpNameElement.sendKeys("test");
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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

		        } catch (Exception e) {
		            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
		        }
		    }












		//part


		 public void addnew() {
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
			 addpart.sendKeys("VariablePart");

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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

		        } catch (Exception e) {
		            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
		        }







		}



		//Char

		public void addchar() throws InterruptedException {

			 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(addchar));
			 Thread.sleep(1000);
			 addpart.sendKeys("variable01");

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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

		        } catch (Exception e) {
		            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
		        }




		}

			 public void controlcahrt() {

				 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(controlcahrt));
				 addpart.click();

			 }

				 public void Analisys() {

					 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(Analisys));
					 addpart.click();



				 }

					 public void DefieRun() {

						 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(DefieRun));
						 addpart.click();


						 Select select = new Select(addpart);
						 select.selectByIndex(1);


					 }


						 public void DefineTrend() {

							 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(DefineTrend));
							 addpart.click();




						 Select select1 = new Select(addpart);
						 select1.selectByIndex(1);


					 }
						 public void saveDD() {

							 WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(saveDD));
							 addpart.click();


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
		public void closechar() throws InterruptedException {
			Thread.sleep(2000);

			WebElement cancelButton = driver.findElement(By.xpath("//button[@class='btn cancel']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancelButton);


		}




		/////creating para01

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
			 para.sendKeys("Identity");
		}


		public void Identity() {
			 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Identity));
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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

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
			 para.sendKeys("Select From List");
		}


		public void selectfromlist() {

		       WebElement enterparaname =  driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[11]"));
		       Actions actions01 = new Actions(driver);
		       actions01.scrollToElement(enterparaname).perform();

		       WebElement para = wait.until(ExpectedConditions.elementToBeClickable(selectfromlist));
				 para.click();


		}

		public void ADDPARA1() {
			 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ADDPARA1));
			 para.sendKeys("Rakshith");
		}

		public void addparaentries1() {
			 WebElement save = wait.until(ExpectedConditions.elementToBeClickable(addparaentries1));
			 save.click();
		}

		public void ADDPARA2() {
			 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(ADDPARA2));
			 para.sendKeys("ROJA");
		}

		public void addparaentries2() {
			 WebElement save = wait.until(ExpectedConditions.elementToBeClickable(addparaentries2));
			 save.click();
		}



		public void ADDPARA3() {
			 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(ADDPARA3));
			 para.sendKeys("nishi");
		}

		public void addparaentries3() {
			 WebElement save = wait.until(ExpectedConditions.elementToBeClickable(addparaentries3));
			 save.click();
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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

		        } catch (Exception e) {
		            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
		        }
		}

		public void close4() {
			 WebElement close = wait.until(ExpectedConditions.elementToBeClickable(close4));
			 close.click();
		}



		////////////////5//////////


		//alphA ONLY
		public void clickaddpara5() {
			 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickaddpara5));
			 para.click();
		}


		public void sendparaname5() {
			 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(sendparaname5));
			 para.sendKeys("Alpha");
		}
		//alpha

		public void alpha() {
			 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(alpha));
			 para.click();
		}
		public void save5() {
			 WebElement save = wait.until(ExpectedConditions.elementToBeClickable(save5));
			 save.click();


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

		public void close5() {
			 WebElement close = wait.until(ExpectedConditions.elementToBeClickable(close5));
			 close.click();
		}


	//Assignpara


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
			 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
			 para.click();
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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

		        } catch (Exception e) {
		            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
		        }
		}







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
				 para.sendKeys("MasterSequence");
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

			public void addsatellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(addsatellite));
				 para.click();
			}

			public void satellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(satellite));
				 para.click();
			}

			public void Entersatellitename() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Entersatellitename));
				 para.sendKeys("Variable");
			}


			public void Addsetellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addsetellite));
				 para.click();
			}



			public void Kebabsatellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Kebabsatellite));
				 para.click();
				 WebElement kebabIcon = driver.findElement(By.cssSelector("img[src*='more.svg']"));

				// Click the element using JavaScript
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", kebabIcon);

			}


			public void Addpaegsatellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addpaegsatellite));
				 para.click();
			}


			public void Enterpagenamesatellite() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Enterpagenamesatellite));
				 para.sendKeys("VariablePage");
			}

			public void Addsatellitepage() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addsatellitepage));
				 para.click();
			}


			public void Dragsequencname() {

				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Dragsequencname));
				WebElement test = driver.findElement(By.xpath("((//p[text()='VariablePage']))[1]"));
				  Actions actions02 = new Actions(driver);
				  actions02.clickAndHold(para).moveToElement(test).release().build().perform();

			}

			public void savesatellitepage() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savesatellitepage));
				 para.click();
			}

			public void closesatellitepage() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(closesatellitepage));
				 para.click();
			}




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
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp));
				 WebElement para1 =  driver.findElement(By.xpath("//option[text()='Rakshith']"));
				 para.click();
				 para1.click();

			}


			public void alphavalid() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(alphavalid));
				 para.sendKeys("Test01");
			}



			public void subgroup1() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup1));
				 para.sendKeys("13.00");
			}



			public void subgroup2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup2));
				 para.sendKeys("12.44");
			}




			public void savechart() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart));
				 para.click();
			}


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

	//
//			 private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
//			    private By parameterdp2= By.xpath("//select[@cursorposition=\"1\"]");
//			    private By alphavalid2 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
//			    private By subgroup12= By.id("Subgroup_0");
//			    private By subgroup3= By.id("Subgroup_1");
//			    private By savechart2 = By.id("sequencebychartsave");
//			    private By getText2 = By.id("linkheader");
	//


			public void time2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time2));
				 para.click();
			}


			public void parameterdp2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp2));
				 WebElement para1 =  driver.findElement(By.xpath("//option[text()='ROJA']"));
				 para.click();
				 para1.click();
			}


			public void alphavalid2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(alphavalid2));
				 para.clear();
				 para.sendKeys("Test02");
			}



			public void subgroup12() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup12));
				 para.sendKeys("12.00");
			}




			public void subgroup3() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup3));
				 para.sendKeys("12.50");
			}


			public void savechart2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart2));
				 para.click();
			}

			public void getText2() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText2));
				 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

				    // Define the expected result
//				    String expectedResults = "Process in Control ";
				    String expectedResults = "Process in Control";
				    // Log both results for debugging
				    System.out.println("Expected: '" + expectedResults + "'");
				    System.out.println("Actual: '" + actualResults + "'");

				    // Assert the actual result matches the expected result
				    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);










			}



			//edit03


			public void time3() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time3));
				 para.click();
			}



			public void subgroup13() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup13));
				 para.sendKeys("12.80");
			}




			public void subgroup33() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup33));
				 para.sendKeys("13.00");
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



		//  edit chart04




			public void time4() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time4));
				 para.click();
			}



			public void subgroup4() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup4));
				 para.sendKeys("12.55");
			}




			public void subgroup44() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup44));
				 para.sendKeys("13.00");
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



		//  edit chart05


			public void time5() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time5));
				 para.click();
			}



			public void subgroup5() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup5));
				 para.sendKeys("12.88");
			}




			public void subgroup55() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup55));
				 para.sendKeys("12.33");
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



		//  edit chart06


			public void time6() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time6));
				 para.click();
			}



			public void subgroup66() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup66));
				 para.sendKeys("12.00");
			}




			public void subgroup6() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup6));
				 para.sendKeys("12.44");
			}


			public void savechar6() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechar6));
				 para.click();
			}

			public void getText6() {
				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText6));
				 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

				    // Define the expected result
				 String expectedResults = "Process in Control";

				    // Log both results for debugging
				    System.out.println("Expected: '" + expectedResults + "'");
				    System.out.println("Actual: '" + actualResults + "'");

				    // Assert the actual result matches the expected result
				    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


			}







		//  edit chart07



				public void time7() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time7));
					 para.click();
				}



				public void subgroup77() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup77));
					 para.sendKeys("12.00");
				}




				public void subgroup7() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup7));
					 para.sendKeys("13.00");
				}


				public void savechart7() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart7));
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




			//  edit chart08



				public void time8() {
					WebElement dateInput = driver.findElement(By.id("idDate"));
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateInput);

				}



				public void subgroup88() throws InterruptedException {
					 Thread.sleep(1000);
					 WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(subgroup88));
					 para.sendKeys("12.00");
				}




				public void subgroup8() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup8));
					 para.sendKeys("12.76");
				}


				public void savechart8() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart8));
					 para.click();
				}

				public void getText8() {
					 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText8));
					 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

					    // Define the expected result
					 String expectedResults = "Process in Control";

					    // Log both results for debugging
					    System.out.println("Expected: '" + expectedResults + "'");
					    System.out.println("Actual: '" + actualResults + "'");

					    // Assert the actual result matches the expected result
					    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


				}





			//  edit chart09



					public void time9() {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time9));
						 para.click();
					}



					public void subgroup99() {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup99));
						 para.sendKeys("12.00");
					}




					public void subgroup9() {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup9));
						 para.sendKeys("12.99");
					}


					public void savechart9() {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart9));
						 para.click();
					}

					public void getText9() {
						 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText9));
						 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

						    // Define the expected result
						 String expectedResults = "Process in Control";

						    // Log both results for debugging
						    System.out.println("Expected: '" + expectedResults + "'");
						    System.out.println("Actual: '" + actualResults + "'");

						    // Assert the actual result matches the expected result
						    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


					}





					//  edit chart10



							public void time10() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time10));
								 para.click();
							}



							public void subgroup100() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup100));
								 para.sendKeys("12.00");
							}




							public void subgroup10() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup10));
								 para.sendKeys("12.00");
							}


							public void savechart10() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart10));
								 para.click();
							}

							public void getText10() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText10));
								 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

								    // Define the expected result
								 String expectedResults = "Process in Control";

								    // Log both results for debugging
								    System.out.println("Expected: '" + expectedResults + "'");
								    System.out.println("Actual: '" + actualResults + "'");

								    // Assert the actual result matches the expected result
								    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


							}


							//  edit chart11



							public void time11() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time11));
								 para.click();
							}



							public void subgroup111() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup111));
								 para.sendKeys("13.00");
							}




							public void subgroup11() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup11));
								 para.sendKeys("13.00");
							}


							public void savechart11() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart11));
								 para.click();
							}

							public void getText11() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText11));
								 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

								    // Define the expected result
								 String expectedResults = "Process in Control";

								    // Log both results for debugging
								    System.out.println("Expected: '" + expectedResults + "'");
								    System.out.println("Actual: '" + actualResults + "'");

								    // Assert the actual result matches the expected result
								    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


							}



		//  edit chart12




							public void time12() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time12));
								 para.click();
							}



							public void subgroup122() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup122));
								 para.sendKeys("13.00");
							}




							public void subgroup22() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup22));
								 para.sendKeys("13.00");
							}


							public void savechart12() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart12));
								 para.click();
							}

							public void getText12() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText12));
								 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

								    // Define the expected result
								 String expectedResults = "Process in Control";

								    // Log both results for debugging
								    System.out.println("Expected: '" + expectedResults + "'");
								    System.out.println("Actual: '" + actualResults + "'");

								    // Assert the actual result matches the expected result
								    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


							}



		//  edit chart13





							public void time13() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time13));
								 para.click();
							}



							public void subgroup133() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup133));
								 para.sendKeys("13.00");
							}




							public void subgroup1333() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup1333));
								 para.sendKeys("13.00");
							}


							public void savechart13() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart13));
								 para.click();
							}

							public void getText13() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText13));
								 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

								    // Define the expected result
								 String expectedResults = "Process in Control";

								    // Log both results for debugging
								    System.out.println("Expected: '" + expectedResults + "'");
								    System.out.println("Actual: '" + actualResults + "'");

								    // Assert the actual result matches the expected result
								    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


							}






	//  edit chart14



							public void time14() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time14));
								 para.click();
							}



							public void subgroup144() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup144));
								 para.sendKeys("13.00");
							}




							public void subgroup14() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup14));
								 para.sendKeys("13.00");
							}


							public void savechart14() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart14));
								 para.click();
							}

							public void getText14() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText14));
								 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

								    // Define the expected result
								 String expectedResults = "Process in Control";

								    // Log both results for debugging
								    System.out.println("Expected: '" + expectedResults + "'");
								    System.out.println("Actual: '" + actualResults + "'");

								    // Assert the actual result matches the expected result
								    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


							}







						//  edit chart15



							public void time15() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time15));
								 para.click();
							}



							public void subgroup155() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup155));
								 para.sendKeys("13.00");
							}




							public void subgroup15() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup15));
								 para.sendKeys("13.00");
							}


							public void savechart15() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart15));
								 para.click();
							}

							public void cancelpp() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(cancelpp));
								 para.click();
							}


							public void getText15() {
								 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText15));
								 String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

								    // Define the expected result
								    String expectedResults = "Avg Run Up";

								    // Log both results for debugging
								    System.out.println("Expected: '" + expectedResults + "'");
								    System.out.println("Actual: '" + actualResults + "'");

								    // Assert the actual result matches the expected result
								    Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);


							}





	}














