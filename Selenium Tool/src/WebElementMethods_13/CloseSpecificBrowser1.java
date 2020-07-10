// close specific tab  (here close L&T tab)
package WebElementMethods_13;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser1 
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
		for( String tab : WHr )
		{
			driver.switchTo().window(tab) ;
			String title = driver.getTitle() ;
			if( title .contains("LnT") )
				driver.close(); 
		}
	}
}
