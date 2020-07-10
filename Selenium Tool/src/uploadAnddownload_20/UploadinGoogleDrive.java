package uploadAnddownload_20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadinGoogleDrive 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	
	public static void main(String[] args) throws InterruptedException 	
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://drive.google.com/drive/my-drive");
		

		driver.findElement(By.name("identifier")).sendKeys("indudharaqsp123@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("induqsp123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement seleniumfolder = driver.findElement(By.xpath("//div[text()='selenium']"));
		
		// create Actions class object to do doubleclick
		Actions act = new Actions(driver);
		act.doubleClick( seleniumfolder ).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='uw8t2'])[1]")).click();
	
	}	
	
}
