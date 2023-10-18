package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.dashboard;
import pageobject.loginpage;
import utilities.readconfig;

public class Base2 {
	readconfig re=new readconfig();

	public WebDriver driver;
	@BeforeTest
	public  WebDriver setup() {
		String browser = re.getbrowser();
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome") ){
			//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			//log.info("chrome is starting");
			}
		else if(browser.equalsIgnoreCase("firefox") ){
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
			driver=new FirefoxDriver();
			//log.info("firefox is starting");
			}
		driver.manage().window().maximize();
		driver.get(re.geturl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		loginpage lp=new loginpage(driver);
		wait.until(ExpectedConditions.visibilityOf(lp.email()));
		lp.email().sendKeys(re.getemail());
		wait.until(ExpectedConditions.visibilityOf(lp.password()));
		lp.password().sendKeys(re.getpass());
		wait.until(ExpectedConditions.visibilityOf(lp.btn()));
		lp.btn().click();
		return driver;
	}
	@AfterTest
	public WebDriver teardown() {
		driver.close();
		return driver;
	}
	
	public void screen(String testcasename,WebDriver driver) {
		
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File(System.getProperty("user.dir")+"//Screenshots//"+testcasename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}
}
