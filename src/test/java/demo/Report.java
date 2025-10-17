package demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Report {

	    public static void main(String[] args) {

	        // 1️⃣ Create main report manager
	        ExtentReports extent = new ExtentReports();

	        // 2️⃣ Create HTML report file
	        ExtentSparkReporter spark = new ExtentSparkReporter("reports/MyReport.html");

	        // 3️⃣ Attach spark reporter to main extent
	        extent.attachReporter(spark);

	        // 4️⃣ Create a test entry (like a test case)
	        ExtentTest test = extent.createTest("Login Test");

	        // 5️⃣ Log test steps
	        test.info("Opening browser");
	        test.pass("Login successful");

	        // 6️⃣ Save (generate) the report
	        extent.flush();

	        System.out.println("Report generated successfully!");
	    }
	}