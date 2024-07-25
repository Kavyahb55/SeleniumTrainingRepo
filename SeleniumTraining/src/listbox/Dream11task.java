package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dream11task {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.dream11.com/");
	WebElement task = driver.findElement(By.id("regEmail"));
	Select dream=new Select(task);
	dream.selectByVisibleText("Please enter a valid 10 digit mobile number.");
	System.out.println(task.getText());
	

	}

}
