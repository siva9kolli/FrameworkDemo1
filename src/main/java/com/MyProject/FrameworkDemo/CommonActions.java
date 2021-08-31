package com.MyProject.FrameworkDemo;

import org.openqa.selenium.WebElement;

public class CommonActions {
	
	public void clickOnElement(WebElement element) {
		element.click();
		System.out.println("Succesfully clicked on webelement " + element.getAttribute("value"));
	}
	
	public void typeInInputBox(WebElement element, String data) {
		element.sendKeys(data);
		System.out.println("Succesfully entered value on webelement " + element.getAttribute("name"));
	}

	
}
