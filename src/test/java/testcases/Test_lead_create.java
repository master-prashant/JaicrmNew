package testcases;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.companyprofile;
import pageobject.compprofileleadlist;
import pageobject.create_leadDahboard;
import pageobject.createcomp_float;
import pageobject.dashboard;
import pageobject.leadlist;

public class Test_lead_create extends Base2 {
	SoftAssert sa= new SoftAssert();

	@Test(priority=1)
	public void leadcreate_with_valid_datafromfloat_btn() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		create_leadDahboard cl=new create_leadDahboard(driver);
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
		db.plusicon().click();
		wait.until(ExpectedConditions.visibilityOf(db.createlead()));
		db.createlead().click();
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
		for(WebElement serprov:cl.servprovlist()) {
			String servprovlist=serprov.getText();
			if(servprovlist.contains("Dell")) {
				serprov.click();
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(cl.selectproductfamily()));
		cl.selectproductfamily().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(cl.prodfamlist()));
		for(WebElement prodfam:cl.prodfamlist()) {
			String prodfamlist=prodfam.getText();
			if(prodfamlist.contains("Laptops")) {
				prodfam.click();
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(cl.selectproduct()));
		cl.selectproduct().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(cl.productist()));
		for(WebElement product:cl.productist()) {
			String productlist=product.getText();
			if(productlist.contains("Inspirion 3537")) {
				wait.until(ExpectedConditions.visibilityOf(product));
				product.click();
				break;
			}
		}
		cl.summary().sendKeys("dnkjcnkds sdkjckjsd csdkjnkjcsd csdkjcnksdnc dksckjnsdk csdnjcsdc dsnckdsnk v sdnvndskv dskvkjsdnv kdnkfv ");
		cl.savebtn().click();
		wait.until(ExpectedConditions.visibilityOf(cl.leadlistbtn()));
		boolean lealbtn=cl.leadlistbtn().isDisplayed();
		sa.assertEquals(lealbtn, true);
		cl.leadlistbtn().click();
		sa.assertAll();
		
	}
	
	@Test(priority=2)
	public void cheecksave_beforeselection() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		create_leadDahboard cl=new create_leadDahboard(driver);
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
		db.plusicon().click();
		wait.until(ExpectedConditions.visibilityOf(db.createlead()));
		db.createlead().click();
		wait.until(ExpectedConditions.visibilityOf(cl.selectcomp()));
		boolean btn=cl.savebtn().isEnabled();
		sa.assertEquals(btn, false);
		sa.assertAll();
	}
	
	@Test(priority=3)
	public void cheeckerrormsg_beforeselection() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		create_leadDahboard cl=new create_leadDahboard(driver);
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
		db.plusicon().click();
		wait.until(ExpectedConditions.visibilityOf(db.createlead()));
		db.createlead().click();
		wait.until(ExpectedConditions.visibilityOf(cl.selectcomp()));
		cl.selectcomp().click();
		cl.selectcomp().sendKeys("bajaj");
		wait.until(ExpectedConditions.visibilityOf(cl.compoption()));
		cl.compoption().click();
		wait.until(ExpectedConditions.visibilityOf(cl.savebtn()));
		cl.savebtn().click();
		String seladd=cl.seladderror().getText();
		sa.assertEquals(seladd, "Please Select Address.");
		String selcont=cl.selconerror().getText();
		sa.assertEquals(selcont, "Please Select Contact.");
		String leadname=cl.leadnameerror().getText();
		sa.assertEquals(leadname, "Please Enter Lead Name between 1 to 50 characters.");
		String type=cl.seltypeerror().getText();
		sa.assertEquals(type, "Please Select type.");
		String source=cl.sourceerror().getText();
		sa.assertEquals(source, "Please Select Source.");
		String datasource=cl.datasourceerror().getText();
		sa.assertEquals(datasource, "Please Enter Data Source.");
		String servprov=cl.serproverror().getText();
		sa.assertEquals(servprov, "Please Select Service Provider");
		String prodfam=cl.prodfamerror().getText();
		sa.assertEquals(prodfam, "Please Select Product Family");
		String prod=cl.proderror().getText();
		sa.assertEquals(prod, "Please Select Product.");
		String summ=cl.summerror().getText();
		sa.assertEquals(summ, "Please add the summary between 100 to 2000 characters");
		sa.assertAll();
	}
	
	@Test(priority=4)
	public void createlead_ifcontact_notpresent() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		create_leadDahboard cl=new create_leadDahboard(driver);
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
		db.plusicon().click();
		wait.until(ExpectedConditions.visibilityOf(db.createlead()));
		db.createlead().click();
		wait.until(ExpectedConditions.visibilityOf(cl.selectcomp()));
		cl.selectcomp().click();
		cl.selectcomp().sendKeys("zingbus");
		wait.until(ExpectedConditions.visibilityOf(cl.compoption()));
		cl.compoption().click();
		String cont=driver.findElement(By.xpath("//small[@style='color: red;']")).getText();
		sa.assertEquals(cont, "Please Add Contact");
		sa.assertAll();
	}
	
	@Test(priority=5)
	public void createlead_ifaddress_notpresent() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		create_leadDahboard cl=new create_leadDahboard(driver);
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
		db.plusicon().click();
		wait.until(ExpectedConditions.visibilityOf(db.createlead()));
		db.createlead().click();
		wait.until(ExpectedConditions.visibilityOf(cl.selectcomp()));
		cl.selectcomp().click();
		cl.selectcomp().sendKeys("alex");
		wait.until(ExpectedConditions.visibilityOf(cl.compoption()));
		cl.compoption().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//small[@style='color: red;'])[1]"))));
		String add=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]")).getText();
		sa.assertEquals(add, "Please Add Address");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//small[@style='color: red;'])[2]"))));
		String cont=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
		sa.assertEquals(cont, "Please Add Contact");
		sa.assertAll();
	}
	
	@Test(priority=6)
	public void createlead_fromcompprof() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		wait1.withTimeout(Duration.ofMillis(10000));
		wait1.pollingEvery(Duration.ofMillis(500));
		dashboard db=new dashboard(driver);
		create_leadDahboard main=new create_leadDahboard(driver);
		companyprofile com=new companyprofile(driver);
		compprofileleadlist ll=new compprofileleadlist(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		wait1.until(ExpectedConditions.visibilityOf(db.searchfordropdown()));
		db.searchfordropdown().click();
		db.compvalue().click();
		wait1.until(ExpectedConditions.visibilityOf(db.searchvalue()));
		db.searchvalue().sendKeys("bajaj");
		wait1.until(ExpectedConditions.visibilityOf(db.compdrofirst()));
		db.compdrofirst().click();
		companyprofile cop=new companyprofile(driver);
		wait.until(ExpectedConditions.visibilityOf(cop.leadcard()));
		cop.leadcard().click();
		wait1.until(ExpectedConditions.visibilityOf(ll.createlead()));
		ll.createlead().click();
		//wait1.until(ExpectedConditions.visibilityOf(com.companyname()));
		//String compname=com.companyname().getText();
		//sa.assertEquals(compname, "BAJAJ PRIVATE LIMITED");
		wait1.until(ExpectedConditions.visibilityOf(main.selectaddress()));
		main.selectaddress().click();
		main.addresslist().click();
		main.selectcontact().click();
		main.contcatlist().click();
		main.selectserviceprovider().click();
		for(WebElement serprov:main.servprovlist()) {
			String servprovlist=serprov.getText();
			if(servprovlist.contains("Dell")) {
				wait.until(ExpectedConditions.visibilityOf(serprov));
				serprov.click();
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(main.selectproductfamily()));
		main.selectproductfamily().click();
		for(WebElement prodfam:main.prodfamlist()) {
			String prodfamlist=prodfam.getText();
			if(prodfamlist.contains("Laptops")) {
				wait.until(ExpectedConditions.visibilityOf(prodfam));
				prodfam.click();
				break;
			}
		}
		main.selecttype().click();
		main.hottype().click();
		main.leadname().sendKeys("automaiton lead");
		main.selectsource().click();
		main.sourceEmail().click();
		main.datasource().sendKeys("automated");
		wait.until(ExpectedConditions.elementToBeClickable(main.selectproduct()));
		main.selectproduct().click();
		for(WebElement product:main.productist()) {
			wait.until(ExpectedConditions.visibilityOf(product));
			String productlist=product.getText();
			if(productlist.contains("Inspirion 3537")) {
				wait.until(ExpectedConditions.visibilityOf(product));
				product.click();
				break;
			}
		}
		main.summary().sendKeys("dnkjcnkds sdkjckjsd csdkjnkjcsd csdkjcnksdnc dksckjnsdk csdnjcsdc dsnckdsnk v sdnvndskv dskvkjsdnv kdnkfv");
		main.savebtn().click();
		wait1.until(ExpectedConditions.visibilityOf(main.okswal()));
		main.okswal().click();
		sa.assertAll();
	}	
	@Test(priority=7)
	public void leadcreate_with_valid_datafromdashboard_leadcard() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		wait1.withTimeout(Duration.ofMillis(10000));
		wait1.pollingEvery(Duration.ofMillis(500));
		create_leadDahboard cl=new create_leadDahboard(driver);
		leadlist ll=new leadlist(driver);
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		wait.until(ExpectedConditions.visibilityOf(db.leadscard()));
		db.leadscard().click();
		wait.until(ExpectedConditions.visibilityOf(ll.createlead()));
		ll.createlead().click();
		wait.until(ExpectedConditions.visibilityOf(cl.selectcomp()));
		cl.selectcomp().click();
		cl.selectcomp().sendKeys("bajaj");
		wait1.until(ExpectedConditions.visibilityOf(cl.compoption()));
		cl.compoption().click();
		wait1.until(ExpectedConditions.elementToBeClickable(cl.selectaddress()));
		cl.selectaddress().click();
		wait1.until(ExpectedConditions.visibilityOf(cl.addresslist()));
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
		cl.selectserviceprovider().click();
		for(WebElement serprov:cl.servprovlist()) {
			String servprovlist=serprov.getText();
			if(servprovlist.contains("Dell")) {
				wait1.until(ExpectedConditions.visibilityOf(serprov));
				serprov.click();
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(cl.selectproductfamily()));
		cl.selectproductfamily().click();
		for(WebElement prodfam:cl.prodfamlist()) {
			String prodfamlist=prodfam.getText();
			if(prodfamlist.contains("Laptops")) {
				wait.until(ExpectedConditions.visibilityOf(prodfam));
				prodfam.click();
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(cl.selectproduct()));
		cl.selectproduct().click();
		for(WebElement product:cl.productist()) {
			String productlist=product.getText();
			if(productlist.contains("Inspirion 3537")) {
				wait.until(ExpectedConditions.visibilityOf(product));
				product.click();
				break;
			}
		}
		
		cl.summary().sendKeys("dnkjcnkds sdkjckjsd csdkjnkjcsd csdkjcnksdnc dksckjnsdk csdnjcsdc dsnckdsnk v sdnvndskv dskvkjsdnv kdnkfv ");
		cl.savebtn().click();
		//boolean lealbtn=cl.leadlistbtn().isDisplayed();
		//sa.assertEquals(lealbtn, true);
		wait1.until(ExpectedConditions.visibilityOf(cl.okswal()));
		cl.okswal().click();	
		sa.assertAll();
	}
	
//	@Test(priority=8)
//	public void check_productfamerror_ifproductnotpresent() throws InterruptedException {
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
//		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
//		wait1.withTimeout(Duration.ofMillis(10000));
//		wait1.pollingEvery(Duration.ofMillis(500));
//		create_leadDahboard cl=new create_leadDahboard(driver);
//		dashboard db=new dashboard(driver);
//		wait.until(ExpectedConditions.visibilityOf(db.logo()));
//		db.logo().click();
//		wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
//		db.plusicon().click();
//		wait.until(ExpectedConditions.visibilityOf(db.createlead()));
//		db.createlead().click();
//		wait.until(ExpectedConditions.visibilityOf(cl.selectserviceprovider()));
//		cl.selectserviceprovider().click();
//		for(WebElement serprov:cl.servprovlist()) {
//			String servprovlist=serprov.getText();
//			if(servprovlist.contains("Dont Add Product Family")) {
//				wait1.until(ExpectedConditions.visibilityOf(serprov));
//				serprov.click();
//				break;
//			}
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(cl.addprodfamerror()));
//		String addfam=cl.addprodfamerror().getText();
//		
//		sa.assertEquals(addfam, "Add Product family for Dont Add Product Family. Please contact to Admin.");
//		cl.okswal().click();
//		sa.assertAll();
//		
//		}
	
	@Test(priority=9)
	public void check_producterror_ifproductfamnotpresent() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		wait1.withTimeout(Duration.ofMillis(10000));
		wait1.pollingEvery(Duration.ofMillis(500));
		create_leadDahboard cl=new create_leadDahboard(driver);
		dashboard db=new dashboard(driver);
		wait.until(ExpectedConditions.visibilityOf(db.logo()));
		db.logo().click();
		wait.until(ExpectedConditions.visibilityOf(db.plusicon()));
		db.plusicon().click();
		wait.until(ExpectedConditions.visibilityOf(db.createlead()));
		db.createlead().click();
		wait1.until(ExpectedConditions.visibilityOf(cl.selectserviceprovider()));
		cl.selectserviceprovider().click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("li[tabindex='0']"))));
		for(WebElement serprov:cl.servprovlist()) {
			String servprovlist=serprov.getText();
			if(servprovlist.contains("Dont Add Product Family")) {
				wait1.until(ExpectedConditions.visibilityOf(serprov));
				serprov.click();
				break;
			}
		}
		wait1.until(ExpectedConditions.elementToBeClickable(cl.selectproductfamily()));
		cl.selectproductfamily().click();
		for(WebElement prodfam:cl.prodfamlist()) {
			String prodfamlist=prodfam.getText();
			if(prodfamlist.contains("Laptops")) {
				wait1.until(ExpectedConditions.visibilityOf(prodfam));
				prodfam.click();
				break;
			}
		}
		wait.until(ExpectedConditions.visibilityOf(cl.addprodfamerror()));
		String addfam=cl.addprodfamerror().getText();
		
		sa.assertEquals(addfam, "No product exists for this Laptops under Dont Add Product Family. Please contact the admin about adding a product.");
		cl.okswal().click();
		sa.assertAll();
		}
	
	
}
