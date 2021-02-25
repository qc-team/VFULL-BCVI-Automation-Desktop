package administration_res;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	// Login Properties
	WebDriver chromeDriver;

	public Login() {
		// Initialize Chrome Driver and Login
		InitializeChromeDriver initializeChromeDriver = new InitializeChromeDriver();
		this.chromeDriver = initializeChromeDriver.getChromeDriver();

	}

	public void loginToAdmin() {
		// add username
		WebElement userName = chromeDriver.findElement(By.id("username"));
		userName.sendKeys("eresidency");
		// add password
		WebElement password = chromeDriver.findElement(By.id("password"));
		password.sendKeys("P@ssw0rd");
		// click login button
		WebElement login = chromeDriver.findElement(By.className("ladda-label"));
		login.click();
		
	}

}
