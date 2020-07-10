// get the font size of the web element

package WebElementMethods_13;

import org.openqa.selenium.By;

public class FontSize extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("Chrome");
		String font = driver.findElement(By.id("email")).getCssValue("font") ;
		System.out.println( font );
		
		String font_size = driver.findElement(By.id("email")).getCssValue("font-size") ;
		System.out.println( font_size );
		
		String fontstyle = driver.findElement(By.id("email")).getCssValue("font-style") ;
		System.out.println(fontstyle);
		

		String fontcolor = driver.findElement(By.id("email")).getCssValue("font-colour") ;
		System.out.println(fontcolor);

		
		driver.close();
	}
	
	
}
