package webdrivermethods_12;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic2 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		// open the browser
		WebDriver driver = new ChromeDriver() ;
		// maximaise the browser
		driver.manage().window().maximize();
		// enter url
		driver.get("http://www.gmail.com");
		Thread.sleep(2000) ;
		// get title  
		System.out.println( driver.getTitle() );
		// go to wikipedia from gmail
		driver.navigate().to("http://www.wikipedia.com");
		// go back to gmail
		driver.navigate().back();
		// go again for wikipedia
		driver.navigate().forward();
	}
}
