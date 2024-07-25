package locatorspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbydependentandindependentattribute {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com");
		driver.findElement(By.xpath("(//span[text()='footwear'])[1]/../..//button[text()='add to cart']")).click();

	}

}
