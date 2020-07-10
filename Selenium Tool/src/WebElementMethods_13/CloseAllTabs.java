// Close all tabs without using quit method
package WebElementMethods_13;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTabs
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		Set<String> WHr = driver.getWindowHandles() ;
		System.out.println("reference of parent tab and child tabs : " + WHr);
		
		for( String tab : WHr)
		{
			driver.switchTo().window(tab) ;
			driver.close();
			
		}
	}
	
}
