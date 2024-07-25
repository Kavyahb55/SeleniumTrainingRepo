package unittestingpractise;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsPrc {
	@Test
	public void register()
	
	{
		Assert.fail();
		Reporter.log("user registered successfully",true);
		


	}
	
	@Test(dependsOnMethods = "register")
	public void login()
	{
		Reporter.log("user loggerdin successfully",true);
	}
	
	
	
	

}
