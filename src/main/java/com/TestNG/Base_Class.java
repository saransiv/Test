package com.TestNG;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String Browser) {
		if (Browser.equalsIgnoreCase("Chrome")) {
			System.getProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_Base_Class\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else {
			System.out.println("Check the brower Name");

		}

		driver.manage().window().maximize();

		return driver;

	}

	// getproperty
	public static void openUrl(String Url) {
		driver.get(Url);

	}

	// sendkey
	public static void inputvalue(WebElement ele, String str) {
		ele.sendKeys(str);

	}

	// isEnabled
	public static void enable(WebElement ele) {
		boolean enabled = ele.isEnabled();
		System.out.println(enabled);

	}

	// gettext
	public static void getthetext(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);

	}

	// clear
	public static void clearthetext(WebElement ele) {
		ele.clear();

	}
	
	//click
	public static void clicktheelement(WebElement ele) {
		ele.click();

	}

	// isselected
	public static void isselect(WebElement ele) {
		boolean selected = ele.isSelected();
		System.out.println(selected);
	}

	// getsize
	public static void getthesize(WebElement ele) {
		Dimension size = ele.getSize();
		System.out.println(size);

	}

	// submit
	public static void givethesubmit(WebElement ele) {
		ele.submit();

	}

	// close
	public static void closethepage() {
		driver.close();

	}

//implicitywait
	public static void implicitywait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

	// quit
	public static void quit() {
		driver.quit();

	}

	// GetAllSelectedOptions
	public static void getallselectedoptions(WebElement ele) {
		Select s1 = new Select(ele);
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		System.out.println(allSelectedOptions);

	}

	// isEnabled
	public static void isenabled(WebElement ele) {
		boolean isenabled = ele.isEnabled();
		System.out.println(isenabled);

	}

//getoptions
	public static void getoptions(WebElement ele) {
		Select s1 = new Select(ele);
		List<WebElement> options = s1.getOptions();
		System.out.println(options);

	}

	// notify
	public static void notifyme(WebElement ele) {
		ele.notify();

	}

	// notifyAll
	public static void notifyall(WebElement ele) {
		ele.notifyAll();

	}

	// getwindowhandle
	public static void getwindowhandle(String str) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String ID : windowHandles) {
			Set<String> title = driver.switchTo().window(ID).getWindowHandles();
			System.out.println(title);

		}

	}

	// getTagName
	public static void getthetagname(WebElement ele) {
		String tagname = ele.getTagName();
		System.out.println(tagname);

	}

	public static void minimize() {
		driver.manage().window().minimize();

	}
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);

	}

	
	

}