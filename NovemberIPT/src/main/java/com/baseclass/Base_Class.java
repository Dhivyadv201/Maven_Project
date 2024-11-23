package com.baseclass;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public abstract class Base_Class {

	public static WebDriver driver;
	
	public static ExtentReports extentReports;
	
	public static File file;
	
	static String Reset = "\u001b[0m";
	static String BrightWhite = "\u001b[37;1m";
	static String BackgroundBrightBlack = "\u001b[40;1m";
	static String Blue = "\u001b[34m";

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
			Assert.fail("ERROR :  OCCUR DURING BROWSER LAUNCH");
		}
		driver.manage().window().maximize();
		return driver;
	}

	protected static WebDriver launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING URL LAUNCH");
		}
		return driver;
	}

	protected static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING BROWSER CLOSE");
		}
	}

	protected static void terminateBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING TERMINATE BROWSER");
		}
	}

	protected static void passInput(WebElement element, String input) {
		try {
			element.sendKeys(input);

		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING VALUE PASSING");
		}
	}

	protected static void navigatePage(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING NAVIGATE TO OTHER URL");
		}
	}

	protected static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING ELEMENT CLICK");
		}
	}

	protected static Select dropDownObject(WebElement element) {
		Select select = new Select(element);
		return select;
	}

	protected static void seleByVisibleText(WebElement element, String text) {
		try {
			dropDownObject(element).selectByVisibleText(text);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING SELECT BY VISIBLE TEXT");
		}
	}

	protected static void selectByIndex(WebElement element, int num) {
		try {
			dropDownObject(element).selectByIndex(num);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING SELECT INDEX");
		}

	}

	protected static void validation(String actual, String excepected) {
		try {
			Assert.assertEquals(actual, excepected);
		} catch (Exception e) {

			Assert.fail("ERROR : OCCUR DURING VALIDATION");
		}
	}

	protected static void windowsHandles(int num) {
		try {
			List<String> allWindow = new ArrayList(driver.getWindowHandles());
			driver.switchTo().window(allWindow.get(num));

		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING WINDO HANDLE");
		}
	}

	public static WebDriver art() throws FileNotFoundException, InterruptedException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\OctoberIPT\\Test\\Testing.txt");
		Scanner reader = new Scanner(file);
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			System.out.println(BackgroundBrightBlack + line + Blue + Reset);
			Thread.sleep(54);
		}
		return driver;

	}
	
	public static void implicitWait(int num) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));

	}

	public static void extentReportStart(String location) {
		extentReports = new ExtentReports();
		file = new File(location);
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
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
		File destfile = new File("Screenshort\\.png" + "_" + timeStamp + ".png");
		FileUtils.copyFile(scrfile, destfile);
		return destfile.getAbsolutePath();
	}
}