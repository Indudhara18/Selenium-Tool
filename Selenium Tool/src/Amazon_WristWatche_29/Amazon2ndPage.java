package Amazon_WristWatche_29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon2ndPage 
{
	@FindBy(xpath = "//span[text()='Leather']")
	private WebElement materialtype ;
	
	public Amazon2ndPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectLeather()
	{
		materialtype.click();
	}
	
	
}
