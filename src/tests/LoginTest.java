package tests;

import base.BaseClass;
import pages.LoginPage;
import utilities.screenshots;

public class LoginTest extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		

		BaseClass bc = new BaseClass();

        bc.setup();

        LoginPage lp = new LoginPage(BaseClass.driver);

        lp.login("standard_user", "secret_sauce");

        Thread.sleep(2000);

        screenshots.captureScreenshot(
                driver,
                "LoginSuccess");
        
        String currentUrl = BaseClass.driver.getCurrentUrl();

        if(currentUrl.contains("inventory")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        bc.closeBrowser();
    
	}

}
