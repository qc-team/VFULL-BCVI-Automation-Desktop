package administration_res;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SupportDocument extends Login {

	public SupportDocument() {
	}

	public void addSupportDocument() {
		// Support Document
		WebElement supportDocument = chromeDriver.findElement(By.xpath(
				"//body/app-root[@ng-version='7.0.4']/div[@class='arabicStyle']/app-admin-menu[@class='ng-star-inserted']/div[@class='container-fluid']/div[@class='dashboard-wrapper']/div[@class='row']/div[1]/div[1]"));
		supportDocument.click();

		// wait for 7 seconds for system to load new page
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Search support document with arabic and english name
		WebElement searchSupportDocument = chromeDriver.findElement(By.xpath("//input[@id='mat-input-2']"));
		// for english name
		searchSupportDocument.sendKeys("shady");
		searchSupportDocument.clear();
		try {
			WaitingForSystemLoading wait2 = new WaitingForSystemLoading();
			wait2.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// for arabic name
		searchSupportDocument.sendKeys("شادى");
		searchSupportDocument.clear();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Add new support document with arabic and english name
		// add new support document button
		WebElement addSupportDocument = chromeDriver.findElement(By.xpath("//button[contains(text(),'إضافة')]"));
		addSupportDocument.click();
		// wait for 7 seconds for system to load new page
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// add arabic name
		WebElement addSupportDocumentArName = chromeDriver.findElement(By.xpath("//input[@id='mat-input-3']"));
		addSupportDocumentArName.sendKeys("شادى أحمد");
		// add english name
		WebElement addSupportDocumentEnName = chromeDriver.findElement(By.xpath("//input[@id='mat-input-4']"));
		addSupportDocumentEnName.sendKeys("Shady Ahmed");
		// cancel adding new support document
		WebElement cancelAddingSupportDocument = chromeDriver
				.findElement(By.xpath("//button[contains(text(),'إلغاء')]"));
		cancelAddingSupportDocument.click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addSupportDocument.click();
		// readding same data and save it
		addSupportDocumentArName.sendKeys("شادى أحمد");
		addSupportDocumentEnName.sendKeys("Shady Ahmed");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// save entire data
		WebElement saveAddingSupportDocument = chromeDriver
				.findElement(By.xpath("//button[@class='btn btn-success ml-2']"));
		saveAddingSupportDocument.click();
		// wait for 5 seconds for system to load new page
		try {
			WaitingForSystemLoading wait2 = new WaitingForSystemLoading();
			wait2.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement backToMainDashboard = chromeDriver
				.findElement(By.xpath("//a[contains(@class,'nav-link btn btn-link')]"));
		backToMainDashboard.click();

	}

}
