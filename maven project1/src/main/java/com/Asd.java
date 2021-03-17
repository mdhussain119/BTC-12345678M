package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Asd {
	
	public Properties a() throws IOException {
		System.out.println("hi");
		FileInputStream v = new FileInputStream(new File("/Users/mdhussain/eclipse-workspace/mavenFirstProject/src/main/resources/confit.properties"));
		Properties p = new Properties();
		p.load(v);
		return p;
		
	}
	

}
