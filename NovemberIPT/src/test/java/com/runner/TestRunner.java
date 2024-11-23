package com.runner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

public class TestRunner extends Base_Class{
public static void main(String[] args) {
	
	launchBrowser("chrome");
	launchUrl("https://www.google.com/");
	WebElement element = driver.findElement(By.name("q"));
	passInput(element, "Rose");
	terminateBrowser();
	
}
}
