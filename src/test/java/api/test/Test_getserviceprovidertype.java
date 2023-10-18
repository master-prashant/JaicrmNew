package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import io.restassured.response.Response;

public class Test_getserviceprovidertype {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void getserviceprovidertype(){
		Response res= end.getserviceprovidertype();
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String data=res.jsonPath().get("data").toString();
		Assert.assertEquals(data, "Service Provider Type Added Successfully.");
		logger.info("assertion for save Industry Type is done");
		
}

}
