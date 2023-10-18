package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createopportunity_payload;
import api.payloads.getproducttype_payload;
import io.restassured.response.Response;

public class Test_Create_opportunity {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	createopportunity_payload cr=new createopportunity_payload();
	
	@Test(priority=1)
	public void createopportunity(){
		
		logger.info("payload for create opportunity is provided");
		Response res= end.createopportunity(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String name=res.jsonPath().get("data.value[0]").toString();
		Assert.assertEquals(name, "Inspirion 3537");
		logger.info("assertion for create opportunity is done");
}

}
