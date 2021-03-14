package com.bit.ifElseFor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SmokeTest extends BaseTest{
	
	
//	@Test
//	public void targetTest() throws InterruptedException{
//		Sample s = new Sample(dr);
//		
//		
//		
//		s.targetCode();
//		
//		
//	}
	
	@Test
	public void signin() throws InterruptedException {
		dr.get("https://www.target.com/");
		dr.findElement(By.id("account")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//div[@id='accountMenu']/ul/li[2]/a/div[@class='Row-uds8za-0 kRWFss']")).click();
		Thread.sleep(3000);
		dr.findElement(By.id("username")).sendKeys("asdfghjke@gmail.com");
		dr.findElement(By.id("firstname")).sendKeys("asdhenha");
		dr.findElement(By.id("lastname")).sendKeys("njhygtfrde");
		dr.findElement(By.id("phone")).sendKeys("1234567895");
		dr.findElement(By.id("password")).sendKeys("Vahsgejahsgt123");
		dr.findElement(By.xpath("//label[@class='sc-chPdSV etIVAW']/div[@class='sc-kGXeez fQexOT']")).click();
		
		WebElement e = dr.findElement(By.xpath("//input[@id='object-object']"));
		Thread.sleep(5000);
		WebElement e1 =dr.findElement(By.xpath("//button[text()='Create account']"));
		
		
		if(e1.isEnabled() && e.isSelected()) {
			System.out.println("both came right");
			
		}
		else if(e1.isEnabled()|| e.isSelected()) {
			System.out.println("its only enabled");
			
		}
		else {
			System.out.println("nothing match");
	}
		
		
	}
	

}
