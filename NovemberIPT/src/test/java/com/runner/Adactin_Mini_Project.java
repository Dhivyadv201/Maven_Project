 package com.runner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Mini_Project {
public static void main(String[] args) throws InterruptedException {
	WebDriver y = new ChromeDriver();
	y.manage().window().maximize();
	y.get("http://adactinhotelapp.com/index.php");
	y.findElement(By.id("username")).sendKeys("balaviknesh",Keys.ENTER);
	y.findElement(By.id("password")).sendKeys("8870223737");
	y.findElement(By.id("login")).click();
	WebElement l = y.findElement(By.id("location"));
	Select a = new Select(l);a.selectByVisibleText("Paris");
	WebElement h = y.findElement(By.id("hotels"));
	Select b = new Select(h);b.selectByVisibleText("Hotel Sunshine");
	WebElement r = y.findElement(By.id("room_type"));
	Select c = new Select(r);c.selectByVisibleText("Super Deluxe");
	WebElement n = y.findElement(By.id("room_nos"));
	Select d = new Select(n);d.selectByVisibleText("2 - Two");
	y.findElement(By.xpath("//*[@id=\"datepick_in\"]")).clear();
	y.findElement(By.xpath("//*[@id=\"datepick_in\"]")).sendKeys("23/10/2022");
	y.findElement(By.xpath("//*[@id=\"datepick_out\"]")).clear();
	y.findElement(By.id("datepick_out")).sendKeys("28/10/2022");
	WebElement ar = y.findElement(By.id("adult_room"));
	Select e = new Select(ar);e.selectByVisibleText("2 - Two");
	WebElement cr = y.findElement(By.id("child_room"));
	Select f = new Select(cr);f.selectByVisibleText("2 - Two");
	y.findElement(By.id("Submit")).click();
	y.findElement(By.id("radiobutton_0")).click();
	y.findElement(By.id("continue")).click();
	y.findElement(By.id("first_name")).sendKeys("Yuvaraj");
	y.findElement(By.id("last_name")).sendKeys("Elumalai");
	y.findElement(By.id("address")).sendKeys("Madurai");
	y.findElement(By.id("cc_num")).sendKeys("1234567890123456");
	WebElement cc = y.findElement(By.id("cc_type"));
	Select g = new Select(cc);g.selectByVisibleText("Other");
	WebElement mn = y.findElement(By.id("cc_exp_month"));
	Select i = new Select(mn);i.selectByVisibleText("October");
	WebElement yr = y.findElement(By.id("cc_exp_year"));
	Select h1 = new Select(yr);h1.selectByVisibleText("2022");
	y.findElement(By.id("cc_cvv")).sendKeys("000");
	y.findElement(By.id("book_now")).click();	
	Thread.sleep(5000);
	y.findElement(By.xpath("(//input[@type='button'])[3]")).click();
}
}
