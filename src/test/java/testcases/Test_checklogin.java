package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.dashboard;
import pageobject.loginpage;
import utilities.readconfig;

public class Test_checklogin extends Base {
	readconfig re = new readconfig();

	@Test(priority = 1)
	public void validinput() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		loginpage lp = new loginpage(driver);
		wait.until(ExpectedConditions.visibilityOf(lp.email()));
		lp.email().sendKeys(re.getemail());
		wait.until(ExpectedConditions.visibilityOf(lp.password()));
		lp.password().sendKeys(re.getpass());
		wait.until(ExpectedConditions.visibilityOf(lp.btn()));
		lp.btn().click();
		dashboard db = new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.rolename()));
		db.rolename().click();
		wait.until(ExpectedConditions.visibilityOf(db.logout()));
		db.logout().click();

	}

	@Test(priority = 2)
	public void invalidemail()  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		loginpage lp = new loginpage(driver);
		wait.until(ExpectedConditions.visibilityOf(lp.email()));
		lp.email().sendKeys("ram@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(lp.password()));
		lp.password().clear();
		lp.password().sendKeys(re.getpass());
		wait.until(ExpectedConditions.visibilityOf(lp.btn()));
		lp.btn().click();
		wait.until(ExpectedConditions.visibilityOf(lp.errormessage()));
		String getmsg = lp.errormessage().getText();
		String msg = "Invalid Credentials";
		Assert.assertEquals(getmsg, msg);
	}

	@Test(priority = 3)
	public void blankemail()  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		loginpage lp = new loginpage(driver);
	
//		wait.until(ExpectedConditions.visibilityOf(lp.email()));
		lp.email().clear();
		wait.until(ExpectedConditions.visibilityOf(lp.password()));
	
		lp.password().clear();
		lp.password().sendKeys(re.getpass());
		wait.until(ExpectedConditions.visibilityOf(lp.btn()));
		lp.btn().click();
		wait.until(ExpectedConditions.visibilityOf(lp.errormessage()));
		String getmsg = lp.errormessage().getText();
		String msg = "Missing credentials";
		Assert.assertEquals(getmsg, msg);

	}

	@Test(priority = 4)
	public void missingcredentials() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		loginpage lp = new loginpage(driver);
		wait.until(ExpectedConditions.visibilityOf(lp.email()));
		lp.email().clear();
		lp.password().clear();
		lp.btn().click();
		wait.until(ExpectedConditions.visibilityOf(lp.errormessage()));
		String getmsg = lp.errormessage().getText();
		String msg = "Missing credentials";
		Assert.assertEquals(getmsg, msg);

	}

}
