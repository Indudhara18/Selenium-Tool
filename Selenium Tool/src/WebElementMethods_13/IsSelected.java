// checkbox selected or not
package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IsSelected extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
		openApp("Chrome");
		// find check box
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Keep me signed in']")) ;
		// inorder to find checkbox always use ' type ' attribute with attribute value ' checkbox '
		WebElement cbox = driver.findElement(By.xpath("//input[@type='checkbox']")) ;
		// before selecting check box check once
		if ( cbox.isSelected() ) 
			System.out.println("Check box selected");
		else
			System.out.println("Check box Not selected");
		
		// select check box
		checkbox.click();
		Thread.sleep(3000);
		
		if ( cbox.isSelected() ) 
			System.out.println("Check box selected");
		else
			System.out.println("Check box Not selected");
		
	}
	
}
