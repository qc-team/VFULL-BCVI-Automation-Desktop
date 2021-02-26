package eresidency_public;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.ClassProperties;
import br.InitiateChromeDriver;
import br.Login;
import br.WaitingForLoading;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EResidencyPublic extends ClassProperties implements InitiateChromeDriver, WaitingForLoading{

	public EResidencyPublic() {
		// TODO Auto-generated constructor stub
		initiateChromeDriver();
		waitForLoading();
	}

	@Override
	public void initiateChromeDriver() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		this.chromeDriver = new ChromeDriver();
		this.chromeDriver.manage().window().maximize();

		chromeDriver.get("http://cqcehap001.qcenv.idemia.local/eresidency-portal_frontend/");
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
