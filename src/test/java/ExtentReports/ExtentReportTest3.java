package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import modulDrivenTestCases.ReUsable;

import modulDrivenTestScripts.TestCase3;

public class ExtentReportTest3 {
	
	
	public static void getExtentReport3() throws Exception {
	ExtentHtmlReporter Reporter = new ExtentHtmlReporter("./test-output/ExtentReport3.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(Reporter);
	
	
	ExtentTest loggerT3=extent.createTest("TestID2 -A");
	loggerT3.log(Status.INFO, "Xero Application page is launched ");
	loggerT3.log(Status.PASS, "xero login page is opened");
	loggerT3.log(Status.PASS, "User Name is displayed in User name field");
	loggerT3.log(Status.PASS, "password is  applied in password");
	loggerT3.log(Status.PASS, "You are currently using a trial account.will display");
	loggerT3.log(Status.PASS, "you are now in dashboard page");
	loggerT3.log(Status.FAIL, "you are now in account  drop down page");
	loggerT3.log(Status.PASS, "you are now in report drop down page");
	loggerT3.log(Status.PASS, "you are now in contact drop down page");
	loggerT3.log(Status.PASS, "you are now in settings drop down page");
	loggerT3.log(Status.PASS, "you are now in new drop down page");
	loggerT3.log(Status.PASS, "you are now in new drop down page");
	loggerT3.log(Status.PASS, "should show you notification page");
	loggerT3.log(Status.PASS, "search field area should be shown");
	loggerT3.log(Status.PASS, "help field area and ,what do you need help with area field should be shown withhelp centre,get help for this page");
	
	
	
	ReUsable.getFirefox();
	TestCase3.Test3();
	Thread.sleep(5000);
	extent.flush();
	}
}
