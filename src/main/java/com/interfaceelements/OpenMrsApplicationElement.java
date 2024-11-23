package com.interfaceelements;

public interface OpenMrsApplicationElement {

	// login element

	String username_xpath = "(//input[@class='form-control form-control-sm form-control-lg form-control-md'])[1]";
	String password_name = "password";
	String location_id = "Inpatient Ward";
	String login_xpath = "//input[@class='btn confirm']";
	String invalidusername_id = "error-message";
	String invaliddata_id = "error-message";
	String invalidloction_xpath = "//*[text()='You must choose a location!']";
}