package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.Edit_USER;
import api.payloads.delete_user;
import io.restassured.response.Response;

public class Test_edit_user {
	All_endpoint end;
	Edit_USER ed=new Edit_USER();
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void edituser_validdata() {
		ed.setBirth_date("1985-02-12");
		ed.setFirstname("Vrushali");
		ed.setLastname("Dengle");
		ed.setUsercreate_email("vrushali@mobigic.com");
		ed.setUsercreate_id("6450d528f5614c9a92e929bf");
		ed.setUsercreate_primaryphone("7755441125");
		ed.setUsercreate_role("6459f03af77665c5dfa93b35");
		ed.setUsercreate_reportingTo("6450d528f5614c9a92e929bf");
		ed.setUsercreate_secondaryphone("");
		
		logger.info("payload provided for edit user with valid input");
		
		Response response=end.Edit_user(ed);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String truemsg=response.jsonPath().get("data").toString();
		Assert.assertEquals(truemsg, "User modified.");
		logger.info("user modified with valid data");
	}
	
	
	@Test(priority=2)
	public void edituser_withblank_id() {
		ed.setBirth_date("1985-02-12");
		ed.setFirstname("Vrushali");
		ed.setLastname("Dengle");
		ed.setUsercreate_email("vrushali646@mobigic.com");
		ed.setUsercreate_id("");
		ed.setUsercreate_primaryphone("7755441125464646");			//6450d528f5614c9a92e929bf
		ed.setUsercreate_role("6459f03af77665c5dfa93b35");
		ed.setUsercreate_reportingTo("6450d528f5614c9a92e929bf");
		ed.setUsercreate_secondaryphone("");
		
		logger.info("payload provided for edit user with blank id");
		
		Response response=end.Edit_user(ed);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String truemsg=response.jsonPath().get("errormsg").toString();
		Assert.assertEquals(truemsg, "There is nothing to edit");
		logger.info("error msg shown when no id present");
	}	
	
	@Test(priority=3)
	public void edituser_invalid_id() {
		ed.setBirth_date("1985-02-12");
		ed.setFirstname("Vrushali");
		ed.setLastname("Dengle");
		ed.setUsercreate_email("vrushali4546@mobigic.com");
		ed.setUsercreate_id("65446165616");
		ed.setUsercreate_primaryphone("77554411000");			//6450d528f5614c9a92e929bf
		ed.setUsercreate_role("6459f03af77665c5dfa93b35");
		ed.setUsercreate_reportingTo("6450d528f5614c9a92e929bf");
		ed.setUsercreate_secondaryphone("");
		
		logger.info("payload provided for edit user with invalid id");
		
		Response response=end.Edit_user(ed);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String truemsg=response.jsonPath().get("errormsg").toString();
		Assert.assertEquals(truemsg, "something goes wrong.");
		logger.info("error msg shown when no id present");
	}	
	
	@Test(priority=4)
	public void edituser_blank_phone() {
		ed.setBirth_date("1985-02-12");
		ed.setFirstname("Vrushali");
		ed.setLastname("Dengle");
		ed.setUsercreate_email("vrushali@mobigic.com");
		ed.setUsercreate_id("6450d528f5614c9a92e929bf");		//
		ed.setUsercreate_primaryphone("");			
		ed.setUsercreate_role("6459f03af77665c5dfa93b35");
		ed.setUsercreate_reportingTo("6450d528f5614c9a92e929bf");
		ed.setUsercreate_secondaryphone("");
		
		logger.info("payload provided for edit user with blank phoneno");
		
		Response response=end.Edit_user(ed);
		response.then().log().all();
		response.then().assertThat().statusCode(500);
		logger.info("Statuscode verified");
	}	
	
	@Test(priority=5)
	public void edituser_withexistingmail() {
		ed.setBirth_date("1985-02-12");
		ed.setFirstname("Vrushali");
		ed.setLastname("Dengle");
		ed.setUsercreate_email("jayesh@mobigic.com");
		ed.setUsercreate_id("6450d528f5614c9a92e929bf");		//
		ed.setUsercreate_primaryphone("8734545454");			
		ed.setUsercreate_role("6459f03af77665c5dfa93b35");
		ed.setUsercreate_reportingTo("6450d528f5614c9a92e929bf");
		ed.setUsercreate_secondaryphone("");
		
		logger.info("payload provided for edit user with another existing user mail");
		
		Response response=end.Edit_user(ed);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		logger.info("Statuscode verified");
		String emailerr=response.jsonPath().get("errormsg").toString();
		Assert.assertEquals(emailerr, "Email address is already Register");
		logger.info("error message shown for existing email when edit user");
	}
	
	@Test(priority=5)
	public void edituser_withexistinuser_phone() {
		ed.setBirth_date("1985-02-12");
		ed.setFirstname("Vrushali");
		ed.setLastname("Dengle");
		ed.setUsercreate_email("vrushali@mobigic.com");
		ed.setUsercreate_id("6450d528f5614c9a92e929bf");		//
		ed.setUsercreate_primaryphone("9175751130");			
		ed.setUsercreate_role("6459f03af77665c5dfa93b35");
		ed.setUsercreate_reportingTo("6450d528f5614c9a92e929bf");
		ed.setUsercreate_secondaryphone("");
		
		logger.info("payload provided for edit user with another existing user phone");
		
		Response response=end.Edit_user(ed);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		logger.info("Statuscode verified");
		String phonerr=response.jsonPath().get("errormsg").toString();
		Assert.assertEquals(phonerr, "Mobile Number is already Register");
		logger.info("error message shown for existing phone no when edit user");
	}
}
