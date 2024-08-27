package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageToHomePage extends PageBaes {

	WebDriver driver;

	public LoginPageToHomePage(WebDriver driver) {

		// this.driver = driver;
		super(driver);
	}


	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")

	public WebElement BackPack;

	
	

	public boolean checkElements() {

		Isdisplayed(BackPack);
		return true;

	}

}
