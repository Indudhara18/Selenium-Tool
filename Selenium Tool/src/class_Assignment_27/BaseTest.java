package class_Assignment_27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


/**
 * This class is used as precondition and post conditions
 * @author indudhar
 *
 */
public class BaseTest 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	
	public static WebDriver driver ; 
	
	@BeforeClass
	public void openBrowser()
	{	
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void openApplication()
	{
		driver.get("http://www.flipkart.com");
		
	}
	
	
	
	
}
