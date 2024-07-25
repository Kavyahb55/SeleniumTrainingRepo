package webdrivermethodspractise;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandlemethod {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");//8B86
		String windoWId = driver.getWindowHandle();
		System.out.println(windoWId);

	}

}
