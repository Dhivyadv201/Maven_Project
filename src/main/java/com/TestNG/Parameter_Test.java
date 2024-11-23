package com.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class Parameter_Test extends Base_Class{
	
@Test
@Parameters({"Username", "Password"})

public void login(String Username,String Password) throws InterruptedException{
	launchBrowser("Chrome");
	launchurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	implicitWait(20);
	driver.findElement(By.name("username")).sendKeys(Username);
	driver.findElement(By.name("password")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}


	


