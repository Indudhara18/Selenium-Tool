package xpath_by_text_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginLout 
{
	static
	{
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize() ;
		driver.get("http://indudharagowdaacer/login.do"); 
		driver.findElement(By.xpath("//input[@name='username' and @class='textField']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password' and @name='pwd']")).sendKeys("manager") ;
		driver.findElement(By.xpath("//a[@id='loginButton' and @class='initial']")).click();
		
		Thread.sleep(3000);
		String actualTitle = driver.getTitle() ;
		System.out.println("Title : " + actualTitle );
		String expectedTitle = "actiTIME - Enter Time-Track" ;
		if ( actualTitle . equals( expectedTitle ) ) 
			System.out.println("homepage is verified");
		
		
		else
			System.out.println("homepage not verified");
		
		driver.findElement(By.xpath("//a[text() = 'Logout']")).click();
	}
}
