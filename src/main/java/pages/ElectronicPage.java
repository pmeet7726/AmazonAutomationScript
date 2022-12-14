package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class ElectronicPage extends TestBase{
	
	@FindBy(xpath="//span[@id='B07XVFB67J-amazons-choice-label']")
	public WebElement wirelessspeaker;
	
	@FindBy(css="div.s-suggestion-container")
	public List<WebElement> Options;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement Navsearch;
	
	@FindBy(id="add-to-cart-button")
	public WebElement addtocart;
	
	
	
	
	public ElectronicPage() {
		PageFactory.initElements(driver, this );
	}
	
	public void ProductSearch(String Search, String Product) throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(Navsearch).click().sendKeys(Search).build().perform();
		Thread.sleep(2000);
		for(WebElement Option:Options)
		{
			if(Option.getText().equalsIgnoreCase(Product))
			{
				Option.click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	
	public void AddToCartSpeaker() {
		wirelessspeaker.click();
		addtocart.click();
	}

}
