package com.nopcommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis =new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationURL() {
		return pro.getProperty("baseURL");
	}
	
	public String getEmail() {
		return pro.getProperty("email");
	}
	
	public String getPassword() {
		return pro.getProperty("password");
	}
	
	public String getChromePath() {
		return pro.getProperty("chromePath");
	}
	
	
	public String getFirefoxPath() {
		return pro.getProperty("firefoxPath");
	}
	
	
	public String getIePath() {
		return pro.getProperty("iePath");
	}
	
	public String getMSedgePath() {
		return pro.getProperty("msedgePath");
	}
}
