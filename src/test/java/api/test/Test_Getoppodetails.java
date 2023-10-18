package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.editlead_payload;
import io.restassured.response.Response;

public class Test_Getoppodetails {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void Getoppodetails(){
		Response res= end.getoppodetails();
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String id=res.jsonPath().get("oppodetails.opportunity_no").toString();
		Assert.assertEquals(id, "OP-00098");
		logger.info("assertion for Test_Get oppo details is done");
}
}
