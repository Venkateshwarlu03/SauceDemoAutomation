package testss;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.CheckOut;
import pages.LoginPage;

public class Check_Out {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		LoginPage obj1 = new LoginPage(driver);
		CheckOut obj2 = new CheckOut(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		obj1.userNameField("standard_user");
        obj1.passwordField("secret_sauce");
        obj1.loginButton();
        
        obj2.addCart();
        obj2.clickCart();
        obj2.check_out();
        obj2.firstName("venkat");
        obj2.lastName("m");
        obj2.postalCode("518302");
        obj2.Continue();
        
        Thread.sleep(2000);
        driver.close();
	}

}
