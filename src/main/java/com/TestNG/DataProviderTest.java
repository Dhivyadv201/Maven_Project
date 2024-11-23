package com.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class DataProviderTest extends Base_Class{
	
	@Test(dataProvider = "login")
	
	public void login(String Username,String Password) {
	launchBrowser("chrome");
	
	launchurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	implicitWait(20);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Username);
	driver.findElement(By.name("password")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	terminateBrowser();
	}
	@DataProvider(name = "login")
public Object[][]dataset(){
	return new Object[][]
			{{"ABC","123"},{" "," "},{"Admin","admin123"}};
}
			}
