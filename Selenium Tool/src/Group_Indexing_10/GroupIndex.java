package Group_Indexing_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupIndex 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Manu/Desktop/html%20files/Group_Index.html");

		// matches with all the weblinks , Select the first Index 
//		driver.findElement(By.xpath("(//a)[1]")).click() ;
		
		// matches with all the weblinks , Select the Second Index
//		driver.findElement(By.xpath("(//a)[2]")).click();
		
		// matches with all the weblinks , Select the third Index
//		driver.findElement(By.xpath("(//a)[3]")).click();

		// matches with all the weblinks , Select the third Index
//		driver.findElement(By.xpath("(//a)[4]")).click();

		// matches with all first index weblinks , Select the second Index
//		driver.findElement(By.xpath("(//a[1])[2]")).click();

		// matches with all second index weblinks, select the first index
//		driver.findElement(By.xpath("(//a[2])[1]")).click();
		
		// matches with all second index weblinks, select the second index
//		driver.findElement(By.xpath("(//a[2])[2]")).click();
		
		// select only the last link
//		driver.findElement(By.xpath("(//a)[last()]")).click();
		
		// select only last but one
//		driver.findElement(By.xpath("(//a)[last()-1]")).click();
	
		// select all except 1st link
//		driver.findElement(By.xpath("(//a)[position()>1]")).click();
		
		// select first link and last link
		List<WebElement> list = driver.findElements(By.xpath("(//a)[1] | (//a)[last()]"));
		for (WebElement link : list) 
		{
			link.click();
		}
		
		driver.close();
	}
	
}
