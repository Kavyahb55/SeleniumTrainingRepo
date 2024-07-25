package javascriptexecutorpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidenelementPrc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://facebook.com/signup");
	WebElement customGender = driver.findElement(By.name("sex"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguements[0].value='transgender life is tough'","customGender");

	}

}
