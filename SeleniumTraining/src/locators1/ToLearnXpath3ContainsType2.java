package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath3ContainsType2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]"));

	}

}
