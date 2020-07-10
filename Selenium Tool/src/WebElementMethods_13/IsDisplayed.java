package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IsDisplayed  extends BaseTest
{
	public static void main(String[] args) 
	{
		BaseTest.openApp("Chrome");
		WebElement usernametextbox = driver.findElement(By.id("email")) ;
		
		if ( usernametextbox.isDisplayed() ) 
			System.out.println("username text box is displayed");
		else
			System.out.println("username text box not displayed"); 	
		
	}
}
