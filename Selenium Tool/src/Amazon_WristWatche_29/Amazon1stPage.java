package Amazon_WristWatche_29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon1stPage 
{
	@FindBy(xpath = "//span[text()='Analogue']")
	private WebElement watchtype ;
	
	public Amazon1stPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void watchType()
	{
		watchtype.click();
	}
}
