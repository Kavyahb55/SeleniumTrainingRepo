package pompractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPrcPage {
	//2.initialization
	
	public RegisterPrcPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
				
	}
	//1.declaration 
	@FindBy(id = "FirstName")
	private WebElement firstNameTextfield;
	
	@FindBy(name = "LastName")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextField;
	
//3.generate getters
	
	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

}
