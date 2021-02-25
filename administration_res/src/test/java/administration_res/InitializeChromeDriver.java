package administration_res;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeChromeDriver {

	// Login Properties
	private WebDriver chromeDriver;

	public InitializeChromeDriver() {
		// TODO login to eresidency administration subsystem
		WebDriverManager.chromedriver().setup();
		this.chromeDriver = new ChromeDriver();
		chromeDriver.get("http://cqcehap001.qcenv.idemia.local/eresidency-administration_frontend/#/login");
	}
	public void setChromeDriver(WebDriver chromeDriver) {
		this.chromeDriver = chromeDriver;
	}
	public WebDriver getChromeDriver() {
		return this.chromeDriver;
	}

}
