package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		
		String path = System.getProperty("user.dir") + "\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Yashwanth - This is my Report name");
		reporter.config().setDocumentTitle("Yashwanth Test Result");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester  ", "Yashwanth");
		return extent;
	}

}
