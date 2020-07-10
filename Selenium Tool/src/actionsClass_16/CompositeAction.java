package actionsClass_16;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeAction 
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
		WebElement actitimeinc = driver.findElement(By.xpath("//a[text()='Actimind Inc.']"));
		
		
		// Create Actions class  
		Actions act = new Actions(driver) ;
		// through keyboard control and click on link
		act.sendKeys(Keys.CONTROL).click(actitimeinc).perform();
		
	}
}
