package Amazon_WristWatche_29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon3rdPage 
{
	@FindBy(xpath = "//span[text()='25% Off or more']")
	private WebElement discount ;
	
	public Amazon3rdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void selectDiscount()
	{
		discount.click();
	}
	
}
