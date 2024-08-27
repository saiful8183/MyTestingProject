package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPageStepOne extends PageBaes {

	WebDriver driver;

	public CheckOutPageStepOne(WebDriver driver) {

		// this.driver = driver;
		super(driver);
	}

	@FindBy(xpath = "//input[@id='first-name']")

	public WebElement firstName;

	@FindBy(xpath = "//input[@id='last-name']")

	public WebElement lastName;

	@FindBy(xpath = "//input[@id='postal-code']")

	public WebElement zipCode;

	@FindBy(xpath = "//input[@id='continue']")

	public WebElement Continue;

	public void checkoutInformation(String Firstname, String Lastname, String ZipCode) {

		type(firstName, Firstname);
		type(lastName, Lastname);
		type(zipCode, ZipCode);

	}

	public void clickContinue() {

		doclick(Continue, 1);

	}


}
