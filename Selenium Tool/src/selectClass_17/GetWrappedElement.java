package selectClass_17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Manu/Desktop/html%20files/MultiSelectListBox.html");
		
		// identify listbox element from web page
		WebElement listbox = driver.findElement(By.id("country"));
		
		// create Select class object to perform actions on listbox wheather 
		// it may be Multiple Select or Single Select
		
		Select sel = new Select(listbox) ; 
		boolean check = sel.isMultiple() ;
		System.out.println( check );
		
		WebElement MultiSelectlistbox = sel.getWrappedElement() ;
	//	String s = MultiSelectlistbox.getText() ;
	//	System.out.println( s );
		System.out.println( MultiSelectlistbox.getText() );
		driver.close();
	
	}
}
