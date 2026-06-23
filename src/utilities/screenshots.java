package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshots {
	
	public static void captureScreenshot(
            WebDriver driver,
            String fileName) {

        try {

            File src =
                ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            String path =
                System.getProperty("user.dir")
                + "/screenshots/"
                + fileName
                + ".png";

            File dest = new File(path);

            FileUtils.copyFile(src, dest);

            System.out.println(
                "Screenshot saved: " + path);

        }
        catch(Exception e) {

            System.out.println(
                "Screenshot failed");

            e.printStackTrace();
        }
    }

}
