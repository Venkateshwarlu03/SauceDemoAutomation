package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	    public static void waitForVisibility(WebDriver driver, WebElement element, int seconds) {
	        new WebDriverWait(driver, Duration.ofSeconds(seconds))
	            .until(ExpectedConditions.visibilityOf(element));
	    }
}
