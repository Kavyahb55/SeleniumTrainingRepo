package synchronisation;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Implicitwait {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://instagram.com/");
		
		//on user name text field	
		
		driver.findElement(By.name("username")).sendKeys("solosolid");
		



	}

}
