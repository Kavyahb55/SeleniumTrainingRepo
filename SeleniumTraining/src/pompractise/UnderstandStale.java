package pompractise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandStale {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		  
	// WebElement searchButton = driver.findElement(By.id("small-searchterms"));
	// searchButton.click();
	 //driver.navigate().refresh();
	// searchButton.click();
		
		WelcomePrcPage1 wpp=new WelcomePrcPage1(driver);
		wpp.getSearchButton().click();
	Alert alert = driver.switchTo().alert();
	 alert.accept();
	 //or driver.switchto().alert().accept();this also works fine
				Thread.sleep(3000);
		driver.navigate().refresh();
		wpp.getSearchButton().click();
		
		
	 
	 
		

	}

}
