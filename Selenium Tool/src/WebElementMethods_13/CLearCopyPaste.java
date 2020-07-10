// clear the data from username textbox
// enter "Rat" into username textbox
// select data from username textbox  and copy 
// clear the data from password textbox
// paste data selected from username textbox to password textbox

package WebElementMethods_13;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CLearCopyPaste extends BaseTest
{
	public static void main(String[] args) throws InterruptedException
	{
		openApp("Chrome");
		// find username textbox					select all			delete		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a" , Keys.DELETE);
		// find username textbox					enter Rat   select all and copy
		driver.findElement(By.id("email")).sendKeys("Rat" , Keys.CONTROL+"ac");
		
		Thread.sleep(3000);
		
		// find password textbox						select all			delete
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"a" , Keys.DELETE);
		// find password textbox						paste			delete
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");
				
	}
	
}
