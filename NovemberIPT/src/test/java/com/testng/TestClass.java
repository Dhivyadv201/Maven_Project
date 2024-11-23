package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class TestClass extends Base_Class{
@Test(timeOut = 2000, expectedExceptions = ArithmeticException.class)
	public void login() {
		launchBrowser("chrome");
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicitWait(30);
		String user = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]")).getText();
		String substring = user.substring(11);
		driver.findElement(By.name("username")).sendKeys(substring);
		int i = 10/0;
		String pass = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[2]")).getText();
		String substring2 = pass.substring(11);
		driver.findElement(By.name("password")).sendKeys(substring2);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

}
}