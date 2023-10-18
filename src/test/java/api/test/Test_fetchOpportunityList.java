package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createopportunity_payload;
import api.payloads.fetchopportunity_payload;
import io.restassured.response.Response;

public class Test_fetchOpportunityList {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	fetchopportunity_payload fe=new fetchopportunity_payload();
	
	@Test(priority=1)
	public void fetchopportunity_list(){
		fe.setLength("");
		fe.setSearch("");
		fe.setStart("0");
		logger.info("payload for fetch opportunity list is provided");
		Response res= end.fetchopportunity(fe);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
//		String name=res.jsonPath().get("data.value[0]").toString();
//		Assert.assertEquals(name, "Inspirion 3537");
//		logger.info("assertion for create opportunity is done");
}

}
