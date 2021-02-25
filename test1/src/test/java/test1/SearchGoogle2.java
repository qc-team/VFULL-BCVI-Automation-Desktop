package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchGoogle2 {
	
	WebDriver chromeDriver=null;
	
	@BeforeTest
	public void initiateChromeDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();

		chromeDriver.get("https://www.google.com/");
	}
	
	@Test
	public void searchGoogle() {
		chromeDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium",Keys.ENTER);
	}
	
	@AfterTest
	public void closeChromeDriver() {
		// TODO Auto-generated method stub
		chromeDriver.close();
		chromeDriver.quit();

	}

}
