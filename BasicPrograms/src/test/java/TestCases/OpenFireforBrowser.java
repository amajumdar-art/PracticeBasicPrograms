package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireforBrowser {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "/Users/aritramajumdar/eclipse/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
