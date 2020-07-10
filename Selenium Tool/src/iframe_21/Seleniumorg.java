package iframe_21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumorg 
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
		driver.get("https://selenium.dev");
		
		// click on download tab
		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		
		// scroll down
		int yaxis = driver.findElement(By.xpath("//h2[contains(text(),'Selenium Client & WebDriver Language Bindings')]")).getLocation().getY();
		JavascriptExecutor jse = ( JavascriptExecutor ) driver ;
		jse.executeScript("window.scrollBy(0,"+yaxis+")");
		
		
		// click on javca API docs
		driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a[3]")).click();
		
		// switchto particular frame
		driver.switchTo().frame(1);
	
		// find Abstract Annotations 
		driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
		// switch back to original frame 
		driver.switchTo().defaultContent();
		
		// find frame in which constructor tab is present 
		WebElement constructorframe = driver.findElement(By.xpath("(//frame[1])[2]"));
		driver.switchTo().frame( constructorframe );
				
		// find constr tab and click on it
		driver.findElement(By.xpath("(//a[text()='Constr'])[1]")).click();
		
		// in the same frame identify elemnt to get text of it
		String s = driver.findElement(By.xpath("//th[text()='Constructor and Description']/../../tr[2]")).getText();
		System.out.println( s );
		driver.close();
	}
}
