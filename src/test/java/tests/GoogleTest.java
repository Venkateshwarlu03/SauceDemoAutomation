package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearch;
 

public class GoogleTest {

	private static WebDriver driver = null;

	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		GoogleSearch.textbox_search(driver).sendKeys("Selenium web");
		Thread.sleep(2000);
		GoogleSearch.button_search(driver).click();
		Thread.sleep(2000);
		driver.close();

	}

}
