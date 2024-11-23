package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceelements.AdactinApplicationElements;
import com.srcmainresources.FileReaderManger;

public class AdactinSearchPage extends Base_Class implements AdactinApplicationElements{
	
	@FindBy(id = location_id)
	private WebElement location;
	
	@FindBy(id = hotels_id)
	private WebElement hotels;
	
	@FindBy(id = roomType_id)
	private WebElement roomType;
	
	@FindBy(id = numberOfRooms_id)
	private WebElement noOfRooms;
	
	@FindBy(name = checkIn_name)
	private WebElement checkin;
	
	@FindBy(name = checkOut_name)
	private WebElement ckeckout;
	
	@FindBy(id = adulsRoom_id)
	private WebElement adulRoom;
	
	@FindBy(id = childrenRoom_id)
	private WebElement childRoom;
	
	@FindBy(id = srearch_id)
	private WebElement submit;
	
	public AdactinSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	

	}

	public void searchPage() throws IOException {
	
		FileReaderManger data = new FileReaderManger();
		seleByVisibleText(location, data.getDataProperty("location"));
		seleByVisibleText(hotels, data.getDataProperty("hotels"));
		seleByVisibleText(roomType, data.getDataProperty("roomtype"));
		
		
		
	}

	
}
