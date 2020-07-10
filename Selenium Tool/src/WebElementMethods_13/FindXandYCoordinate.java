//WAS to find the X and Y coordinates of textbox

package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindXandYCoordinate extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("Chrome");
		// find username textbox
		WebElement usernametextbox = driver.findElement(By.id("email")) ;
		// find the coordinates - get the point 
		int Xaxis = usernametextbox.getLocation().getX() ;
		System.out.println("X axis coordinates of username textbox : " + Xaxis);
		
		int Yaxis = usernametextbox.getLocation().getY() ;
		System.out.println("Y axis coordinate of username textbox : " + Yaxis);
		 
		// find password textbox
		WebElement passwordtextbox = driver.findElement(By.id("password")) ;
		// find the coordinates - get the point 
		int Xaxis1 = passwordtextbox.getLocation().getX() ;
		System.out.println("X axis coordinates of password textbox : " + Xaxis1);
			
		 int Yaxis1 = passwordtextbox.getLocation().getY() ;
		 System.out.println("Y axis coordinate of password textbox : " + Yaxis1);
		 
		 if ( Xaxis == Xaxis1 ) 
			System.out.println("Allignment is proper");
		 else 
			 System.out.println("Allignment is Improper");
	}		
		
}
