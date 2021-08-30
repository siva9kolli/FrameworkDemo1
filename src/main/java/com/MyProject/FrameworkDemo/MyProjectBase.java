package com.MyProject.FrameworkDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyProjectBase {
	public static WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void launchApplication() {
		driver.get("https://parabank.parasoft.com/");
	}
	
	@AfterSuite
	public void killSession() {
		driver.quit();
	}

}
