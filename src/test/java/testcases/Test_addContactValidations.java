package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.addcontactpopupfromprofile;
import pageobject.companyprofile;
import pageobject.dashboard;
import utilities.companycreateconf;

public class Test_addContactValidations extends Base2{
	SoftAssert sa = new SoftAssert();
	companycreateconf compdata = new companycreateconf();
	
	@Test(priority = 1)
	public void companyname_onPopup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		dashboard db = new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.searchfordropdown()));
		db.searchfordropdown().click();
		wait.until(ExpectedConditions.visibilityOf(db.compvalue()));
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
		add.close().click();
		db.logo().click();
		sa.assertAll();
	}
	
	@Test(priority = 2)
	public void addcontact_errormessage_withnoinput() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		dashboard db = new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.searchfordropdown()));
		db.searchfordropdown().click();
		wait.until(ExpectedConditions.visibilityOf(db.compvalue()));
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
		add.save().click();
		String finame=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]")).getText();
		String laname=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
		String email=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		String desig=driver.findElement(By.xpath("(//small[@style='color: red;'])[4]")).getText();
		String mobno=driver.findElement(By.xpath("(//small[@style='color: red;'])[5]")).getText();
		sa.assertEquals(finame, "Please Enter Valid First Name.");
		sa.assertEquals(laname, "Please Enter Valid Last Name.");
		sa.assertEquals(email, "Please Enter Valid Email.");
		sa.assertEquals(desig, "Please Select Designation");
		sa.assertEquals(mobno, "Please Enter Valid Number");
		add.close().click();
		db.logo().click();
		sa.assertAll();
	}
	
	@Test(priority = 3)
	public void addcontact_errormessage_for_invaalidinput() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		dashboard db = new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.searchfordropdown()));
		db.searchfordropdown().click();
		wait.until(ExpectedConditions.visibilityOf(db.compvalue()));
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
		add.phone().sendKeys("4784587423");
		add.email().sendKeys("djvnj");
		add.linkdin().sendKeys("eeferjir848");
		add.twitter().sendKeys("eeferjir848");
		add.save().click();
		Thread.sleep(Duration.ofSeconds(5));
		String twitter=driver.findElement(By.xpath("(//small[@style='color: red;'])[7]")).getText();
		String linkdin=driver.findElement(By.xpath("(//small[@style='color: red;'])[6]")).getText();
		String mobno=driver.findElement(By.xpath("(//small[@style='color: red;'])[5]")).getText();
		String email=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		sa.assertEquals(mobno, "Please Enter Valid Number");
		sa.assertEquals(twitter, "Please start url with https://www.twitter.com");
		sa.assertEquals(linkdin, "Please start url with https://www.linkedin.com");
		sa.assertEquals(email, "Please Enter Valid Email.");
		add.close().click();
		db.logo().click();
		sa.assertAll();
	}
	@Test(priority = 4)
	public void addcontact_withExistingEmail() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		dashboard db = new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.searchfordropdown()));
		db.searchfordropdown().click();
		wait.until(ExpectedConditions.visibilityOf(db.compvalue()));
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
		wait.until(ExpectedConditions.visibilityOf(add.swalerror()));
		String existemail=add.swalerror().getText();
		sa.assertEquals(existemail, "Email is already Register");
		add.okswal().click();
		add.close().click();
		db.logo().click();
		sa.assertAll();
	}
	
	@Test(priority = 5)
	public void addcontact_withExisting_Phone() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		dashboard db = new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.searchfordropdown()));
		db.searchfordropdown().click();
		wait.until(ExpectedConditions.visibilityOf(db.compvalue()));
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
		add.email().sendKeys("smita7979797@gmail.com");
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
		wait.until(ExpectedConditions.visibilityOf(add.swalerror()));
		String existemail=add.swalerror().getText();
		sa.assertEquals(existemail, "Mobile Number is already Register");
		add.okswal().click();
		add.close().click();
		db.logo().click();
		
		sa.assertAll();
	}
	
	
}
