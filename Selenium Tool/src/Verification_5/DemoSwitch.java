package Verification_5;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSwitch {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		// open browser
		WebDriver driver = new ChromeDriver() ;
		// call method from other class
		VerificationPage.verifyPage(driver, "http://www.google.com" , "Google");
		
		// wait for a while (5 seconds) before execution
		Thread.sleep(5000);			// declare or handle the exception
		
		// enter test data inside google.com
		driver.switchTo().activeElement().sendKeys("Seleniumhq" , Keys.ENTER);
		
	}
}
