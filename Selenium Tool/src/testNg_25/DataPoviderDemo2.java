package testNg_25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPoviderDemo2 
{
	public static WebDriver driver ;
/*	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	
	@BeforeMethod
	public void openApplication()
	{
		driver.get("http://localhost/login.do");
	}
*/
	
	
	@DataProvider
	public Object[][] dataValue()
	{
		Object[][] s = new Object[3][2];
		
		s[0][0] = "userA" ;
		s[0][1] = "pw123" ;
		
		s[1][0] = "userB" ;
		s[1][1] = "pw456" ;
		
		s[2][0] = "userC" ;
		s[2][1] = "pw789" ;
		
		return s ;
	}
	
	@Test( dataProvider = "dataValue" )
	public void test_Invalid(String un , String pw)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
