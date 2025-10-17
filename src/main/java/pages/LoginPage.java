package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;
	By userName = By.id("user-name");
	By password = By.id("password");
	By Login = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void userNameField(String text) {
		
		driver.findElement(userName).sendKeys(text);
	}
	
	public void passwordField(String text) {
		driver.findElement(password).sendKeys(text);
	}
	
	public void loginButton() {
		driver.findElement(Login).click();
		
		}

	}

