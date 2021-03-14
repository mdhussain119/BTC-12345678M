package com.bit.ifElseFor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Tryingtest {
	
	static WebDriver driver;

	@BeforeClass
	public static void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mdhussain/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Before
	public void click() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='header']/nav/a[3]/span")).click();// Categories
		Thread.sleep(5000);

	}

	@Test
	public void catagoryTest() throws InterruptedException {
		
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='categoriesMenu']/ul/li"));// list of category
		int size = ele.size();
		System.out.println(size);

		for (int i = 2; i <= size; i++) {      // main 
			driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[" + i + "]/a")).click();// main category
			Thread.sleep(5000);

			List<WebElement> ele1 = driver.findElements(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li"));// grocery
																												// category
			int size1 = ele1.size();
			System.out.println(size1);
			Thread.sleep(5000);

			for (int j = 1; j <= size1; j++) {        //grocery
				driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li[" + j + "]/a")).click();
				Thread.sleep(5000);
				List<WebElement> ele2 = driver.findElements(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li"));// produce
																													// category
				int size2 = ele2.size();
				System.out.println(size2);
				Thread.sleep(4000);

				for (int k = 1; k <= size2; k++) { //produce

					Thread.sleep(5000);
					driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li[" + k + "]/a")).click();
					Thread.sleep(5000);           
					System.out.println(driver.getTitle());
					Thread.sleep(5000);
					System.out.println(driver.findElement(By.xpath("//h1")).getText());

					driver.navigate().back();
					if(k==size2) {
						continue;
						}

					driver.findElement(By.xpath("//nav[@id=\"headerMain\"]/a[3]/span")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[2]")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//div[@id='categoriesMenu']/ul/li[3]/ul/li[1]")).click();
					Thread.sleep(7000);
					driver.findElement(By.xpath("//*[@id=\"categoriesMenu\"]/ul/li[3]/ul/li[6]/button")).click();// show
																													// more
				
					}
				}

			}

		}
	
	
	
	
	
	

}
