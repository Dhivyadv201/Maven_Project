package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.Base_Class;
import com.interfaceelements.AdactinApplicationElements;
import com.srcmainresources.FileReaderManager;

public class AdactinBookHotel extends Base_Class implements AdactinApplicationElements {
	
	@FindBy(name=firstName_name)
	private WebElement firstname;
	@FindBy(name=lastName_name)
	private WebElement lastname;
	@FindBy(name=billingAdd_name)
	private WebElement address;
	@FindBy(id=creditCardNo_id)
	private WebElement cc_number;
	@FindBy(name=creditCardType_name)
	private WebElement cc_type;
	@FindBy(name=selectMonth_name)
	private WebElement cc_exp_month;
	@FindBy(name=selectYear_name)
	private WebElement cc_exp_year;
	@FindBy(id=cvvNo_id)
	private WebElement cc_cvv;
	@FindBy(name=bookNowBtn_name)
	private WebElement booknow;
	
	
	public AdactinBookHotel (WebDriver driver){
		PageFactory.initElements(driver,this);
	}


	public void hotelBook() throws IOException {
		FileReaderManager bookHotel=new FileReaderManager();
		passValues(firstname,bookHotel.getDataProperty("Firstname"));
		passValues(lastname,bookHotel.getDataProperty("Lastname"));
		passValues(address,bookHotel.getDataProperty("BillingAddress"));
		passValues(cc_number,bookHotel.getDataProperty("Creditcard"));
		selectByVisibleText(cc_type,bookHotel.getDataProperty("Creditcardtype"));
		selectByVisibleText(cc_exp_month,bookHotel.getDataProperty("Expirymonth"));
		selectByVisibleText(cc_exp_year,bookHotel.getDataProperty("Expiryyear"));
		passValues(cc_cvv,bookHotel.getDataProperty("cvv"));
		elementClick(booknow);
		explicitWait(booknow, 10);
		
	}


	
	
}
	
	