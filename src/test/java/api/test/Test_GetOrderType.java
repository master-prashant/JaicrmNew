package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.getordertype_payload;
import api.payloads.leadassigned_payload;
import io.restassured.response.Response;

public class Test_GetOrderType {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	getordertype_payload or=new getordertype_payload();
	
	@Test(priority=1)
	public void GetOrderType(){
		or.setSelected_opportunitytype("Business from Existing Account");
		logger.info("payload for get order type is provided");
		Response res= end.getordertype(or);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
//		String name=res.jsonPath().get("data[0].first_name").toString();
//		Assert.assertEquals(name, "CHANDRAKANT");
//		logger.info("assertion for get contacts from company id is done");
}

}
