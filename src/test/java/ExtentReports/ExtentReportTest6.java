package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import modulDrivenTestCases.ReUsable;
import modulDrivenTestScripts.TestCase3;
import modulDrivenTestScripts.TestCase6;

public class ExtentReportTest6 {

	public static void getExtentReport6() throws Exception {
		ExtentHtmlReporter Reporter = new ExtentHtmlReporter("./test-output/ExtentReport6.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(Reporter);
		
		
		ExtentTest loggerT6=extent.createTest("TestID2 -A");
		loggerT6.log(Status.INFO, "Xero Application page is launched ");
		loggerT6.log(Status.PASS, "xero login page is opened");
		loggerT6.log(Status.PASS, "Xero  dashboard page is displayed");
		loggerT6.log(Status.PASS, "Xero navigation box will be displayes");
		loggerT6.log(Status.PASS, "Profile Setting page will be displayed");
		loggerT6.log(Status.PASS, "Uploaded Image is displayed");
		
		
		
		ReUsable.getFirefox();
		TestCase6.Test6();
		Thread.sleep(2000);
		extent.flush();
		}
	
	
	
	
}
