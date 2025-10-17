package testss;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.LoginPage;

public class Login_Page {

	public static void main(String[] args) throws InterruptedException {
				
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		LoginPage obj1 = new LoginPage(driver);
		
		obj1.userNameField("standard_user");
		obj1.passwordField("secret_sauce");
		obj1.loginButton();
		
		
	
	}

}
