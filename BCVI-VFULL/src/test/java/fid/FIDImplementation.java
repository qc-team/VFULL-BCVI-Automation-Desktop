package fid;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.ClassProperties;
import br.InitiateChromeDriver;
import br.Login;
import br.WaitingForLoading;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FIDImplementation extends ClassProperties implements InitiateChromeDriver, Login, WaitingForLoading{
	
	public FIDImplementation() {
		// TODO Auto-generated constructor stub
		initiateChromeDriver();
		loginToSystem();
		waitForLoading();
	}

	@Override
	public void loginToSystem() {
		// TODO Auto-generated method stub
		// Connect to db to get username and password
//		MysqlConnect mysqlConnect = new MysqlConnect();
//		mysqlConnect.startdbConnection();
		WebElement userName = chromeDriver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("Admin");
		WebElement password = chromeDriver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("S3cr3tP4ss");
		password.sendKeys(Keys.ENTER);
		waitForLoading();

	}

	@Override
	public void initiateChromeDriver() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		this.chromeDriver = new ChromeDriver();
		this.chromeDriver.manage().window().maximize();

		chromeDriver.get("http://cqcehap001.qcenv.idemia.local/foreigner_frontend/");
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
