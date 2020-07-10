package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IsEnabled extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("mozilla"); 			                            // calling the static method 
		WebElement usernametextbox = driver.findElement(By.id("email")) ;
		if ( usernametextbox.isEnabled() ) 
			System.out.println("username text box is enabled");
		else
			System.out.println("username text box in Disabled");		
	}	
}
