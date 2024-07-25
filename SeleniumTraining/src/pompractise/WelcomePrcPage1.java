package pompractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePrcPage1 {
		
	//2.initialization
	public WelcomePrcPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);		

	}
	//1.declarization
		@FindBy(linkText="Register")
		private WebElement registerLink;
		
		@FindBy(xpath = "//input[@value='Search']")
		private WebElement searchButton;
		

	public WebElement getSearchButton() {
			return searchButton;
		}


	//3.generate getters
	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	

	
	

}
