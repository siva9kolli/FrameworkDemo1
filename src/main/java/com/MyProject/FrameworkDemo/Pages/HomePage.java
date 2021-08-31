package com.MyProject.FrameworkDemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyProject.FrameworkDemo.CommonActions;

public class HomePage {
	 WebDriver driver;
	public CommonActions commonActions;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		commonActions = new CommonActions();
	}
	
	@FindBy(name = "username")
	WebElement usernameInputbox;
	
	@FindBy(css = "input[type='password']") 
	WebElement passwordInputbox;
	
	@FindBy(xpath = "//input[@value='Log In']") 
	WebElement loginButton;
	
	@FindBy(css = "a[href='lookup.htm']")
	private WebElement forgotPasswordLink;
	
	
	
	public void login(String userName, String password) {
		commonActions.typeInInputBox(usernameInputbox, userName);
		commonActions.typeInInputBox(passwordInputbox, password);
		commonActions.clickOnElement(loginButton);
		
	}
	
	public WebElement getLink() {
		return forgotPasswordLink;
	}
	
	
	public void clickOnForgotPasswordLink() {
		forgotPasswordLink.click();
	}
	
}
