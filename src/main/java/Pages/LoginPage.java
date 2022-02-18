package Pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	//Object Repository
	@FindBy(xpath="//input[@id='userid']") private WebElement userIDTextbox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath="//img[@alt='Kite']") private WebElement logo;
	@FindBy(xpath="//h2[text()='Login to Kite']") private WebElement label;
	@FindBy(xpath="//input[@label='PIN']") private WebElement pinTextbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueBtn;
	
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();	//return the title of web application
	}
	
	public String validateLabel()
	{
		return label.getText();
	}
	
	public boolean validateLogo()
	{
		return logo.isDisplayed();			// It return boolean value
	}
	
	public void loginZerodha() throws InterruptedException
	{
		userIDTextbox.sendKeys(prop.getProperty("username"));
		passwordTextbox.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		Thread.sleep(1000);
		pinTextbox.sendKeys(prop.getProperty("pin"));
		continueBtn.click();
		Thread.sleep(2000);		
	}

}
