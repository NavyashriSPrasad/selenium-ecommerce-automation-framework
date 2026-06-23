package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;
import base.BaseClass;

@Listeners(utilities.TestListener.class)
public class LoginTestNG extends BaseClass {

//	 @Test
//	    public void verifyLogin() throws InterruptedException {
//
//	        setup();
//
//	        LoginPage lp = new LoginPage(driver);
//
//	        lp.login("standard_user", "secret_sauce");
//
//	        String currentUrl = driver.getCurrentUrl();
//
//	        if(currentUrl.contains("inventory")) {
//	            System.out.println("Login Successful");
//	        } else {
//	            System.out.println("Login Failed");
//	        }
//
//	        closeBrowser();
//	    }
	
	@Test
	public void verifyLogin() throws InterruptedException {

	    LoginPage lp = new LoginPage(driver);

	    String username = ExcelUtility.getCellData(1, 0);

	    String password = ExcelUtility.getCellData(1, 1);

	    lp.login(username, password);

	    Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
	    //Assert.assertTrue(false);
	}
}
