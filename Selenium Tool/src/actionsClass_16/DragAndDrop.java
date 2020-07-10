package actionsClass_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		
		WebElement designation = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(source, designation).build().perform();
		
		
	}
}
