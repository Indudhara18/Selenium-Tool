package upcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Navigate {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		
		// maximize the window
		driver.manage().window().maximize();
		
		// enter url
		driver.get("http://www.google.com");
		
		// get current web page url
		String url = driver.getCurrentUrl() ;
		System.out.println(url);
		
		// get current web page title
	 	String title = driver.getTitle() ;
		System.out.println(title);
		
		System.out.println("================================");
		
		// navigate to myntra 
		driver.navigate().to("http://myntra.com");
		
		// get url of myntra
		String murl = driver.getCurrentUrl() ;
		System.out.println(murl);
		
		// get title of myntra
	 	String mtitle = driver.getTitle() ;
		System.out.println(mtitle);
		
		// navigate back to google
		driver.navigate().back(); 
		
		// navigate to myntra again
		driver.navigate().forward();
		
		// refresh myntra
		driver.navigate().refresh();
		
		driver.navigate().to("http://web.Whatsapp.com") ;
		// close current browser
		// driver.close() ;
	}
}
