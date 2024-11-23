package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.AdactinApplicationElements;
import com.srcmainresources.FileReaderManager;

public class AdactinSearchPage extends Base_Class implements AdactinApplicationElements {

	@FindBy(id = location_id)
	private WebElement location;
	@FindBy(id = hotels_id)
	private WebElement hotels;
	@FindBy(id = roomtype_id)
	private WebElement roomtype;
	@FindBy(id = numberofrooms_id)
	private WebElement numberofrooms;
	@FindBy(name = checkIn_name)
	private WebElement checkIn;
	@FindBy(name = checkOut_name)
	private WebElement checkOut;
	@FindBy(id = adultroom_id)
	private WebElement adultroom;
	@FindBy(id = childroom_id)
	private WebElement childroom;
	@FindBy(name = searchbtn_name)
	private WebElement searchelement;
	public AdactinSearchPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	
	
}
	public void searchHotel() throws IOException {
		FileReaderManager search=new FileReaderManager();
		selectByVisibleText(location,search.getDataProperty("Location"));
		selectByVisibleText(hotels,search.getDataProperty("Hotels"));
		selectByVisibleText(roomtype,search.getDataProperty("Roomtype"));
		selectByVisibleText(numberofrooms,search.getDataProperty("numberofrooms"));
		clearValue(checkIn);
		passValues(checkIn,search.getDataProperty("Checkindate"));
		clearValue(checkOut);
		passValues(checkOut,search.getDataProperty("Checkoutdate"));
		selectByVisibleText(adultroom,search.getDataProperty("Adultsroom"));
		selectByVisibleText(childroom,search.getDataProperty("Childrenroom"));
		elementClick(searchelement);
		
		
		
	}
}
