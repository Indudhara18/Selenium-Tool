package Verification_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerificationPage {
	
	// driver executable path
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe") ;
	}
	
	// code reuseability
	public static void verifyPage( WebDriver driver, String url, String expectedtitle)
	{	
		// maximize browser
		driver.manage().window().maximize(); 
		// enter url
		driver.get(url);
		// get title
		String actualtitle = driver.getTitle() ;
		// compare actual and expected title
		if ( actualtitle . equals(expectedtitle) ) 		
		System.out.println("Expected page is displayed, Test case is Passed :" +expectedtitle);
		
		else
		System.out.println("Expected page not displayed, Test case failed :" +actualtitle);			
	}
	
	public static void main(String[] args) 
	{
		 // open the browser
		 WebDriver driver = new ChromeDriver() ;
		 // call method
		 verifyPage(driver, "http://www.google.com", "Google");
		 
		 WebDriver driver1 = new FirefoxDriver() ;
		 verifyPage(driver1, "http://www.google.com", "Google");
		
		 verifyPage(driver1, "http://indudharagowdaacer/login.do", "actiTIME - Login");
		
	}
}
