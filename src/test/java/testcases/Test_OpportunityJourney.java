package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.create_leadDahboard;
import pageobject.createopportunity;
import pageobject.dashboard;
import pageobject.leaddetails;
import pageobject.leadlist;
import pageobject.opp_details;
import utilities.readconfig;

public class Test_OpportunityJourney extends Base2 {
	SoftAssert sa=new SoftAssert();
	readconfig re=new readconfig();
	@SuppressWarnings("unchecked")
	@Test(priority=1)
	public void checkfileup() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
		
//		FluentWait wait1=new FluentWait(driver);
//		wait1.withTimeout(Duration.ofSeconds(10));
//		wait1.pollingEvery(Duration.ofMillis(500));
//		wait1.ignoring(Exception.class);
		leadlist ll = new leadlist(driver);
		dashboard db = new dashboard(driver);
		leaddetails cf=new leaddetails(driver);
		createopportunity co= new createopportunity(driver);
		create_leadDahboard cl = new create_leadDahboard(driver);
		opp_details opd=new opp_details(driver);
		wait1.until(ExpectedConditions.visibilityOf(db.opportunitiscard()));
		db.opportunitiscard().click();
		WebElement oppid=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/table/tbody/tr[1]/th/p"));
		wait1.until(ExpectedConditions.visibilityOf(oppid));
		oppid.click();
		wait1.until(ExpectedConditions.invisibilityOf(opd.fileuploadBtn()));
		opd.fileuploadBtn().sendKeys(System.getProperty("user.dir")+"//testdata//doc.pdf");
		Thread.sleep(Duration.ofSeconds(2));
		
		}
	@Test(priority=1, enabled=false)
	public void validatelead() throws InterruptedException {
		//WebDriverwait1 wait1 = new WebDriverwait1(driver, Duration.ofSeconds(60));
		@SuppressWarnings("rawtypes")
		FluentWait wait1=new FluentWait(driver);
		wait1.withTimeout(Duration.ofSeconds(4));
		wait1.pollingEvery(Duration.ofMillis(500));
		wait1.ignoring(Exception.class);
		leadlist ll = new leadlist(driver);
		dashboard db = new dashboard(driver);
		leaddetails cf=new leaddetails(driver);
		createopportunity co= new createopportunity(driver);
		create_leadDahboard cl = new create_leadDahboard(driver);
		opp_details opd=new opp_details(driver);
		wait1.until(ExpectedConditions.visibilityOf(db.leadscard()));
		db.leadscard().click();
		wait1.until(ExpectedConditions.visibilityOf(ll.createlead()));
		ll.createlead().click();
		wait1.until(ExpectedConditions.visibilityOf(cl.selectcomp()));
		cl.selectcomp().click();
		cl.selectcomp().sendKeys("bajaj");
		wait1.until(ExpectedConditions.visibilityOf(cl.compoption()));
		cl.compoption().click();
		wait1.until(ExpectedConditions.visibilityOf(cl.selectaddress()));
		cl.selectaddress().click();
		wait1.until(ExpectedConditions.visibilityOf(cl.addresslist()));
		cl.addresslist().click();
		cl.selectcontact().click();
		wait1.until(ExpectedConditions.visibilityOf(cl.contcatlist()));
		cl.contcatlist().click();
		cl.selecttype().click();
		wait1.until(ExpectedConditions.visibilityOf(cl.Coldtype()));
		cl.Coldtype().click();
		cl.leadname().sendKeys("need internet service for office");
		cl.selectsource().click();
		wait1.until(ExpectedConditions.visibilityOf(cl.sourcetradeind()));
		cl.sourcetradeind().click();
		cl.datasource().sendKeys("friends sugg");
		wait1.until(ExpectedConditions.visibilityOf(cl.selectserviceprovider()));
		cl.selectserviceprovider().click();
		wait1.until(ExpectedConditions.visibilityOfAllElements(cl.servprovlist()));
		for (WebElement serprov : cl.servprovlist()) {
			String servprovlist = serprov.getText();
			if (servprovlist.contains("Dell")) {
				serprov.click();
				break;
			}
		}
		wait1.until(ExpectedConditions.elementToBeClickable(cl.selectproductfamily()));
		cl.selectproductfamily().click();
		wait1.until(ExpectedConditions.visibilityOfAllElements(cl.prodfamlist()));
		for (WebElement prodfam : cl.prodfamlist()) {
			String prodfamlist = prodfam.getText();
			if (prodfamlist.contains("Laptops")) {
				prodfam.click();
				break;
			}
		}
		wait1.until(ExpectedConditions.elementToBeClickable(cl.selectproduct()));
		cl.selectproduct().click();
		wait1.until(ExpectedConditions.visibilityOfAllElements(cl.productist()));
		for (WebElement product : cl.productist()) {
			String productlist = product.getText();
			if (productlist.contains("Inspirion 3537")) {
				wait1.until(ExpectedConditions.visibilityOf(product));
				product.click();
				break;
			}
		}
		cl.summary().sendKeys(
				"dnkjcnkds sdkjckjsd csdkjnkjcsd csdkjcnksdnc dksckjnsdk csdnjcsdc dsnckdsnk v sdnvndskv dskvkjsdnv kdnkfv ");
		cl.savebtn().click();
		wait1.until(ExpectedConditions.visibilityOf(cl.okswal()));
		cl.okswal().click();
		wait1.until(ExpectedConditions.elementToBeClickable(ll.nextpage()));
		ll.firstleadintable().click();
		wait1.until(ExpectedConditions.elementToBeClickable(cf.validatelead()));
		cf.validatelead().click();
		wait1.until(ExpectedConditions.visibilityOf(cf.yes_validatepop()));
		cf.yes_validatepop().click();
		wait1.until(ExpectedConditions.visibilityOf(cf.okswal()));
		cf.okswal().click();
		wait1.until(ExpectedConditions.visibilityOf(cf.validatedtext()));
		String val=cf.validatedtext().getText();
		sa.assertEquals(val, "Validated");
		cf.converttoopportunityTop().click();
		wait1.until(ExpectedConditions.visibilityOf(co.selectLineofBuissness()));
		co.selectLineofBuissness().click();
		wait1.until(ExpectedConditions.visibilityOf(co.itinfraStructure()));
		co.itinfraStructure().click();
		co.expectedmrc().sendKeys("10");
		co.expectedNRC().sendKeys("5");
		co.savewithoutfolup().click();
		wait1.until(ExpectedConditions.visibilityOf(co.opportunityDetailspopbtn()));
		co.opportunityDetailspopbtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.editbt()));
		opd.editbt().click();
		wait1.until(ExpectedConditions.visibilityOf(co.serviceprovOppID()));
		co.serviceprovOppID().sendKeys("12345678");
		co.savewithoutfolup().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.swaltitle()));
		String msg=opd.swaltitle().getText();
		sa.assertEquals(msg, "Opportunity updated successfully..");
		opd.okswalbtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.stagenameTitle()));
		String iden=opd.stagenameTitle().getText();
		sa.assertEquals(iden, "Identified");					//checking stage name after opportunity created
		opd.approvebtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.okswalbtn()));
		opd.okswalbtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.stagenameTitle()));
		String qul=opd.stagenameTitle().getText();
		sa.assertEquals(qul, "Qualified");					//checking stage name after approval of qualified request
		opd.feasiblitysavebtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.okswalbtn()));
		opd.okswalbtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.stagenameTitle()));
		String quali=opd.stagenameTitle().getText();
		sa.assertEquals(quali, "Qualified");				//checking again stage name after check feasibility request
		opd.approvebtn().click();								//approving feasible state
		wait1.until(ExpectedConditions.visibilityOf(opd.okswalbtn()));
		opd.okswalbtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.stagenameTitle()));
		String feas=opd.stagenameTitle().getText();
		sa.assertEquals(feas, "Feasible");					//checking stage name after approval of feasible request
		opd.ulpoadDocandSentforAppr().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.swaltitle()));
		String fileuploerr=opd.swaltitle().getText();
		sa.assertEquals(fileuploerr, "No files were uploaded");	 //checking error message if file is not selected and click on send request button
		opd.okswalbtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.fileuploadBtn()));
		opd.fileuploadBtn().sendKeys(re.LargeSizeFile());
		wait1.until(ExpectedConditions.visibilityOf(opd.swaltitle()));
		String Lfileuploerr=opd.swaltitle().getText();
		sa.assertEquals(Lfileuploerr, "File size should be less than 2 MB");	 //checking error message if fileSize is greater than 2MB
		opd.okswalbtn().click();	
		wait1.until(ExpectedConditions.visibilityOf(opd.fileuploadBtn()));
		opd.fileuploadBtn().sendKeys(re.LargeSizeFile());
		wait1.until(ExpectedConditions.visibilityOf(opd.swaltitle()));
		String fileformerr=opd.swaltitle().getText();
		sa.assertEquals(fileformerr, "Invalid File Format. Please Upload pdf, jpg, jpeg, png files.");	 //checking error message if file format is wrong
		opd.okswalbtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.fileuploadBtn()));													
		opd.fileuploadBtn().sendKeys(re.getFilePath());			//uploading correct file for solution
		wait1.until(ExpectedConditions.visibilityOf(opd.ulpoadDocandSentforAppr()));
		opd.ulpoadDocandSentforAppr().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.okswalbtn()));
		cf.okswal().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.stagenameTitle()));
		String feasap=opd.stagenameTitle().getText();
		sa.assertEquals(feasap, "Feasible");					//checking stage name before approval of solution request
		opd.approvebtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.okswalbtn()));
		cf.okswal().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.stagenameTitle()));
		String sol=opd.stagenameTitle().getText();
		sa.assertEquals(sol, "Solution");					//checking stage name after approval of solution request
		opd.commertialSavebtn().click();
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//small[@style='color: red;'])[1]"))));
		String otcerr=driver.findElement(By.xpath("(//small[@style='color: red;'])[1]")).getText();
		String arcerr=driver.findElement(By.xpath("(//small[@style='color: red;'])[2]")).getText();
		String cperr=driver.findElement(By.xpath("(//small[@style='color: red;'])[3]")).getText();
		String bferr=driver.findElement(By.xpath("(//small[@style='color: red;'])[4]")).getText();
		String bberr=driver.findElement(By.xpath("(//small[@style='color: red;'])[5]")).getText();
		String bterr=driver.findElement(By.xpath("(//small[@style='color: red;'])[6]")).getText();
		sa.assertEquals(otcerr, "Please Enter One Time Charges.");			//validating the errors if values not added for commercial
		sa.assertEquals(arcerr, "Please Enter Recurring Charges.");
		sa.assertEquals(cperr, "Please Select Contract(period).");
		sa.assertEquals(bferr, "Please Select Bill Frequency.");
		sa.assertEquals(bberr, "Please Select Billed By.");
		sa.assertEquals(bterr, "Please Select Type.");
		opd.CommOTC().sendKeys("11000");				//adding one time charge
		opd.CommARC().sendKeys("20000");				//adding annual recurring charge
		opd.selectContractp().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.limonth()));
		opd.limonth().click();						//selecting 24 month in contract period
		opd.selectBillingfreqdrdo().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.liAnnually()));
		opd.liAnnually().click();						//selecting annually in billing frequency 
		opd.selectBilledBY().click();					
		wait1.until(ExpectedConditions.visibilityOf(opd.LiMobigic()));
		opd.LiMobigic().click();						//selecting billed by as mobigic
		opd.selectBillingType().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.LiAdvance()));
		opd.LiAdvance().click();						//selecting billing type as advance
		opd.commertialSavebtn().click();					//click save commercial button
		wait1.until(ExpectedConditions.visibilityOf(opd.okswalbtn()));
		opd.okswalbtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.stagenameTitle()));
		String solu=opd.stagenameTitle().getText();
		sa.assertEquals(solu, "Solution");					//checking stage name after filling commercials
		opd.approvebtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.okswalbtn()));
		opd.okswalbtn().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.stagenameTitle()));
		String com=opd.stagenameTitle().getText();
		sa.assertEquals(com, "Commercials");					//checking stage name after approval of commercials
		opd.fileuploadBtn().sendKeys(re.getFilePath());
		opd.ulpoadDocandSentforAppr().click();
		wait1.until(ExpectedConditions.visibilityOf(opd.okswalbtn()));
		opd.okswalbtn().click();
		sa.assertAll();
}
}
