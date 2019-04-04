package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import modulDrivenTestCases.ReUsable;

import modulDrivenTestScripts.TestCase2;

public class ExtentReportTest2 {

	public static void getExtentReport2() throws Exception {
	
	ExtentHtmlReporter Reporter = new ExtentHtmlReporter("./test-output/ExtentReport2.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(Reporter);
	
	
	//Testcase 2
	
	ExtentTest loggerT2A=extent.createTest("TestID2 -A");
	loggerT2A.log(Status.INFO, "Xero Application page is launched ");
	loggerT2A.log(Status.PASS, "clicked 30 days trial button Successfully");
	loggerT2A.log(Status.PASS, "first name entered Successfully");
	loggerT2A.log(Status.PASS, "last name entered Successfully");
	loggerT2A.log(Status.PASS, "Email entered Successfully");
	loggerT2A.log(Status.PASS, "phone number entered Successfully");
	loggerT2A.log(Status.FAIL, "Conuntry selected Successfully");
	loggerT2A.log(Status.PASS, "Terms and condition selected Successfully");
	loggerT2A.log(Status.PASS, "Captcha selected Successfully");
	loggerT2A.log(Status.PASS, "Get stareted clicked Successfully");

	
	ReUsable.getChrome();
	TestCase2.Test2A();
	Thread.sleep(5000);
	extent.flush();
	
	
	ExtentTest loggerT2B=extent.createTest("TestID2 -B");
	loggerT2B.log(Status.INFO, "Xero Application page is displayed ");
	loggerT2B.log(Status.PASS, "Free trial clicked successfully");
	loggerT2B.log(Status.FAIL, "entered email in wrong format");
	loggerT2B.log(Status.PASS, "get started clicked clicked Successfully");
	ReUsable.getChrome();
	TestCase2.Test2B();
	Thread.sleep(5000);
	extent.flush();
	
	ExtentTest loggerT1C=extent.createTest("TestID2 -C");
	loggerT1C.log(Status.INFO, "Xero Application page is displayed ");
	loggerT1C.log(Status.PASS, "30 days trial displayed");
	loggerT1C.log(Status.PASS, "A new Xero terms of web page should open");
	loggerT1C.log(Status.PASS, "A new privacy policy web page should open");
	ReUsable.getChrome();
	TestCase2.Test2C();
	Thread.sleep(5000);
	extent.flush();
	
	ExtentTest loggerT2D=extent.createTest("TestID2 -D");
	loggerT2D.log(Status.INFO, "Xero Application page is displayed ");
	loggerT2D.log(Status.PASS, "Click on Free trial passed");
	loggerT2D.log(Status.PASS, "A new  offer details page opened");
	ReUsable.getChrome();
	TestCase2.Test2D();
	Thread.sleep(5000);
	extent.flush();

}
	

}
