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
import util.UIActions;




public class TestCase02Page {
	UIActions actions;
	private WebDriver driver;
	private WebDriverWait wait;


	private By addnew1 = By.id("new");
	private By AddCharLink = By.xpath("//a[text()='Add Characteristic ']");
	private By DDN = By.xpath("(//input[@role='combobox'])[1]");
	private By DG = By.xpath("//div[contains(text(),'SPC_Control_Group')]");
	private By PN = By.xpath("(//input[@role='combobox'])[2]");
	private By PART = By.xpath("//div[contains(text(),'Car Spare parts')]");
	private By Char = By.id("AddChar");


	private By addchar = By.id("AddChar");
	private By charaaddbutton = By.xpath("//button[text()=' Add ']");
	private By upperspec = By.id("upperlmt");
	private By lowerspec = By.id("lowerspec");
	private By subsize = By.id("subgroupsize");
	private By savechar = By.xpath("//button[text()=' Save ']");
	private By cntab = By.id("CN");
	private By addicon = By.xpath("(//img[@class='imgStyle1'])[1]");
	private By Entercasue = By.xpath("//input[@id='AddCauseAction']");
	private By savecause = By.xpath("//button[@class=\"btn add\"]");

	private By controlcahrt = By.xpath("//img[@id='CCP']");
	private By Analisys = By.xpath("//a[text()='Analysis']");
	private By DefieRun = By.xpath("//select[@formcontrolname=\"DefineRunValue\"]");
	private By DefineTrend = By.xpath("//select[@formcontrolname=\"DefineTrendValue\"]");
	private By saveDD = By.xpath("//button[text()=' Save ']");
	private By alarmstab = By.id("AR");
	private By restication = By.xpath("//label[@for='forceCauseNoteOnOocOrAc']//span[@class='checkmark']");
	private By saverr = By.xpath("//button[@type=\"submit\"]");
	private By closechar = By.xpath("((//button[text()=' Close '])[1]");


	//creating use in function


	private By clickconfiguration01 = By.xpath("(//img)[8]");
	private By clickaddpara2 = By.xpath("(//img[@class='imgStyle1'])[1]");
	private By sendparaname01 = By.xpath("(//input[@maxlength=\"40\"])[1]");
	private By Useinfunction = By.xpath("//label[normalize-space()='Use in Function (Numeric)']//span[@class='checkmark']");
	private By save01 = By.xpath("//button[text()=' Save ']");
	private By close01 = By.xpath("//button[text()=' Close ']");


	//creating para01 require parameter entry


	private By clickaddpara3 = By.xpath("(//img[@class='imgStyle1'])[1]");
	private By text02 = By.xpath("(//input[@maxlength=\"40\"])[1]");
	private By requireparameter = By.xpath("//label[normalize-space()='Require Parameter Entry']//span[@class='checkmark']");
	private By save2 = By.xpath("//button[text()=' Save ']");
	private By close2 = By.xpath("//button[text()=' Close ']");


	//Assign para to part


	private By filesicon = By.xpath("//div[@class='iconpos-top']//div[1]//span[1]//img[1]");
	private By Addptp = By.id("new");
	private By Assignparaicon = By.xpath("//a[text()='Assign Parameters to Part ']");
	private By datadropdown = By.xpath("(//input[@role='combobox'])[1]");
	private By selectgrp = By.xpath("//div[contains(text(),'SPC_Control_Group')]");
	private By partdropdown = By.xpath("(//input[@role='combobox'])[2]");
	private By selectpartpara = By.xpath("//div[contains(text(),'Car Spare parts')]");
	private By checkallbox = By.xpath("(//span[@class='checkmark'])[4]");
	private By kebabicon = By.xpath("//span[@class='layout-btn btn-more none']//img");
	private By assignlink = By.xpath("(//button[@id=\"btn0\"])[1]");
	private By saveassign = By.xpath("//button[text()=' Save ']");
	private By closeassign = By.xpath("(//button[text()=' Close '])[2]");

//	Add sequence


	private By addseqlink = By.xpath("//img[@id=\"new\"]");
	private By expand = By.xpath("//span[@class='right-round']//img[@class='imgsize']");
	private By down = By.xpath("//img[@class=\"dropdown_icon\"]");
	private By DDG = By.xpath("(//p[@title='SPC_Control_Group'])[1]");
	private By okg = By.xpath("//button[text()=' OK ']");
	private By DDG1 = By.xpath("(//p[@class='qual_groups_label'][normalize-space()='SPC_Control_Group'])[1]");
	private By DDd = By.xpath("//span[@id='showBy']//img");
	private By Sequenc = By.xpath("//a[text()=' Sequences']");
	private By editsequence = By.xpath("//span[text()='Edit Sequence']");
	private By drag = By.xpath("//p[text()='Engine ']");
	private By drop = By.xpath("//p[text()=' Characteristics in Sequence ']");
	private By save = By.xpath("//button[text()='Save']");
	private By close1 = By.xpath("(//button[text()=' Close '])[2]");

//	edit chart01

	private By clickvaripage = By.xpath("(//div[@class='col-lg-10'])[1]");
	private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[2]");
	private By date = By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
	private By time = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	private By subgroup1 = By.id("Subgroup_0");
	private By subgroup2 = By.id("Subgroup_1");
	private By savere = By.id("sequencebychartsave");
	private By clickok = By.id("btn0");
	private By parameterdp2 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
	private By savechart = By.id("sequencebychartsave");
	private By getText = By.id("linkheader");


//  edit chart02

	private By time2 = By.xpath("//input[@id=\"idTime\"]");
	private By subgroup22 = By.id("Subgroup_0");
	private By subgroup3 = By.id("Subgroup_1");
	private By parameterdp3 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
	private By savechart2 = By.id("sequencebychartsave");
	private By getText2 = By.id("linkheader");


//  edit chart03

	private By time3 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	private By subgroup13 = By.id("Subgroup_0");
	private By subgroup33 = By.id("Subgroup_1");
	private By parameterdp4 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
	private By savechart3 = By.id("sequencebychartsave");
	private By getText3 = By.id("linkheader");


//  edit chart04

	private By time4 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	private By subgroup4 = By.id("Subgroup_0");
	private By subgroup44 = By.id("Subgroup_1");
	private By parameterdp5 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
	private By savechart4 = By.id("sequencebychartsave");
	private By getText4 = By.id("linkheader");


//  edit chart05

	private By time5 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
	private By subgroup5 = By.id("Subgroup_0");
	private By subgroup55 = By.id("Subgroup_1");
	private By parameterdp6 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
	private By savechart5 = By.id("sequencebychartsave");
	private By getText5 = By.id("linkheader");


	private By time6 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");

	private By subgroup66 = By.id("Subgroup_0");
	private By subgroup6 = By.id("Subgroup_1");
	private By parameterdp7 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
	private By savechar6 = By.id("sequencebychartsave");
	private By getText6 = By.id("linkheader");


//  edit chart07

	private By time7 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");

	private By subgroup77 = By.id("Subgroup_0");
	private By subgroup7 = By.id("Subgroup_1");
	private By parameterdp8 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
	private By savechart7 = By.id("sequencebychartsave");
	private By okbutton = By.xpath("(//button[@id=\"btn0\"])[1]");
	private By causeselect = By.xpath("(//select[@id=\"Cause\"])[2]");
	private By submitcauses = By.xpath("//button[@id=\"noteSave\"]");

	private By getText7 = By.id("linkheader");


	public TestCase02Page(WebDriver driver) {
		this.driver = driver;
		this.actions = new UIActions(driver);
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
		addGrpElement.sendKeys("Engine");

	}


	public void charaaddbutton() {

		WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(charaaddbutton));
		addpart.click();

	}


	public void upperspec() {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(upperspec));
		addpart.click();


		addpart.sendKeys("10.00");

	}

	public void lowerspec() {

		WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(lowerspec));
		addpart.sendKeys("5.00");

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
//	            String expectedText = "Your expected popup text here";
//	            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

		} catch (Exception e) {
			System.err.println("Failed to fetch text from the popup: " + e.getMessage());
		}


	}
	public void cntab() {

		WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(cntab));
		addpart.click();

	}
	public void addicon() {

		WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(addicon));
		addpart.click();

	}
	public void Entercasue() {

		WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(Entercasue));
		addpart.sendKeys("Cause");

	}

	public void savecause() {

		WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(savecause));
		addpart.click();

	}



	public void controlcahrt() throws InterruptedException {

		WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(controlcahrt));
		actions.performClick(addpart,"");

	}

	public void Analisys() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

		WebElement analysisTab = driver.findElement(By.xpath("//a[text()='Analysis']"));
		analysisTab.click();


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
//					            String expectedText = "Your expected popup text here";
//					            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

		} catch (Exception e) {
			System.err.println("Failed to fetch text from the popup: " + e.getMessage());
		}


	}

	public void alarmstab() {

		WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(alarmstab));
		addpart.click();

	}

	public void restication() {

		WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(restication));
		addpart.click();
	}

	public void saverr() {

		WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(saverr));
		addpart.click();
	}



	public void closechar() throws InterruptedException {
		Thread.sleep(2000);

		WebElement cancelButton = driver.findElement(By.xpath("//button[@class='btn cancel']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancelButton);


	}


	/// //creating para01
	public void clickconfiguration01() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickconfiguration01));
		para.click();
	}

	public void clickaddpara2() throws InterruptedException {

		Thread.sleep(2000);
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickaddpara2));
		para.click();
	}


	public void sendparaname01() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(sendparaname01));
		para.sendKeys("Use in Function (Numeric)");
	}


	public void Useinfunction() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Useinfunction));
		para.click();
	}


	public void save01() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(save01));
		para.click();
	}


	public void close01() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(close01));
		para.click();
	}


	//para02

	public void clickaddpara3() throws InterruptedException {

		Thread.sleep(2000);
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickaddpara2));
		actions.performClick(para,"");
	}

	public void Sendparametername() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(text02));
		para.sendKeys("Require Parameter Entry");
	}


	public void requireparameter() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(requireparameter));
		para.click();
	}


	public void save2() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(save2));
		para.click();
	}


	public void close2() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(close2));
		para.click();
		Thread.sleep(1000);
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
//		 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(checkallbox));
//		 para.click();


		WebElement para0 = driver.findElement(By.xpath("//p[text()=' Numeric ']"));
		WebElement test0 = driver.findElement(By.xpath("//p[text()=' Parameters ']"));
		Actions actions002 = new Actions(driver);
		actions002.clickAndHold(para0).moveToElement(test0).release().build().perform();

		WebElement para01 = driver.findElement(By.xpath("//p[text()=' PasswordProtection ']"));
		WebElement test01 = driver.findElement(By.xpath("//p[text()=' Parameters ']"));
		Actions actions0021 = new Actions(driver);
		actions0021.clickAndHold(para01).moveToElement(test01).release().build().perform();
	}

	public void checkallbox1() {
		WebElement para = driver.findElement(By.xpath("//p[text()=' Use in Function (Numeric) ']"));
		WebElement test = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
		Actions actions02 = new Actions(driver);
		actions02.clickAndHold(para).moveToElement(test).release().build().perform();

		WebElement para1 = driver.findElement(By.xpath("//p[text()=' Require Parameter Entry ']"));
		WebElement test1 = driver.findElement(By.xpath("//p[text()=' Assigned for part ']"));
		Actions actions021 = new Actions(driver);
		actions021.clickAndHold(para1).moveToElement(test1).release().build().perform();


	}


	public void kebabicon() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(kebabicon));
		para.click();
	}


	public void saveassign() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(saveassign));
		para.click();
	}

	public void assignlink() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(assignlink));
		para.click();
	}


	public void closeassign() throws InterruptedException {

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

	public void Sequenc1() throws InterruptedException {
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

		WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=' Engine ']")));
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
//		            String expectedText = "Your expected popup text here";
//		            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

		} catch (Exception e) {
			System.err.println("Failed to fetch text from the popup: " + e.getMessage());
		}

	}


	public void close1() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(close1));
		para.click();
	}


//	creating satellite


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


	public void subgroup1() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup1));
		para.sendKeys("9.00");
	}


	public void subgroup2() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup2));
		para.sendKeys("6.00");
	}


	public void savere() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savere));
		para.click();

		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='You are required to enter a parameter value.:Require Parameter Entry']")));

		String popupText = popup.getText();
		System.out.println("Popup Text: " + popupText);
	}

	public void clickok() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickok));
		para.click();
		Thread.sleep(1000);


	}


	public void parameterdp2() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp2));
		para.sendKeys("Rakshith");
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
					"1.8600", "7.5000", "13.1400",
					"0.0000", "3.0000", "9.8010",
					"0.31", "0.31", "319.15 %",
					"7.5000", "3.0000"
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
					System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "error");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


//		editchart02

// private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");


	public void time2() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time2));

		WebElement element = driver.findElement(By.id("idTime"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void subgroup22() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup22));
		para.sendKeys("9.60");
	}

	public void subgroup3() throws InterruptedException {
		Thread.sleep(1000);
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup3));
		para.sendKeys("6.10");
	}


	public void parameterdp31() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp2));
		para.sendKeys("Rakshith");
	}


	public void savechart2() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart2));
		para.click();
	}


	public void getText2() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText2));
		String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

		// Define the expected result
//			    String expectedResults = "Process in Control ";
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
					"1.5650", "7.6750", "13.7850",
					"0.0000", "3.2500", "10.6177",
					"0.29", "0.27", "345.74 %",
					"7.8500", "3.5000"
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

		WebElement element = driver.findElement(By.id("idTime"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}


	public void subgroup13() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup13));
		para.sendKeys("8.00");
	}


	public void subgroup33() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup33));
		para.sendKeys("5.10");
	}

	public void parameterdp3() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp3));
		para.sendKeys("Rakshith");
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
					"7.1575", "7.1700", "7.1825",
					"0.0000", "3.1333", "10.2366",
					"0.30", "0.28", "333.33 %",
					"6.5500", "2.9000"
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

		WebElement element = driver.findElement(By.id("idTime"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}


	public void subgroup4() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup4));
		para.sendKeys("7.00");
	}


	public void subgroup44() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup44));
		para.sendKeys("7.00");
	}

	public void parameterdp5() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp5));
		para.sendKeys("Rakshith");
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
					"2.8070", "7.2250", "11.6430",
					"0.0000", "2.3500", "7.6775",
					"0.40", "0.36", "250.00 %",
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
					System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value." + actualText);
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

		WebElement element = driver.findElement(By.id("idTime"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}


	public void subgroup5() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup5));
		para.sendKeys("7.00");
	}


	public void subgroup55() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup55));
		para.sendKeys("7.03");
	}

	public void parameterdp6() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp6));
		para.sendKeys("Rakshith");
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
					"3.6373", "7.1830", "10.7287",
					"0.0000", "1.8860", "6.1616",
					"0.50", "0.44", "200.64 %",
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

		WebElement element = driver.findElement(By.id("idTime"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}


	public void subgroup66() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup66));
		para.sendKeys("7.00");
	}


	public void subgroup6() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup6));
		para.sendKeys("7.01");
	}

	public void parameterdp7() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp7));
		para.sendKeys("Rakshith");
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
					"4.1955", "7.1533", "10.1112",
					"0.0000", "1.5733", "5.1401",
					"0.60", "0.51", "167.38 %",
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
					System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "error");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//  edit chart07


	public void time7() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time7));

		WebElement element = driver.findElement(By.id("idTime"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}


	public void subgroup77() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup77));
		para.sendKeys("7.00");
	}


	public void subgroup7() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(subgroup7));
		para.sendKeys("7.00");
	}

	public void parameterdp8() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(parameterdp8));
		para.sendKeys("Rakshith");
	}


	public void savechart7() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart7));
		para.click();

	}


	public void okbutton() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(okbutton));
		para.click();
	}


	public void causeselect() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(causeselect));
		para.click();


		Select select = new Select(para);
		select.selectByIndex(1);


	}

	public void submitcauses() throws InterruptedException {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(submitcauses));
		para.click();
	}






	public void getText7() {
		WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText7));
		String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

		// Define the expected result
		String expectedResults = "Avg Run Down";
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
					"4.5961", "7.1314", "9.6667",
					"0.0000", "1.3486", "4.4058",
					"0.70", "0.59", "143.47 %",
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
					System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value." + actualText);
				} else {
					System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "error");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
