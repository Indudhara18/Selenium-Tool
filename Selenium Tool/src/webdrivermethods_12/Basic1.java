package webdrivermethods_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		// open the browser
		WebDriver driver = new ChromeDriver() ;
		// maximaise the browser
		driver.manage().window().maximize();
		// enter url
		driver.get("http://www.gmail.com");
		Thread.sleep(2000) ;
		// get title
		System.out.println( driver.getTitle() );
		// get current url
		System.out.println( driver.getCurrentUrl() );
		// get current page source
		// in console html code will display when pagesource is dislpaying
		//	System.out.println( driver.getPageSource()  );
	
		driver.close();
	}
}
