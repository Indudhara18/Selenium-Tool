// WAS to copy data from one text box to other text box
package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

// extends to inherit static block , and OpenApp()

public class CopyTextFromOneTB2OtherTB2 extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("InternetExplorer");
		// identify username textbox from opensourcebilling.org
		WebElement usernametextbox = driver.findElement(By.id("email")) ;
		// select the data from username text box and copy it
		usernametextbox.sendKeys(Keys.CONTROL+"ac");
		// paste the data to password textbox
		
		// identify password textbox from opensourcebilling.org
		WebElement passwordtextbox = driver.findElement(By.id("password")) ;
		// paste the data from username text box to passwordtextbox
		passwordtextbox.sendKeys(Keys.CONTROL+"v");

	}
	
}
