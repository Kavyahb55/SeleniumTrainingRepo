package dataproviders;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataProviders {
	@DataProvider
	public String[][] data() {
		String [][]sarr={ {"abhis1243@gmail.com","abhis@1234"},{"testing123@gmail.com","test@123"}};
	
		return sarr;
		}
		
	
	
	
		@Test(dataProvider = "data")
	public void login(String[] cred) //local variable to use same variable inside ur method
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.id("Email")).sendKeys(cred[0]);
	driver.findElement(By.id("Password")).sendKeys(cred[1]);
	}
	
	
	
	
	
	

}
