package tests;

import org.testng.annotations.Test;

import base.BaseClass;

import org.openqa.selenium.By;
import org.testng.Assert;

import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.screenshots;

public class AddToCartTest extends BaseClass {
	
	@Test
    public void verifyAddToCart() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);
        lp.login("standard_user", "secret_sauce");

//        System.out.println(
//        	    "URL After Login = "
//        	    + driver.getCurrentUrl());
         
        ProductsPage pp = new ProductsPage(driver);
        pp.addProductToCart();
        /*String cartCount = driver.findElement(
                By.className("shopping_cart_badge"))
                .getText();

        System.out.println("Cart Count = " + cartCount);*/
        Thread.sleep(3000);

        screenshots.captureScreenshot(
                driver,
                "AfterClick");
        
        Thread.sleep(2000);

        screenshots.captureScreenshot(
                driver,
                "AddToCart");
        pp.openCart();
        Thread.sleep(3000);
        
        System.out.println("Current URL: " + driver.getCurrentUrl());
        CartPage cp = new CartPage(driver);

        Assert.assertEquals(
                cp.getProductName(),
                "Sauce Labs Backpack");
        Thread.sleep(4000);
    }

}
