package com.runner;

import java.io.IOException;

import com.baseclass.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class AdaticinRunner extends Base_Class {
public static void main(String[] args) throws IOException {
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	launchBrowser(pageObjectManager.getFileReader().getDataProperty("browser"));
	launchUrl(pageObjectManager.getFileReader().getDataProperty("url"));
	pageObjectManager.getLoginPage().validUserNameAndValidPassword();
	pageObjectManager.getSearchpage().searchPage();
}
}
