package testNg_25;

import org.seleniumhq.jetty9.util.thread.TryExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnGroups 
{
	// parent method
	@Test(dependsOnGroups = "check")
	public void test_Createuser()
	{
		Reporter.log("user is created" , true);		
	}
	
	// dependent method
	@Test(dependsOnMethods = "test_Createuser")
	public void test_Edituser()
	{	
		//Assert.fail();
		Reporter.log("user is edited", true);
	}
	
	// dependent method
	@Test(dependsOnMethods = "test_Edituser")
	public void test_Deleteuser()
	{
		Reporter.log("user is deleted", true);
	}
	
	// parent group
	@Test(groups = "check")
	public void test_Login()
	{
		Reporter.log("Login in fine" , true);
	}
}
