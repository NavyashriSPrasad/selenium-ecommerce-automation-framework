package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	
	WebDriver driver;

    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

    By cartIcon = By.className("shopping_cart_link");
    
    By menuButton = By.id("react-burger-menu-btn");

    By logoutLink = By.id("logout_sidebar_link");

    By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart() {
    	System.out.println(
    	        "Button Text = " +
    	        driver.findElement(addToCartButton).getText());

    	    driver.findElement(addToCartButton).click();

    	    System.out.println("Clicked Add To Cart");
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }
    
    public void clickMenu() {

        driver.findElement(menuButton).click();
    }

    public void clickLogout() {

        driver.findElement(logoutLink).click();
    }

}
