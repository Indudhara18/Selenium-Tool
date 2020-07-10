package upcasting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindows {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{	
		// open browser
		WebDriver driver = new ChromeDriver() ;
		
		// maximize the browser
		driver.manage().window().maximize();
	
		// get current window reference
		String wref = driver.getWindowHandle(); 		// reference of GUI object
		System.out.println(wref);
		
		// close current browser
		driver.close() ;
	
	}
	
}

