package main;

import flm.FLMImplementation;



public class MainEntry {

	public static void main(String[] args) {

		// TODO test br subsystem
		FLMImplementation testBR = new FLMImplementation();
		testBR.initiateChromeDriver();
		testBR.loginToSystem();
		testBR.waitForLoading();
	}

}
