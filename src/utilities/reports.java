package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports {

	public static ExtentReports getReport() {

        ExtentSparkReporter spark =
        new ExtentSparkReporter(
            "reports/ExtentReport.html");

        ExtentReports extent =
        new ExtentReports();

        extent.attachReporter(spark);

        return extent;
    }
}
