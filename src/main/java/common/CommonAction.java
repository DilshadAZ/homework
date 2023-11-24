package common;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class CommonAction {

	public static void inputElement(WebElement element, String input) {
		try {
			element.sendKeys(input);
		} catch (NoSuchElementException | NullPointerException e) {
			System.out.println("Exception is: " + e);
		}
	}

	public static void clickElement(WebElement element) {
		try {
			element.click();
		} catch (NoSuchElementException | NullPointerException f) {
			f.printStackTrace();

		}
	}
}