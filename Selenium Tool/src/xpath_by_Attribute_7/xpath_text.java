// using xpath by Attribute and text()
package xpath_by_Attribute_7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_text 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		
		// enter actitime url

		driver.get("http://indudharagowdaacer/login.do");
		
		// find elemenmt in webpage 							and enter testdata
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin"); 
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click() ;
		
		Thread.sleep(5000);
		
		String actualTitle = driver.getTitle() ;
		
		if ( actualTitle . equals("actiTIME - Enter Time-Track") )  //"  " importance given for space also
			System.out.println("Home page is valid");
		else
			System.out.println("Home page does not match with expected page");
		
	}
}
