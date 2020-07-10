package testNg_25;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parameter 
{
	
	// we cant create parametarised method in testng without @parameter
	
	@Test
	public void CreateUser(String un, String pw)
	{
		Reporter.log("user is created" , true);
	}
	
	


}
