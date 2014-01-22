package com.keyu.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.Assert;

public class HomePage {
	private WebDriver driver;
	
	
	@FindBy(how = How.NAME, using = "commit")
	public static WebElement submitButton;

	@FindBy(how = How.ID, using = "email")
	public static WebElement emailText;

	@FindBy(how = How.ID, using = "password")
	public static WebElement passwordText;
	
	@FindBy(how = How.ID, using = "home_stream")
	public static WebElement homeStream;
	
	
	public HomePage(WebDriver driver) {
	    this.driver = driver;
	    ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver,
	            120);
	    PageFactory.initElements(finder, this);

	}
	
	public void enterEmail(String email) {
		emailText.clear();
		emailText.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordText.clear();
		passwordText.sendKeys(password);
	}

	public void submitButton() {
		submitButton.click();
	}
	
	public void homeStreamIsDisplayed() {
		Assert.assertTrue(homeStream.isDisplayed());
	}

}
