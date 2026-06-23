package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.screenshots;

public class CheckoutTest extends BaseClass  {
	
	@Test
    public void verifyCheckout() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);
        lp.login("standard_user", "secret_sauce");
        
        Thread.sleep(2000);
        ProductsPage pp = new ProductsPage(driver);
        pp.addProductToCart();
        
        Thread.sleep(2000);
        
        pp.openCart();

        Thread.sleep(2000);
        CheckoutPage cp = new CheckoutPage(driver);

        cp.clickCheckout();

        Thread.sleep(2000);
        
        cp.enterDetails(
                "Navya",
                "Prasad",
                "560067");

        Thread.sleep(2000);
        
        cp.clickContinue();

        Thread.sleep(2000);
        
        cp.clickFinish();

        Thread.sleep(2000);
        
        screenshots.captureScreenshot(
                driver,
                "CheckoutSuccess");
        
        Assert.assertEquals(
                cp.getSuccessMessage(),
                "Thank you for your order!");
    }


}
