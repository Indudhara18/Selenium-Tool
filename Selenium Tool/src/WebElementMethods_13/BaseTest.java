
// code reuseability 

package WebElementMethods_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe") ;
	}
	
	// in any package, doesnot depend on object creation, in all 3 browsers
	public static WebDriver driver ;
	
	// create a method to open browser, maximise, enter url
	public static void openApp(String browser)
	{
		// if browser is chrome 
		if (browser.contains("Chrome") ) 
		{
			// open chrome browser
			driver = new ChromeDriver() ;
			// maximize the window
			driver.manage().window().maximize();
			// enter the url
			driver.get("http://demo.opensourcebilling.org");
		}
		
		else
		{
			// open Firefox browser
			driver = new FirefoxDriver() ;
			// maximize the window
			driver.manage().window().maximize();
			// enter the url
			driver.get("http://demo.opensourcebilling.org");
		}	
		
	}
	
	
}
