package com.pageobjectmanager;

import com.baseclass.Base_Class;
import com.pageobjectmodel.AdactinLoginPage;
import com.pageobjectmodel.AdactinSearchPage;
import com.srcmainresources.FileReaderManger;

public class PageObjectManager extends Base_Class {
	
	private AdactinLoginPage loginPage;
	private FileReaderManger fileReader;
	private AdactinSearchPage searchpage;

	public AdactinLoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new AdactinLoginPage(driver);
			
		}
		return loginPage;
	}
	
	public AdactinSearchPage getSearchpage() {
		if (searchpage == null) {
			searchpage = new AdactinSearchPage(driver);
			
		}
		return searchpage;
	}

	public FileReaderManger getFileReader() {
		if (fileReader == null) {
		fileReader = new FileReaderManger();
		}
		return fileReader;
	}
}
