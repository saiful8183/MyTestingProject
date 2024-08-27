package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBaes {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		// this.driver = driver;
		super(driver);
	}

	@FindBy(xpath = "//input[@id='user-name']")

	public WebElement User;

	@FindBy(xpath = "//input[@id='password']")

	public WebElement Pass;

	@FindBy(xpath = "//input[@id='login-button']")

	public WebElement loginBtn;

	public void swaglabUserPass(String user, String pass) {

		type(User, user);

		type(Pass, pass);

	}

	public void swaglablogin() {

		doclick(loginBtn, 5);

	}

}

