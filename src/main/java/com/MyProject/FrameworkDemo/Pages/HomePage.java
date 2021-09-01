package com.MyProject.FrameworkDemo.Pages;

import org.openqa.selenium.By;
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
//		commonActions.typeInInputBox(usernameInputbox, userName);
//		commonActions.typeInInputBox(passwordInputbox, password);
//		commonActions.clickOnElement(loginButton);
		sum(12,23);
		clickOnElement("//7er34");
		clickOnElement(By.id("123432"));
		clickOnElement(driver.findElement(By.name("32423")));
		
		
	}
	
	public Integer sum(int a, int b) {
		return a+b;
	}
	
	
	public void clickOnElement1() {
		WebElement ele = driver.findElement(By.xpath("//input[@value='Log In']"));
		ele.click();
	}
	
	public void clickOnElement(String xpathValue) {
		WebElement ele = driver.findElement(By.xpath(xpathValue));
		ele.click();
	}
	
	public void clickOnElement(By locator) {
		WebElement ele = driver.findElement(locator);
		ele.click();
	}
	
	public void clickOnElement(WebElement ele) {
		ele.click();
	}
	
	public WebElement getLink() {
		return forgotPasswordLink;
	}
	
	
	public void clickOnForgotPasswordLink() {
		forgotPasswordLink.click();
	}
	
	public String getTitleOfThePage() {
		return driver.getTitle();
	}
	
	public boolean isDispalyedLoginButton() {
		return loginButton.isDisplayed();
	}
	
}
