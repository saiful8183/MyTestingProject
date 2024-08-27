 package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutStepTwo  extends PageBaes {

	WebDriver driver;

	public CheckOutStepTwo(WebDriver driver) {

		// this.driver = driver;
		super(driver);
	}


	
	
	
	
	
	@FindBy(xpath = "//div[@class='summary_total_label']")

		public WebElement totalPrice;
	
	
	@FindBy(xpath = "//*[@id=\"finish\"]")
	
	public WebElement Finish;
	



public void PriceValidation() {
	CartCheck(totalPrice);
	
	
}

public void finish() {
	
	doclick(Finish,2);
	
	
}



}





