package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations{
	
@BeforeSuite
private void propertySetting() {
	System.out.println("propertySetting");
	}
@BeforeTest
private void browserLaunch() {
	System.out.println("Browser Launch");
}
@BeforeClass
private void urlLaunch() {
	System.out.println("Launch Url");
}
@BeforeMethod
private void login() {
System.out.println("Login");
}
@Test
private void women() {
	System.out.println("Women");
}
@Test
private void men() {
	System.out.println("Men");
}
@Test
private void kids() {
	System.out.println("Kids");
}
@AfterMethod
private void logout() {
	System.out.println("Logout");
}
@AfterClass
private void screenShot() {
	System.out.println("Screenshot");
}
@AfterTest
private void closeBrowser() {
	System.out.println("Close Browser");
}
@AfterSuite
private void terminateBrowser() {
	System.out.println("Terminate Browser");

}

}
