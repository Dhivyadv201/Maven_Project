package com.srcmainresources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class OpenMRS_FileReaderManager {

	private static Properties property;
	private static FileInputStream fileInputStream;

	private static Properties setupProperty() throws IOException {
		File file = new File(
				"C:\\Users\\dhivy\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\srcmainresources\\OpenMRSdata.properties");
		try {
			fileInputStream = new FileInputStream(file);
			property = new Properties();
			property.load(fileInputStream);
		} catch (FileNotFoundException e) {
			Assert.fail("Error in loading the file");
		} catch (Exception e) {
			Assert.fail("Error in reading the file");
		}
		return property;

	}

	public String getDataProperty(String datavalue) throws IOException {
		setupProperty();
		String inputdata = property.getProperty(datavalue);
		return inputdata;

	}

}