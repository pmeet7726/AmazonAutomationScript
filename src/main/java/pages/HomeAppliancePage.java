package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class HomeAppliancePage extends TestBase {
	
	@FindBy(xpath="//img[@alt='Space Heaters']")
	public WebElement heaterelement;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[3]")
	public WebElement energyefficientheater;
	
	@FindBy(css="span#B0B6ZXPRTP-amazons-choice-label")
	public WebElement spaceheater;

	@FindBy(id="add-to-cart-button")
	public WebElement addtocart;
	

	
	public HomeAppliancePage() {
		PageFactory.initElements(driver, this );
		
	}
	
	public void AddToCartHeater() {
		heaterelement.click();
		energyefficientheater.click();
		spaceheater.click();
		addtocart.click();
		
		
	}
	
	
	
	

}
