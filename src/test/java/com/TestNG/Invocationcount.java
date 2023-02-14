package com.TestNG;

import org.testng.annotations.Test;

public class Invocationcount {

	@Test(priority = 1)
	private void userName() {
		System.out.println("My name is Saran");

	}

	@Test(priority = 2)
	private void password() {
		System.out.println("Sar@1997");

	}

	@Test(priority = 3)
	private void login() {
		System.out.println("click");

	}

}
