package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import io.restassured.response.Response;

public class Test_GetContactListFromCompID {
	
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void GetContctList(){
	
		Response res= end.getcontatlist();
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String name=res.jsonPath().get("data[0].first_name").toString();
		Assert.assertEquals(name, "CHANDRAKANT");
		logger.info("assertion for get contacts from company id is done");
}

}
