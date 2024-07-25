package locatorspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.name("Email")).sendKeys("testing123@gmail.com");
		
		driver.findElement(By.id("gender-male")).click();

	}

}
