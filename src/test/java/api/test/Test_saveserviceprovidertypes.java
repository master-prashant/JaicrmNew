package api.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.saveindustrytypes_payload;
import api.payloads.saveserviceprovidertypes_payload;
import io.restassured.response.Response;

public class Test_saveserviceprovidertypes {
	List<String> list=new ArrayList<String>();
	saveserviceprovidertypes_payload sa=new saveserviceprovidertypes_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void save_serviceprovidertypes(){
		list.add("Dell");
		list.add("HCL");
		list.add("Amazon");
		list.add("Google");
		list.add("TATA Communication");
		sa.setSetting_serviceprovider_list(list);
		logger.info("save service provider payload is provided");
		Response res= end.saveserviceprovidertypes(sa);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String data=res.jsonPath().get("data").toString();
		Assert.assertEquals(data, "Service Provider Type Added Successfully.");
		logger.info("assertion for save Industry Type is done");
		
}

}
