package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class CrossBrowserTesting extends Base_Class {
	
@Test(priority = 5)
private void edgeBrowser() {
	launchBrowser("edge");
	launchUrl("https://www.google.com/");
	System.out.println("Browser ID: " + Thread.currentThread().getId());
	terminateBrowser();
}
@Test(enabled = false)
private void chromeBrowser() {
	launchBrowser("chrome");
	launchUrl("https://www.google.com/");
	System.out.println("Browser ID: " + Thread.currentThread().getId());
	terminateBrowser();
}
@Ignore
@Test(priority = -5)
private void firefoxBrowser() {
	launchBrowser("firefox");
	launchUrl("https://www.google.com/");
	System.out.println("Browser ID: " + Thread.currentThread().getId());
	terminateBrowser();
}
}
