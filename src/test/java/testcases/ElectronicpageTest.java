package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ElectronicPage;
import pages.HomeAppliancePage;
import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;
import testdata.DataFile;

public class ElectronicpageTest extends TestBase{
	
	LoginPage lp;
	HomePage hp;
	HomeAppliancePage ha;
	ElectronicPage ep;
	
	DataFile df = new DataFile();
	
	public ElectronicpageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		initialization();
		lp = new LoginPage();
		hp = lp.LoginTest(df.Username, df.Password);
		ep = hp.GotoElectronicPage();
		
	}

	@Test
	public void AddToCartspeaker() throws InterruptedException {
		ep.ProductSearch(df.Searchvalue, df.ClickSearchValue);
		ep.AddToCartSpeaker();
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
}
