package xpath_axes_11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWindow 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://www.myntra.com");
		Thread.sleep(1000);
		// get me the title of main tab
	 	String parenttab = driver.getTitle() ;
		Thread.sleep(3000);
	 	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("kurthas" , Keys.ENTER);
	 	Thread.sleep(3000);
	 	driver.findElement(By.xpath("//img[contains( @src , '6161556086869769-1' )]")).click() ;
		// get me title of child tab 
		String childtab = driver.getTitle() ;
	    Set<String> tabs = driver.getWindowHandles() ;
	    for (String tab : tabs) 
	    {
	    	driver.switchTo().window(tab) ;
	    	 
	    	if ( childtab . equals( driver.getTitle() ) )
	    	{
	    		System.out.println(parenttab);
	    		driver.close();
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("//p[text()='XS']")).click();
	    	//	driver.close();
	    	}
		}
	}
}
