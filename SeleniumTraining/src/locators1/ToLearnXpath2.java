package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();// or below
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();


	}

}
