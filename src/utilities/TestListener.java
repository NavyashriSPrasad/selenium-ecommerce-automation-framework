package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;

public class TestListener extends BaseClass
implements ITestListener {
	
	@Override
    public void onTestFailure(
            ITestResult result) {

        try {

            screenshots.captureScreenshot(
                    driver,
                    result.getName());

            System.out.println(
                "Screenshot Captured");

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
	
	

}
