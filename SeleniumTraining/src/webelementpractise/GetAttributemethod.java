package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributemethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(20000);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String value = driver.findElement(By.xpath("//input[@value='Search']")).getAttribute("class");
		System.out.println(value);
	}

}
