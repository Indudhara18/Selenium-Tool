package testNg_25;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods 
{
	@Test(priority=0)
	void createUser()
	{
		Assert.fail();
		Reporter.log("User is created" , true);
	}
	
	@Test(priority=1 ,   dependsOnMethods = "createUser")
	void editUser()
	{
		Reporter.log("User is edited" , true);
	}
	
	@Test(priority=2 , dependsOnMethods = "editUser" )
	void deleteUser()
	{
		Reporter.log("User is deleted" , true);
	}
		
}
// no need to add any tagname in xml file