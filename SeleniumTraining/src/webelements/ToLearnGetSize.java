package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Dimension dimension = driver.findElement(By.id("Email")).getSize();
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());

	}

}
