package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createbranch_payload;
import io.restassured.response.Response;

public class Test_createbranch_validations {
	createbranch_payload cr=new createbranch_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void createbranch_withexistingGst(){
//		{
//			"address": "awsedr",
//			"city": "Bagasara",
//			"company_id": "642280a1022bff290c8d8b76",
//			"country": "IN",
//			"email": "put@gmail.com",
//			"gst_waiver": "Yes",
//			"gstno": "06BZAHM6385P6Z2",
//			"head_office_address": "true",
//			"phone": "1244567892",
//			"pincode": "414253",
//			"registeredaddress": "false",
//			"sez": "Yes",
//			"state": "GJ",
//			"waiver_date": "2023-03-28T08:59:07.072Z"
//			}
		cr.setAddress("awsedr");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("27AABCB1518L1ZS");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("");
		cr.setState("Maharashtra");
		cr.setWaiver_date("");
		logger.info("payload for create branch address is provided");
		Response res= end.createbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "PAN details under provided GST, registered with another company.");
		logger.info("assertion for create branch address  is done");
}
	
	@Test(priority=2)
	public void createbranch_withexistingPan_attchecdGST(){
		cr.setAddress("awsedr");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("25AABCB1518L1ZS");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("");
		cr.setState("");
		cr.setWaiver_date("");
		logger.info("payload for create branch address is provided");
		Response res= end.createbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "PAN details under provided GST, registered with another company.");
		logger.info("assertion for create branch address  is done");
}
	@Test(priority=3)
	public void createbranch_with_Wrong_PanAttchedGST(){
		cr.setAddress("awsedr");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("25AAWCB1518L1ZS");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("");
		cr.setState("");
		cr.setWaiver_date("");
		logger.info("payload for create branch address is provided");
		Response res= end.createbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Credentials mismatch. Please Input PAN attached GST NO.");
		logger.info("assertion for create branch address  is done");
}
	@Test(priority=4)
	public void createbranch_with_missingGstwavier(){
		cr.setAddress("awsedr");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("");
		cr.setGstno("29IFJNM5466D2ZL");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("Yes");
		cr.setState("");
		cr.setWaiver_date("");
		logger.info("payload for create branch address is provided");
		Response res= end.createbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Missing data in request, kindly recheck");
		logger.info("assertion for create branch address  is done");
}
	@Test(priority=5)
	public void createbranch_with_missingState(){
		cr.setAddress("awsedr");
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
		logger.info("payload for create branch address is provided");
		Response res= end.createbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Missing data in request, kindly recheck");
		logger.info("assertion for create branch address  is done");
}
	@Test(priority=6)
	public void createbranch_with_missingcity(){
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
		logger.info("payload for create branch address is provided");
		Response res= end.createbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Missing data in request, kindly recheck");
		logger.info("assertion for create branch address  is done");
}
	@Test(priority=7)
	public void createbranch_with_missingaddress(){
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
		logger.info("payload for create branch address is provided");
		Response res= end.createbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(err, "Missing data in request, kindly recheck");
		logger.info("assertion for create branch address  is done");
	}

}
