package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	public WebDriver driver;

	public POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "pass")
	private WebElement pass;

	@FindBy(id = "loginbutton")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

}
