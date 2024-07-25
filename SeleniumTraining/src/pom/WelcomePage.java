package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//2.initialisation
	public WelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//1.declarartion
	@FindBy(linkText= "Register")
	private WebElement registerLink;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchbutton1;
	

//getters
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getSearchButton() {//from understand stalelementexception clASS
		return searchButton;
	}

	public WebElement getSearchbutton1() {
		return searchbutton1;
	}
	
	
	
	

}
