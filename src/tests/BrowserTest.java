package tests;

import base.BaseClass;

public class BrowserTest {

	public static void main(String[] args) {
		
		BaseClass bc = new BaseClass();

        bc.setup();

        System.out.println("Browser Opened Successfully");

        bc.closeBrowser();
	}

}
