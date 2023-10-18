package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.getproductfamilytype_payload;
import io.restassured.response.Response;

public class Test_getproductfamilytype {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	getproductfamilytype_payload ge=new getproductfamilytype_payload();
	
	@Test(priority=1)
	public void getproductfamilytype(){
		ge.setSelected_serviceprovider("Dell");
		Response res= end.getproductfamilytype(ge);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String data=res.jsonPath().get("data.name").toString();
		Assert.assertEquals(data,"product_family_Dell");
		logger.info("assertion for get product family type is done");
		
}

}
