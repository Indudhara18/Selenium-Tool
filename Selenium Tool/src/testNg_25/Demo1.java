package testNg_25;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void testA()
	{
		System.out.println("from testA()");		// only on console
	}
	
	@Test
	public void testB()
	{
		Reporter.log("from testB()" );			// only on report
	}
	
	@Test
	public void testC()
	{
		Reporter.log("from testC()" , true);			// both console and report
	}	
	
	@Test
	public void testD()
	{
		Assert.fail();
		Reporter.log("from testD()" , true);
	}
}
