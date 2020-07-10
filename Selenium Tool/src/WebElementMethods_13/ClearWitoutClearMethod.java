// WAS to clear the data present in textbox without using clear()
package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ClearWitoutClearMethod extends BaseTest
{
	public static void main(String[] args) 
	{
		// call static method
		openApp("chrome");
		// find password element 
		WebElement passwordtextbox = driver.findElement(By.id("password") ) ;
		// for that element- from keyboard select all(control+a) and click on delete button
		passwordtextbox.sendKeys(Keys.CONTROL+"a" , Keys.DELETE);
	}
}
