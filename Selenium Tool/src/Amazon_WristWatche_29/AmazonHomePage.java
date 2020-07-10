package Amazon_WristWatche_29;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage 
{
	// declare the WebElements present in Amazon HomePage

	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox ;
	
	// initiase the declared WebElements inside constructor
	
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilaisation
	
	public void searchBox(String search)
	{
		searchbox.sendKeys(search , Keys.ENTER);
	}
	
	
}
