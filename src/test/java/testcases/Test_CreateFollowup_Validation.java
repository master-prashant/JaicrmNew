package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.create_leadDahboard;
import pageobject.dashboard;
import pageobject.leaddetails;
import pageobject.leadlist;

public class Test_CreateFollowup_Validation extends Base2 {
SoftAssert sa = new SoftAssert();
	
	@Test(priority=1)
	public void checkerrors_withoutselectingvalue() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leadlist ll = new leadlist(driver);
		dashboard db = new dashboard(driver);
		leaddetails cf=new leaddetails(driver);
		create_leadDahboard cl = new create_leadDahboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.leadscard()));
		db.leadscard().click();
		wait.until(ExpectedConditions.visibilityOf(ll.createlead()));
		ll.createlead().click();
		wait.until(ExpectedConditions.visibilityOf(cl.selectcomp()));
		cl.selectcomp().click();
		cl.selectcomp().sendKeys("bajaj");
		wait.until(ExpectedConditions.visibilityOf(cl.compoption()));
		cl.compoption().click();
		wait.until(ExpectedConditions.visibilityOf(cl.selectaddress()));
		cl.selectaddress().click();
		wait.until(ExpectedConditions.visibilityOf(cl.addresslist()));
		cl.addresslist().click();
		cl.selectcontact().click();
		wait.until(ExpectedConditions.visibilityOf(cl.contcatlist()));
		cl.contcatlist().click();
		cl.selecttype().click();
		wait.until(ExpectedConditions.visibilityOf(cl.Coldtype()));
		cl.Coldtype().click();
		cl.leadname().sendKeys("need internet service for office");
		cl.selectsource().click();
		wait.until(ExpectedConditions.visibilityOf(cl.sourcetradeind()));
		cl.sourcetradeind().click();
		cl.datasource().sendKeys("friends sugg");
		wait.until(ExpectedConditions.visibilityOf(cl.selectserviceprovider()));
		cl.selectserviceprovider().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(cl.servprovlist()));
		for (WebElement serprov : cl.servprovlist()) {
			String servprovlist = serprov.getText();
			if (servprovlist.contains("Dell")) {
				serprov.click();
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(cl.selectproductfamily()));
		cl.selectproductfamily().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(cl.prodfamlist()));
		for (WebElement prodfam : cl.prodfamlist()) {
			String prodfamlist = prodfam.getText();
			if (prodfamlist.contains("Laptops")) {
				prodfam.click();
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(cl.selectproduct()));
		cl.selectproduct().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(cl.productist()));
		for (WebElement product : cl.productist()) {
			String productlist = product.getText();
			if (productlist.contains("Inspirion 3537")) {
				wait.until(ExpectedConditions.visibilityOf(product));
				product.click();
				break;
			}
		}
		cl.summary().sendKeys(
				"dnkjcnkds sdkjckjsd csdkjnkjcsd csdkjcnksdnc dksckjnsdk csdnjcsdc dsnckdsnk v sdnvndskv dskvkjsdnv kdnkfv ");
		cl.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(cl.okswal()));
		cl.okswal().click();
		wait.until(ExpectedConditions.elementToBeClickable(ll.nextpage()));
		ll.firstleadintable().click();
		wait.until(ExpectedConditions.visibilityOf(cf.validatelead()));
		cf.validatelead().click();
		wait.until(ExpectedConditions.visibilityOf(cf.yes_validatepop()));
		cf.yes_validatepop().click();
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait.until(ExpectedConditions.elementToBeClickable(cf.createfollowup_first()));
		cf.createfollowup_first().click();
		wait.until(ExpectedConditions.visibilityOf(cf.todaysdate()));
		cf.todaysdate().click();
		cf.save().click();
		WebElement hrError=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(hrError));
		String hrErrormsg=hrError.getText();
		String minerror=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
		String typerror=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		sa.assertEquals(hrErrormsg, "Please Select Hour.");
		sa.assertEquals(minerror, "Please Select Minute.");
		sa.assertEquals(typerror, "Please Select Type.");
		sa.assertAll();
		wait.until(ExpectedConditions.visibilityOf(cf.closeFollopop()));
		cf.closeFollopop().click();
	}
	
	@Test(priority=2)
	public void createfollowup_withpastTime() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leaddetails cf=new leaddetails(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cf.createfollowup_first()));
		cf.createfollowup_first().click();
		wait.until(ExpectedConditions.visibilityOf(cf.todaysdate()));
		cf.todaysdate().click();
		cf.selfirsthourecthr().click();
		cf.firstminute().click();
		cf.am().click();
		cf.demo().click();
		cf.save().click();
		wait.until(ExpectedConditions.visibilityOf(cf.pasterror()));
		String err=cf.pasterror().getText();
		sa.assertEquals(err, "Time selection can not be for the past, please select future time.");
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait.until(ExpectedConditions.visibilityOf(cf.closeFollopop()));
		cf.closeFollopop().click();
	}

	
	@Test(priority=3)
	public void closefollowup_error_withNewfolloupcreate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leaddetails cf=new leaddetails(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cf.createfollowup_first()));
		cf.createfollowup_first().click();
		wait.until(ExpectedConditions.visibilityOf(cf.todaysdate()));
		cf.tomarrowdate().click();
		cf.selfirsthourecthr().click();
		cf.firstminute().click();
		cf.pm().click();
		cf.demo().click();
		cf.save().click();
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait.until(ExpectedConditions.visibilityOf(cf.closingremark()));
		cf.newfollowup().click();
		cf.save().click();
		WebElement hrError=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]"));
		wait.until(ExpectedConditions.visibilityOf(hrError));
		String hrErrormsg=hrError.getText();
		String minerror=driver.findElement(By.xpath("(//small[@style='color: red;'])[4]")).getText();
		String dateer=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
		String remerr=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]")).getText();
		String typerror=driver.findElement(By.xpath("(//small[@style='color: red;'])[5]")).getText();
		wait.until(ExpectedConditions.visibilityOf(cf.newfollowup()));
		sa.assertEquals(remerr, "Please add the closing Remark between 100 to 2000 characters");
		sa.assertEquals(dateer, "Please Select Date.");
		sa.assertEquals(hrErrormsg, "Please Select Hour.");
		sa.assertEquals(minerror, "Please Select Minute.");
		sa.assertEquals(typerror, "Please Select Type.");
		sa.assertAll();	
	}
	
	@Test(priority=4)
	public void closefollowup_error_withconverttoOpp() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leaddetails cf=new leaddetails(driver);
		wait.until(ExpectedConditions.visibilityOf(cf.converttoopportunityFollowup()));
		cf.converttoopportunityFollowup().click();
		WebElement remerror=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(remerror));
		String remerr=remerror.getText();
		sa.assertEquals(remerr, "Please add the closing Remark between 100 to 2000 characters");
		sa.assertAll();	
	}
	
	@Test(priority=5)
	public void closefollowup_error_withLost() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leaddetails cf=new leaddetails(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cf.leadlost()));
		cf.leadlost().click();
		cf.save().click();
		WebElement remerror=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(remerror));
		String remerr=remerror.getText();
		sa.assertEquals(remerr, "Please add the closing Remark between 100 to 2000 characters");
		sa.assertAll();	
	}

}
