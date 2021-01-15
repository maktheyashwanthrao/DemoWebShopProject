package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import TestCases.BaseClass;

public class Listeners extends BaseClass implements ITestListener{

	ExtentTest test;
	
	ExtentReports extent =ExtentReportNG.getReportObject();
	
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>(); //To avoid test object confusion when we are executing in parallel
	
	public void onTestStart(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		 test = extent.createTest(methodName);
		 extentTest.set(test);
		
		
		
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "Test Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		
		
		extentTest.get().fail(result.getThrowable());
		//WebDriver driver =null;
		String testMethodName =result.getMethod().getMethodName();
		
	
			Object currentClass = result.getInstance();
			WebDriver driver = ((BaseClass)currentClass).getDriver();
			
			//driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			System.out.println("Driver in getfailed step method" +driver);
		
			
	
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenshotpath(testMethodName,driver), result.getMethod().getMethodName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
