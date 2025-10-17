package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {

	    public static WebDriver openChrome() {
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        return driver;
	        
	    }
	}

