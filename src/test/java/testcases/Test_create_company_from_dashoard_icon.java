package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.createcomp_float;
import pageobject.dashboard;
import pageobject.loginpage;
import utilities.companycreateconf;

public class Test_create_company_from_dashoard_icon extends Base2 {
	SoftAssert sa = new SoftAssert();
	companycreateconf compdata=new companycreateconf();

	@Test(priority=1)
	public void validatecompname() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	createcomp_float cr= new createcomp_float(driver);
	dashboard db=new dashboard(driver);
	wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
	db.plusicon().click();
	wait.until(ExpectedConditions.visibilityOf(db.createcompany()));
	db.createcompany().click();
	wait.until(ExpectedConditions.visibilityOf(cr.companytypebtn()));
	cr.companytypebtn().click();
	wait.until(ExpectedConditions.visibilityOf(cr.llp()));
	cr.llp().click();
	cr.companyname().sendKeys(compdata.getcompname());
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,compdata.getcompname()+" LLP");				//company full name validation
	cr.validatebtn().click();	
	sa.assertAll();
	}
	
	
	@Test(dependsOnMethods= {"validatecompname"},priority=2)
	public void createcomp_withvaliddata() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		createcomp_float cr= new createcomp_float(driver);
		wait.until(ExpectedConditions.visibilityOf(cr.industrytype()));
		cr.industrytype().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[@role='option']"))));
		List <WebElement> op=driver.findElements(By.xpath("//li[@role='option']"));                 //list of dynamically changing dropdown
		for(WebElement ele:op) {
			String currentopt=ele.getText();
			if(currentopt.contains(compdata.getindtype())) {
				ele.click();
				break;
			}
		}
		cr.website().sendKeys(compdata.getwebsite());
		cr.dateofincop().click();
		List<WebElement> year=driver.findElements(By.xpath("//div[@class='PrivatePickersYear-root PrivatePickersYear-modeDesktop css-j9zntq']"));
		for(WebElement yele:year) {
			String allyears=yele.getText();
			if(allyears.contains("2000")) {					//select year in date picker
				yele.click();
				break;
			}
		}
		
		List<WebElement> month=driver.findElements(By.xpath("//button[@class='MuiTypography-root MuiTypography-subtitle1 PrivatePickersMonth-root css-lvzzb0']"));
		for(WebElement monthele:month) {
			String allmonths=monthele.getText();				//select month in date picker
			if(allmonths.contains("Mar")) {
				monthele.click();
				break;
			}
		}
		
		List<WebElement> day=driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-12dt0q8']"));
		for(WebElement dayele:day) {
			String alldays=dayele.getText();				//select day in date picker
			if(alldays.contains("15")) {
				dayele.click();
				break;
			}
		}
		
		cr.tan().sendKeys(compdata.gettan());
		cr.amount().sendKeys(compdata.getamount());
		cr.summary().sendKeys(compdata.getsummary());
		wait.until(ExpectedConditions.visibilityOf(cr.savebtn()));
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='swal-button swal-button--Delete popup-blue']"))));
		WebElement swalmsg=driver.findElement(By.xpath("//button[@class='swal-button swal-button--Delete popup-blue']"));
		String addaddress=swalmsg.getText();
		String actswal="Add Address";
		sa.assertEquals(addaddress, actswal);		
		sa.assertAll();
		
}
	

}