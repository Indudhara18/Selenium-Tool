// WAS to find the height and width of text box
package WebElementMethods_13;

import org.openqa.selenium.By;

public class FindHeightandWidthOfTextBox extends BaseTest 
{
	public static void main(String[] args) 
	{
		BaseTest.openApp("Chrome");
		int usernameTBheight = driver.findElement(By.id("email")).getSize().height ;	// using getsize()
		System.out.println("Height of username text box : " + usernameTBheight);
		int usernameTBwidth = driver.findElement(By.id("email")).getSize().width ;
		System.out.println("Width of username text box : " + usernameTBwidth);
		
		System.out.println("=====================================================");
		
		int ustbheight = driver.findElement(By.id("email")).getRect().getHeight() ;		// using getRect()
		System.out.println( ustbheight );
		int ustbwidth = driver.findElement(By.id("email")).getRect().getWidth() ;
		System.out.println( ustbwidth );
		
		System.out.println("=====================================================");
		
		int passwordTbheight = driver.findElement(By.id("password")).getSize().height ;
		System.out.println("Height of username text box : " + passwordTbheight);
		int passwordTBwidth = driver.findElement(By.id("password")).getSize().width ;
		System.out.println("Width of username text box : " + passwordTBwidth);
	}
}
