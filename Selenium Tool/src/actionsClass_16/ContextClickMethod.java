package actionsClass_16;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod 
{
	static
	{
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://indudharagowdaacer/login.do");
		// find act time inc 
		WebElement actitimeinc = driver.findElement(By.xpath("//a[text()='Actimind Inc.']"));
	
		// create Actions class object
		Actions act = new Actions(driver);
		// right click on actitimeinc link using contextClick() 
		act.contextClick(actitimeinc).perform();
		
		Thread.sleep(3000);
		
		// create Robot class object to perform keyboard actions 
		Robot rbt = new Robot() ;					// throws AWTException
		// from keyboard click on open link on new tab
	//	rbt.keyPress(KeyEvent.VK_T);
		rbt.keyPress(KeyEvent.VK_W);
	}
}
// for all methods of Actions class we have to do method chaining with perform() 