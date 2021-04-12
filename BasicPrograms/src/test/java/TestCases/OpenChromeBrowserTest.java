package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aritramajumdar/eclipse/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
	}

}
