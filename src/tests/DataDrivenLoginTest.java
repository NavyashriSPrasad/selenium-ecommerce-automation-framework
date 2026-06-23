package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utilities.DataProviderClass;

public class DataDrivenLoginTest extends BaseClass {
	
	@Test(dataProvider="loginData",
	          dataProviderClass=DataProviderClass.class)

	    public void verifyLogin(
	            String username,
	            String password)
	            throws Exception {

	        LoginPage lp =
	                new LoginPage(driver);

	        lp.login(username,password);

	        Thread.sleep(2000);

	        System.out.println(
	                "Testing User : "
	                + username);

	        driver.navigate().refresh();
	    }

}
