package evisa_public;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import br.ClassProperties;
import br.InitiateChromeDriver;
import br.Login;
import br.WaitingForLoading;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EVisaPublicImplementation extends ClassProperties implements InitiateChromeDriver, WaitingForLoading{
	
	public EVisaPublicImplementation() {
		// TODO Auto-generated constructor stub
		//start reporter
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("Evisa/public/testReport.html");
		// create html reportes and attach reporter
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		//create toggle for given test
		ExtentTest test1=extent.createTest("Testing EVisa Public Portal subsystems");
		
		test1.log(Status.INFO, "Starting Chrome Driver");
		initiateChromeDriver();
		test1.pass("start chrome successfully");
		//flush all log files
		extent.flush();
		
		waitForLoading();
	}

	@Override
	public void initiateChromeDriver() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		this.chromeDriver = new ChromeDriver();
		this.chromeDriver.manage().window().maximize();

		chromeDriver.get("http://cqcehap001.qcenv.idemia.local/evisa-portal-frontend/home");
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
