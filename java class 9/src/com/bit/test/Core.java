package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Core {
	WebDriver dr;
	public Core(WebDriver dr) {
		this.dr = dr;
	}
	
	public void goToAnytWebsite(String url) {
		
		dr.get(url);
		
	}
	public void verifyurl(By by, String text){
		String actualurl = dr.getCurrentUrl();
		if(actualurl.contains(actualurl)) {
			dr.findElement(by).sendKeys(text);
			
		}
		else {
			System.out.println("url not match");
		}
	}
	public void verifytitle(String expectedtitle, By by, String expactedtext, By locator, By xpath) {
		String actualtitle = dr.getTitle();
		boolean a = actualtitle.equals(expectedtitle);
		System.out.println("its match");
		String actualtext = dr.findElement(by).getText();
		boolean b = actualtext.equals(expactedtext);
		System.out.println("its match also");
		
		if(a && b) {
			dr.findElement(locator).click();	
		}
		else {
			
			System.out.println("everything is mass");
			List<WebElement> ele = dr.findElements(xpath);
			int size = ele.size();
			
			for(int i=1; i<=size; i++) {
				dr.findElement(By.xpath("//div[@id='footer']/div[2]/ul[1]/li["+i+"]/a")).click();
				System.out.println(dr.getTitle());
				dr.navigate().back();
				//Thread.sleep(3000);
			}
		}
	}

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
