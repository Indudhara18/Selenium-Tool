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


public class Flipkartsearchpage 
{
	// declare the Webelements
	
	@FindBy(xpath="//div[text()='Apple iPhone 11 Pro (Silver, 64 GB)']/../../div[2]/div[4]/div[2]")
	private WebElement emi ;
	
	// initialise the WebElements declared
	
	public Flipkartsearchpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilise the WebElements
	public void emiOfItem()
	{
		String emiprice = emi.getText();
		System.out.println(emiprice);
	}
	
	
	
}
