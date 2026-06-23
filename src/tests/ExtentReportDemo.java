package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ExtentManager;

public class ExtentReportDemo {
	
	@Test
    public void testReport() {

        ExtentReports extent =
                ExtentManager.getReport();

        ExtentTest test =
                extent.createTest("Login Test");

        test.pass("Login Successful");

        extent.flush();

    }

}
