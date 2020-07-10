// moveToElement()
package actionsClass_16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOveringAction 
{
	static
	{
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://vtiger.com");
		
		// find resources tab
		WebElement restab = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(restab).perform();
	
		// click on contact from dropdown and click on it
		driver.findElement(By.xpath("//h6[contains(text(),'Contact')]")).click();
		
		WebElement other = driver.findElement(By.xpath("//p[text()='Other Communication']"));
		int yaxis = other.getLocation().getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver ;
		jse.executeScript("window.scrollBy(0,"+yaxis+")") ;
		String contactno = driver.findElement(By.xpath("//p[text()='Human Resources']/../../../div[2]")).getText() ;
		System.out.println( contactno );
		
		driver.close();
	}
}
