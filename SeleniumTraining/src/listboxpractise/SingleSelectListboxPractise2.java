package listboxpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListboxPractise2 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		
		//selectbyindex-daydropdown
		WebElement daydd = driver.findElement(By.id("day"));
		Select dayselect=new Select(daydd);
		dayselect.selectByIndex(0);
		List<WebElement> daycount = dayselect.getOptions();
		System.out.println(daycount.size());
		
		
		
		
		//selectbyvisibletext-monthdropdown
		
		WebElement monthdd = driver.findElement(By.id("month"));
		Select monthselect=new Select(monthdd);
		monthselect.selectByVisibleText("Jan");
		List<WebElement> monthcount = monthselect.getOptions();
		System.out.println(monthcount.size());
		
		
		//selectbyvalue-yeardropdown
		WebElement yeardd = driver.findElement(By.id("year"));
		Select yearselect=new Select(yeardd);
		yearselect.selectByValue("2001");
		List<WebElement> yearcount = yearselect.getOptions();
		System.out.println(yearcount.size());
		
		
		
		
		
		


	}

}
