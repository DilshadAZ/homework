package pagesTest;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import org.testng.annotations.Test;

import baseUtil.BaseClass;



public class HomePageTest extends BaseClass {
	@Test(enabled = false)
	public void inputTextInUserIDFieldTest() {
		homepage.inputTextInUserIDfield();
	}

	@Test(enabled = false)
	public void inputPasswordTest() {
		homepage.inputPasswordInField();
	}

	@Test(enabled = false)
	public void clickLogInButtonTest() {
		homepage.clickLogInButton();
	}

	@Test(enabled = false)
	public void inputUserIDAndPassInFieldTest() throws InterruptedException {
		homepage.inputUserIDAndPassInField();
	}

//StreamWriting methodStreamWriting and run from the same homePageTest

	@Test(enabled = false)
	public void openAnAccount() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='open']")).click();
		Thread.sleep(3000);

	}

	@Test(enabled = false)
	public void clcikForgotIDandPass() throws InterruptedException {
		driver.findElement(By.linkText("Forgot ID/Password?")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = false)

	public void inputUserIDandPasswordandClickLogin2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='onlineId1']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='onlineId1']")).sendKeys("ABG GYGY");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='onlineId1']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='onlineId1']")).sendKeys("Alley Bis");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='passcode1']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='passcode1']")).sendKeys("ABG12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='passcode1']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='passcode1']")).sendKeys("alley0012345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='saveOnlineId']")).isSelected();
		driver.findElement(By.xpath("//input[@id='saveOnlineId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Log In']")).isEnabled();
		WebElement loginButtonElement = driver.findElement(By.xpath("//span[text()='Log In']"));
		System.out.println("The name of login button is " + loginButtonElement.getText());

		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void getTitleName() {
		System.out.println("The Title of the page is " + driver.getTitle());
	}

	@Test(enabled = false)
	public void getCurrentTitle() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='open']")).click();
		Thread.sleep(3000);
		System.out.println("The current url is " + driver.getCurrentUrl());
		System.out.println("The current url is " + driver.getTitle());
	}

	@Test(enabled = false)
	public void clickForgotPasswordByUsingOfEnterKeyFromLaptop() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(@id, 'forgot-oid-pwd')]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='acctNumber']")).sendKeys("asg677", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ssNumber']")).sendKeys("0677", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@id,'verifyCustomerAccount')]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// line-94, we can use Keys.Enter instead of Click
	}

	@Test(enabled = false)
	public void useOfNavigator() throws InterruptedException {
		driver.navigate().to("https://promo.bankofamerica.com/hp-oaa2/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void sizeOfTheWindow() throws InterruptedException {
		System.out.println("The size of the window is " + driver.manage().window().getSize());
		Thread.sleep(3000);
		dimension = new org.openqa.selenium.Dimension(1000, 800);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		System.out.println("The set size of the window is " + driver.manage().window().getSize());
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void anotherDimensionWithNavigation() throws InterruptedException {
		System.out.println("The size of the window is " + driver.manage().window().getSize());
		Thread.sleep(3000);
		dimension = new org.openqa.selenium.Dimension(900, 700);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);

		System.out.println("The size of the window is " + driver.manage().window().getSize());
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com/ref=nav_logo");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		System.out.println("The set size of the window is " + driver.manage().window().getSize());
		Thread.sleep(3000);
		dimension2 = new org.openqa.selenium.Dimension(1200, 800);
		driver.manage().window().setSize(dimension2);
		Thread.sleep(3000);

		System.out.println("The set size of the window is " + driver.manage().window().getSize());
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void mouseHooverAction() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com/ref=nav_logo");
		// Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ourLocatioElement = driver.findElement(By.id("nav_link_allhealthingress"));
		Thread.sleep(3000);
		actions.moveToElement(ourLocatioElement).build().perform();
		Thread.sleep(2000);
		// Line-152, WebElement canElement use Thread.sleep as well.
	}

	@Test(enabled = false)

	public void useOfJavaScriptToClickMethod() throws InterruptedException {

		WebElement forgetpass = driver.findElement(By.xpath("//a[@id='forgot-oid-pwd']"));
		js.executeScript("arguments[0].click()", forgetpass);
		Thread.sleep(3000);
	}

	@Test(enabled = true)
	public void usingJavaScriptForSendKeysAndClickInLogIn() throws InterruptedException {
		Thread.sleep(3000);

		WebElement id = driver.findElement(By.xpath("//input[@id='onlineId1']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='passcode1']"));
		WebElement click = driver.findElement(By.xpath("//input[@id='saveOnlineId']"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@id='signIn']"));

		js.executeScript("arguments[0].value='My NAme'", id);
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='asg677'", pass);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", click);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", loginbutton);
		Thread.sleep(3000);

	}

}
