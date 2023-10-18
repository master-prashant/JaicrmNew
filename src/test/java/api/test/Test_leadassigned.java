package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.leadassigned_payload;
import io.restassured.response.Response;

public class Test_leadassigned {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	leadassigned_payload le=new leadassigned_payload();
	
	@Test(priority=1)
	public void leadassigned(){
		le.setLead_id("64c75b32d3b6783494e89602");
		le.setUser_id("6451e22df5614c9a92e929de");
		logger.info("payload for leadassigned is provided");
		Response res= end.leadassigned(le);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String name=res.jsonPath().get("data").toString();
		Assert.assertEquals(name, "Lead Assigned successfully..");
		logger.info("assertion for lead assigned is done");
}

}
