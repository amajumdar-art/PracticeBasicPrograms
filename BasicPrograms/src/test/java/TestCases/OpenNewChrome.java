package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewChrome {
	
	@Test
	public void OpenChrome() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aritramajumdar/eclipse/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Google");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Pikachu");
		driver.findElement(By.xpath("//a[@name='btnK']")).click();
		
		driver.quit();
		
		
	}
	

}
