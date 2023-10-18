package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createbranch_payload;
import api.payloads.userlist_payload;
import io.restassured.response.Response;

public class Test_CreateBranch {
	
	createbranch_payload cr=new createbranch_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
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

	@Test(priority=1)
	public void createHeadOfficeadd_with_validData(){
		cr.setAddress("awsedr kjkjnj kjnkjnk nkjnknkn");
		cr.setCity("Nilanga");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("29IFJNM5466D2Z1");
		cr.setHead_office_address("true");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("false");
		cr.setSez("No");
		cr.setState("Maharashtra");
		cr.setWaiver_date("0");
		logger.info("payload for create branch address is provided");
		Response res= end.createbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("data").toString();
		Assert.assertEquals(err, "Registered office address created successfully..");
		logger.info("assertion for create branch address  is done");
}
	@Test(priority=2)
	public void createRrgiSOfficeadd_with_validData(){
		cr.setAddress("awsedr kjkjnj kjnkjnk nkjnknkn");
		cr.setCity("Latur");
		cr.setCompany_id("64c38d4be466b805fb6ba0ca");
		cr.setCountry("IN");
		cr.setEmail("rahulogg@gmail.com");
		cr.setGst_waiver("No");
		cr.setGstno("29IFJNM5466D2Z1");
		cr.setHead_office_address("false");
		cr.setPhone("7855445445");
		cr.setPincode("413521");
		cr.setRegisteredaddress("true");
		cr.setSez("No");
		cr.setState("Maharashtra");
		cr.setWaiver_date("0");
		logger.info("payload for create branch address is provided");
		Response res= end.createbranch(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String err=res.jsonPath().get("data").toString();
		Assert.assertEquals(err, "Registered office address created successfully..");
		logger.info("assertion for create branch address  is done");
}

}
