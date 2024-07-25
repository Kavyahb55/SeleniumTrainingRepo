package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSizeAss {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Dimension size = driver.findElement(By.className("button-1 search-box-button")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}

}
