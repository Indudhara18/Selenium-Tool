package popUps_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://indudharagowdaacer/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		
		// find settings module and click on it
		driver.findElement(By.xpath("(//img[@src='/img/default/pixel.gif?hash=797059755'])[17]")).click();
		
		// find logo and color scheme and click on it
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		// find custom logo and check it
		driver.findElement(By.id("uploadNewLogoOption")).click();
		driver.findElement(By.id("FormModifiedDivButton")).click();
		
		Alert al = driver.switchTo().alert() ;
		
		Thread.sleep(2000);
		System.out.println("Alert popup saying: " + al.getText()   );
//		al.sendKeys("neha");			// ElementNotInteractableException because sendKeys() is used for prompt popup
//		al.accept();					// accept() and dismiss() works fine for alert popup
		Thread.sleep(2000);
		al.dismiss();
		
	}
}
