package pages;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonAction.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='onlineId1']")
	WebElement inputTextInUserID;
	@FindBy(xpath = "//input[@id='passcode1']")
	WebElement inputPassword;
	@FindBy(xpath = "//div[@class='main-nav-top-logo']")
	WebElement clickLogInButton;
	@FindBy(xpath = "//img[@itemprop='logo']")
	WebElement logoOfBOA;

	public void inputTextInUserIDfield() {
		inputTextInUserID.sendKeys("D GYg");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void inputPasswordInField() {
		inputPassword.sendKeys("GBHB1234");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickLogInButton() {

		clickLogInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void inputUserIDAndPassInField() throws InterruptedException {
		inputElement(inputTextInUserID, "DDD RRR");
		inputElement(inputPassword, "76hyj8");
		Thread.sleep(3000);
		clickElement(clickLogInButton);
		Thread.sleep(3000);
	}
	public boolean logoIsDisplayed() {
	
	return logoOfBOA.isDisplayed();
			
	}
}