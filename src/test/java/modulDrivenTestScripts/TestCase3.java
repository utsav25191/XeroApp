package modulDrivenTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import modulDrivenTestCases.ReUsable;

public class TestCase3 extends ReUsable{

	
	
	
	public static void Test3() throws Exception {
	
		WebElement UserName = driver.findElement(By.id("email"));
		enterText(UserName, "lindenmotorinn789@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		enterText(pwd, "Trishiv@2018");
		
		WebElement LogIn = driver.findElement(By.id("submitButton"));
		buttonClicked(LogIn);
		
		
		WebElement accounting = driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
		buttonClicked(accounting);
		
		
		WebElement reports = driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
		buttonClicked(reports);
		
		WebElement contacts = driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
		buttonClicked(contacts);
		
		WebElement none = driver.findElement(By.xpath("//div[@class='xrh-appmenucontainer']//button[@type='button']"));
		buttonClicked(none);
		
		WebElement settings = driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
		buttonClicked(settings);
		System.out.println("setting clicked");
		
		WebElement plus = driver.findElement(By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		buttonClicked(plus);
		System.out.println("plus");
		WebElement none1 = driver.findElement(By.xpath("//div[@class='xrh-appmenucontainer']//button[@type='button']"));
		buttonClicked(none1);
		
		WebElement files = driver.findElement(By.xpath("//a[contains(text(),'Files')]"));
		buttonClicked(files);
		System.out.println("files");
		WebElement notification = driver.findElement(By.xpath("//button[@title='Notifications']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		buttonClicked(notification);
		System.out.println("notification");
		
		WebElement search = driver.findElement(By.xpath("//button[@title='Search']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		buttonClicked(search);
		System.out.println("search");
		
		WebElement help = driver.findElement(By.xpath("//button[@title='Help']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		buttonClicked(help);
		System.out.println("help");	
		
		
		
		driver.quit();
		
	}

}
