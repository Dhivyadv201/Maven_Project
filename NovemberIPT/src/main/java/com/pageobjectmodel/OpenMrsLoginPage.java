package com.pageobjectmodel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.baseclass.Base_Class;
import com.excelutility.ExcelUtility;
import com.interfaceelements.OpenMrsInterfaceElement;
import com.srcmainresources.OpenMrsFileReaderManager;
public class OpenMrsLoginPage extends Base_Class implements OpenMrsInterfaceElement{
	@FindBy(id = userName_id)
	private WebElement username;
	@FindBy(id = password_id)
	private WebElement password;
	@FindBy(id = location_id)
	private WebElement location;
	@FindBy(id = login_id)
	private WebElement login;
	
	@FindBy(xpath = errorMessage_xpath)
	private WebElement errorMessage;
	
	@FindBy(xpath = locationError_xpath)
	private WebElement locationError;
	
	public OpenMrsLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public boolean validLogin(ExtentTest extentTest) {
	try {
		OpenMrsFileReaderManager data = new OpenMrsFileReaderManager();
		launchUrl(data.getDataProperty("url"));
		
		passInput(username, ExcelUtility.getCellValue("Registration", "user", "username"));
		passInput(password, ExcelUtility.getCellValue("Registration", "user", "password"));
//	
		passInput(username, data.getDataProperty("loginusername"));
//		passInput(password, data.getDataProperty("loginpassword"));
		elementClick(location);
		elementClick(login);
		validation(driver.getTitle(), data.getDataProperty("tilte"));
		extentTest.log(Status.PASS, "Login Sucessfull");
	} catch (Exception e) {
		Assert.fail("ERROR: OCCURE DURING VALIDATION");
		extentTest.log(Status.FAIL, "Login Failed" + e.getMessage());
		return false;
	}	
		return true;

	}
	
	
	public boolean inValidLogin() {
	try {
		OpenMrsFileReaderManager data = new OpenMrsFileReaderManager();
		launchUrl(data.getDataProperty("url"));
		passInput(username, data.getDataProperty("loginusername"));
		passInput(password, data.getDataProperty("empty"));
		elementClick(location);
		elementClick(login);
		validation(errorMessage.getText(), data.getDataProperty("invalidpassword"));
	} catch (Exception e) {
		Assert.fail("ERROR: OCCURE DURING VALIDATION");
	}	
		return true;

	}

	public boolean emptyLocation() {
		try {
			OpenMrsFileReaderManager data = new OpenMrsFileReaderManager();
			launchUrl(data.getDataProperty("url"));
			passInput(username, data.getDataProperty("loginusername"));
			passInput(password, data.getDataProperty("loginpassword"));
			elementClick(login);
			validation(locationError.getText(), data.getDataProperty("locationerror"));
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING VALIDATION");
		}	
			return true;

		}
	public boolean invalidUserNameAnIValidPassword() {
		try {
			OpenMrsFileReaderManager data = new OpenMrsFileReaderManager();
			launchUrl(data.getDataProperty("url"));
			passInput(username, data.getDataProperty("invaliusername"));
			passInput(password, data.getDataProperty("invalidpasswords"));
			elementClick(location);
			elementClick(login);
			validation(errorMessage.getText(), data.getDataProperty("invalidpassword"));
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING VALIDATION");
		}	
			return true;

		}
}


