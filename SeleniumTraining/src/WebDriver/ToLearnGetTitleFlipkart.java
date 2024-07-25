package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitleFlipkart {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String title1 = driver.getTitle();
		System.out.println("title1");
		
		if(title1.equals("flipkart"))
			
			
		{
			System.out.println("User logged into webpage");
		}
		else {
			System.out.println("Invalid login");
			
		}
		
	}
}
			
			
			
		