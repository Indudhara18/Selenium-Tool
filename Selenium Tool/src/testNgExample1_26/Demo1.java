package testNgExample1_26;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends BaseTest
{	//  Here Demo1 extends BaseTest and BaseTest as 8 methods but not @Test method
	// so only 1 runnable method that is @Test method
	
	@Test
	void test_A()
	{
		Reporter.log("Test NG by IDG" , true);
	}
	
}
