package com.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ITest {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test(retryAnalyzer = ReTest.class)
	public void testMethod() {
		String title = driver.getTitle();
		assertEquals(title, "google");

	}
}
