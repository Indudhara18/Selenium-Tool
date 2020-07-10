package upcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Manu {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe") ;
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.pepperfry.com");
		System.out.println( driver.getCurrentUrl() );
		System.out.println( driver.getTitle() );
		driver.navigate().to("http://www.houzz.com");
		driver.navigate().to("http://www.firefox.com") ;
		System.out.println( driver.getCurrentUrl() );
		System.out.println( driver.getTitle() );
	}
}
