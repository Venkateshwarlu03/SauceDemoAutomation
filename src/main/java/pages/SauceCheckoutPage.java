package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceCheckoutPage {

		WebDriver driver = null;
		By backPack = By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]");
		By bikeLight = By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-bike-light')]");
		By cart = By.className("shopping_cart_link");
		By checkout = By.id("checkout");
		By firstName = By.id("first-name");
		By lastName = By.id("last-name");
		By postalCode = By.id("postal-code");
		By Conti_nue = By.id("continue");
		
		
		public SauceCheckoutPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public void addCart() {
			driver.findElement(backPack).click();
			driver.findElement(bikeLight).click();	
		}
		
		public void clickCart() {
			driver.findElement(cart).click();
		}
		
		public void check_out() {
			driver.findElement(checkout).click();
		}
		
		public void completeCheckOut(String text, String text1, String text2) {
			driver.findElement(firstName).sendKeys(text);
			driver.findElement(lastName).sendKeys(text1);
			driver.findElement(postalCode).sendKeys(text2);
			driver.findElement(Conti_nue).click();
		}
		
	}

