package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import io.restassured.response.Response;

public class Test_leaddetails {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void leaddetails(){
		Response res= end.leaddetails();
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String id=res.jsonPath().get("leaddetails.lead_no").toString();
		Assert.assertEquals(id, "LD-00273");
		logger.info("assertion for lead details is done");
}

}
