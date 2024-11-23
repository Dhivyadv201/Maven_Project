package com.interfaceelements;

public interface OpenMrsInterfaceElement {
	
	String userName_id = "username";
	
	String password_id = "password";
	
	String location_id = "Inpatient Ward";
	
	String login_id = "loginButton";
	
	String errorMessage_xpath = "//div[text()='Invalid username/password. Please try again.']";
	
	String locationError_xpath = "//*[text()='You must choose a location!']";

}
