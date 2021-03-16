package com.dws.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	static Properties prop;

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

	public static String getApplicationURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}

	public static String getEmailId() {
		String useremail = prop.getProperty("username");
		return useremail;
	}

	public static String getCityName() {
		String cityname = prop.getProperty("cityname");
		return cityname;
	}
	
	public static String getAddress1() {
		String address1 = prop.getProperty("address1");
		return address1;
	}
	public static String getZipPostalCode() {
		String zippostalcode = prop.getProperty("zippostalcode");
		return zippostalcode;
	}
	public static String getPhoneNumber() {
		String phonenumber = prop.getProperty("phonenumber");
		return phonenumber;
	}
	public static String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}

}
