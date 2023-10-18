package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.Edit_USER;
import api.payloads.verifycompanyname;
import io.restassured.response.Response;

public class Test_VerifyCompany_Name {
	verifycompanyname ve=new verifycompanyname();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void veifycompname_withvalidData(){
		ve.setName("bajaj");
		ve.setType("PRIVATE LIMITED");
		logger.info("payload for verify company name is provided");
		Response res= end.verify_companyname(ve);
		res.then().assertThat().statusCode(200).log().all();
		String companame=res.jsonPath().get("data[0].company_name").toString();
		Assert.assertEquals(companame, "BAJAJ");		
	}
	
	@Test(priority=2)
	public void veifycompname_invalidData(){
		ve.setName("");
		ve.setType("PRIVATE LIMITED");
		logger.info("payload for verify company name is provided");
		Response res= end.verify_companyname(ve);
		res.then().assertThat().statusCode(200).log().all();	
	}
}
