package com.srcmainresources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class OpenMrsFileReaderManager {
	
	private static Properties property;
	private static FileInputStream fileInputStream;

	private static void setupProperty() throws IOException {
		if (property == null) {
			File file = new File("C:\\Users\\Admin\\eclipse-workspace\\NovemberIPT\\src\\main\\java\\com\\srcmainresources\\OpenMrsTestData.properties");
			try {
				fileInputStream = new FileInputStream(file);
				property = new Properties();
				property.load(fileInputStream);
			} catch (FileNotFoundException e) {
				
				Assert.fail("ERROR : FILENOTFOUND EXCEPTION OCCUR DURING THE PROPERTY FILE LOADING");	
			}catch (Exception e) {
				Assert.fail("ERROR : FILENOTFOUND EXCEPTION OCCUR DURING THE PROPERTY FILE READING");	
			}}}
	public static String getDataProperty(String dataValue) throws IOException {
		setupProperty();
		String browserName = property.getProperty(dataValue);
		return browserName;

	}
	

}
