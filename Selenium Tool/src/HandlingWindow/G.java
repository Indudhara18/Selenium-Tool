// close LnT window only 

package HandlingWindow;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G 
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
		
		 
		// give me one window at a time from collection, to do tasks on each window separetly
		for (String eachwindow : multiplewh) 
		{
			driver.switchTo().window(eachwindow) ;
			String s = driver.getTitle() ;
			if( s.contains("LnT") )
			{
				System.out.println( s );
				driver.close();
			}
		}
		
		System.out.println("LnT window closed successfully");
	}
}
