package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.addcontactpopupfromprofile;
import pageobject.companylist;
import pageobject.companyprofile;
import pageobject.createcomp_float;
import pageobject.dashboard;
import utilities.companycreateconf;

public class Test_AddContact extends Base2 {
	SoftAssert sa = new SoftAssert();
	companycreateconf compdata = new companycreateconf();

	@Test()
	public void addcontactfromprofile() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		dashboard db = new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.searchfordropdown()));
		db.searchfordropdown().click();
		db.compvalue().click();
		wait.until(ExpectedConditions.visibilityOf(db.searchvalue()));
		db.searchvalue().sendKeys("JAIHANUMAN");
		wait.until(ExpectedConditions.visibilityOf(db.compdrofirst()));
		db.compdrofirst().click();
		companyprofile compp = new companyprofile(driver);
		wait.until(ExpectedConditions.visibilityOf(compp.addcontactComman()));
		compp.addcontactComman().click();
		addcontactpopupfromprofile add = new addcontactpopupfromprofile(driver);
		wait.until(ExpectedConditions.visibilityOf(add.compnametitle()));
		String compname = add.compnametitle().getText();
		sa.assertEquals(compname, "JAIHANUMAN LLP");
		add.firstname().sendKeys("smita");
		add.lastname().sendKeys("patil");
		add.datepicker().click();
		List<WebElement> years = driver.findElements(
				By.xpath("//div[@class='PrivatePickersYear-root PrivatePickersYear-modeDesktop css-j9zntq']"));
		for (WebElement year : years) {
			String allyear = year.getText();
			if (allyear.contains("2005")) {
				year.click();
			}
		}
		
		List<WebElement> months = driver
				.findElements(By.xpath("//button[@class='MuiTypography-root MuiTypography-subtitle1 PrivatePickersMonth-root css-lvzzb0']"));
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(
					driver.findElements(By.xpath("//button[@class='MuiTypography-root MuiTypography-subtitle1 PrivatePickersMonth-root css-lvzzb0']"))));
	
			for (WebElement month : months) {
				String allmonth = month.getText();
				if (allmonth.contains("Mar")) {
					month.click();
				}
			}
		} catch (StaleElementReferenceException e) {
		}
		List<WebElement> dates = driver.findElements(By.xpath("//button[@role='gridcell']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(dates));
		try {
			for (WebElement date : dates) {
				String alldate = date.getText();
				if (alldate.contains("15")) {
					date.click();
				}
			}
		} catch (StaleElementReferenceException e) {
		}
		
		add.email().sendKeys("smita@gmail.com");
		add.designation().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(add.listdesign()));
		for(WebElement desig:add.listdesign()){
			String designation=desig.getText();
			if(designation.equals("Director")) {
				desig.click();
			}
			
		}
		add.extdesignation().sendKeys("Assistant");
		add.phone().sendKeys("7564656548");
		add.officephone().sendKeys("9855452247");
		add.department().sendKeys("Account");
		add.linkdin().sendKeys("https://www.linkedin.com/in/naval-patel-74a3691b?trk=people-guest_people_search-card");
		add.twitter().sendKeys("https://www.twitter.com/narendramodi?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
		add.save().click();
	}

}
