package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.createcomp_float;
import pageobject.dashboard;
import utilities.companycreateconf;

public class Test_createcomp_valiadations_fromdashboard extends Base2{
	SoftAssert sa = new SoftAssert();
	companycreateconf compdata=new companycreateconf();
	  
	@BeforeMethod
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
	cr.companyname().sendKeys("rolemodel");
	wait.until(ExpectedConditions.visibilityOf(cr.companyFullName()));
	String compname=cr.companyFullName().getAttribute("value");
	sa.assertEquals(compname,"rolemodel LLP");				//company full name validation
	cr.validatebtn().click();	
	sa.assertAll();
	}
	
	@AfterMethod
	public void clicklogo() {
	createcomp_float cr= new createcomp_float(driver);
	cr.closebtn().click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	dashboard db=new dashboard(driver);
	wait.until(ExpectedConditions.visibilityOf(db.logo()));
	db.logo().click();
	}
	

	//@Test(dependsOnMethods= {"validatecompname"},priority=2
	@Test(priority=1)
	public void invalidpan() {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		createcomp_float cr= new createcomp_float(driver);
		wait.until(ExpectedConditions.visibilityOf(cr.savebtn()));
		cr.pan().sendKeys("bdbbd");
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//small[@style='color: red;'])[3]"))));
		String panerr=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		String experr="Please Enter Correct PAN Number";
		sa.assertEquals(panerr, experr);
		sa.assertAll();	
	}
	
	//@Test(dependsOnMethods= {"validatecompname"},priority=3)
	@Test(priority=2)
	public void invalidtan() {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		createcomp_float cr= new createcomp_float(driver);
		wait.until(ExpectedConditions.visibilityOf(cr.savebtn()));
		cr.tan().sendKeys("bdbbd");
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//small[@style='color: red;'])[3]"))));
		String panerr=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		String experr="Please Enter Correct TAN Number";
		sa.assertEquals(panerr, experr);
		sa.assertAll();	
	}
	
	//@Test(dependsOnMethods= {"validatecompname"},priority=4)
	@Test(priority=3)
	public void invalidcin() {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		createcomp_float cr= new createcomp_float(driver);
		wait.until(ExpectedConditions.visibilityOf(cr.savebtn()));
		cr.cin().sendKeys("bdbbd");
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//small[@style='color: red;'])[3]"))));
		String panerr=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		String experr="Please Enter Correct CIN Number";
		sa.assertEquals(panerr, experr);
		sa.assertAll();	
	}

	//@Test(dependsOnMethods= {"validatecompname"},priority=5)
	@Test(priority=4)
	public void emptydata_compcreate() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		createcomp_float cr= new createcomp_float(driver);
		wait.until(ExpectedConditions.visibilityOf(cr.savebtn()));
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(cr.websiterror()));
		String websiteerror=cr.websiterror().getText();
		String exwebsiteerror="Please Enter Correct Website for eg.https://www.xyz.com, www.xyz.com, etc..";
		sa.assertEquals(websiteerror, exwebsiteerror);                    //web-site validation message
		String indutype=cr.indtyperror().getText();
		String expeindustrytype="Please Select Industry Type.";
		sa.assertEquals(indutype, expeindustrytype);                    //industry type validation message
		String identy=cr.iderror().getText();
		String expeidentitu="Enter Atleast One";
		sa.assertEquals(identy, expeidentitu);                    //identification validation message
		String amount=cr.turnerror().getText();
		String expamount="Please Enter Amount";
		sa.assertEquals(amount, expamount);                    //amount validation message
		String summary=cr.summaryerror().getText();
		String expsummary="Please add the summary between 100 to 2000 characters";
		sa.assertEquals(summary, expsummary);                    //summary validation message
		sa.assertAll();		
	}
	
	//@Test(dependsOnMethods= {"validatecompname"},priority=6)
	@Test(priority=5)
	public void createcomp_with_invaliddata() throws InterruptedException {
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
		cr.website().sendKeys("djckjds");
		cr.tan().sendKeys("dnjcdnjcdjcd");
		cr.pan().sendKeys("fvfd");
		cr.cin().sendKeys("fddf");
		cr.amount().sendKeys("jhbvhgvh");
		cr.summary().sendKeys("dvhbfd dfjvjbfd");
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//small[@style='color: red;'])[1]"))));
		String tanerr=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		String acttanerr="Please Enter Correct TAN Number";
		sa.assertEquals(acttanerr, tanerr);          //invalid tan
		String panerr=driver.findElement(By.xpath("(//small[@style='color: red;'])[4]")).getText();
		String actpanerr="Please Enter Correct PAN Number";
		sa.assertEquals(panerr, actpanerr);          //invalid pan
		String cinerr=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
		String actcinerr="Please Enter Correct CIN Number";
		sa.assertEquals(actcinerr, cinerr);          //invalid cin
		String inweb=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]")).getText();
		String actweberror="Please Enter Correct Website for eg.https://www.xyz.com, www.xyz.com, etc..";
		sa.assertEquals(actweberror, inweb);		//invalid web site error
		String invamount=driver.findElement(By.xpath("(//small[@style='color: red;'])[5]")).getText();
		String actinvamount="Please Enter Amount";
		sa.assertEquals(actinvamount, invamount,"failed amount validation");		//invalid amount error
		String summerror=driver.findElement(By.xpath("(//small[@style='color: red;'])[6]")).getText();
		String actsummerror="Please add the summary between 100 to 2000 characters";
		sa.assertEquals(actsummerror, summerror);		//invalid summary error
		sa.assertAll();
}
	//@Test(dependsOnMethods= {"validatecompname"},priority=7)
	@Test(priority=6)
	public void existing_pan() throws InterruptedException {
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
		cr.website().sendKeys("www.anjnjnj.com");
		cr.pan().sendKeys("ERTPP7523B");  
		cr.amount().sendKeys(compdata.getamount());
		cr.summary().sendKeys(compdata.getsummary());
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(cr.existcomp()));
		String panerr=cr.existcomp().getText();
		String actpanerr="PAN Already Registered.";
		sa.assertEquals(actpanerr, panerr);          	//existing pan error
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='swal-button-container']"))));
		driver.findElement(By.xpath("//div[@class='swal-button-container']")).click();
		sa.assertAll();
}
	
	//@Test(dependsOnMethods= {"validatecompname"},priority=8)
	@Test(priority=7)
	public void existing_tan() throws InterruptedException {
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
		cr.website().sendKeys("www.alexijdncnd.com");
		//cr.date().sendKeys("11/07/2000");
		cr.tan().sendKeys("ALEX81522S");  
		cr.amount().sendKeys(compdata.getamount());
		cr.summary().sendKeys(compdata.getsummary());
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(cr.existcomp()));
		String panerr=cr.existcomp().getText();
		String actpanerr="TAN Already Registered.";
		sa.assertEquals(actpanerr, panerr);          	//existing tan error
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='swal-button-container']"))));
		driver.findElement(By.xpath("//div[@class='swal-button-container']")).click();
		sa.assertAll();
}
	//@Test(dependsOnMethods= {"validatecompname"},priority=9)
	@Test(priority=8)
	public void existing_cin() throws InterruptedException {
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
		cr.website().sendKeys("www.alixamatching.com");
		//cr.date().sendKeys("11/07/2000");
		cr.cin().sendKeys("U21091KA2019OPC141331");  
		cr.amount().sendKeys(compdata.getamount());
		cr.summary().sendKeys(compdata.getsummary());
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(cr.existcomp()));
		String cin=cr.existcomp().getText();
		String actcin="CIN Already Registered.";
		sa.assertEquals(actcin, cin);          	//existing CIN error
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='swal-button-container']"))));
		driver.findElement(By.xpath("//div[@class='swal-button-container']")).click();
		sa.assertAll();
}
	@Test(priority=9)
	public void invalid_cin_withvalid_pan() throws InterruptedException {
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
		cr.website().sendKeys("www.alixamatch.com");
		//cr.date().sendKeys("11/07/2000");
		cr.cin().sendKeys("054656");
		cr.pan().sendKeys("axalz1010p");
		cr.amount().sendKeys(compdata.getamount());
		cr.summary().sendKeys(compdata.getsummary());
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//small[@style='color: red;']"))));
		String cin=driver.findElement(By.xpath("//small[@style='color: red;']")).getText();
		String actcin="Please Enter Correct CIN Number";
		sa.assertEquals(actcin, cin);          	//existing CIN error
		sa.assertAll();
}
	@Test(priority=10)
	public void invalid_tan_withvalid_pan() throws InterruptedException {
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
		cr.website().sendKeys("www.alixamatch.com");
		//cr.date().sendKeys("11/07/2000");
		cr.tan().sendKeys("054656");
		cr.pan().sendKeys("axalz1010p");
		cr.amount().sendKeys(compdata.getamount());
		cr.summary().sendKeys(compdata.getsummary());
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//small[@style='color: red;']"))));
		String tan=driver.findElement(By.xpath("//small[@style='color: red;']")).getText();
		String acttane="Please Enter Correct TAN Number";
		sa.assertEquals(acttane, tan);          	//existing CIN error
		sa.assertAll();
}
	@Test(priority=11)
	public void invalid_pan_withvalid_tan() throws InterruptedException {
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
		cr.website().sendKeys("www.alixamatch.com");
		//cr.date().sendKeys("11/07/2000");
		cr.pan().sendKeys("054656");
		cr.tan().sendKeys("axal91010p");
		cr.amount().sendKeys(compdata.getamount());
		cr.summary().sendKeys(compdata.getsummary());
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//small[@style='color: red;']"))));
		String pan=driver.findElement(By.xpath("//small[@style='color: red;']")).getText();
		String actpane="Please Enter Correct PAN Number";
		sa.assertEquals(actpane, pan);          	//existing CIN error
		sa.assertAll();
}
	//@Test(dependsOnMethods= {"validatecompname"},priority=10)
	@Test(priority=12)
	public void existing_website() throws InterruptedException {
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
		cr.website().sendKeys("www.bajaj.com");
		//cr.date().sendKeys("11/07/2000");
		cr.cin().sendKeys("U21091KA2019OPC141457");  
		cr.amount().sendKeys(compdata.getamount());
		cr.summary().sendKeys(compdata.getsummary());
		cr.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(cr.existcomp()));
		String website=cr.existcomp().getText();
		String expwebsite="Website Already Registered.";
		sa.assertEquals(expwebsite, website);          	//existing website error
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='swal-button-container']"))));
		driver.findElement(By.xpath("//div[@class='swal-button-container']")).click();
		sa.assertAll();
}

}
