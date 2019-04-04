package modulDrivenTestScripts;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;

import modulDrivenTestCases.ReUsable;



public class TestCase1 extends ReUsable {
	
	
	
	public static  void Test1A() throws Exception {
		report = new ExtentReports();	
	Thread.sleep(2000);
	WebElement username = driver.findElement(By.id("email"));
	enterText(username, "lindenmotorinn789@gmail.com");
	
	WebElement pwd = driver.findElement(By.id("password"));
	enterText(pwd, "Trishiv@2018");
	
	
	WebElement login = driver.findElement(By.id("submitButton"));
	buttonClicked(login);
	driver.quit();
		
	}
public static  void Test1B() throws Exception {
	
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("email"));
		enterText(username, "lindenmotorinn789@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));

		enterText(pwd, "Trishiv2018");
	
		WebElement login = driver.findElement(By.id("submitButton"));
		buttonClicked(login);
		
		try {
		    WebDriverWait wait = new WebDriverWait(driver, 2);
		    wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();
		    System.out.println(alert.getText());
		    alert.accept();
		} catch (Exception e) {
		    //exception handling
		}
		driver.quit();
		
	}

public static  void Test1C() throws Exception {
	
	Thread.sleep(2000);
	WebElement username = driver.findElement(By.id("email"));
	enterText(username, "lindenmotorinn@gmail.com");
	
	WebElement pwd = driver.findElement(By.id("password"));
	enterText(pwd, "Trishiv@2018");
	
	WebElement login = driver.findElement(By.id("submitButton"));
	buttonClicked(login);
	
	try {
	    WebDriverWait wait = new WebDriverWait(driver, 2);
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	} catch (Exception e) {
	    //exception handling
	}
	driver.quit();
	
	}

public static  void Test1D() throws Exception {
	
	Thread.sleep(2000);
	WebElement forgotPwd = driver.findElement(By.xpath("//a[contains(@class,'forgot-password-advert')]"));
	buttonClicked(forgotPwd);
	
	WebElement emailid = driver.findElement(By.id("UserName"));
	enterText(emailid, "Trishhiv123@gmail.com");
	
	WebElement sendLink = driver.findElement(By.xpath("//span[contains(@class,'text')]"));
	buttonClicked(sendLink);
	
	/*try {
	    WebDriverWait wait = new WebDriverWait(driver, 2);
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	} catch (Exception e) {
	    //exception handling
	}
	*/
	driver.quit();
	
	}

	
}
