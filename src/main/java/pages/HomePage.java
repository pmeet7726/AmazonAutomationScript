package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	public WebElement homeappliancelink;
	
	@FindBy(id="nav-hamburger-menu")
	public WebElement AllCatagories;
	
	@FindBy(xpath="//div[normalize-space()='Electronics, Computers & Office']")
	public WebElement ElectronicSection;
	
	@FindBy(xpath="//a[normalize-space()='All Electronics']")
	public WebElement ElectronicLink;
	
	
	//a[normalize-space()='All Electronics']
	public HomePage() {
		PageFactory.initElements(driver, this );
	}
	
	public String GetTitle() {
		return driver.getTitle();
	}
	
	public HomeAppliancePage GotoHomeAppliancePage() {
		homeappliancelink.click();
		
		return new HomeAppliancePage();
		
	}
	
	public ElectronicPage GotoElectronicPage() throws InterruptedException {
		AllCatagories.click();
		Thread.sleep(2000);
		ElectronicSection.click();
		Thread.sleep(2000);
		ElectronicLink.click();
		
		return new ElectronicPage();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
