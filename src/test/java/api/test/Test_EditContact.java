package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createcontact_payload;
import api.payloads.editcontact_payload;
import io.restassured.response.Response;

public class Test_EditContact {
	editcontact_payload cr=new editcontact_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	
	@Test(priority=1)
	public void editcontact_with_existingmail(){
		cr.setCompany_id("647eaa713f33a4f60f8fab23");
		cr.setContact_id("64c8a02e933e494d3e2a8356");
		cr.setDepartment("Purchase");
		cr.setDesignation("Director");
		cr.setDob("1985-05-16");
		cr.setEmail("naval@gmail.com");
		cr.setExtendedDesignation("");
		cr.setFirstname("NAVAL");
		cr.setLastname("PATEL");
		cr.setLinkdin("");
		cr.setOfficephone("");
		cr.setPhone("7898554545");
		cr.setTwitter("");
		
		logger.info("edit contact payload is provided");
		Response res= end.editcontact(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Email is already Register");
		logger.info("assertion for edit contact is done");
}
	@Test(priority=2)
	public void editcontact_with_existingPhone(){
		cr.setCompany_id("647eaa713f33a4f60f8fab23");
		cr.setContact_id("64c8a02e933e494d3e2a8356");
		cr.setDepartment("Purchase");
		cr.setDesignation("Director");
		cr.setDob("1985-05-16");
		cr.setEmail("naval12345@gmail.com");
		cr.setExtendedDesignation("");
		cr.setFirstname("NAVAL");
		cr.setLastname("PATEL");
		cr.setLinkdin("");
		cr.setOfficephone("");
		cr.setPhone("9854411255");
		cr.setTwitter("");
		
		logger.info("edit contact payload is provided");		
		Response res= end.editcontact(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Mobile Number is already Register");
		logger.info("assertion for edit contact is done");
}
	
	@Test(priority=3)
	public void editcontact_with_validData(){
		cr.setCompany_id("647eaa713f33a4f60f8fab23");
		cr.setContact_id("64c8a02e933e494d3e2a8356");
		cr.setDepartment("Purchase");
		cr.setDesignation("Director");
		cr.setDob("1985-05-16");
		cr.setEmail("naval12345@gmail.com");
		cr.setExtendedDesignation("");
		cr.setFirstname("NAVAL");
		cr.setLastname("PATEL");
		cr.setLinkdin("");
		cr.setOfficephone("");
		cr.setPhone("9854411255");
		cr.setTwitter("");
		
		logger.info("edit contact payload is provided");		
		Response res= end.editcontact(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String msg=res.jsonPath().get("data").toString();
		Assert.assertEquals(msg, "Contact updated successfully..");
		logger.info("assertion for edit contact is done");
}
	@Test(priority=4)
	public void editcontact_with_MissingData(){
		cr.setCompany_id("647eaa713f33a4f60f8fab23");
		cr.setContact_id("64c8a02e933e494d3e2a8356");
		cr.setDepartment("Purchase");
		cr.setDesignation("Director");
		cr.setDob("1985-05-16");
		cr.setEmail("naval12345@gmail.com");
		cr.setExtendedDesignation("");
		cr.setFirstname("NAVAL");
		cr.setLastname("PATEL");
		cr.setLinkdin("");
		cr.setOfficephone("");
		cr.setPhone("");
		cr.setTwitter("");
		
		logger.info("edit contact payload is provided");		
		Response res= end.editcontact(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String msg=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(msg, "Missing data in request, kindly recheck");
		logger.info("assertion for edit contact is done");
}
}
