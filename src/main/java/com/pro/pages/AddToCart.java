package com.pro.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends PageBaes {

	WebDriver driver;

	public AddToCart(WebDriver driver) {

		// this.driver = driver;
		super(driver);
	}



	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")

	public WebElement BackPack;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	
	public WebElement AddBackpack;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	
	public WebElement AddBikeLight;
	

	
	
	//@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
	@FindBy(xpath ="//*[@id=\"shopping_cart_container\"]")
	
	public WebElement checkCartvalidation;
	
	
	
	
	
	//List<WebElement> cartItems = driver.findElements(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
	
	
	//@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
	
	//public WebElement chectCart;

	
	


		public void swaglabAddCart() {
			
			
		doclick(AddBackpack, 0);
		doclick(AddBikeLight,0);

	}

		public void TestCartItems() {
			CartValidation(checkCartvalidation);
		
			
		}
	public boolean checkElements() {

		Isdisplayed(BackPack);
		return true;

	}

}
