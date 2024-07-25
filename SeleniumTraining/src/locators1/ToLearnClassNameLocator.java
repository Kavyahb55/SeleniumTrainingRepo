package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		driver.findElement(By.className("text-box single-line")).sendKeys("testingggggg");

	}

}
