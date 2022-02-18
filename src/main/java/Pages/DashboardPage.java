package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {

	@FindBy (xpath="//span[@class='nickname']") private WebElement nicknameLabel;
	@FindBy (xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy (xpath="//h4[@class='username']") private WebElement usernameLabel;
	@FindBy (xpath="//div[@class='email']") private WebElement email;
	
	@FindBy (xpath="//input[@icon='search']") private WebElement searchBar;
	@FindBy (xpath="//span[@class='tradingsymbol']") private WebElement selectShare;
	@FindBy (xpath="//button[@class='button-blue']") private WebElement buyBtnSearchBar;
	@FindBy (xpath="//input[@label='Qty.']") private WebElement quantityTextbox;
	@FindBy (xpath="//input[@label='Price']") private WebElement priceTextbox;
	@FindBy (xpath="//button[@type='submit']//span[text()='Buy']") private WebElement BuyBtn;
	@FindBy (xpath="//button[@class='button-outline cancel']") private WebElement CancelBtn;
	@FindBy (xpath="//label[@class='su-switch-control']") private WebElement toggleBtn;
	
	
	public DashboardPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String validateNickname()
	{
		return nicknameLabel.getText();
	}
	
	public String validateProfileName() throws InterruptedException
	{
		userID.click();
		Thread.sleep(1000);
		return usernameLabel.getText();
	}
	
	public String validateEmailID() throws InterruptedException
	{
		userID.click();
		Thread.sleep(1000);
		return email.getText();
	}
	
	public void buyShare() throws InterruptedException
	{
		searchBar.sendKeys("TCS");
		Actions a = new Actions(driver);
		a.moveToElement(selectShare).build().perform();
		buyBtnSearchBar.click();
		Thread.sleep(1000);
		quantityTextbox.clear();
		quantityTextbox.sendKeys("10");
		priceTextbox.clear();
		priceTextbox.sendKeys("3400");
		Thread.sleep(5000);
		toggleBtn.click();
		Thread.sleep(5000);
		CancelBtn.click();
		Thread.sleep(5000);	
	}
	
	
	
}
