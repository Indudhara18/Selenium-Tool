// get the logo TagName
package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogoTagName extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("Chrome");
		WebElement logo = driver.findElement(By.xpath("//a[@class='logo']")) ;
		System.out.println( logo.getTagName() ) ;
		driver.close();		
	}
	
	
}
