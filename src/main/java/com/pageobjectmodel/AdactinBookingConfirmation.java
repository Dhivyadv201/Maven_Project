package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.AdactinApplicationElements;

public class AdactinBookingConfirmation extends Base_Class implements AdactinApplicationElements {
	@FindBy(id = logout_id)
	private WebElement logout;

	public AdactinBookingConfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void confirmation() throws IOException {

		javaScriptscroll();
		takeScreenshot();
		explicitWait(logout, 10);
//		elementClick(logout);

	}

}