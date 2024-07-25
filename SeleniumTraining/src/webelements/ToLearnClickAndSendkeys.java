package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClickAndSendkeys {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.className("//input[@value='Search store']")).sendKeys("mobiles",Keys.ENTER);
	
	}

}
