package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase {

	DashboardPage dash;
	LoginPage login;
	
	public DashboardPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initalization();
		login = new LoginPage();
		dash = new DashboardPage();
		login.loginZerodha();
	}
	
	@Test (enabled = false)
	public void validateNicknameTest()
	{
		String nickname = dash.validateNickname();
		AssertJUnit.assertEquals(nickname, "Rohit");
	}
	
	@Test (enabled = false)
	public void validateProfileNameTest() throws InterruptedException
	{
		String name = dash.validateProfileName();
		AssertJUnit.assertEquals(name, "Rohit Ram Jagdale");
	}
	
	@Test (enabled = true)
	public void validateEmailIDTest() throws InterruptedException
	{
		String name = dash.validateEmailID();
		AssertJUnit.assertEquals(name, "rohitjagdale24@gmail.com");
	}
	
	@Test  (enabled = false)
 	public void buyShareTest() throws InterruptedException
	{
		dash.buyShare();
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
