// add a item to cart
package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCart 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		driver.get("http://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("G-shock watch" , Keys.ENTER) ;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text() ,  'GG-1000-1A3DR (G662)')]")).click() ;
	}
}
