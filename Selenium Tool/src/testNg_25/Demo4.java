package testNg_25;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 
{

	@Test(invocationCount = 1)						// default value is 1
	void testA()
	{
		Reporter.log("hey bunny", true);			// false means only in report
	}
	
	@Test(invocationCount = 0)						// 0 means skips the method
	public void testB()
	{
		Reporter.log("hey hamster", true);			// true means in report and console
 	}
	
	@Test(priority=-1, invocationCount = 5)
	public void testK()
	{
		Reporter.log("whoah", true);
	}
	
	@Test(invocationCount = -2)						// negative means skip the method
	public void testD()
	{
		Reporter.log("from D", true);
	}
	
//	@Test(invocationCount = 1.5)					// cant pass decimals
	public void testE()
	{
		Reporter.log("eeee" ,  true);
	}

	int b = 2 ;
//	@Test(invocationCount = b)					// cant pass variables
	public void testN()
	{
		
	}
	
	final int a = 5 ;							// can pass constants but not recomended
	@Test(invocationCount = a)						
	public void testF()
	{
		Reporter.log("chashma" , true);
	}

}



