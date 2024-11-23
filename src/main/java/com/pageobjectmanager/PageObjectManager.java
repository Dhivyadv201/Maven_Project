package com.pageobjectmanager;

import com.baseclass.Base_Class;
import com.pageobjectmodel.AdactinBookHotel;
import com.pageobjectmodel.AdactinBookingConfirmation;
import com.pageobjectmodel.AdactinLoginPage;
import com.pageobjectmodel.AdactinSearchPage;
import com.pageobjectmodel.AdactinSelectHotel;
import com.srcmainresources.FileReaderManager;

public class PageObjectManager extends Base_Class {

	private FileReaderManager reader;
	private AdactinLoginPage loginpage;
	private AdactinSearchPage searchPage;
	private AdactinSelectHotel selecthotel;
	private AdactinBookHotel hotelbooking;
	private AdactinBookingConfirmation confirmation;

	public FileReaderManager getReader() {
		if (reader == null) {
			reader = new FileReaderManager();
		}
		return reader;
	}

	public AdactinLoginPage getLoginpage() {
		if (loginpage == null) {
			loginpage = new AdactinLoginPage(driver);
		}
		return loginpage;
	}

	public AdactinSearchPage getSearchPage() {
		if (searchPage == null) {
			searchPage = new AdactinSearchPage(driver);
		}
		return searchPage;
	}

	public AdactinSelectHotel getSelecthotel() {
		if (selecthotel == null)
			selecthotel = new AdactinSelectHotel(driver);
		return selecthotel;
	}

	public AdactinBookHotel getHotelbooking() {
		if (hotelbooking == null)
			hotelbooking = new AdactinBookHotel(driver);
		return hotelbooking;
	}

	public AdactinBookingConfirmation getConfirmation() {
		if (confirmation == null)
			confirmation = new AdactinBookingConfirmation(driver);
		return confirmation;
	}

}
