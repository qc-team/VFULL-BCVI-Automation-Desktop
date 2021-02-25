package administration_res;

public class WaitingForSystemLoading {

	public WaitingForSystemLoading() throws InterruptedException {

		// TODO wait for 7 seconds for system to load new page

	}

	public void waiting() {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
