// WAS to copy data from one text box to other text box
package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

// extends to inherit static block , and OpenApp()

public class CopyTextFromOneTB2OtherTB extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("InternetExplorer");
		// identify username textbox from opensourcebilling.org
		WebElement usernametextbox = driver.findElement(By.id("email")) ;
		// select the data from username text box
		usernametextbox.sendKeys(Keys.CONTROL+"a");
		// copy the data which is selected
		usernametextbox.sendKeys(Keys.CONTROL+"c");
		// paste the data to password textbox
		
		// identify password textbox from opensourcebilling.org
		WebElement passwordtextbox = driver.findElement(By.id("password")) ;
		// paste the data from username text box to passwordtextbox
		passwordtextbox.sendKeys(Keys.CONTROL+"v");

	}
	
}
