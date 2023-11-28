package pagesTest;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

	@Test(enabled = false)
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
	@Test(enabled = false)
	public void assertionTrueFalseofLogoIsDisplayed1() {
		homepage.logoIsDisplayed();
		Assert.assertTrue(false);
		//Assert.assertFalse(false);
	}
	@Test(enabled = false)
	public void assertionTrueFalseofLogoIsDisplayed2() {
		homepage.logoIsDisplayed();
		Assert.assertTrue(false);
		//Assert.assertFalse(false);
}
	@Test(enabled = false)
	public void getTitleNameBySoftAssert() throws InterruptedException {
		//System.out.println("The Title of the page is " + driver.getTitle());
		String actual = driver.getTitle();
		Thread.sleep(3000);
		System.out.println("The title is " + actual);
		String expectedTitle = " Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expectedTitle);
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is" + currentURL);
	    Thread.sleep(3000);

}
	@Test(enabled = false)
	public void getTitleNameByHardAssert() throws InterruptedException {
		//System.out.println("The Title of the page is " + driver.getTitle());
		String actual = driver.getTitle();
		Thread.sleep(3000);
		System.out.println("The title is " + actual);
		String expectedTitle = " Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
		Assert.assertEquals(actual, expectedTitle);
		Thread.sleep(3000);
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is" + currentURL);
		//it fails that is why did not go to next test line-225+226,
		//hard assertion does not allow to go next test if the previous test is fails.
	}
	@Test(enabled = false)
	public void dropdownMethod1() throws InterruptedException {
		driver.navigate().to("https://www.ebay.com/");
	
		//js = (JavascriptExecutor) driver;
		//WebElement click  = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//js.executeScript("arguments[0].click()", click);
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
	
		WebElement all = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		all.click();
		Thread.sleep(3000);
		select = new Select(all);
		Thread.sleep(3000);
		//select.selectByValue("267");
		select.selectByVisibleText("Books");
		Thread.sleep(3000);			
}	

@Test(enabled = true)
public void scrollDownWithExplicitlyWait() throws InterruptedException {
	driver.navigate().to("https://enthrallit.com/");
	Thread.sleep(3000);
	WebElement clickSelenium = driver.findElement(By.linkText("Selenium"));
	
	js.executeScript("arguments[0].click()", clickSelenium);
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0, 1200)", "");
	Thread.sleep(3000);
	WebElement writeText = driver.findElement(By.cssSelector("input.form-control"));
	js.executeScript("arguments[0].value='My Name'", writeText);
	Thread.sleep(3000);
	WebElement hideButton= driver.findElement(By.xpath("//button[@id='formButton']"));
	//WebElement hideButton= driver.findElement(By.cssSelector("div.class"));
	js.executeScript("arguments[0].click()", hideButton);

	wait.until(ExpectedConditions.elementToBeClickable(hideButton));
	Thread.sleep(3000);
}
}