package unittesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

//class for second testscript-add to cart
public class TC_DWS_002conf extends BaseClass {
	@Test//you have to run pgm where 2test is present
	public void addProduct()
	{
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Reporter.log("product added to cart successfully",true);
	}
	

}
