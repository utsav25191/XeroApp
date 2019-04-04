package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import modulDrivenTestCases.ReUsable;
import modulDrivenTestScripts.TestCase1;

public class ExtentReportTest1 {

public static void  getExtentReport1() throws Exception {
	ExtentHtmlReporter Reporter = new ExtentHtmlReporter("./test-output/ExtentReport1.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(Reporter);
		
	//Testcase 1
	ExtentTest loggerT1A=extent.createTest("TestID1 -A");
	loggerT1A.log(Status.INFO, "Xero Application page is displayed ");
	loggerT1A.log(Status.PASS, "Username entered Successfully");
	loggerT1A.log(Status.PASS, "password enterd Successfully");
	loggerT1A.log(Status.PASS, "login button clicked Successfully");
	ReUsable.getFirefox();
	TestCase1.Test1A();
	Thread.sleep(5000);
	extent.flush();
	
	ExtentTest loggerT1B=extent.createTest("TestID1 -B");
	loggerT1B.log(Status.INFO, "Xero Application page is displayed ");
	loggerT1B.log(Status.PASS, "Username entered Successfully");
	loggerT1B.log(Status.PASS, "password enterd failed message got");
	loggerT1B.log(Status.PASS, "login button clicked Successfully");
	ReUsable.getFirefox();
	TestCase1.Test1B();
	Thread.sleep(5000);
	extent.flush();
	
	ExtentTest loggerT1C=extent.createTest("TestID1 -C");
	loggerT1C.log(Status.INFO, "Xero Application page is displayed ");
	loggerT1C.log(Status.PASS, "Username entered incorrectly message got perfectly");
	loggerT1C.log(Status.PASS, "password enterd Successfully");
	loggerT1C.log(Status.PASS, "login button clicked Successfully");
	ReUsable.getFirefox();
	TestCase1.Test1C();
	Thread.sleep(5000);
	extent.flush();
	
	ExtentTest loggerT1D=extent.createTest("TestID1 -D");
	loggerT1D.log(Status.INFO, "Xero Application page is displayed ");
	loggerT1D.log(Status.PASS, "Click on Forgot password");
	loggerT1D.log(Status.PASS, "Entered Email and send a link");
	ReUsable.getFirefox();
	TestCase1.Test1D();
	Thread.sleep(5000);
	extent.flush();

}
	
	
	
}
