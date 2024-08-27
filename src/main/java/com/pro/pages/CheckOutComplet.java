package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutComplet extends PageBaes {

	WebDriver driver;

	public CheckOutComplet(WebDriver driver) {

		// this.driver = driver;
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"back-to-products\"]")

	public WebElement BackHome;

	public void backHome() {

		doclick(BackHome, 3);

	}

}
