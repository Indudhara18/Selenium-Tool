package WebElementMethods_13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAllLinks 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		WebDriverWait wait = new WebDriverWait(driver, 10) ;
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 wait.until(ExpectedConditions.titleContains("Google")) ;
		 System.out.println( allLinks );
		 int count = allLinks.size();
		 System.out.println( count );
		 
		 for (WebElement link : allLinks) 
		 {
			String S = link.getText() ;
			System.out.println( S );
			
		 }
		 
		 
	}
	
}
