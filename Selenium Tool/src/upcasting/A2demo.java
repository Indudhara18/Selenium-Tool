package upcasting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2demo {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe") ;
	}
	
	public static void testChrome(ChromeDriver driver )
	{
		// maximize the browser
		driver.manage().window().maximize();				
		// enter url
		driver.get("http://www.google.com");
				
		// get url
		String url = driver.getCurrentUrl() ;
		System.out.println("url :" + url) ;
		// get title
		String title = driver.getTitle();
		System.out.println("Title :" +title);
				
		// close browser
		driver.close();
	}
	
	public static void testFirefox(FirefoxDriver driver )
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
		 ChromeDriver driver =	new ChromeDriver() ;
		 testChrome(driver);
		 FirefoxDriver driver1 =	new FirefoxDriver() ;
		 testFirefox(driver1);
		
	}
}
