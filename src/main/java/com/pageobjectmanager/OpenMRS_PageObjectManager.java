package com.pageobjectmanager;

import com.baseclass.Base_Class;
import com.pageobjectmodel.OpenMrs_LoginPage;
import com.srcmainresources.OpenMRS_FileReaderManager;

public class OpenMRS_PageObjectManager extends Base_Class {

	private OpenMRS_FileReaderManager reader;

	private OpenMrs_LoginPage loginpage;

	public OpenMRS_FileReaderManager getReader() {
		if (reader == null) {
			reader = new OpenMRS_FileReaderManager();
		}
		return reader;
	}

	public OpenMrs_LoginPage getLoginpage() {
		if (loginpage == null) {
			loginpage = new OpenMrs_LoginPage(driver);
		}
		return loginpage;
	}
}