package com.MyProject.FrameworkDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.MyProject.FrameworkDemo.Pages.ForgotPasswordPage;
import com.MyProject.FrameworkDemo.Pages.HomePage;

public class VerifyLoginWithInValidCredentials extends MyProjectBase{
	public HomePage homePage;

	
	@BeforeClass
	public void initializePages() {
		homePage = new HomePage(driver);
		
	}
	
	@Test
	public void verifyLogin() {
		homePage.login("Selenium", "Test@1234");
		homePage.clickOnForgotPasswordLink();
	}
}
