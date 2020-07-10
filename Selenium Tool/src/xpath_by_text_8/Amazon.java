package xpath_by_text_8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.findElement(By.xpath("//span[@class='icp-color-base' and text()='USD - U.S. Dollar' ]")).click();
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce' ]")).click();
		driver.findElement(By.xpath("//a[@id='icp-sc-dropdown_2']")).click();
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.xpath("//a[@id='icp-touch-link-country']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("// span[text()='India']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-mini a-button-primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes for men" , Keys.ENTER);
	}
	
}
