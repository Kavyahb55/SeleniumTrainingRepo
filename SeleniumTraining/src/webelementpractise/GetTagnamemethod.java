package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagnamemethod {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String tagname = driver.findElement(By.name("q")).getTagName();	
		System.out.println(tagname);

	}

}
