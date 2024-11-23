package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.AdactinApplicationElements;

public class AdactinSelectHotel extends Base_Class implements AdactinApplicationElements{

	@FindBy(id = selectBtn_id)
	private WebElement select;
	@FindBy(name = continuebtn_name)
	private WebElement continuebtn;
	public AdactinSelectHotel(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void selectHotel() {
		elementClick(select);
		elementClick(continuebtn);
		
		
	}
}
