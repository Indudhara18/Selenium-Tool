// close all tabs except parent tab
package WebElementMethods_13;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildTabsOnly 
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
		
		String parentTab = driver.getWindowHandle() ;
		Set<String> WHr = driver.getWindowHandles() ;
		
		WHr.remove(parentTab) ;
		
		for (String tab : WHr)
		{
			driver.switchTo().window(tab) ;
			driver.close();
		}
	}	
	
}
