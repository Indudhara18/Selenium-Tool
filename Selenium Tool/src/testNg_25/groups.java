package testNg_25;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groups 
{
	@Test(priority = 1, groups = {"INTIGRATIONtesting" , "a"})
	void editUser()
	{
		Reporter.log("user is edited" , true);
	}
	
	@Test( groups = "INTIGRATIONtesting" )
	void CreateUser()
	{
		Reporter.log("user is created" , true);
	}
	
	
	@Test(priority = 2 , groups = "SYSTEMtesting" )
	void deleteUser()
	{
		Reporter.log("user is deleted" , true);
	}
	
}
// add groups tagname in xml
// create xml file and add 