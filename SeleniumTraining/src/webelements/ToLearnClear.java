package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement usernameTF = driver.findElement(By.name("username"));
		usernameTF.sendKeys("TESTING");
		usernameTF.clear();
		
		


	}

}
