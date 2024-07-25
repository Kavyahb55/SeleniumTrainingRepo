package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.linkText("https://www.oracle.com/in/java/technologies/downloads/")).click();
		//doubt
		driver.findElement(By.linkText(")



	}

}
