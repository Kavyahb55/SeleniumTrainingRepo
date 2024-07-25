package unittestingpractise;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClassPrc {
	
	@Test
	public void addToCart()
	{
		driver.findElement(By.xpath("//input[@value='Add to cart'])[2]"));
		Reporter.log("Product 2 added to art succesfully",true);
	}

}
