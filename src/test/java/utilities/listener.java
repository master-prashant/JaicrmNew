package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testcases.Base;


public class listener extends Base implements ITestListener{
	public ExtentSparkReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void onTestStart(ITestResult result) {
		htmlreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"reporter/extent.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Env","staging");
		extent.setSystemInfo("user","prashant");
		
		htmlreporter.config().setDocumentTitle("recruit web app testing");
		htmlreporter.config().setTheme(Theme.DARK);
		
	}

	public void onTestSuccess(ITestResult result) {
		logger=extent.createTest((result.getName()));
		logger.log(Status.PASS,MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));
		
	}

	public void onTestFailure(ITestResult result) {
		WebDriver driver = null;
		logger=extent.createTest(result.getName());
		logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName(),ExtentColor.RED));
		String testcasename=result.getMethod().getMethodName();

				try {
					driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 

		screen(testcasename, driver);
		logger.fail("screenshot is below: "+ logger.addScreenCaptureFromPath(testcasename));
	
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
