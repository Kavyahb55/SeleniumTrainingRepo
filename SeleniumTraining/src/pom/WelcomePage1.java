package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//repository class
public class WelcomePage1 {
	//initialisation
	public WelcomePage1(WebDriver driver) {
		PageFactory.initElements(driver, this );
		
		}
		
		

	//3.getters
	public WebElement getRegisterLink() {
		return registerLink;
	}

	//1.declare
	@FindBy(linkText="Register")
	private WebElement registerLink;

		

	


}
