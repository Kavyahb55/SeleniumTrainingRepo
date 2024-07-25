package actionspractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAandHold {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi/login/yunobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("kavya");
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword showhidden]"));
		Actions act=new Actions(driver);
		act.clickAndHold(eyeIcon).perform();



	}

}
