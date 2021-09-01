package com.MyProject.FrameworkDemo;

import org.testng.Assert;
import org.testng.annotations.*;

import com.MyProject.FrameworkDemo.Pages.HomePage;

public class VerifyPageNavigations extends MyProjectBase{
	public HomePage homePage;

	
	@BeforeClass
	public void initializePages() {
		homePage = new HomePage(driver);
		
	}
	
	@Test
	public void verifyPageNavigatedToHome() {
		String actualTitle = homePage.getTitleOfThePage();
		
		Assert.assertEquals(actualTitle, "ParaBank | Welcome | Online Banking");
		Assert.assertTrue(homePage.isDispalyedLoginButton());
	}

}
