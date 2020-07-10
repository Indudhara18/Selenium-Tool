// question no 1
package IQ30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHomePage1
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver  driver = new ChromeDriver() ;
		driver.get("http://indudharagowdaacer/login.do") ;
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		String actualTitle  = driver.getTitle() ;
		System.out.println(actualTitle);
		String expectedTitle = "actiTIME - Enter Time-Track" ;
		
		// equals method to compare state of String class
		if ( actualTitle .equals( expectedTitle ) ) 
			System.out.println("Home Page Verified");
		
		else
			System.out.println("Home page not verified");
		
		// equality operator to compare the address of String object
		if ( actualTitle == expectedTitle )
			System.out.println("Both String reference variables pointing towards same object");
		else
			System.out.println("String reference variables pointing towards different objects");
		
		driver.findElement(By.id("logoutLink")).click();
	//	driver.close();
		
	}
}
