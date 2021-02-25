package administration_res;

public class MainEntry {
	public static void main(String[] args) {
		
		// Login to System 
		SupportDocument supportDocument=new SupportDocument();
		supportDocument.loginToAdmin();
		//wait for 7 seconds for web components to be loaded
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Full Test for Support Document
		supportDocument.addSupportDocument();
		//wait for 7 seconds for web components to be loaded
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QuiteChromeDriver quiteChromeDriver=new QuiteChromeDriver();
		quiteChromeDriver.endWebDriver();

	}

}
