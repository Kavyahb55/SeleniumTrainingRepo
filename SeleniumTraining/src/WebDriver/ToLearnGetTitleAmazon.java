package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitleAmazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(title2.equals("Amazon"))
		{
			System.out.println("Valid login via url");
			
		}
		else {
			System.out.println("Invalid login via url");
			
			
		}

	}

}
