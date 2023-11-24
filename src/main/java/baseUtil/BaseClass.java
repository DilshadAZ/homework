package baseUtil;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

public class BaseClass {
public WebDriver driver;
public HomePage homepage;
Configuration configuration;
public Dimension dimension;
public Dimension dimension2;
public Actions actions;
public JavascriptExecutor js;

	

	@BeforeMethod
	public void setUp() {
		configuration = new Configuration();
		initDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(configuration.getProperties(URL));
		long pageLoadWait =  Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long implicitlyWait = Long.parseLong(configuration.getProperties(EXPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		initClass();
		actions = new Actions(driver);
		js = (JavascriptExecutor) driver;
		
	}	
	public void initDriver() {
		String browerName = configuration.getProperties(BROWSER); //"browser"
		switch (browerName) { 
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
		default:
			System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver.exe");	
			driver = new ChromeDriver();
			break;
		}
	}

	public void initClass() {
		homepage = new HomePage(driver);
	}
	
	@AfterMethod
	//aftermethod TestNG annotation
	public void tearUp() {
		driver.quit();
	}
}
