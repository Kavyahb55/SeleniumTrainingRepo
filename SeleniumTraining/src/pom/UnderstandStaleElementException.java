package pom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandStaleElementException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com");
		
		//WebElement searchbtn = driver.findElement(By.id("small-searchterms"));
		//searchbtn.click();
		//driver.navigate().refresh();
		//searchbtn.click();//if you run you get staleelementexception
		
		WelcomePage wp=new WelcomePage(driver);
		wp.getSearchButton().click();
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		Thread.sleep(2000);
		wp.getSearchButton().click();//popupcomes page refresh again popup comes-yes!!!!!!!!!!!!!!!!!!!
		
		

	}

}
