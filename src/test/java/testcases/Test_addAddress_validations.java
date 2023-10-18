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

import pageobject.addAddressComppro;
import pageobject.addcontactpopupfromprofile;
import pageobject.companyprofile;
import pageobject.dashboard;
import pageobject.leadlist;
import utilities.companycreateconf;

public class Test_addAddress_validations extends Base2 {
	SoftAssert sa = new SoftAssert();
	companycreateconf compdata = new companycreateconf();

	@Test(priority=1)
	public void addAddress_companynametitle() throws InterruptedException {
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
		wait.until(ExpectedConditions.visibilityOf(compp.commanaddaddress()));
		compp.commanaddaddress().click();
		addAddressComppro add = new addAddressComppro(driver);
		wait.until(ExpectedConditions.visibilityOf(add.companyname()));
		String compname = add.companyname().getText();
		sa.assertEquals(compname, "JAIHANUMAN LLP");
		driver.findElement(By.xpath("(//button[@aria-label='close'])[1]")).click();   //close pop up
		sa.assertAll();
		}
	
	@Test(priority=2)
	public void addAddress_WithNodata() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		dashboard db = new dashboard(driver);
		addAddressComppro add = new addAddressComppro(driver);
		companyprofile compp = new companyprofile(driver);
		wait.until(ExpectedConditions.visibilityOf(compp.commanaddaddress()));
		compp.commanaddaddress().click();
		wait.until(ExpectedConditions.visibilityOf(compp.radioBranch()));
		compp.radioBranch().click();
		driver.findElement(By.xpath("//button[@id='save_add']")).click();
		wait.until(ExpectedConditions.visibilityOf(add.save()));
		String compname = add.companyname().getText();
		sa.assertEquals(compname, "JAIHANUMAN LLP");
		add.save().click();
		String state=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]")).getText();
		String city=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
		String pincode=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		String address=driver.findElement(By.xpath("(//small[@style='color: red;'])[4]")).getText();
		String email=driver.findElement(By.xpath("(//small[@style='color: red;'])[5]")).getText();
		String phoneno=driver.findElement(By.xpath("(//small[@style='color: red;'])[6]")).getText();
		String gstno=driver.findElement(By.xpath("(//small[@style='color: red;'])[7]")).getText();
		String sez=driver.findElement(By.xpath("(//small[@style='color: red;'])[8]")).getText();
		sa.assertEquals(state, "Please Select State.");
		sa.assertEquals(city, "Please Select City.");
		sa.assertEquals(pincode, "Please Enter Valid Pincode.");
		sa.assertEquals(address, "Please add the Address between 30 to 150 characters");
		sa.assertEquals(email, "Please Enter Valid Email ID.");
		sa.assertEquals(phoneno, "Please Enter Valid Mobile Number.");
		sa.assertEquals(gstno, "Please Enter Valid GST Number");
		sa.assertEquals(sez, "Please Select Sez");
		sa.assertAll();
		add.close().click();
	}
	
	@Test(priority=3)
	public void addAddress_WithInvalidData() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		dashboard db = new dashboard(driver);
		addAddressComppro add = new addAddressComppro(driver);
		companyprofile compp = new companyprofile(driver);
		wait.until(ExpectedConditions.visibilityOf(compp.commanaddaddress()));
		compp.commanaddaddress().click();
		wait.until(ExpectedConditions.visibilityOf(compp.radioBranch()));
		compp.radioBranch().click();
		driver.findElement(By.xpath("//button[@id='save_add']")).click();   //proceed button
		add.selectState().click();
		List<WebElement>states=add.dropdownlist();
		for(WebElement liststate:states) {
			String state=liststate.getText();
			if(state.equalsIgnoreCase("Maharashtra")) {
				liststate.click();
			}
		}
		wait.until(ExpectedConditions.visibilityOf(add.selectCity()));
		add.selectCity().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(add.dropdownlist()));
		driver.findElement(By.xpath("//li[@data-value='Aheri']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(add.pincode()));
		add.pincode().sendKeys("745");
		add.address().sendKeys("shop no 5, shri balaji apartment, pancard club road, baner\r\n"
				+ "shop no 5, shri balaji apartment, pancard club road, baner\r\n"
				+ "shop no 5, shri balaji apartment, pancard club road, baner");
		wait.until(ExpectedConditions.visibilityOfAllElements(add.email()));
		add.email().sendKeys("fjnkf");
		add.phone().sendKeys("5874979898");
		add.gstno().sendKeys("06BPDJK5778S2ZF");
		add.sez().click();
		List<WebElement>sez=add.dropdownlist();
		for(WebElement sezoption:sez) {
			String option=sezoption.getText();
			if(option.equalsIgnoreCase("no")) {
				sezoption.click();
			}
		}

		add.save().click();
		String pincode=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]")).getText();
		String address=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
		String email=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		String phoneno=driver.findElement(By.xpath("(//small[@style='color: red;'])[4]")).getText();
		String gstno=driver.findElement(By.xpath("(//small[@style='color: red;'])[5]")).getText();
		sa.assertEquals(pincode, "Please Enter Valid Pincode.");
		sa.assertEquals(address, "Please add the Address between 30 to 150 characters");
		sa.assertEquals(email, "Please Enter Valid Email ID.");
		sa.assertEquals(phoneno, "Please Enter Valid Mobile Number.");
		sa.assertEquals(gstno, "State code and GST Number Mismatch");
		sa.assertAll();
		add.close().click();
	}
	
	@Test(priority=4)
	public void checkunique_gst() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		dashboard db = new dashboard(driver);
		addAddressComppro add = new addAddressComppro(driver);
		companyprofile compp = new companyprofile(driver);
		wait.until(ExpectedConditions.visibilityOf(compp.commanaddaddress()));
		compp.commanaddaddress().click();
		wait.until(ExpectedConditions.visibilityOf(compp.radioBranch()));
		compp.radioBranch().click();
		driver.findElement(By.xpath("//button[@id='save_add']")).click();   //proceed button
		add.selectState().click();
		List<WebElement>states=add.dropdownlist();
		for(WebElement liststate:states) {
			String state=liststate.getText();
			if(state.equalsIgnoreCase("Maharashtra")) {
				liststate.click();
			}
		}
		wait.until(ExpectedConditions.visibilityOf(add.selectCity()));
		add.selectCity().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(add.dropdownlist()));
		driver.findElement(By.xpath("//li[@data-value='Aheri']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(add.pincode()));
		add.pincode().sendKeys("413021");
		add.address().sendKeys("shop no 5, shri balaji apartment, pancard club road, baner");
		wait.until(ExpectedConditions.visibilityOfAllElements(add.email()));
		add.email().sendKeys("fjnkf@gmail.com");
		add.phone().sendKeys("6874979898");
		add.gstno().sendKeys("27ERTPP9800BCZ1");
		add.sez().click();
		List<WebElement>sez=add.dropdownlist();
		for(WebElement sezoption:sez) {
			String option=sezoption.getText();
			if(option.equalsIgnoreCase("no")) {
				sezoption.click();
			}
		}

		add.save().click();
		wait.until(ExpectedConditions.visibilityOf(add.okswal()));
		String gstno=add.swalerror().getText();
		sa.assertEquals(gstno, "PAN details under provided GST, registered with another company.");
		sa.assertAll();
		add.okswal().click();
		wait.until(ExpectedConditions.visibilityOf(add.close()));
		add.close().click();
	}
	
	@Test(priority=5, enabled=false)
	public void add_BrachAddress() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		companyprofile compp = new companyprofile(driver);
		addAddressComppro add = new addAddressComppro(driver);
		wait.until(ExpectedConditions.visibilityOf(compp.commanaddaddress()));
		compp.commanaddaddress().click();
		wait.until(ExpectedConditions.visibilityOf(add.companyname()));
		String compname = add.companyname().getText();
		sa.assertEquals(compname, "JAIHANUMAN LLP");
		wait.until(ExpectedConditions.visibilityOf(compp.radioBranch()));
		compp.radioBranch().click();
		driver.findElement(By.xpath("//button[@id='save_add']")).click();   //proceed button
		add.selectState().click();
		List<WebElement>states=add.dropdownlist();
		for(WebElement liststate:states) {
			String state=liststate.getText();
			if(state.equalsIgnoreCase("Maharashtra")) {
				liststate.click();
			}
		}
		wait.until(ExpectedConditions.visibilityOf(add.selectCity()));
		add.selectCity().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(add.dropdownlist()));
		driver.findElement(By.xpath("//li[@data-value='Aheri']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(add.pincode()));
		add.pincode().sendKeys("413021");
		add.address().sendKeys("shop no 10, shri mahadev apartment, dp road near hanuman temple, aundh");
		wait.until(ExpectedConditions.visibilityOfAllElements(add.email()));
		add.email().sendKeys("djcdkk@gmail.com.com");
		add.phone().sendKeys("9849749798");
		add.gstno().sendKeys("27ERTPP9900BCZ1");
		add.sez().click();
		List<WebElement>sez=add.dropdownlist();
		for(WebElement sezoption:sez) {
			String option=sezoption.getText();
			if(option.equalsIgnoreCase("no")) {
				sezoption.click();
			}
		}

		add.save().click();
		wait.until(ExpectedConditions.visibilityOf(add.swalerror()));
		String msg=add.swalerror().getText();
		sa.assertEquals(msg, "Branch office address created successfully..");
		sa.assertAll();
		add.okswal().click();
		}
		
		
	}


