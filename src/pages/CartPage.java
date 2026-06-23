package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;

    //By productName = By.className("inventory_item_name");
	By productName =
		    By.xpath("//div[@class='inventory_item_name']");
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
    	/*WebDriverWait wait =
    	        new WebDriverWait(driver, Duration.ofSeconds(10));

    	    wait.until(
    	        ExpectedConditions.visibilityOfElementLocated(productName));
        return driver.findElement(productName).getText();*/
    	try {
            Thread.sleep(2000);
        }
        catch(Exception e) {
        }

        return driver.findElement(productName).getText();
    }

}
