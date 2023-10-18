package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createfeasibility_paylod;
import api.payloads.opportunityRejected_payload;
import io.restassured.response.Response;

public class Test_createfeasibility {
	createfeasibility_paylod cr=new createfeasibility_paylod();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void createfeasibility(){
		cr.setOpportunity_id("64d4c09ee3851f0894b31e06");
		cr.setExternal_id("");
		cr.setRemark("djcjndkv");
		logger.info("payload for create feasibility is provided");
		Response res= end.createfeasibility(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
//		String rec=res.jsonPath().get("data.msg").toString();
//		Assert.assertEquals(rec, "Lead updated successfully..");
//		logger.info("assertion for edit lead is done");
}

}
