package com.bit.test;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sample {
	
	WebDriver dr;
	
	public Sample(WebDriver dr) {
		this.dr = dr;	
	}
	
	@Before
	public void targetCode() throws InterruptedException {
	Core c = new Core(dr);

	c.goToAnytWebsite("https://www.target.com/");
	Thread.sleep(5000);
	c.verifytitle("Target : Expect More. Pay Less.", By.xpath("//span[text()='Get gifts today']"), "Get pppp gifts today", By.xpath("//span[text()='Categories']"), By.xpath("//div[@id='footer']/div[2]/ul[1]/li"));
	c.verifyurl(By.id("search"), "kidstoy");
	
	
	
	}
	

	
	
	
	
	
	
	
	
}
