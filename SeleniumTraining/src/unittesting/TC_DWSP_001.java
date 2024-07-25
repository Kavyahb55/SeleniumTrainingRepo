package unittesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWSP_001 {//testng class
	@Test
	public void test()
	{
		
		Reporter.log("test executing...");
	}


			
	
	@Test//testcase
		public void demo()
	
	{
		//test step
		Reporter.log("demo executing...",true);
			}

}
