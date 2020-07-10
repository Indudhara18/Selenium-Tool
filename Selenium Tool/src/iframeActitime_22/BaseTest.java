package iframeActitime_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver ;
	
	public static void openApplication(String browser)
	{
		if( browser.equals("chrome") )
			driver = new ChromeDriver();
		else
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://indudharagowdaacer/login.do");		
	}
	
}
