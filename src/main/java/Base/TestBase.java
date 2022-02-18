package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
	{
		prop = new Properties();
		//It is used to access the Config.properties file in our script
		FileInputStream ip = new FileInputStream("/Users/Zenith/eclipse-workspace/FrameWork23Oct/src/main/java/Config/Config.properties");
		prop.load(ip);
	}
	
	
	public static void initalization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver(options);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
}
