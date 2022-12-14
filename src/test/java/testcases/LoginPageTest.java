package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;
import testdata.DataFile;

public class LoginPageTest extends TestBase{
	
	LoginPage lp;
	HomePage hp;
	DataFile df = new DataFile();
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialization();
		lp = new LoginPage();
	}
	
	@Test(priority = 1)
	public void GetTitle() {
		String Title = lp.ValidateTitleOfPage();
		Assert.assertEquals(Title, df.ExpectedLoginpageTitle);
		System.out.println(Title);
	}
	
	@Test(priority = 2)
	public void Login() {
		hp = lp.LoginTest(df.Username, df.Password);
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}

}
