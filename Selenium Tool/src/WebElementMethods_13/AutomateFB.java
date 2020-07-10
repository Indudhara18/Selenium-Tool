package WebElementMethods_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFB 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println("Login Page Title :" + driver.getTitle()  );
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']")) ;
		boolean displayed  = firstname.isDisplayed() ;
		System.out.println("FirstName TextBox displayed :" + displayed);
		
		boolean enabled = firstname.isEnabled() ;
		System.out.println("FirstName TextBox enabled :" + enabled );
		
		if ( driver.getTitle() . equals("Facebook – log in or sign up") ) 
		{
			System.out.println("Login page verified and logging out");
			driver.close();
		}
		
		
	}
}
