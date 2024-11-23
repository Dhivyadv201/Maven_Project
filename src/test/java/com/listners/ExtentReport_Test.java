package com.listners;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.baseclass.Base_Class;

public class ExtentReport_Test extends Base_Class {

	public static ExtentTest extenttest;

	@BeforeSuite
	private void extentTestReportStartUp() {
		
		extentReportStart(null);
	}

	@AfterSuite
	private void extendReportEnd() throws IOException {
		
		extentReportTearDown(null);
	}
}