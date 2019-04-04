package modulDrivenTestCases;


import org.openqa.selenium.WebDriver;

import ExtentReports.ExtentReportTest1;
import ExtentReports.ExtentReportTest2;
import ExtentReports.ExtentReportTest3;
import ExtentReports.ExtentReportTest6;





public class MainMethod {
protected static WebDriver driver;


	public static void main(String[] args) throws Exception {
		
		ExtentReportTest1.getExtentReport1();
		ExtentReportTest2.getExtentReport2();
		ExtentReportTest3.getExtentReport3();
		ExtentReportTest6.getExtentReport6();
		
		
	}

}
