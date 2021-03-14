package com.bit.ifElseFor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Core {
	
	WebDriver dr;
	
	public Core(WebDriver dr) {
		this.dr = dr;
		
	}
	public void gotoanywebsite(String url) {
		dr.get(url);
		
	}
	public void verifyDisplai(By by,By xpath, By locator, By code) {
		WebElement e = dr.findElement(by);
		WebElement e1 = dr.findElement(xpath);
		
		if(e.isDisplayed()&& e1.isSelected()) {
			dr.findElement(locator).click();
			
		}
		else if(e.isDisplayed()|| e1.isSelected()) {
			dr.findElement(code).click();
			
			
		}
		else {
			System.out.println("wrong");
		}
	}
	
	
	public void categoriesforloop(By by){
		List<WebElement> ele = dr.findElements(by);
		int z = ele.size();
		for (int i = 1; i <=z; i++) {
			dr.findElement(By.xpath("//div[@class='h-overflow-hidden utility-navFill']/ul/li["+i+"]/a")).click();
			System.out.println(dr.getTitle());
			dr.navigate().back();
		}
	}
	
	public String textcheck() {
		String k=dr.findElement(By.xpath("//span[text()='Wrap it up with same-day pickup & delivery.']")).getText();
		String b ="Wrap it up with same-day pickup & delivery.";
		
		if(k.contains(b)) {
			System.out.println("ppp");
			return k;
			
		}
		else {
			return k+ "didnt not match";
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
