package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dumm {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");	
		 boolean check = driver.findElement(By.xpath("//options[@value='199']")).isSelected();
		 System.out.println(check);
	}

}
