package class_Assignment_27;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This class is used as WebElements object repository - POM class
 * @author Indudhar
 *
 */


public class FlipKartHomePage 
{
	// declare the Webelements
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchBox ;
	
	// initialise the WebElements declared
	
	public FlipKartHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilise the WebElements
	
	public void enterIntoSearchbox(String enter)
	{
		searchBox.sendKeys(enter , Keys.ENTER);
	}
	
}

