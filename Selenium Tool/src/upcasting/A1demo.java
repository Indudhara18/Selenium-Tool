package upcasting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1demo {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe") ;
	}
	
	
	public static void main(String[] args) 
	{
		
	  ChromeDriver driver =	new ChromeDriver() ;
	  FirefoxDriver driver1 =	new FirefoxDriver() ;
	  
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
	  
			System.out.println("==========================");
			
			// maximize the browser
			driver1.manage().window().maximize();
			
			// enter url
			driver1.get("http://www.google.com");
			
			// get url
			String curl = driver1.getCurrentUrl() ;
			System.out.println("url :" + curl);
			
			// get title
			String atitle = driver1.getTitle();
			System.out.println("Title :" + atitle);
			
			// close browser
			driver1.close();
	  
	}
	
	
}
