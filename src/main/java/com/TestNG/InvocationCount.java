package com.TestNG;

import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class InvocationCount extends Base_Class {
	
	@Test(priority=1)
		
		private void edgeBrowser() {
			launchBrowser("edge");
			launchurl("https://www.google.com/");
			System.out.println("Browser ID: "+Thread.currentThread().getId());
			terminateBrowser();
				}
	@Test(invocationCount=5)
		
		private void chromeBrowser() {
			launchBrowser("chrome");
			launchurl("https://www.google.com/");
			System.out.println("Browser ID: "+Thread.currentThread().getId());
			terminateBrowser();
				}
	@Test(priority=-5)

	private void firefoxBrowser() {
		launchBrowser("firefox");
		launchurl("https://www.google.com/");
		System.out.println("Browser ID: "+Thread.currentThread().getId());
		terminateBrowser();
			}


	}


