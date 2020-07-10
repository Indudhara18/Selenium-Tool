package upcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_get_method {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		// open browser
	 	WebDriver driver = new ChromeDriver() ;		
	 	// driver is having reference of java object
	 	
	 	// enter url without using get()
	 	driver.navigate().to("http://www.wikipedia.com");
	 	System.out.println("===========================");
	 	
	 	// to get title from current web page
	 	String title = driver.getTitle();
	 	System.out.println( title );
	 	
	 	// to get current wen page url
	 	String url = driver.getCurrentUrl() ;
	 	System.out.println(url) ;
	 	
	 	// to get cuurent web page source code
	 	String ps = driver.getPageSource();
	 	System.out.println(ps);
	 	
	 	// close current browser
	 	driver.close();
	}
}
