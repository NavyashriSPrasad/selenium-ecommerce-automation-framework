package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.screenshots;

public class LogoutTest  extends BaseClass {


    @Test
    public void verifyLogout() throws Exception {

        LoginPage lp = new LoginPage(driver);

        lp.login("standard_user",
                 "secret_sauce");

        Thread.sleep(2000);

        ProductsPage pp =
                new ProductsPage(driver);

        pp.clickMenu();

        Thread.sleep(2000);

        pp.clickLogout();

        Thread.sleep(2000);
        
        screenshots.captureScreenshot(
                driver,
                "LogoutSuccess");

        Assert.assertTrue(
            driver.getCurrentUrl()
                  .contains("saucedemo.com"));

        System.out.println(
            "Logout Successful");
    }
}
