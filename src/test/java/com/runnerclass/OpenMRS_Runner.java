package com.runnerclass;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.listners.ExtentReport_Test;
import com.listners.ITestListenerClass;
import com.pageobjectmanager.OpenMRS_PageObjectManager;

@Listeners(ITestListenerClass.class)

public class OpenMRS_Runner extends Base_Class {

	OpenMRS_PageObjectManager openMRSobj = new OpenMRS_PageObjectManager();

	@BeforeTest
	public void setUp() throws IOException {
		launchBrowser(openMRSobj.getReader().getDataProperty("browser"));
	}

//	@Test(priority = -5)
//	private void invalidUserNameAndValidPassword() throws IOException {
//		Assert.assertTrue(openMRSobj.getLoginpage().invalidUserNameAndValidPassword());
//	}
//
//	@Test(priority = 3)
//	private void withoutUserNameAndPassword() throws IOException {
//		Assert.assertTrue(openMRSobj.getLoginpage().withoutUserNameAndPassword());
//	}
//
//	@Test(priority = 1)
//	private void withoutClickingLocation() throws IOException {
//		Assert.assertTrue(openMRSobj.getLoginpage().withoutClickingLocation());
//	}

	@Test()
	private void validUserNameAndValidPasswordTest() throws Throwable {
		ExtentReport_Test.extenttest = extentReports
				.createTest("Login Test" + " " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("validUserNameAndValidPasswordTest");
		Assert.assertTrue(openMRSobj.getLoginpage().validUserNameAndValidPassword(ExtentReport_Test.extenttest));

	}

	@AfterTest
	private void termination() {
		terminateBrowser();
	}

	@BeforeSuite
	private void extendReportStartUp() {
		extentReportStart("C:\\Users\\dhivy\\eclipse-workspace\\Maven_Project\\Reports");
	}

	@AfterSuite
	private void extendReportEnd() throws IOException {
		extentReportTearDown("C:\\Users\\dhivy\\eclipse-workspace\\Maven_Project\\Reports\\index.html");
	}
}
