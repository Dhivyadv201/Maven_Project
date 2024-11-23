package com.baseclass;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class Base_Class {

	public static WebDriver driver;

	public static ExtentReports extentReports;
	public static File file;

	protected static WebDriver launchBrowser(String browserName) {
		try {

			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			Assert.fail("Error occur during browser launch");

		}
		driver.manage().window().maximize();
		return driver;
	}

	protected static WebDriver launchurl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("Error occur during url launch");
		}
		return driver;
	}

	protected static void passValues(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			Assert.fail("Error occur during passing the values");
		}
	}

	protected static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			Assert.fail("Error occur while closing the browser");
		}
	}

	protected static void navigationPage(String url) {
		try {
			driver.navigate().to(url);

		} catch (Exception e) {
			Assert.fail("Error occur during navigate to the page");
		}
	}

	protected static Select selectElement(WebElement element) {
		Select select = new Select(element);
		return select;
	}

	protected static void selectByVisibleText(WebElement element, String text) {
		try {
			selectElement(element).selectByVisibleText(text);
		} catch (Exception e) {
			Assert.fail("Error occur during select by visible text");
		}
	}

	protected static void elementClick(WebElement clk) {
		try {
			clk.click();
		} catch (Exception e) {
			Assert.fail("Error occur during element click");
		}
	}

	protected static void search(WebElement driver) {
		try {
			driver.sendKeys();
		} catch (Exception e) {
			Assert.fail("Error occur during element send");
		}
	}

	protected static void button(WebElement button) {
		try {
			button.click();
		} catch (Exception e) {
			Assert.fail("Error occur during element click");
		}
	}

	protected static void passingValueAlert(String value) {
		try {
			alertClass().sendKeys(value);
		} catch (Exception e) {
			Assert.fail("Error occur passing the value");
		}
	}

	protected static void getTextAlert() {
		try {
			alertClass().getText();
		} catch (Exception e) {
			Assert.fail("Error occur passing the value");
		}
	}

	protected static Alert alertClass() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	protected static void acceptAlert() {
		try {
			alertClass().accept();
		} catch (Exception e) {
			Assert.fail("Error occur accept the alert");
		}
	}

	protected static void dismissAlert() {
		try {
			alertClass().dismiss();
		} catch (Exception e) {
			Assert.fail("Error occur dismiss the alert");
		}
	}

	protected static Actions actionClass() {
		Actions act = new Actions(driver);
		return act;

	}

	protected static void clickAndHoldAction(WebElement element) {
		try {
			actionClass().clickAndHold(element).build().perform();
		} catch (Exception e) {
			Assert.fail("Error occur during click and hold the alert");
		}

	}

	protected static void clearValue(WebElement element) {
		element.clear();
	}

//	protected static void takesScreenShot() {
//		TakesScreenshot scr = (TakesScreenshot) driver;
//		try {
//			File src = scr.getScreenshotAs(OutputType.FILE);
//			File dest = new File("C:\\Users\\dhivy\\eclipse-workspace\\Maven_Project\\Screenshots\\image.png");
//			FileHandler.copy(src, dest);
//		} catch (Exception e) {
//			Assert.fail("Error occur during take screenshot");
//		}
//	}
	
	protected static void terminateBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("Error occur during terminating the browser");
		}
	}

	protected static void explicitWait(WebElement element, int seconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			Assert.fail("Error occur during Visibility of element");
		}
	}
	protected static void implicitWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		} catch (Exception e) {
			Assert.fail("Error occur during implicit wait");
		}
	}
	protected static void javaScriptscroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 1000);");

	}

	protected static void validation(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
		} catch (Exception e) {
			Assert.fail("Error occur during Validation");
		}
	}

	public static void extentReportStart(String location) {
		extentReports = new ExtentReports();
		file = new File(location);
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
	}

	public static void extentReportTearDown(String location) throws IOException {
		extentReports.flush();
		file = new File(location);
		Desktop.getDesktop().browse((file).toURI());

	}

	public String takeScreenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("Screenshot\\.png" + "_" + timeStamp + ".png");
		FileUtils.copyFile(scrfile, destfile);
		return destfile.getAbsolutePath();

	}
}
