package com.MyProject.FrameworkDemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.MyProject.FrameworkDemo.Pages.ForgotPasswordPage;

public class VerifyForgotPassword extends MyProjectBase{
	public ForgotPasswordPage forgotPasswordPage;
	
	@BeforeClass
	public void initializePages() {
		forgotPasswordPage = new ForgotPasswordPage(driver);
	}
	
	@Test
	public void verifyForgotPasswordStatus() {
		Assert.assertTrue(forgotPasswordPage.isDisplayedCustomerLookUpHeading());
	}
}
