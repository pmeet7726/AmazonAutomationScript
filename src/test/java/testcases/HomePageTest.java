package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;
import testdata.DataFile;

public class HomePageTest extends TestBase{
	
	LoginPage lp;
	HomePage hp;
	
	DataFile df = new DataFile();
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		lp = new LoginPage();
		hp = lp.LoginTest(df.Username, df.Password);
	}
	
	@Test(priority = 1)
	public void verifyTitle() {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, df.ExpectedHomePageTitle);
	}
	
	@Test(priority = 2)
	public void HomeAppliancePage() {
		hp.GotoHomeAppliancePage();
		
	}
	
	
	
	
	@Test(priority = 3)
	public void Electronic() throws InterruptedException {
		hp.GotoElectronicPage();
	}
	
	@AfterMethod
	public void CloseBrowser() {
		
		driver.quit();
	}

}
