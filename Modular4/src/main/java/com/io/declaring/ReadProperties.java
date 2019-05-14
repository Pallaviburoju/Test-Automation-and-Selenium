package com.io.declaring;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	static Properties prop = new Properties();
	public static void readProperties() {
		
		try {
			InputStream is = new FileInputStream(
					"E:\\Eclipse2\\Modular4\\src\\main\\java\\config.properties");
			prop.load(is);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
