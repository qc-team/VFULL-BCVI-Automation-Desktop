package administration_res;

public class QuiteChromeDriver extends Login{

	public QuiteChromeDriver() {
		// TODO Auto-generated constructor stub
	}

	public void endWebDriver() {
		chromeDriver.close();
		chromeDriver.quit();
	}
}
