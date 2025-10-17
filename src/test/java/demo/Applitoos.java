package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Applitoos {

	public static void main(String[] args) {
		
		    
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();

		        // Initialize Eyes
		        Eyes eyes = new Eyes();
		        eyes.setApiKey("MbJZ8j3fZvDY9YUNq7Yn662p49GXLIsyexJODkOmR2E110"); // Paste from Applitools Dashboard

		       
		            eyes.open(driver, "My App", "My first Applitools Test");

		            driver.get("https://www.google.com/");

		            // Visual checkpoint
		            eyes.checkWindow("Login Page");

		            // End test
		            eyes.closeAsync();

		       
		            driver.quit();
		            eyes.abortIfNotClosed();
		        }
		    

	}


