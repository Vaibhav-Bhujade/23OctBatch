package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
	@Test (enabled = false)
	public void method1() throws InterruptedException
	{
		WebElement alertOpenBtn = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		alertOpenBtn.click();
//		Thread.sleep(7000);
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		w1.until(ExpectedConditions.alertIsPresent());
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	@Test (enabled = false)
	public void method2()
	{
		WebElement changeTextBtn = driver.findElement(By.xpath("//button[@id='populate-text']"));
		changeTextBtn.click();
		WebElement siteLabel = driver.findElement(By.xpath("//h2[@class='target-text']"));
		WebDriverWait w2 = new WebDriverWait(driver, 10);
		w2.until(ExpectedConditions.textToBePresentInElement(siteLabel, "Selenium Webdriver"));
	}
	
	
	@Test (enabled = false)
	public void method3()
	{
		WebElement displayBtn = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		displayBtn.click();
		WebElement hiddenBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
		WebDriverWait w3 = new WebDriverWait(driver, 10);
		w3.until(ExpectedConditions.visibilityOfAllElements(hiddenBtn));
	}
	
	@Test (enabled = false)
	public void method4()
	{
		WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enable-button']"));
		enableBtn.click();
		WebElement disbleBtn = driver.findElement(By.xpath("//button[@id='disable']"));
		WebDriverWait w3 = new WebDriverWait(driver, 10);
		w3.until(ExpectedConditions.elementToBeClickable(disbleBtn));
	}
	
	@Test (enabled = true)
	public void method5()
	{
		WebElement checkboxBtn = driver.findElement(By.xpath("//button[@id='checkbox']"));
		checkboxBtn.click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebDriverWait w3 = new WebDriverWait(driver, 10);
		w3.until(ExpectedConditions.elementToBeSelected(checkbox));
	}
}
