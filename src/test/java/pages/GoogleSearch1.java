package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch1 {

	WebDriver driver = null;
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	public GoogleSearch1(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setTextBox(String texxt) {
	driver.findElement(textbox_search).sendKeys(texxt);
	}
	
	public void setButton() {
		driver.findElement(button_search).click();
	}
}
