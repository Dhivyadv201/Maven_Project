package com.interfaceelements;

public interface AdactinApplicationElements {
	
	//login elements
	
	
	String username_id="username";
	String password_name="password";
	String login_xpath="//input[@class='login_button']";
	
	//search page elements
	
	String location_id="location";
	String hotels_id="hotels";
	String roomtype_id="room_type";
	String numberofrooms_id="room_nos";
	String checkIn_name="datepick_in";
	String checkOut_name="datepick_out";
	String adultroom_id="adult_room";
	String childroom_id="child_room";
	String searchbtn_name="Submit";
	//select Hotel
	
	String selectBtn_id="radiobutton_0";
	String continuebtn_name="continue";
	
	//Book a Hotel
	
	String firstName_name="first_name";
	String lastName_name="last_name";
	String billingAdd_name="address";
	String creditCardNo_id="cc_num";
	String creditCardType_name="cc_type";
	String selectMonth_name="cc_exp_month";
	String selectYear_name="cc_exp_year";
	String cvvNo_id="cc_cvv";
	String bookNowBtn_name="book_now";
	
	//Booking Confirmation
	
	String logout_id="logout";
}
