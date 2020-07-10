// Close specific browser , (here close Parent Tab)
package WebElementMethods_13;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser 
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
		// get window reference of parent tab
		String parentTab = driver.getWindowHandle() ;
		Set<String> WHr = driver.getWindowHandles() ;
		for( String tab : WHr )
		{
			driver.switchTo().window(tab) ;
			if ( parentTab. equals(tab) ) 
			{
				driver.close();
			}
			
		}
	}
	
}
