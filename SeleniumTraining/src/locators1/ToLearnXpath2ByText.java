package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath2ByText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		//driver.findElement(By.xpath("//span[text()='Wishlist']"));

	}

}
