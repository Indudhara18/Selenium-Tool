package upcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCode {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe") ;
	}
	
	// run test script in different browsers
	// do upcasting
	public static void testBrowsers(WebDriver driver)
	{
		// maximize the browser
		driver.manage().window().maximize();
		
		// enter url
		driver.get("http://www.google.com");
		
		// get url
		String url = driver.getCurrentUrl() ;
		System.out.println("url :" + url);
		
		// get title
		String title = driver.getTitle();
		System.out.println("Title :" +title);
		
		// close browser
		driver.close();
	}
	
	public static void main(String[] args) 
	{
		// create Chrome object or open the Chrome browser
		WebDriver driver = new ChromeDriver() ;
		testBrowsers(driver) ;
		
		// create Firefox object or open the Firefox browser
		 FirefoxDriver driver1 = new FirefoxDriver() ;
		 testBrowsers(driver1) ;
		 
	}
}

