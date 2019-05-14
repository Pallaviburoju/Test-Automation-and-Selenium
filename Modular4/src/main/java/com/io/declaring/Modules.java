package com.io.declaring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modules {
	public static WebDriver driver;
	static String browser;
	public static void setBrowser() {
		ReadProperties.readProperties();
		browser=ReadProperties.prop.getProperty("browser");
	}
	public static void setBrowserConfig() {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse2\\Modular4\\src\\main\\java\\chromedriver.exe");
		}
	}
	public static void runTest() {
		driver=new ChromeDriver();
		driver.get(ReadProperties.prop.getProperty("url"));		
	}
	public static void endTest() {
		driver.quit();
	}
}
