package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.addAddressComppro;
import pageobject.companyprofile;
import pageobject.dashboard;
import utilities.companycreateconf;

public class Test_addAddress extends Base2{
	SoftAssert sa = new SoftAssert();
	companycreateconf compdata = new companycreateconf();

	@Test()
	public void addAddress_companynametitle() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		dashboard db = new dashboard(driver);
		companyprofile compp = new companyprofile(driver);
		addAddressComppro add = new addAddressComppro(driver);
		wait.until(ExpectedConditions.visibilityOf(db.searchfordropdown()));
		db.searchfordropdown().click();
		wait.until(ExpectedConditions.visibilityOf(db.compvalue()));
		db.compvalue().click();
		wait.until(ExpectedConditions.visibilityOf(db.searchvalue()));
		db.searchvalue().sendKeys("JAIHANUMAN");
		wait.until(ExpectedConditions.visibilityOf(db.compdrofirst()));
		db.compdrofirst().click();
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
		add.address().sendKeys("shop no 5, shri balaji apartment, pancard club road, baner");
		wait.until(ExpectedConditions.visibilityOfAllElements(add.email()));
		add.email().sendKeys("fjnkf@gmail.com");
		add.phone().sendKeys("6874979898");
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
		String msg=add.swalerror().getText();
		sa.assertEquals(msg, "Branch office address created successfully..");
		sa.assertAll();
		add.okswal().click();
		}

}
