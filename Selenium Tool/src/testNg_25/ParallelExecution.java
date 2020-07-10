package testNg_25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public  WebDriver driver ;
	
	@Parameters( "sBrowser" )
	@Test
	public void test_Browser(String sBrowser )
	{
		if(sBrowser.equals("chrome"))
			driver = new ChromeDriver();
		
		else if( sBrowser.equals("firefox") )
			driver = new FirefoxDriver() ;
		
		else
			driver = new InternetExplorerDriver();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		for (int i = 0; i < 30 ; i++) 
		{
			WebElement unTB = driver.findElement(By.id("username"));
			unTB.sendKeys("user1");
			unTB.clear();
			
			WebElement pwTB = driver.findElement(By.name("pwd"));
			pwTB.sendKeys("pass1");
			pwTB.clear();
		}
		
		driver.close();
	}
	
	
}
