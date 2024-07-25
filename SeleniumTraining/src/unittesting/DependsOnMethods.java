package unittesting;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void register()
	{
		Assert.fail();
		Reporter.log("user registered successfully",true);
		
				
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
	Reporter.log("user logged in succesfully",true);
	
	//testcase run=2,failure=1,skip=1

		
}
}


