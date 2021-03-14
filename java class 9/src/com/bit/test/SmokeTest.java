package com.bit.test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SmokeTest extends BaseTest {
	
	
	
//	@Test
//	public void targerTest() throws InterruptedException {
//		
//		Sample s = new Sample(dr);
//		
//		s.targetCode();
//		
//		
//	}
	
	@Test
	public void CatchMultipleElements() {
		dr.get("https://www.target.com/");
		List<WebElement> a = dr.findElements(By.xpath("//*[@id=\"headerMain\"]/a")); //its all the header.

		int num = a.size();
		System.out.println(num);
		
		for(int i=3; i<=num; i++) {
			dr.findElement(By.xpath("//*[@id=\"headerMain\"]/a["+i+"]")).click();
			List<WebElement> b = dr.findElements(By.xpath("//div[@id='categoriesMenu']/ul/li")); // its all the cetagory.
			
			int num2 = b.size();
			System.out.println(num2);
			b.get(2).click();
			
			for (int j =2; j <=num2 ; j++) {
				dr.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li["+j+"]/a")).click();
				
			}
			
			
			System.out.println("git trying");
			
			
			
			
			
			
//			dr.navigate().back();
			
			
			
		} 
	
	
	
	}
	

}
