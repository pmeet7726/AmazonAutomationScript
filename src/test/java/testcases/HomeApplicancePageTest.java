package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomeAppliancePage;
import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;
import testdata.DataFile;

public class HomeApplicancePageTest extends TestBase {
	
	LoginPage lp;
	HomePage hp;
	HomeAppliancePage ha;
	DataFile df = new DataFile();
	
	
	public HomeApplicancePageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialization();
		lp = new LoginPage();
		hp = lp.LoginTest(df.Username, df.Password);
		ha = hp.GotoHomeAppliancePage();
	}
	
	@Test(priority = 1)
 	public void AddToCart() {
		ha.AddToCartHeater();
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}

}
