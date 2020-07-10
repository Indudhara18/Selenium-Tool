package pomClass_23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://indudharagowdaacer/login.do");
		
		PomClass pc = new PomClass(driver);
		
		pc.setUserName("first");
		pc.clickLoginButton();
		
		Thread.sleep(2000);
		
		pc.setPassword("second");
		pc.clickLoginButton();
		
		pc.setUserName("first");
		pc.setPassword("second");
		pc.clickLoginButton();

		pc.clickLoginButton();

	}
	
}
