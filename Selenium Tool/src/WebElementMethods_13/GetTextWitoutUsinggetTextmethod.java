// get text without using getText()
package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetTextWitoutUsinggetTextmethod extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("Chrome");
		
		// getting text without using getText() and by using getAttribute()
		String usnTB = driver.findElement(By.id("email")).getAttribute("value") ;
		System.out.println( usnTB );
		 
		
		WebElement submitbutton = driver.findElement(By.name("btn_login"))  ;
		String text = submitbutton.getText() ;
		System.out.println( text );	
		
		driver.close();
	}
	
}
