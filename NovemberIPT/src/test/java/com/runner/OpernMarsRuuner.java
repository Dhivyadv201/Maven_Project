package com.runner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.listeners.ExtentReport_Test;
import com.listeners.ITestListenerClass;
import com.pageobjectmanager.OpenMrsPageOjectManager;

@Listeners(ITestListenerClass.class)
public class OpernMarsRuuner extends Base_Class {

	OpenMrsPageOjectManager pageObjectManager = new OpenMrsPageOjectManager();

	@BeforeTest
	public void setUp() throws IOException {
		launchBrowser(pageObjectManager.getFileReader().getDataProperty("browser"));

	}

	@Test
	private void validLoginTest() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Valid Login Test");
		Assert.assertTrue(pageObjectManager.getLoginPage().validLogin(ExtentReport_Test.extenttest));

	}

	@Test
	private void inValidloginTest() {
		Assert.assertTrue(pageObjectManager.getLoginPage().inValidLogin());

	}

	@Test
	private void emptyLocation() {
		Assert.assertTrue(pageObjectManager.getLoginPage().emptyLocation());

	}

	private void inValidUserLogin() {
		Assert.assertTrue(pageObjectManager.getLoginPage().invalidUserNameAnIValidPassword());
	}

	@AfterTest
	private void termination() {
		terminateBrowser();
	}

	@BeforeSuite
	private void extendStartUp() {
		extentReportStart("C:\\Users\\Admin\\eclipse-workspace\\NovemberIPT\\Reports");

	}

	@AfterSuite
	private void ExtendReportEnd() throws IOException {
		extentReportTearDown("C:\\Users\\Admin\\eclipse-workspace\\NovemberIPT\\Reports\\index.html");

	}

}
