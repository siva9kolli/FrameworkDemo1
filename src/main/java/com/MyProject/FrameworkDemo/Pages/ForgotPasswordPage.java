package com.MyProject.FrameworkDemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	public HomePage homePage;
	
	public ForgotPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		homePage = new HomePage(driver);
	}
	
	@FindBy(xpath = "//h1[text()='Customer Lookup']")
	private WebElement customerLookUpHeading;
	

	@FindBy(xpath = "//input[@value='Find My Login Info' and @class='button']")
	private WebElement loginInfoButton;
	
	
	public boolean isDisplayedCustomerLookUpHeading() {
		homePage.getLink().isDisplayed();
		return customerLookUpHeading.isDisplayed();
	}
	
}
