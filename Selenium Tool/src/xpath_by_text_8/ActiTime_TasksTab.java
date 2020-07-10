package xpath_by_text_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime_TasksTab 
{
	// sss can not directly communicate with browser so we need to set driver executable path
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		// open browser
	 	WebDriver driver = new FirefoxDriver() ;
	 	// maximaize 
	 	driver.manage().window().maximize();
	 	// enter url
	 	driver.get("http://indudharagowdaacer/login.do");
	 	// enter username
	 	driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("admin");
	 	// enter password
	 	driver.findElement(By.xpath("//input[@type='password' and @name='pwd']")).sendKeys("manager");
	 	Thread.sleep(3000);
	 	// keep me logged in
	 	driver.findElement(By.xpath("//label[contains(text(),'Keep')]")).click() ;
	 	// click on login button
	 	driver.findElement(By.xpath("//a[@id='loginButton' and @class='initial']")).click();
	 	// homepage title
	 	String actualTitle = driver.getTitle();
	 	System.out.println("Title :" + actualTitle);
	 	if ( actualTitle . contains("actiTIME - Enter Time-Track")) 
			System.out.println("Homepage verified");
	 	else
	 		System.out.println("Homepage not verified");
	 	// click on tasks module (4 ways possible)
	// 	driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	// 	driver.findElement(By.xpath("//div[contains(text(), 'Tasks' )]")).click();
	//  driver.findElement(By.xpath("//a[@class='content tasks' and @href='/tasks/otasklist.do']")).click();
	 	driver.findElement(By.xpath("//a[@class = 'content tasks']")).click();
	}
}
