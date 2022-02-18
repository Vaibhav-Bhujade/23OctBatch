package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage login;
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initalization();
		login = new LoginPage();
	}
	
	@Test (enabled=true)
	public void validateLoginPageTitleTest()
	{
		String name = login.validateLoginPageTitle();
		AssertJUnit.assertEquals(name, "Kite - Zerodha's fast and elegant flagship trading platform");
	}
	
	@Test (enabled=true)
	public void validateLogoTest()
	{
		boolean value = login.validateLogo();
		AssertJUnit.assertEquals(value, true);
	} 
	
	@Test (enabled=true)
	public void validateLabelTest()
	{
		String label = login.validateLabel();
		AssertJUnit.assertEquals(label, "Login to Kite");
	}
	 
	@Test (enabled=true)
	public void loginZerodhaTest() throws InterruptedException
	{
		login.loginZerodha();
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
}
