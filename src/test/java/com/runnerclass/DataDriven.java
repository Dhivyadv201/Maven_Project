package com.runnerclass;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class DataDriven {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String username=ReadExcelData.readParticularCellData("Sheet1",4,1);
		driver.findElement(By.id("email")).sendKeys(username);
		String password=ReadExcelData.readParticularCellData("Sheet1",4,2);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
	}
}
