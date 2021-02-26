package br;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import database.MysqlConnect;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Br extends ClassProperties
		implements InitiateChromeDriver, Login, SearchingRules, AddingRules, WaitingForLoading, CloseChromeDriver {
	
//	public Br() {
//		//start reporter
//		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("extent.html");
//		// create html reportes and attach reporter
//		ExtentReports extent =new ExtentReports();
//		extent.attachReporter(htmlReporter);
//		//create toggle for given test
//		ExtentTest test1=extent.createTest("Testing border control subsystems");
//		
//		
//		// TODO Initiate Chrome Driver for use
//		    test1.log(Status.INFO, "Starting Chrome Driver");
//		    initiateChromeDriver();
//		    test1.pass("start chrome successfully");
//
//		// TODO Login to BR Subsystem with valid credentials
//		    test1.log(Status.INFO, "login to BR subsystem");
//		    loginToSystem();
//		    test1.pass("login successfully to br subsystem");
//		    test1.addScreenCaptureFromPath("login.png");
//
//		// TODO waiting for 7 seconds for system loading
//		    test1.log(Status.INFO, "wait 5 sec for system for loading");
//		    waitForLoading();
//
//		// TODO Check user Guide
//		    test1.log(Status.INFO, "start user guide");
//		    userGuide();
//		    test1.pass("Testing user guide");
//
//		// TODO waiting for 7 seconds for system loading
//		   test1.log(Status.INFO, "wait 5 sec for system for loading");
//		   waitForLoading();
//
//		// TODO search business rules
//		   test1.log(Status.INFO, "searching for business rule");
//		   searchBusinessRules();
//		   test1.pass("searching successfully for business rule");
//
//		// TODO waiting for 7 seconds for system loading
//		   test1.log(Status.INFO, "wait 5 sec for system for loading");
//		   waitForLoading();
//
//		// TODO add new business rule
//		   test1.log(Status.INFO, "Adding new business rule");
//		   addingNewBusinessRules();
//		   test1.pass("Adding new business rule successfully");
//
//		// TODO close system and shutdown chrome driver
//		   test1.log(Status.INFO, "close chrome driver");
//		   closeChromeDriver();
//		   
//		//flush all log files
//		   extent.flush();
//
//	}

	@BeforeTest
	public void initiateChromeDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		this.chromeDriver = new ChromeDriver();
		this.chromeDriver.manage().window().maximize();

		chromeDriver.get("http://cqcehap001.qcenv.idemia.local/businessrules_frontend/#/app-login");
	}

	@Test
	public void loginToSystem() {
		// Connect to db to get username and password
//		MysqlConnect mysqlConnect = new MysqlConnect();
//		mysqlConnect.startdbConnection();
		WebElement userName = chromeDriver.findElement(By.id("userName"));
		userName.sendKeys("Admin");
		WebElement password = chromeDriver.findElement(By.id("password"));
		password.sendKeys("S3cr3tP4ss");
		password.sendKeys(Keys.ENTER);
		waitForLoading();
	}

	@Test
	public void addingNewBusinessRules() {
		// TODO Auto-generated method stub
		WebElement addNewBusinessRule = chromeDriver
				.findElement(By.xpath("//i[@class='fa-3x d-block fa fa-plus-square']"));
		addNewBusinessRule.click();
		// TODO waiting for 7 seconds for system loading
		waitForLoading();

		// pass parameters for fields of new business rule
		// business rule data
		WebElement newBusinessRuleName = chromeDriver.findElement(By.xpath("//input[@id='name']"));
		newBusinessRuleName.sendKeys("شادى 1234احمد");

		WebElement newBusinessRuleESystem = chromeDriver.findElement(By.className("mat-select-arrow-wrapper"));
		newBusinessRuleESystem.click();
		WebElement newBusinessRuleESystemChoise = chromeDriver.findElement(
				By.xpath("//span[contains(@class,'mat-option-text')][contains(text(),'النظام المركزي للتحركات')]"));
		newBusinessRuleESystemChoise.click();

		WebElement newBusinessRuleActivateDate = chromeDriver.findElement(By.xpath("//input[@id='ExpiryDate']"));
		newBusinessRuleActivateDate.sendKeys("01012020");

		WebElement newBusinessRuleExpireDate = chromeDriver.findElement(By.xpath("//input[@id='deactivationDate']"));
		newBusinessRuleExpireDate.sendKeys("01092021");

		WebElement newBusinessRuleDesc = chromeDriver.findElement(By.xpath("//textarea[@id='description']"));
		newBusinessRuleDesc.sendKeys("لا يوجد تعليق او وصف لقاعدة العمل هذة1234");

		chromeDriver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(Keys.TAB, Keys.ENTER);
		waitForLoading();

		// business rule criteria
		chromeDriver.findElement(By.xpath(
				"//ng-select[@id='criteriaNames']//div[contains(@class,'ng-select-container')]//div[contains(@class,'ng-value-container')]//div[contains(@class,'ng-input')]//input[contains(@type,'text')]"))
				.sendKeys(Keys.ENTER, Keys.ENTER);
		waitForLoading();
		chromeDriver.findElement(By.xpath(
				"//label[contains(@class,'mat-radio-label')]//div[contains(@class,'mat-radio-label-content')][contains(text(),'نعم')]"))
				.click();
		chromeDriver.findElement(By.xpath(
				"//div[contains(@class,'row m-t-xs ng-star-inserted')]//div[contains(@class,'col-md-12 text-left')]//button[contains(@type,'button')][contains(text(),'التالي')]"))
				.click();
		waitForLoading();

		// business rule action
		chromeDriver.findElement(By.xpath(
				"//ng-select[@id='actionName']//div[contains(@class,'ng-select-container')]//div[contains(@class,'ng-value-container')]//div[contains(@class,'ng-input')]//input[contains(@type,'text')]"))
				.sendKeys(Keys.ENTER, Keys.ENTER);
//		chromeDriver.findElement(By.xpath("//ng-select[@id='actionName']//div[contains(@class,'ng-select-container')]//div[contains(@class,'ng-value-container')]//div[contains(@class,'ng-input')]//input[contains(@type,'text')]")).sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
//		chromeDriver.findElement(By.xpath("//button[@class='btn btn-primary font-normal font-16']")).click();
		waitForLoading();
	}

	@Test
	public void userGuide() {
		// TODO check user guide
		WebElement userGuide = chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-userGuide')]"));
		userGuide.click();
		for (int i = 0; i < 3; i++) {
			waitForLoading();
		}
		WebElement closeUserGuide = chromeDriver.findElement(By.xpath("//button[contains(text(),'إغلاق')]"));
		closeUserGuide.click();
	}

	@Test
	public void searchBusinessRules() {
		// TODO choose search rules
		WebElement searchRules = chromeDriver.findElement(By.xpath("//i[@class='fa-3x d-block fa fa-search']"));
		searchRules.click();
		// wait for loading webElements
		waitForLoading();
		// pass rule name
		WebElement ruleName = chromeDriver.findElement(By.id("businessRuleName"));
		ruleName.sendKeys("5445shady");
		// pass electronic system
		WebElement eSystem = chromeDriver.findElement(By.className("mat-select-arrow-wrapper"));
		eSystem.click();
		WebElement chooseESystem = chromeDriver.findElement(By.id("mat-option-0"));
		chooseESystem.click();
		// pass expire date
		WebElement expireDate = chromeDriver.findElement(By.id("ExpiryDate"));
		expireDate.sendKeys("01012020");
		expireDate.sendKeys(Keys.ENTER);
		// TODO wait for loading webElements
		waitForLoading();
		// check reload button
		reload();
		// check collapse button
		collapse();
		// get back to dashboard
		dashBoard();
	}

	@Test
	public void dashBoard() {
		// get back to main dashboard
		WebElement dashboardButton = chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-info')]"));
		dashboardButton.click();
	}

	@Test
	public void collapse() {
		// check collapse button
		WebElement collapsButton = chromeDriver.findElement(By.xpath("//i[@class='fa fa-chevron-up']"));
		collapsButton.click();
	}

	@Test
	public void reload() {
		// check reload button
		WebElement reloadButton = chromeDriver.findElement(By.xpath("//i[@class='fa fa-refresh m-l-xs']"));
		reloadButton.click();
	}

	@AfterTest
	public void closeChromeDriver() {
		// TODO Auto-generated method stub
		chromeDriver.close();
		chromeDriver.quit();

	}

	@Override
	public void waitForLoading() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
