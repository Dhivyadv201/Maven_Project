package com.runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

public class TestRunner extends Base_Class{
public static void main(String[] args) {
	launchBrowser("chrome");
	launchurl("https://www.google.com/");
	navigationPage("https://www.amazon.in/");
	WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
	dropDownObject(dropdown);
	selectByValue(dropdown, "search-alias=alexa-skills");
	WebElement clk=driver.findElement(By.xpath("//a[text()='Mobiles']"));
	clk.click();
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iPhone 16 Pro");
	WebElement button=driver.findElement(By.id("nav-search-submit-button"));
	button.click();
	takesScreenShot("C:\\Users\\dhivy\\eclipse-workspace\\Maven_Project\\Images\\screenshot.png");
	terminateBrowser();
}
}
