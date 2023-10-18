package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.createcomp_float;
import pageobject.dashboard;
import utilities.companycreateconf;

public class Test_validate_comp_name extends Base2 {
	SoftAssert sa = new SoftAssert();
	companycreateconf compdata=new companycreateconf();
	
	@Test(priority=1)
	public void validate_existing_compname() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	db.logo().click();
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
	cr.companytypebtn().click();
	wait.until(ExpectedConditions.visibilityOf(cr.llp()));
	cr.llp().click();
	cr.companyname().sendKeys("alex");
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,"alex LLP");				//company full name validation
	cr.validatebtn().click();
	wait.until(ExpectedConditions.visibilityOf(db.swalmsg()));
	String errorexcomp=db.swalmsg().getText();
	String experr="Company name already exist.";			//error message validation
	sa.assertEquals(errorexcomp,experr);
	db.okswalbtn().click();
	cr.closebtn().click();
	sa.assertAll();
	}
	
	@Test(priority=2)
	public void validate_compname_pvtltd() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	db.logo().click();
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
	cr.companytypebtn().click();
	wait.until(ExpectedConditions.visibilityOf(cr.prvltd()));
	cr.prvltd().click();
	cr.companyname().sendKeys("alex");
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,"alex PRIVATE LIMITED");				//company full name validation
	sa.assertAll();
	cr.closebtn().click();
	}
	
	@Test(priority=3)
	public void validate_compname_ltd() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	db.logo().click();
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
	cr.companytypebtn().click();
	wait.until(ExpectedConditions.visibilityOf(cr.ltd()));
	cr.ltd().click();
	cr.companyname().sendKeys("alex");
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,"alex LIMITED");				//company full name validation
	sa.assertAll();
	cr.closebtn().click();
	}
	
	@Test(priority=4)
	public void validate_compname_ngo() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	db.logo().click();
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
	cr.companytypebtn().click();
	wait.until(ExpectedConditions.visibilityOf(cr.ngo()));
	cr.ngo().click();
	cr.companyname().sendKeys("alex");
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,"alex ");				//company full name validation
	sa.assertAll();
	cr.closebtn().click();
	}
	
	@Test(priority=5)
	public void validate_compname_trust() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	db.logo().click();
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
	cr.companytypebtn().click();
	wait.until(ExpectedConditions.visibilityOf(cr.trust()));
	cr.trust().click();
	cr.companyname().sendKeys("alex");
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,"alex ");				//company full name validation
	sa.assertAll();
	cr.closebtn().click();
	}
	
	@Test(priority=6)
	public void validate_compname_properitor() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	db.logo().click();
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
	cr.companytypebtn().click();
	wait.until(ExpectedConditions.visibilityOf(cr.PROPRIETOR()));
	cr.PROPRIETOR().click();
	cr.companyname().sendKeys("alex");
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,"alex ");				//company full name validation
	sa.assertAll();
	cr.closebtn().click();
	}
	
	@Test(priority=7)
	public void validate_compname_forignentity() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	db.logo().click();
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
	cr.companytypebtn().click();
	wait.until(ExpectedConditions.visibilityOf(cr.foreignent()));
	cr.foreignent().click();
	cr.companyname().sendKeys("alex");
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,"alex ");				//company full name validation
	sa.assertAll();
	cr.closebtn().click();
	}
	@Test(priority=8)
	public void validate_compname_other() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	db.logo().click();
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
	cr.companytypebtn().click();
	wait.until(ExpectedConditions.visibilityOf(cr.others()));
	cr.others().click();
	cr.companyname().sendKeys("alex");
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,"alex ");				//company full name validation
	sa.assertAll();
	cr.closebtn().click();
	}
	
	@Test(priority=9)
	public void validate_compname_errormessage() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	db.logo().click();
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
//	cr.companytypebtn().click();
//	wait.until(ExpectedConditions.visibilityOf(cr.others()));
//	cr.others().click();
//	cr.companyname().sendKeys("alex");
//	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	cr.validatebtn().click();
	//String compname=cr.companyFullName().getAttribute("value");
	String type=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]")).getText();
	String comame=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
	sa.assertEquals(type,"Please Select Type.");
	sa.assertEquals(comame,"Please Enter Name.");
	boolean com=cr.companyname().isEnabled();
	sa.assertEquals(com, true);
	sa.assertAll();
	cr.closebtn().click();
	}

}
