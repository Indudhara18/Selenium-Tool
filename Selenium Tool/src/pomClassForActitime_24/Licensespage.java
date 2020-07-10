package pomClassForActitime_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Licensespage 
{


	// declaration on webElement
	
	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]")
	private WebElement productedition ;
	
	
	// initialisation of declared WebElement
	
	public Licensespage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilaisation of web elements
	
	public void getProductedition()
	{
		String pe = productedition.getText();
		System.out.println("Product Edition is:" + pe);
	}
	

	
	
}
