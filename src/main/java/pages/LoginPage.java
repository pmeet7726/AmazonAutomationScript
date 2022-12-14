package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase{
	
	

	@FindBy(id="ap_email")
	public WebElement email;
	
	@FindBy(id="continue")
	public WebElement continuebutton;
	

	@FindBy(id="ap_password")
	public WebElement passwordelement;
	
	@FindBy(id="signInSubmit")
	public WebElement button;
	
	public LoginPage() {
		super();
		PageFactory.initElements(driver, this );
	}
	
	public String ValidateTitleOfPage() {
		return driver.getTitle();
	}
	
	
	public HomePage LoginTest(String UserName, String Password) {
		email.sendKeys(UserName);
		continuebutton.click();
		passwordelement.sendKeys(Password);
		button.click();
		
		return new HomePage();
	}
}
