package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentURL {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.instagram.com/"))
		{
			System.out.println("User navigated correctly");

		}
		else {
			System.out.println("User failed to navigate");
			
			
		}
		

	}

}
