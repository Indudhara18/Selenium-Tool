package jeethAmazon_28;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
	  	WebDriver driver = new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	driver.manage().window().maximize();
	  	driver.get("http://www.amazon.in");
	  	
	  	
	  	WebElement sign = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	  	
	  	Actions ac = new Actions(driver);
	  	ac.moveToElement(sign).perform();
	  	
	  	driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
	  	
	  	WebDriverWait wait = new WebDriverWait(driver, 10);
	  	wait.until(ExpectedConditions.titleContains("Amazon Sign In"));
	  	
	  	driver.findElement(By.id("ap_email")).sendKeys("indudhara18@gmail.com");
	  	driver.findElement(By.id("continue")).click();
	  	driver.findElement(By.id("ap_password")).sendKeys("shakira");
	  	driver.findElement(By.id("signInSubmit")).click();
	  	
	  	wait.until(ExpectedConditions.titleContains("Authentication required"));
	  	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	  		  	
//	   	driver.findElement(By.xpath("//img[@alt='captcha']")).sendKeys(Keys.CONTROL+"ac");
//	   	driver.findElement(By.xpath("//input[@name='cvf_captcha_input']")).sendKeys(Keys.CONTROL+"v");
	  	
//	  	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//	 	search.sendKeys("1plus pro" , Keys.ENTER);
	 	
	}
	
}
