package com.dws.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	static Properties prop;

	// Read configuration file and load the data
	public ReadConfig() {

		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	// Get Application URL
	public static String getApplicationURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}

	// Get EmailId
	public static String getEmailId() {
		String useremail = prop.getProperty("username");
		return useremail;
	}

	// Get CityName
	public static String getCityName() {
		String cityname = prop.getProperty("cityname");
		return cityname;
	}

	// Get Address1
	public static String getAddress1() {
		String address1 = prop.getProperty("address1");
		return address1;
	}

	// Get ZipPostalCode
	public static String getZipPostalCode() {
		String zippostalcode = prop.getProperty("zippostalcode");
		return zippostalcode;
	}

	// Get PhoneNumber
	public static String getPhoneNumber() {
		String phonenumber = prop.getProperty("phonenumber");
		return phonenumber;
	}

	// Get Password
	public static String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}

	// Get no of books
	public static String getBooksquantity() {
		String booksquantity = prop.getProperty("booksquantity");
		return booksquantity;
	}
}
