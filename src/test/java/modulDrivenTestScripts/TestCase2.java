package modulDrivenTestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import modulDrivenTestCases.ReUsable;

public class TestCase2 extends ReUsable{

	public static  void Test2A() throws Exception {
	
	Thread.sleep(2000);
	WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
	buttonClicked(freeTrial);
	
	WebElement fName = driver.findElement(By.xpath("//input[@name='FirstName']"));
	enterText(fName, "Jay");
	
	WebElement lName = driver.findElement(By.xpath("//input[@name='LastName']"));
	enterText(lName, "Patel");
	
	WebElement email = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
	enterText(email, "jay123@gmail.com");
	
	WebElement phNumber = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
	enterText(phNumber, "234-567-8978");
	
	WebElement country = driver.findElement(By.cssSelector("body.xero.is-live-mode main.main:nth-child(2) div.section.bright.section-padding.section-padding-none.section-bright.section-section_c1c0:nth-child(1) div.row div.small-12.columns form.signup-form.signup-form-no-background div.signup-form-country.form-group:nth-child(6) label.form-label.form-label-active span.form-select > select.form-input"));
	selectByName(country, "India");
	
	WebElement captcha = driver.findElement(By.xpath("//textarea[@id='g-recaptcha-response']"));
	buttonClicked(captcha);
	

	WebElement terms = driver.findElement(By.name("TermsAccepted"));
	buttonClicked(terms);
	
	WebElement getStarted = driver.findElement(By.cssSelector("body.xero.is-live-mode main.main:nth-child(2) div.section.bright.section-padding.section-padding-none.section-bright.section-section_c1c0:nth-child(1) div.row div.small-12.columns form.signup-form.signup-form-no-background div.signup-form-submit.form-group:nth-child(9) > span.g-recaptcha-submit"));
	buttonClicked(getStarted);
	System.out.println("getstarted");

	
	
	
	driver.quit();
		
}
public static  void Test2B() throws Exception {
	
		Thread.sleep(2000);
		WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		buttonClicked(freeTrial);
		
		WebElement getStarted = driver.findElement(By.cssSelector("body.xero.is-live-mode main.main:nth-child(2) div.section.bright.section-padding.section-padding-none.section-bright.section-section_c1c0:nth-child(1) div.row div.small-12.columns form.signup-form.signup-form-no-background div.signup-form-submit.form-group:nth-child(9) > span.g-recaptcha-submit"));
		buttonClicked(getStarted);
		
		
		WebElement username = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		enterText(username, "lindenmot@ori@nn789@gmail.com");
		
		
		WebElement getStarted1 = driver.findElement(By.cssSelector("body.xero.is-live-mode main.main:nth-child(2) div.section.bright.section-padding.section-padding-none.section-bright.section-section_c1c0:nth-child(1) div.row div.small-12.columns form.signup-form.signup-form-no-background div.signup-form-submit.form-group:nth-child(9) > span.g-recaptcha-submit"));
		buttonClicked(getStarted1);
		
		driver.quit();
		
		}


public static  void Test2C() throws Exception {
	
	Thread.sleep(2000);
	WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		buttonClicked(freeTrial);
	
	WebElement terms = driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
		buttonClicked(terms);
	
	WebElement privacy = driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
		buttonClicked(privacy);

	driver.quit();
	
	}

public static  void Test2D() throws Exception {
	
	Thread.sleep(2000);
	WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
	buttonClicked(freeTrial);
	
	
	WebElement offer = driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
	buttonClicked(offer);
	
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
