package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import pages.SauceCheckoutPage;
import pages.SauceLoginPage;
import utils.BrowserUtils;
import utils.ExtentReport.ExtentReportManager;

import java.io.File;
import org.apache.commons.io.FileUtils;




public class SauceLoginTest{

	    WebDriver driver = null;
	    SauceLoginPage loginPage = null;
        SauceCheckoutPage checkOut = null;
        ExtentReports extent;
        ExtentTest test;
        
        
	    @BeforeClass
	    public void setup() {
	       
	        driver = BrowserUtils.openChrome();
	        driver.get("https://www.saucedemo.com");

	        loginPage = new SauceLoginPage(driver);
	        checkOut = new SauceCheckoutPage(driver);
 
	       extent = ExtentReportManager.getReporter();
	    }

	    
	    @DataProvider(name = "users")
	    public Object[][] usersData() {
	        return new Object[][] {
	            {"standard_user", "secret_sauce"}
	        };
	    }

	    @DataProvider(name = "create")
	    public Object[][] userData1(){
	     return new Object[][] {
	    	 {"venkat","M","518302"}
	     };
	    }
	    
	    @Test(dataProvider = "users")
	    public void loginTest(String user, String pass) {
	    	
	    	 test = extent.createTest("Login Test for user: " + user);
	    	
	        try {
	            
	            loginPage.login(user, pass);
	            test.pass("Login successful for user:"+user);
	        } catch(Exception e) {
	        	  takeScreenshot(user);
	              try {
	                  test.fail("Login failed for user: " + user,
	                            MediaEntityBuilder.createScreenCaptureFromPath("screenshots/" + user + ".png").build());
	              } catch(Exception ex) {
	                  ex.printStackTrace();
	              }
	              throw e;
	        }
	    }
@Test(dataProvider = "create",dependsOnMethods = "loginTest")
	public void checkOutTest(String firstName,String lastName, String postalCode) {
	
	test = extent.createTest("Checkout Test for user: " + firstName);
	
	try {
		test.info("Adding item to cart");
		checkOut.addCart();
		
		test.info("Clicked cart");
		checkOut.clickCart();
		checkOut.check_out();
		
		checkOut.completeCheckOut(firstName,lastName, postalCode);	
		test.pass("Checkout completed for: " + firstName);
	}
	catch(Exception e1) {
		 takeScreenshot(firstName);
         try {
             test.fail("Checkout failed for: " + firstName,
                       MediaEntityBuilder.createScreenCaptureFromPath("screenshots/" + firstName + ".png").build());
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         throw e1;
	}
}
	    public void takeScreenshot(String fileName) {
	        try {
	            
	            TakesScreenshot screenshot = (TakesScreenshot) driver;
	            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

	            File destinationFile = new File("screenshots/" + fileName + ".png");
	            FileUtils.copyFile(sourceFile, destinationFile);

	            System.out.println("Screenshot saved: " + destinationFile.getAbsolutePath());
	        } 
	        catch (Exception e) {
	            System.out.println("Failed to take screenshot: " + e.getMessage());
	        }}   
	    @AfterClass
	    public void teardown() {
	        driver.quit();
	        extent.flush(); 
	        System.out.println("Report generated at: " + new java.io.File("reports/AutomationReport.html").getAbsolutePath());
	}}
