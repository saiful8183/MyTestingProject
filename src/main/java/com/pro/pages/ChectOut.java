package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChectOut extends PageBaes {

	WebDriver driver;

	public ChectOut(WebDriver driver) {

		// this.driver = driver;
		super(driver);
	}

	


	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	

	public WebElement chectCart;

	@FindBy(xpath = "//button[@id='checkout']")

	public WebElement chectout;

	
	




	public void swaglabCheckoutCart() {

		doclick(chectCart, 0);
		doclick(chectout, 0);

		

	}


}
