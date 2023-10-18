package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.editlead_payload;
import api.payloads.opportunityApproved_payload;
import io.restassured.response.Response;

public class Test_opportunityApproved {
	opportunityApproved_payload ap=new opportunityApproved_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void opportunityApproved(){
		ap.setOpportunity_id("64d4c09ee3851f0894b31e06");
		ap.setOpportunity_stage("Qualified");
		ap.setUser_id("6450cb38f5614c9a92e929bb");
		logger.info("payload for opportunity Approved is provided");
		Response res= end.opportunityApproved(ap);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
//		String rec=res.jsonPath().get("data.msg").toString();
//		Assert.assertEquals(rec, "Lead updated successfully..");
//		logger.info("assertion for edit lead is done");
}

}
