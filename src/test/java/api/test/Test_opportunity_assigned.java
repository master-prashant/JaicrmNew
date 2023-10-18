package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.getdashboardcount_payload;
import api.payloads.opportunityassign_payload;
import io.restassured.response.Response;

public class Test_opportunity_assigned {
	opportunityassign_payload op=new opportunityassign_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void opportunity_assigned(){
		op.setOpportunity_id("649963654ba313fc90c1ee0e");
		op.setUser_id("6451e22df5614c9a92e929de");
		logger.info("opportunity_assigned payload is provided");
		Response res= end.opportunityassigned(op);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String data=res.jsonPath().get("data").toString();
		Assert.assertEquals(data, "Opportunity Assigned successfully..");
		logger.info("assertion for opportunity_assigned is done");
}
}
