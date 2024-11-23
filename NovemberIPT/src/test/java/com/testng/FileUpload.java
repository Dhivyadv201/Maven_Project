package com.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	@Test
	private void fileUpload() throws AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.filemail.com/share/upload-file");
	driver.findElement(By.xpath("//*[text()='Add Files']")).click();
	Robot rb = new Robot();
	rb.delay(2000);
	StringSelection ss = new StringSelection("C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshot1.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	
		

	}

}
