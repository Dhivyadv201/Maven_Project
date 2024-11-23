package com.srcmainresources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class FileReaderManager {

	private static Properties property;
	private static FileInputStream fileinputstream;
	
	private static Properties setupProperty() throws IOException {
			File file=new File("C:\\Users\\dhivy\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\srcmainresources\\Adactindata.properties");
		try {
			fileinputstream=new FileInputStream(file);
			property=new Properties();
			property.load(fileinputstream);
		}catch(FileNotFoundException e) {
			Assert.fail("Error in loading file");
		}catch(Exception e) {
			Assert.fail("Error in loading file");
		}
		return property;
	
	}
	

		public String getDataProperty(String datavalue) throws IOException{
			setupProperty();
			String inputdata=property.getProperty(datavalue);
			return inputdata;
			
		}
		
}
