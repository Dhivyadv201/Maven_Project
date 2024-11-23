package com.pageobjectmodel;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.baseclass.Base_Class;
import com.interfaceelements.OpenMrsApplicationElement;
import com.srcmainresources.OpenMRS_FileReaderManager;

public class OpenMrs_LoginPage extends Base_Class implements OpenMrsApplicationElement {

	@FindBy(xpath = username_xpath)
	private WebElement username;

	@FindBy(name = password_name)
	private WebElement password;

	@FindBy(id = location_id)
	private WebElement location;

	@FindBy(xpath = login_xpath)
	private WebElement login;

	@FindBy(id = invalidusername_id)
	private WebElement invalidusername;

	@FindBy(id = invaliddata_id)
	private WebElement invaliddata;

	@FindBy(xpath = invalidloction_xpath)
	private WebElement invalidlocation;

	public OpenMrs_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean validUserNameAndValidPassword(ExtentTest extenttext) throws IOException {
		try {
			OpenMRS_FileReaderManager data = new OpenMRS_FileReaderManager();
			launchurl(data.getDataProperty("url"));
			passValues(username, data.getDataProperty("username"));
			passValues(password, data.getDataProperty("password"));
			elementClick(location);
			elementClick(login);
			validation(driver.getTitle(), data.getDataProperty("title"));
			extenttext.log(Status.PASS,"Login Sucessful");

		} catch (AssertionError e) {
			extenttext.log(Status.FAIL,"Login fail" + e.getMessage());
		return false;
		}
		return true;

	}

//	public boolean invalidUserNameAndValidPassword() throws IOException {
//		try {
//			OpenMRS_FileReaderManager data = new OpenMRS_FileReaderManager();
//			launchurl(data.getDataProperty("url"));
//			passValues(username, data.getDataProperty("empty"));
//			passValues(password, data.getDataProperty("password"));
//			elementClick(location);
//			elementClick(login);
//			validation(invalidusername.getText(), data.getDataProperty("errormessage"));
//
//		} catch (Exception e) {
//			Assert.fail("Error occur during validation");
//		}
//		return true;
//
//	}
//
//	public boolean withoutUserNameAndPassword() throws IOException {
//		try {
//			OpenMRS_FileReaderManager data = new OpenMRS_FileReaderManager();
//			launchurl(data.getDataProperty("url"));
//			passValues(username, data.getDataProperty("empty"));
//			passValues(password, data.getDataProperty("empty"));
//			elementClick(location);
//			elementClick(login);
//			validation(invaliddata.getText(), data.getDataProperty("errormessage"));
//
//		} catch (Exception e) {
//			Assert.fail("Error occur during validation");
//		}
//		return true;
//
//	}
//
//	public boolean withoutClickingLocation() throws IOException {
//		try {
//			OpenMRS_FileReaderManager data = new OpenMRS_FileReaderManager();
//			launchurl(data.getDataProperty("url"));
//passValues(username, data.getDataProperty("username"));
//passValues(password, data.getDataProperty("password"));
//			elementClick(login);
//			validation(invalidlocation.getText(), data.getDataProperty("invalidlocation"));
//
//		} catch (Exception e) {
//			Assert.fail("Error occur during validation");
//		}
//		return true;
//
//	}
}
