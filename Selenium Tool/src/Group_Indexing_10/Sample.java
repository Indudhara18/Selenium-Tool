package Group_Indexing_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample
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

		// matches with all the weblinks and it will return the address of first matching element 
//		driver.findElement(By.xpath("//a")).click() ;
		
		// matches with all the first index weblinks and it will return the address of first matching element
//		driver.findElement(By.xpath("//a[1]")).click();
		
		// matches with all the second index wenlinks and it will return the address of first matching element
		driver.findElement(By.xpath("//a[2]")).click();
			
		driver.close();
	}
}
