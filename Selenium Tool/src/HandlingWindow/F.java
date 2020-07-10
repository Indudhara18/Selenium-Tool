// close child windows only 
// ---> using getWindowHandles() and remove() !! optimised code


package HandlingWindow;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		//open the browser
		WebDriver driver = new ChromeDriver() ;
		// maximize the browser
		driver.manage().window().maximize();
		// enter the url
		driver.get("http://www.naukri.com");
		// get current window reference
		String naukriwh = driver.getWindowHandle() ;
		System.out.println(naukriwh);
		System.out.println("=================================");
		
		//get multiple window reference in collection
		Set<String> multiplewh = driver.getWindowHandles() ;
		System.out.println(multiplewh);
		System.out.println("================================");
		
		// get the size of collection of windows
		int size = multiplewh.size() ;
		System.out.println("no of windows is : " +size );
		
		// remove parent window reference from collection of windows reference
		multiplewh.remove( naukriwh ) ;
		
		// After removing parent reference
		int size1 = multiplewh.size() ;
		System.out.println(size1);
		System.out.println("==================================");
		
		// give me one window at a time from collection, to do tasks on each window separetly
		for (String eachwindow : multiplewh) 
		{
			driver.switchTo().window(eachwindow) ;
			driver.close();
		}
		
		System.out.println(" All child windows closed successfully");
	}
}
