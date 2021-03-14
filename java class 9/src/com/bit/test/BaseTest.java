package com.bit.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static WebDriver dr;
	
	
	@BeforeClass
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdhussain/Downloads/chromedriver");
		dr= new ChromeDriver();
	}
	
	
//	@AfterClass
//	public static void closeBrowser() {
//		dr.quit();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
