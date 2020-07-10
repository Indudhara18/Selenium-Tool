package handleMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestionBoxOfGoogleSearchBox 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
	//	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		
		WebElement searchBOX = driver.findElement(By.name("q"));
		searchBOX.sendKeys("java");
		
		List<WebElement> autoLinks = driver.findElements(By.xpath("//span[contains(text(),'java')]")) ;
		System.out.println( autoLinks );
		int count = autoLinks.size() ;
		System.out.println( count );
		
		for (WebElement link : autoLinks) 
		{
			String S = link.getText() ;
			System.out.println( S );
			
		//	if ( S.equalsIgnoreCase( "java interview questions" ) ) 
		//		link.click();
		}
		
		autoLinks.get(5).click();
	}
}
