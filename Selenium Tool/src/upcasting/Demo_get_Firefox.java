package upcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_get_Firefox {
	
	// setting up of driver executable path
	static
	{
		System.setProperty( "webdriver.gecko.driver" , "./driver/geckodriver.exe" ) ;
	}
	// code reuseability - for all the objects it will get executed,
	// no need to type again and again for each and every object (if it is in main() ); 
	
	public static void main(String[] args) 
	{
		
		// open Firefox browser
		WebDriver driver = new FirefoxDriver() ;
		
		// maximize browser window
		driver.manage().window().maximize();		// method chaining
		
		// enter url  using get()
		driver.get( "http://www.google.com" ) ;

		// get url of google web page
		System.out.println( driver.getCurrentUrl() ) ;
		
		// get title of google web page
		System.out.println( driver.getTitle() );
		
		System.out.println("=================");

		// navigate to another web page
		driver.navigate().to( "http://www.gmail.com" ) ;
		
		// navigate back to google page
		driver.navigate().back() ;
		
		// navigate to flipkart
		driver.navigate().to( "http://www.flipkart.com") ;
		
		// navigate to amazon
		driver.navigate().to( "http://www.amazon.com") ;
				
		// navigate back to home page
		driver.navigate().back() ;
		driver.navigate().back() ;
		
		// navigate to flipkart
		driver.navigate().forward();
		
	 	System.out.println( driver.getTitle() );
	 	
	 	// close current browser
	 	driver.close();
		
	}
}
