package dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders2 {
	@DataProvider
	public String[][]data()
	{
		String[][]sarr={ {"abhis1@gmail.com","abhi1"},{"abhi2@gmail.com","abhi2"},{"abhi3@gmail.com","abhi3"}};
				return sarr;
	}
	
	
	@Test(dataProvider = "data")
	public void login(String[]cred) {//local variable to use same variable inside ur method
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys(cred[1]);
	}
	
	

}
