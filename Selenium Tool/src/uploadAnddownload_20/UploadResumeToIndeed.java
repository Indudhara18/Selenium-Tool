package uploadAnddownload_20;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadResumeToIndeed 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.indeed.co.in");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Job Search India | Indeed"));
		driver.findElement(By.xpath("//a[text()='Upload Your Resume']")).click();
		
		wait.until(ExpectedConditions.titleContains("Indeed Resume"));
		String filepath = "C:\\Users\\Manu\\open_source_licenses.txt" ; 
		driver.findElement(By.xpath("//button[text()='Upload your resume']")).sendKeys(filepath);
	//	Thread.sleep(1000);
		
	//	Robot rbt = new Robot();
		
	}
		
		
		
}
	

