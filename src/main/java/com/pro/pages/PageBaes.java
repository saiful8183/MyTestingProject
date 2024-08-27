package com.pro.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageBaes {

	WebDriver driver;

	public PageBaes(WebDriver driver) {

		this.driver = driver;

	}

	public void doclick(WebElement elemnet, int waitTime) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));

		wait.until(ExpectedConditions.elementToBeClickable(elemnet)).click();
	}

	public WebElement waitForElement(WebElement elemnet, int waitTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
		return wait.until(ExpectedConditions.elementToBeClickable(elemnet));

	}

	public void type(WebElement element, String text) {

		element = waitForElement(element, 10);
		element.click();
		element.clear();
		element.sendKeys(text);

	}

	public void selectFromDropDown(WebElement element, String text) {

		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	public void MouseOverAction(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();

	}

	public void CartValidation(WebElement element) {

		System.out.println(element.getText());

		int expected = 2;

		String actual = element.getText();

		// String price = actual.substring(8);

		
		int ActualPrice = ItemConverter(actual);

		// Assert.assertTrue(ActualPrice == expect);

		Assert.assertEquals(ActualPrice, expected);

	}

	public void CartCheck(WebElement element) {

		// System.out.println(element.getText());

		double expect = 43.18;

		String actual = element.getText();

		String price = actual.substring(8);

		System.out.println(price);
		double ActualPrice = PriceConverter(price);

		// Assert.assertTrue(ActualPrice == expect);

		Assert.assertEquals(ActualPrice, expect);

	}

	public int ItemConverter(String item) {

		int converttoInt = Integer.parseInt(item);

		return converttoInt;

	}

	public double PriceConverter(String price) {

		double converttoInt = Double.parseDouble(price);

		return converttoInt;

	}

	public void Isdisplayed(WebElement element) {
		element.isDisplayed();

	}

}
