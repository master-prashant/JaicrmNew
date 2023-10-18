package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.create_leadDahboard;
import pageobject.dashboard;
import pageobject.leaddetails;
import pageobject.leadlist;

public class Test_leaddetailsOpr extends Base2 {
	SoftAssert sa = new SoftAssert();
	
	@Test(priority=1)
	public void createfollowup() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(cf.createfollowup_first()));
		cf.createfollowup_first().click();
		wait.until(ExpectedConditions.visibilityOf(cf.todaysdate()));
		cf.tomarrowdate().click();
		cf.selfirsthourecthr().click();
		cf.firstminute().click();
		cf.pm().click();
		cf.email().click();
		cf.save().click();
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait.until(ExpectedConditions.visibilityOf(cf.newfollowup()));
		String newfolloup=cf.newfollowup().getText();
		sa.assertEquals(newfolloup, "New Follow-Up");
		sa.assertAll();	
	}
	
	@Test(priority=2)
	public void editbttonbeforeValidation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leaddetails cf=new leaddetails(driver);
		wait.until(ExpectedConditions.visibilityOf(cf.editlead()));
		sa.assertEquals(true, cf.editlead().isEnabled());
		sa.assertAll();	
	}
	
	@Test(priority=3)
	public void validatelead() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leaddetails cf=new leaddetails(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cf.validatelead()));
		cf.validatelead().click();
		wait.until(ExpectedConditions.visibilityOf(cf.yes_validatepop()));
		cf.yes_validatepop().click();
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait.until(ExpectedConditions.visibilityOf(cf.validatedtext()));
		String val=cf.validatedtext().getText();
		sa.assertEquals(val, "Validated");
		sa.assertEquals(true, cf.converttoopportunityFollowup().isDisplayed());
		sa.assertAll();	
	}
	
	
	
	@Test(priority=4)
	public void createSecondfollowup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));;
		leaddetails cf=new leaddetails(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cf.newfollowup()));
		cf.closingremark().sendKeys("for create new follow up doing testing by automation and now creating new follow up by closing first follow up");
		cf.newfollowup().click();
		wait.until(ExpectedConditions.visibilityOf(cf.todaysdate()));
		cf.tomarrowdate().click();
		cf.selfirsthourecthr().click();
		cf.firstminute().click();
		cf.pm().click();
		cf.email().click();
		cf.save().click();
		try {
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();}
		catch(StaleElementReferenceException e) {
			
		}
		wait.until(ExpectedConditions.visibilityOf(cf.newfollowup()));
		String newfolloup=cf.newfollowup().getText();
		sa.assertEquals(newfolloup, "New Follow-Up");
		sa.assertAll();	
	}
	
	@Test(priority=5)
	public void lostled() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leaddetails cf=new leaddetails(driver);
		wait.until(ExpectedConditions.visibilityOf(cf.leadlost()));
		cf.closingremark().sendKeys("for lead lost doing testing by automation and now entering the closing remark and clicking on lost button");
		cf.leadlost().click();
		cf.save().click();
		wait.until(ExpectedConditions.visibilityOf(cf.yes_lost()));
		cf.yes_lost().click();
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait.until(ExpectedConditions.visibilityOf(cf.lostleadstatus()));
		String lost=cf.lostleadstatus().getText();
		sa.assertEquals(lost, "Lost");
		sa.assertAll();	
	}


}
