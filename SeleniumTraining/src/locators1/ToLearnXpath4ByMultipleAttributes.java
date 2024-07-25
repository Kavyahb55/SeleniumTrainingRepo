package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath4ByMultipleAttributes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products'and @class=desktop-'SearchBar')]"));

	}

}
