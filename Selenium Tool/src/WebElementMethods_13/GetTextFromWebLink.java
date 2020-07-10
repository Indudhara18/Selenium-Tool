// get text of the link text 

package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetTextFromWebLink extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("Chrome");
		WebElement link = driver.findElement(By.xpath("//a[@target='_blank'][2]"));
		String linktext = link.getText() ;
		System.out.println("Text of weblink : " + linktext );
		driver.close();
	}
	
}
