package bittech;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Asd;

public class SmokeTest {
	
	Properties prop; 
	WebDriver dr;
	
	
	@Test
	public void ad() throws IOException {
		
		Asd b = new Asd();
		
		prop = b.a();
		
		String bro =prop.getProperty("browser");
		if(bro.equals("Chrome")) {
//		System.setProperty("", "");
//		dr = new ChromeDriver();
			System.out.println("open chrome browser");
		}
		else if(bro.equals("Firefox")) {
			System.out.println("open firefox browser");
			
		}
		dr.get(prop.getProperty("url"));
		
		
	}

}
