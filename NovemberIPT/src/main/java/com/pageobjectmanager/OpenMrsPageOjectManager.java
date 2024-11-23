package com.pageobjectmanager;


import com.baseclass.Base_Class;
import com.pageobjectmodel.AdactinLoginPage;
import com.pageobjectmodel.AdactinSearchPage;
import com.pageobjectmodel.OpenMrsLoginPage;
import com.srcmainresources.OpenMrsFileReaderManager;

public class OpenMrsPageOjectManager extends Base_Class {
	
	private OpenMrsLoginPage loginPage;
	private OpenMrsFileReaderManager fileReader;
	
	
	public OpenMrsLoginPage getLoginPage() {
		
		if (loginPage == null) {
			loginPage = new OpenMrsLoginPage(driver);
		}
		return loginPage;
	}
	public OpenMrsFileReaderManager getFileReader() {
		if (fileReader == null) {
			fileReader = new OpenMrsFileReaderManager();
		}
		return fileReader;
	}

	

}
