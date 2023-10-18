package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createcontact_payload;
import api.payloads.fetchdashboardlead_payload;
import io.restassured.response.Response;

public class Test_fetchdashboardlead {
	fetchdashboardlead_payload fe=new fetchdashboardlead_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	
	@Test(priority=1)
	public void fetchdashboardlead(){
		fe.setLength("10");
		fe.setName("expiring_lead");
		fe.setStart("0");
		logger.info("fetch dashboard lead payload is provided");
		Response res= end.fetchdashboardlead(fe);
		res.then().log().all();
//		res.then().assertThat().statusCode(200).log().all();
//		logger.info("status code 200");
//		String err=res.jsonPath().get("errormsg").toString();
//		Assert.assertEquals(err, "Email is already Register");
//		logger.info("assertion for create contact is done");
}

}
