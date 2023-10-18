package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.alertlist;
import pageobject.companylist;
import pageobject.companyprofile;
import pageobject.contactlist;
import pageobject.dashboard;
import pageobject.leaddetails;
import pageobject.leadlist;
import pageobject.loginpage;
import pageobject.opplist;
import pageobject.tasklist;
import pageobject.userslist;
import utilities.readconfig;

public class Test_dashboardnavigation extends Base2 {
	readconfig re=new readconfig();
	@Test(priority=1)
	public void clickleadcard() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		dashboard db=new dashboard(driver);
		leadlist li=new leadlist(driver);
		wait.until(ExpectedConditions.visibilityOf(db.leadscard()));
		db.leadscard().click();
		wait.until(ExpectedConditions.visibilityOf(li.leadlisttitle()));
		String acttitle=li.leadlisttitle().getText();
		String exptitle="Lead List";
		Assert.assertEquals(exptitle, acttitle);
	}
	
	
	@Test(priority=2)
	public void clicktaskcard(){
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		tasklist tsk=new tasklist(driver);
		wait.until(ExpectedConditions.visibilityOf(db.taskcard()));
		db.taskcard().click();
		wait.until(ExpectedConditions.visibilityOf(tsk.tasklisttitle()));
		String acttitle=tsk.tasklisttitle().getText();
		String exptitle="Task List";
		Assert.assertEquals(exptitle, acttitle);	
	}
	
	@Test(priority=3)
	public void clickoppocard(){
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		opplist opp=new opplist(driver);
		wait.until(ExpectedConditions.visibilityOf(db.opportunitiscard()));
		db.opportunitiscard().click();
		wait.until(ExpectedConditions.visibilityOf(opp.opplisttitle()));
		String acttitle=opp.opplisttitle().getText();
		String exptitle="Opportunity List";
		Assert.assertEquals(exptitle, acttitle);	
	}
	

	
	@Test(priority=4)
	public void clickusericon(){
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		userslist ul=new userslist(driver);
		wait.until(ExpectedConditions.visibilityOf(db.usersicon()));
		db.usersicon().click();
		wait.until(ExpectedConditions.visibilityOf(ul.userslisttitle()));
		String acttitle=ul.userslisttitle().getText();
		String exptitle="User List";
		Assert.assertEquals(exptitle, acttitle);	
	}
	
	@Test(priority=5)
	public void clickcontacticon(){
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		contactlist cl=new contactlist(driver);
		wait.until(ExpectedConditions.visibilityOf(db.contacticon()));
		db.contacticon().click();
		wait.until(ExpectedConditions.visibilityOf(cl.contactlisttitle()));
		String acttitle=cl.contactlisttitle().getText();
		String exptitle="Contact List";
		Assert.assertEquals(exptitle, acttitle);
	}
	
	@Test(priority=6)
	public void click_companyicon(){
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		companylist col=new companylist(driver);
		wait.until(ExpectedConditions.visibilityOf(db.companiesicon()));
		db.companiesicon().click();
		wait.until(ExpectedConditions.visibilityOf(col.companylisttitle()));
		String acttitle=col.companylisttitle().getText();
		String exptitle="Company List";
		Assert.assertEquals(exptitle, acttitle);	
	}
	
	@Test(priority=7)
	public void searchvalue_without_searchfor(){
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		wait.until(ExpectedConditions.visibilityOf(db.searchvalue()));
		db.searchvalue().click();
		wait.until(ExpectedConditions.visibilityOf(db.swalmsg()));
		String acttitle=db.swalmsg().getText();
		String exptitle="Please select Search For.";
		Assert.assertEquals(exptitle, acttitle);
		db.okswalbtn().click();
	}	
	
	@Test(priority=8)
		public void search_company() throws InterruptedException{
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
			dashboard db=new dashboard(driver);
			wait.until(ExpectedConditions.visibilityOf(db.logo()));
			db.logo().click();
			wait.until(ExpectedConditions.visibilityOf(db.searchfordropdown()));
			db.searchfordropdown().click();
			db.searchfordropdown().sendKeys(Keys.ARROW_DOWN);
			db.searchfordropdown().sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.visibilityOf(db.searchvalue()));
			db.searchvalue().sendKeys("birla");
			wait.until(ExpectedConditions.visibilityOf(db.compdrofirst()));
			db.compdrofirst().click();
			companyprofile cop=new companyprofile(driver);
			wait.until(ExpectedConditions.visibilityOf(cop.companyname()));
			String acttitle=cop.companyname().getText();
			System.out.println(acttitle);
			String exptitle="BIRLA SOFT PRIVATE LIMITED";
			Assert.assertEquals(exptitle, acttitle);
	}
	
}
