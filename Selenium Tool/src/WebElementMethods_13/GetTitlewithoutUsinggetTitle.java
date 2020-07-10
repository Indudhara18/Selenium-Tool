// get the title of webpage without using getTitle()

package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetTitlewithoutUsinggetTitle extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("Chrome") ;
		// find title element
		WebElement titleElement = driver.findElement(By.tagName("title")) ;
		// try by passing value as argument
		String title = titleElement.getAttribute("value") ;
		System.out.println( title );
		
		// try passing textContent
		String titlebyalternative = titleElement.getAttribute("textContent") ;
		System.out.println( titlebyalternative );
		
		// using getTitle()
		String actualtitle = driver.getTitle() ;
		
		System.out.println( actualtitle );
		
		// compare getTitle() result with getAttribute() result
		
		if (titlebyalternative .equals(actualtitle) ) 
		{
			System.out.println("without using getTitle() is working fine");
		}
		driver.close();
	}	
}
