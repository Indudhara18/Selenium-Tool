package class_Assignment_27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class is used as WebElements object repository - POM class
 * @author Indudhar
 *
 */
public class FlipkartLoginPage 
{	
	// declare the Webelements present in Flipkart Login
	
	@FindBy(xpath="//span[text()='Enter Email/Mobile number']")
	private WebElement usTB ;
	
	@FindBy(xpath="//span[text()='Enter Password']")
	private WebElement psTB ;
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement xmark ;
	
	
	// initialise the WebElements declared
	
	public FlipkartLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
			
	// utilise the WebElements
	
	public void setUserName(String username)
	{
		usTB.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		psTB.sendKeys(password);
	}
	
	public void clickXmark()
	{
		xmark.click();
	}
}
