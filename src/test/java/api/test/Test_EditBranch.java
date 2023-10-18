package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createbranch_payload;
import api.payloads.editbranch_payload;
import io.restassured.response.Response;

public class Test_EditBranch {
	editbranch_payload cr=new editbranch_payload();
	All_endpoint end;
	
	public static Logger logger=LogManager.getLogger();
	@Test(priority=1)
	public void editbranch_with_missingCity(){
		cr.setBranch_id("64c79f30d3b6783494e89609");
		cr.setAddress("awsedr");
		cr.setCity("");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("29IFJNM5466D2ZL");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("Yes");
		cr.setState("Goa");
		cr.setWaiver_date("0");
		logger.info("payload for edit branch address is provided");
		Response res= end.editbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Missing data in request, kindly recheck");
		logger.info("assertion for edit branch address  is done");
}


	@Test(priority=2)
	public void editbranch_with_missingAddress(){
		cr.setBranch_id("64c79f30d3b6783494e89609");
		cr.setAddress("");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("29IFJNM5466D2ZL");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("Yes");
		cr.setState("Goa");
		cr.setWaiver_date("0");
		logger.info("payload for edit branch address is provided");
		Response res= end.editbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Missing data in request, kindly recheck");
		logger.info("assertion for edit branch address  is done");
}
	
	@Test(priority=3)
	public void editbranch_with_missingCountry(){
		cr.setBranch_id("64c79f30d3b6783494e89609");
		cr.setAddress("nsdknsdcnkd ndskjncnd");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("29IFJNM5466D2ZL");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("Yes");
		cr.setState("Goa");
		cr.setWaiver_date("0");
		logger.info("payload for edit branch address is provided");
		Response res= end.editbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Missing data in request, kindly recheck");
		logger.info("assertion for edit branch address  is done");
}
	@Test(priority=4)
	public void editbranch_with_missingState(){
		cr.setBranch_id("64c79f30d3b6783494e89609");
		cr.setAddress("nsdknsdcnkd ndskjncnd");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("29IFJNM5466D2ZL");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("Yes");
		cr.setState("");
		cr.setWaiver_date("0");
		logger.info("payload for edit branch address is provided");
		Response res= end.editbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Missing data in request, kindly recheck");
		logger.info("assertion for edit branch address  is done");
}
	
	@Test(priority=4)
	public void editbranch_with_missingPincode(){
		cr.setBranch_id("64c79f30d3b6783494e89609");
		cr.setAddress("nsdknsdcnkd ndskjncnd");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("29IFJNM5466D2ZL");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("");
		cr.setRegisteredaddress("false");
		cr.setSez("Yes");
		cr.setState("Maharashtra");
		cr.setWaiver_date("0");
		logger.info("payload for edit branch address is provided");
		Response res= end.editbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Missing data in request, kindly recheck");
		logger.info("assertion for edit branch address  is done");
}
	@Test(priority=4)
	public void editbranch_with_existingCompGST(){
		cr.setBranch_id("64c79f30d3b6783494e89609");
		cr.setAddress("nsdknsdcnkd ndskjncnd");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("27AABCB1518L1ZS");
		cr.setHead_office_address("true");
		cr.setPhone("7654646666");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("Yes");
		cr.setState("Maharashtra");
		cr.setWaiver_date("0");
		logger.info("payload for edit branch address is provided");
		Response res= end.editbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "PAN details under provided GST, registered with another company.");
		logger.info("assertion for edit branch address  is done");
}
	
	@Test(priority=4)
	public void editbranch_with_existingPanattchedGST(){
		cr.setBranch_id("64c79f30d3b6783494e89609");
		cr.setAddress("nsdknsdcnkd ndskjncnd");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("26AABCB1518L1Z4");
		cr.setHead_office_address("true");
		cr.setPhone("7654646666");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("Yes");
		cr.setState("Maharashtra");
		cr.setWaiver_date("0");
		logger.info("payload for edit branch address is provided");
		Response res= end.editbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "PAN details under provided GST, registered with another company.");
		logger.info("assertion for edit branch address  is done");
}
	
	@Test(priority=4)
	public void editbranch_with_validData(){
		cr.setBranch_id("64c79f30d3b6783494e89609");
		cr.setAddress("nsdknsdcnkd ndskjncnd");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("27IFJNM5466D2ZL");
		cr.setHead_office_address("false");
		cr.setPhone("7654646666");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("Yes");
		cr.setState("Maharashtra");
		cr.setWaiver_date("0");
		logger.info("payload for edit branch address is provided");
		Response res= end.editbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("data").toString();
		Assert.assertEquals(err, "Branch office address updated successfully..");
		logger.info("assertion for edit branch address  is done");
}
	
	
}
