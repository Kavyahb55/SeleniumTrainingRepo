package webdrivermethodspractise;

import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");

	}

}
