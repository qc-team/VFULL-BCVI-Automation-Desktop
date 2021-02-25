package hellowworld_shady;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class TestHelloWorld {
	
	public static void main(String []args) {
//setup firefox webdriver for using selenium
		    //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		   //WebDriver driver=new FirefoxDriver();
//setup Chrome webdriver for using selenium
		    //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver1.exe");
		   //WebDriver driver=new ChromeDriver();
//setup IE webdriver for using selenium
		   //System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriver\\IEDriverServer.exe");
		  //WebDriver driver=new InternetExplorerDriver();
		
		
		//driver.get("http://www.seleniumhq.org/");
//		try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.close();
//		driver.quit();
		
//		@Test
//		public void testhelloworld()
//		{
//			System.out.println("... hello world ...");
//			System.out.println(System.getProperty("user.dir"));
//		}
		
	//using drivermanager to get latest version of webdrivers
		
		//ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver chromeDriver=new ChromeDriver();
		chromeDriver.get("http://cqcehap001.qcenv.idemia.local/eresidency-administration_frontend/#/login");
		WebElement userName=chromeDriver.findElement(By.id("username"));
		userName.sendKeys("eresidency");
		WebElement password=chromeDriver.findElement(By.id("password"));
		password.sendKeys("P@ssw0rd");
		WebElement login=chromeDriver.findElement(By.className("ladda-label"));
		login.click();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromeDriver.close();
		chromeDriver.quit();
		
		//FirefoxDriver
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver firefoxDriver = new FirefoxDriver();
//		firefoxDriver.get("https://www.facebook.com");
//		try {
//			Thread.sleep(30000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		firefoxDriver.close();
//		firefoxDriver.quit();
//		
//		//Internet Exploer Driver
//		WebDriverManager.iedriver().setup();
//		WebDriver ieDriver=new InternetExplorerDriver();
//		ieDriver.get("https://www.youtube.com");
//		try {
//			Thread.sleep(30000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		ieDriver.close();
//		ieDriver.quit();
//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.operadriver().setup();
//		WebDriverManager.phantomjs().setup();
//		WebDriverManager.chromiumdriver().setup();

	}
	
}
