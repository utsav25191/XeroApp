package modulDrivenTestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;




public class ReUsable extends MainMethod {

	protected static ExtentReports report;
	protected static ExtentTest logger ;
	 
	
	
	public static void getFirefox() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ishan\\Desktop\\Utsav\\geckodriver.exe");
		
		  driver = new FirefoxDriver();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.xero.com/");
		System.out.println("launched successfully");
		
	}
public static void getChrome() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ishan\\Desktop\\Utsav\\chromedriver.exe");
	
	  driver = new ChromeDriver();
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.xero.com/us/");
	System.out.println("launched successfully");
	
}








	public static void buttonClicked(WebElement obj) throws InterruptedException {
		if(obj.isDisplayed()) {
			Thread.sleep(2000);
			obj.click();
			System.out.println("Button clicked successfully");
		}else {
			System.out.println("No Button exist...");
		}
	}
	
public static void enterText(WebElement obj,String textVal) throws InterruptedException {
		
		if(obj.isDisplayed()) {
			Thread.sleep(1000);
			obj.sendKeys(textVal);
			obj.getText();
			
			System.out.println("Entering into text field is successful...");
		}else{
			System.out.println("Field does not exist please check");
			
		}
	}
	
public static void selectByIndex(WebElement obj,int value) throws InterruptedException {
	
	if(obj.isDisplayed()){
		Select select = new Select(obj);
		Thread.sleep(2000);
		select.selectByIndex(value);
		System.out.println("Elemenet clicked successful");
	}	else {
	System.out.println("Element is not clicked successfully..."); 
		
	}
		
	
}

public static void selectByName(WebElement obj,String value) throws InterruptedException {
	
	if(obj.isDisplayed()){
		Select select = new Select(obj);
		Thread.sleep(2000);
		select.selectByValue(value);
		System.out.println("Elemenet clicked successful");
	}	else {
	System.out.println("Element is not clicked successfully..."); 
		
	}
		
	
}public static void selectByText(WebElement obj,String text) throws InterruptedException {
	
	if(obj.isDisplayed()){
		Select select = new Select(obj);
		Thread.sleep(2000);
		select.wait();
		select.selectByVisibleText(text);
		
		System.out.println("Elemenet clicked successful");
	}	else {
	System.out.println("Element is not clicked successfully..."); 
		
	}
		
	
}



	

}
