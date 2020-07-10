// "C:\Users\Manu\Desktop\html files\xpath_By_Attribute .html"
package xpath_by_Attribute_7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByxpathByAttribute 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Manu/Desktop/html%20files/xpath_By_Attribute%20.html");
		
		driver.findElement(By.xpath("//input[@value='A']")).sendKeys("ParleG"); 
		driver.findElement(By.xpath("//input[@value='B']")).sendKeys("Santoor");
		
		driver.findElement(By.xpath("//input[@value='C']")).sendKeys("Guggu");
		driver.findElement(By.xpath("//input[@value='D']")).sendKeys("Etagi");
	}
	
}
