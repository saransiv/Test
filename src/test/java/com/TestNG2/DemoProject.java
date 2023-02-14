package com.TestNG2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.TestNG.Base_Class;
import com.TestNG.POM;

public class DemoProject extends Base_Class {

	public static WebDriver driver;

	public static POM pom;

	@Test(priority = 1)
	private void BrowsweLaunch() {

		driver = browserLaunch("Chrome");

		openUrl("https://www.facebook.com/login/");

		pom = new POM(driver);

	}

	@Test(priority = 2)
	private void credintial() {
		inputvalue(pom.getEmail(), "saransiva2806@gmail.com");
		inputvalue(pom.getPass(), "Sar@1997");
		clicktheelement(pom.getLogin());
	}

	@Test(priority = 3)
	private void closepage() throws InterruptedException {

		sleep(4000);
		closethepage();
	}

}
