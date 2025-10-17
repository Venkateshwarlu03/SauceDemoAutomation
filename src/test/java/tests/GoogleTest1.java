package tests;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.GoogleSearch1;

public class GoogleTest1 {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		GoogleSearch1 Obj1 = new GoogleSearch1(driver);

		Obj1.setTextBox("A B C");
		
		Obj1.setButton();
	
		//driver.close();
	}

}
