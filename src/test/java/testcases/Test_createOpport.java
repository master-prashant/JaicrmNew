package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.create_leadDahboard;
import pageobject.createopportunity;
import pageobject.dashboard;
import pageobject.leaddetails;
import pageobject.leadlist;

public class Test_createOpport extends Base2 {
	
	SoftAssert sa = new SoftAssert();
	@Test(priority=1)
	public void create_oppr_error_vlidation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leadlist ll = new leadlist(driver);
		dashboard db = new dashboard(driver);
		leaddetails cf=new leaddetails(driver);
		createopportunity co= new createopportunity(driver);
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
		wait.until(ExpectedConditions.elementToBeClickable(cf.validatelead()));
		cf.validatelead().click();
		wait.until(ExpectedConditions.visibilityOf(cf.yes_validatepop()));
		cf.yes_validatepop().click();
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait.until(ExpectedConditions.visibilityOf(cf.validatedtext()));
		String val=cf.validatedtext().getText();
		sa.assertEquals(val, "Validated");
		cf.converttoopportunityTop().click();
		wait.until(ExpectedConditions.visibilityOf(co.savewithoutfolup()));
		co.savewithoutfolup().click();
		String lob=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]")).getText();
		String eMRC=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
		String eNRC=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		sa.assertEquals(lob, "Please Select Line of Busieness.");
		sa.assertEquals(eMRC, "Please Enter value");
		sa.assertEquals(eNRC, "Please Enter value");
		wait.until(ExpectedConditions.visibilityOf(co.selectLineofBuissness()));
		co.selectLineofBuissness().click();
		wait.until(ExpectedConditions.visibilityOf(co.itinfraStructure()));
		co.itinfraStructure().click();
		co.expectedmrc().sendKeys("0");
		co.expectedNRC().sendKeys("0");
		co.savewithoutfolup().click();
		wait.until(ExpectedConditions.visibilityOf(co.swaltitle()));
		String mrcerr=co.swaltitle().getText();
		sa.assertEquals(mrcerr, "Either expected MRC or expected NRC should be greater than zero");
		sa.assertAll();
	}
	@Test(priority=2)
	public void create_oppr_without_followup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leadlist ll = new leadlist(driver);
		dashboard db = new dashboard(driver);
		leaddetails cf=new leaddetails(driver);
		createopportunity co= new createopportunity(driver);
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
		wait.until(ExpectedConditions.elementToBeClickable(cf.validatelead()));
		cf.validatelead().click();
		wait.until(ExpectedConditions.visibilityOf(cf.yes_validatepop()));
		cf.yes_validatepop().click();
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait.until(ExpectedConditions.visibilityOf(cf.validatedtext()));
		String val=cf.validatedtext().getText();
		sa.assertEquals(val, "Validated");
		cf.converttoopportunityTop().click();
		wait.until(ExpectedConditions.visibilityOf(co.selectLineofBuissness()));
		co.selectLineofBuissness().click();
		wait.until(ExpectedConditions.visibilityOf(co.itinfraStructure()));
		co.itinfraStructure().click();
		co.expectedmrc().sendKeys("10");
		co.expectedNRC().sendKeys("5");
		co.savewithoutfolup().click();
		wait.until(ExpectedConditions.visibilityOf(co.opportunityDetailspopbtn()));
		String opp_details=co.opportunityDetailspopbtn().getText();
		sa.assertEquals(opp_details, "Opportunity Details");
		sa.assertAll();
	}
	
	@Test(priority=3)
	public void create_oppr_with_followup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		leadlist ll = new leadlist(driver);
		dashboard db = new dashboard(driver);
		leaddetails cf=new leaddetails(driver);
		createopportunity co= new createopportunity(driver);
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
		wait.until(ExpectedConditions.elementToBeClickable(cf.validatelead()));
		cf.validatelead().click();
		wait.until(ExpectedConditions.visibilityOf(cf.yes_validatepop()));
		cf.yes_validatepop().click();
		wait.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait.until(ExpectedConditions.visibilityOf(cf.validatedtext()));
		String val=cf.validatedtext().getText();
		sa.assertEquals(val, "Validated");
		cf.closingremark().sendKeys("converting this lead by using automation to opportunity for that closing remark is entering\r\n"
				+ "and clicking on convert to opportunity button");
		cf.converttoopportunityFollowup().click();
		cf.save().click();
		wait.until(ExpectedConditions.visibilityOf(co.selectLineofBuissness()));
		co.selectLineofBuissness().click();
		wait.until(ExpectedConditions.visibilityOf(co.itinfraStructure()));
		co.itinfraStructure().click();
		co.expectedmrc().sendKeys("10");
		co.expectedNRC().sendKeys("5");
		co.saveWITHfolup().click();
		wait.until(ExpectedConditions.visibilityOf(co.opportunityDetailspopbtn()));
		String opp_details=co.opportunitylistpopbtn().getText();
		sa.assertEquals(opp_details, "Opportunity List");
		sa.assertAll();
	}
	

}
