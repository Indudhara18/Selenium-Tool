// print title of all the windows at a time

package HandlingWindow;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		//open browser
		WebDriver driver = new ChromeDriver() ;
		// maximize
		driver.manage().window().maximize();
		// enter url
		driver.get("http://www.naukri.com");
		// get current window reference
		String naukriwh = driver.getWindowHandle() ;
		System.out.println(naukriwh);
		System.out.println("=================================");
		
		//get multiple window reference
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
			String title = driver.getTitle();
			System.out.println( title );
			driver.close();
		}
		
		System.out.println("Title of all windows printed successfully");
	}
}
