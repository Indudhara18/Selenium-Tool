package uploadAnddownload_20;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UploadCvToNaukri 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions() ;
		options.addArguments("--disable-notifications") ;
		
	//	WebDriver driver = new FirefoxDriver() ;
		WebDriver driver = new ChromeDriver(options) ;
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		
		String ptab = driver.getWindowHandle() ;
		Set<String> whr = driver.getWindowHandles() ;	
		
		for (String tab : whr) 
		{
			driver.switchTo().window(tab);
			if ( tab . equals(ptab) ) 
			{
			//	Alert al = driver.switchTo().alert() ;
			//	System.out.println( "popup message" + al.getText() );
			//	al.dismiss();
				System.out.println( driver.getTitle() );	
				String path = "C:\\Users\\Manu\\Desktop\\AB.SQL" ;
				// we can use sendKeys() only if type="file" in html code		
				driver.findElement(By.xpath("//input[@id='input_resumeParser']")).sendKeys(path);;
				// if cv is uploaded close the browser
				driver.close();
			}
		}
		
		
		
		
		
	}
	
}
