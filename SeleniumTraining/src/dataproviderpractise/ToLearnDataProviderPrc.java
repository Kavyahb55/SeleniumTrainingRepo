package dataproviderpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProviderPrc {
	@DataProvider
	public String[][] data()
	{
		String[][] sarr={{"abhis1234@gmail.com","jack123"}, {"abhis9876@gmail.com","will123"}};
		return sarr;
	}
	
		@Test(dataProvider = "data")
	public void login(String[]cred)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricents.com");
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys();
		
		
	}

}
