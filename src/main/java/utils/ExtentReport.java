package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static class ExtentReportManager {
		
		
	    private static ExtentReports extent;

	    public static ExtentReports getReporter() {
	   
	            ExtentSparkReporter spark = new ExtentSparkReporter("reports/AutomationReport.html");
	            spark.config().setReportName("SauceDemo Test Report");
	            spark.config().setDocumentTitle("Automation Results");

	            extent = new ExtentReports();
	            extent.attachReporter(spark);
	            extent.setSystemInfo("Tester", "VenkateshwarluS");
	            extent.setSystemInfo("Environment", "QA");
				return extent;
	     
	    }
	}

}
