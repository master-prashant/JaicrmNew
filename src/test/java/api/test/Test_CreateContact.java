package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createcontact_payload;
import io.restassured.response.Response;

public class Test_CreateContact {
	createcontact_payload cr=new createcontact_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	
	@Test()
	public void createcontact_with_existingmail(){
		cr.setCompany_id("647eaa713f33a4f60f8fab23");
		cr.setDepartment("Purchase");
		cr.setDesignation("Director");
		cr.setDob("1985-07-15");
		cr.setEmail("naval125@gmail.com");
		cr.setExtendedDesignation("");
		cr.setFirstname("Naval");
		cr.setLastname("Patel");
		cr.setLinkdin("");
		cr.setOfficephone("");
		cr.setPhone("7698554545");
		cr.setTwitter("");
		
		logger.info("create contact payload is provided");
		Response res= end.createcontact(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String msg=res.jsonPath().get("data").toString();
		Assert.assertEquals(msg, "Contact created successfully..");
		logger.info("assertion for create contact is done");
}

}
