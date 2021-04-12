package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadProperties {
	
	Properties prop;
	
	@BeforeMethod
	public void setUp() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/aritramajumdar/eclipse-workspace/BasicPrograms/src/main/java/utilities/config.properties");
		prop.load(ip);
	}
	
	@Test
	public void CallBrowser() {
		System.out.println(prop.getProperty("browser"));
	}

}
