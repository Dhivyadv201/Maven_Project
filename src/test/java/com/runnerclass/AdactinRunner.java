package com.runnerclass;

import java.io.IOException;

import com.baseclass.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class AdactinRunner extends Base_Class {

	public static void main(String[] args) throws IOException {
		PageObjectManager pageobj = new PageObjectManager();
		launchBrowser(pageobj.getReader().getDataProperty("browser"));
		launchurl(pageobj.getReader().getDataProperty("url"));
		pageobj.getLoginpage().validUserNameAndValidPassword();
		pageobj.getSearchPage().searchHotel();
		pageobj.getSelecthotel().selectHotel();
		pageobj.getHotelbooking().hotelBook();
		pageobj.getConfirmation().confirmation();

	}

}
