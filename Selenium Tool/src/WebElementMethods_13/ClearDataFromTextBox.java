// WAS to clear the data which is present inside the text box using clear method

package WebElementMethods_13;

import org.openqa.selenium.By;

public class ClearDataFromTextBox extends BaseTest
{
	public static void main(String[] args) 
	{
		BaseTest.openApp("Firefox");
		driver.findElement( By.id("email") ).clear();
		
	}	
}
