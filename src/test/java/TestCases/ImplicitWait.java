package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {

	@Test
	public void googleSearch() throws InterruptedException
	{
		System.getProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			

		
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchBar.sendKeys("selenium");
//		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("//li[@role='presentation'][4]"));
		ele.click();
		
		driver.close();
	}
}
