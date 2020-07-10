package testNgExample1_26;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * This class is used for pre condition and post condition
 * @author Indudhara
 *
 */
public class BaseTest 
{
	@BeforeSuite
	public void m1()
	{
		Reporter.log("Before Suit" , true);
	}
	
	@AfterSuite
	public void m2()
	{
		Reporter.log("After Suit" , true);
	}
	
	@BeforeTest
	public void m3()
	{
		Reporter.log("Before Test" , true);
	}
	
	@AfterTest
	public void m4()
	{
		Reporter.log("After Test", true);
	}
	
	@BeforeClass
	public void m5()
	{
		Reporter.log("Before Class", true);
	}
	
	@AfterClass
	public void m6()
	{
		Reporter.log("After Class" , true);
	}
	
	@BeforeMethod
	public void m7()
	{
		Reporter.log("Before Method" , true);
	}
	
	@AfterMethod
	public void m8()
	{
		Reporter.log("After Method" , true);
	}
	
}
