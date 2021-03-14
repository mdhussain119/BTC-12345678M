package com.bit.ifElseFor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sample {
	
	WebDriver dr;
	public Sample(WebDriver dr) {
		this.dr = dr;
	}
	
	public void targetCode() throws InterruptedException{
		Core c = new Core(dr);
		
		c.gotoanywebsite("https://www.target.com/");
		c.verifyDisplai(By.id("home"), By.id("home"), By.xpath("//span[text()='Categories']"), By.xpath("//nav[@id='headerMain']/a[@id='secondary']"));
		Thread.sleep(5000);
		c.categoriesforloop(By.xpath("//div[@class='h-overflow-hidden utility-navFill']/ul/li"));
		
		c.textcheck();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	

	
	

}
