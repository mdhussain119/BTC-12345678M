package com.bit.ifElseFor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tryingperiod {
	
	static WebDriver driver;

	@BeforeClass
	public static void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mdshakhawathossain/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Before
	public void click() throws InterruptedException {
		driver.findElement(By.xpath("//nav[@id=\"headerMain\"]/a[3]/span[1]")).click();// Categories
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//a[@class=\"Link-sc-1khjl8b-0 NavigationLink-kfyxgv-0 dJwaza lbDZi\"]/div[text()='Grocery']"))
				.click(); // Groceries
		Thread.sleep(4000);

	}
	
	@Test

	public void catagoryTest() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li[1]")).click();// produce
		driver.findElement(By.xpath("//*[@id=\"categoriesMenu\"]/ul/li[3]/ul/li[6]/button")).click();// show more

		List<WebElement> e = driver.findElements(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li"));

		int size = e.size();

		System.out.println(size);

		for (int i = 1; i <= e.size(); i++) {

			driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li[" + i + "]/a")).click();
			Thread.sleep(10000);
			System.out.println(driver.getTitle());
			Thread.sleep(7000);
			System.out.println(driver.findElement(By.xpath("//h1")).getText());

			Thread.sleep(2000);
			driver.navigate().back();
			
			if(i==6) {
				break;
			}

			
				driver.findElement(By.xpath("//nav[@id=\"headerMain\"]/a[3]/span[1]")).click();// Categories
				Thread.sleep(5000);
				driver.findElement(By.xpath(
						"//a[@class=\"Link-sc-1khjl8b-0 NavigationLink-kfyxgv-0 dJwaza lbDZi\"]/div[text()='Grocery']"))
						.click();// grocery
				Thread.sleep(4000);
					
				driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li[1]")).click();// produce

				driver.findElement(By.xpath("//*[@id=\"categoriesMenu\"]/ul/li[3]/ul/li[6]/button")).click();// show more
				Thread.sleep(3000);
			

		}

	}

	@Test
	public void dairyFood() throws InterruptedException {

		driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li[2]")).click();// dairy

		List<WebElement> ele = driver
				.findElements(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li"));
		int size = ele.size();
		System.out.println(size);

		for (int i = 1; i <= size; i++) {

			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li[" + i + "]/a"))
					.click();
			Thread.sleep(8000);
			System.out.println(driver.findElement(By.xpath("//h1")).getText());
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());

			
			driver.navigate().back();
			if(i==size) {
				break;
			}
			Thread.sleep(5000);

			driver.findElement(By.xpath("//nav[@id=\"headerMain\"]/a[3]/span[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"//a[@class=\"Link-sc-1khjl8b-0 NavigationLink-kfyxgv-0 dJwaza lbDZi\"]/div[text()='Grocery']"))
					.click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li[2]")).click();
			Thread.sleep(3000);

		}

	}

	@AfterClass
	public static void close() {
		driver.quit();
	}

}
