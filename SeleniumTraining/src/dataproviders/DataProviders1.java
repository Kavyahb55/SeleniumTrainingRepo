package dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders1 {
	@DataProvider
	public String[][]data(){
	String[][]sarr={ {"abhis1234@gmail.com","abhis@123"},{"testing123@gmail.com","testing@123"}};
	return sarr;
	}
	@Test(dataProvider = "data")
	public void Login(String[]cred) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.id("Email")).sendKeys(cred[0]);
	driver.findElement(By.id("Password")).sendKeys(cred[1]);
	
	

}
}	
