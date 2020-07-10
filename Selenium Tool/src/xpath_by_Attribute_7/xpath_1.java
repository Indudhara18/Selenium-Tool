// acti time xpath by attribute
package xpath_by_Attribute_7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_1 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		// enter actitime url
		driver.get("http://indudharagowdaacer/login.do");
		
		// find username text box using xpath by attribute
		// syntax --> //tagname[@attribute_name = 'attribute_value']
		WebElement usname = driver.findElement(By.xpath("//input[@name='username']")) ;
		
		// sendkey() is used to pass the value to textfield
		usname.sendKeys("admin");
	
		// find password textbox and enter manager
		WebElement pssword= driver.findElement(By.xpath("//input[@name='pwd']")) ;
		pssword.sendKeys("manager");
		
		// find login button on web page and click on it
		WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']")) ;
		login.click();
		
		// find logout button on click on it
		WebElement logout = driver.findElement(By.xpath("//a[@id='logoutLink']")) ;
		logout.click();
	}
}

// in WebElement interface sendKeys() is there to enter testdata