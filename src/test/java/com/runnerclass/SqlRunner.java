package com.runnerclass;

import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.JdbcConnector;

public class SqlRunner {
	
	//public static void main(String[] args) throws SQLException {
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
		//String fname=JdbcConnector.getParticularData();
		//driver.findElement(By.id("email")).sendKeys(fname);
	//}
	public static void main(String[] args) throws SQLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		String fname=JdbcConnector.getParticularData();
		driver.findElement(By.name("search query")).sendKeys(fname);
		
	
	}
	}


