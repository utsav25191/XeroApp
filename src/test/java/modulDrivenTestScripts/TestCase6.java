package modulDrivenTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import modulDrivenTestCases.ReUsable;

public class TestCase6 extends ReUsable {
	
	public static void Test6() throws Exception {

	WebElement UserName = driver.findElement(By.id("email"));
	enterText(UserName, "lindenmotorinn789@gmail.com");
	
	WebElement pwd = driver.findElement(By.id("password"));
	enterText(pwd, "Trishiv@2018");
	
	WebElement LogIn = driver.findElement(By.id("submitButton"));
	buttonClicked(LogIn);
	
	WebElement userName = driver.findElement(By.xpath("//button[@title='utsav patel']"));
	buttonClicked(userName);
	
	
	WebElement editprofile = driver.findElement(By.xpath("//li[@class='xrh-addon xrh-addon-lastvisible']//li[1]//a[1]"));
	buttonClicked(editprofile);
	
	WebElement upload = driver.findElement(By.id("button-1041"));
	upload.click();
	System.out.println("upload clicked");
	
	WebElement browse = driver.findElement(By.xpath("//input[@name='file']"));
	browse.sendKeys("C:\\Users\\ishan\\eclipse-workspace\\modulDrivenTestCases\\images\\1.jpg");
	
	WebElement Upload1=driver.findElement(By.xpath("//div[@class='x-btn blue x-exclude x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"));
	Upload1.click();
	
	  WebElement save=driver.findElement(By.xpath(" //div[@class='x-btn green skip x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']//div[@class='x-btn-wrap']"));
	  buttonClicked(save);
	  
	  
	
	driver.quit();
	}
	
}
