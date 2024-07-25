package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEE2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com");
		//WebElement searchbutton1 = driver.findElement(By.xpath("//input[@value='Search']"));
		//searchbutton1.click();//popupcomes
		//driver.navigate().refresh();//page refreshes
		//searchbutton1.click();//again popup not coming
		//
		
		WelcomePage wp=new WelcomePage(driver);
		wp.getSearchbutton1().click();
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		Thread.sleep(2000);
		wp.getSearchbutton1().click();//run pgm here
		
		
		

		
		
		



	}

}
