package api.test;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.getproductfamilytype_payload;
import api.payloads.saveproductfamilytypes_payload;
import io.restassured.response.Response;

public class Test_saveproductfamilytypes {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	saveproductfamilytypes_payload sa=new saveproductfamilytypes_payload();
	ArrayList<String> pr=new ArrayList<String>();
	
	@Test(priority=1)
	public void saveproductfamilytypes(){
		sa.setSelected_serviceprovider("Dell");
		pr.add("Laptops");
		pr.add("Batteries");
		pr.add("sd card");
		pr.add("keyboards");
		pr.add("RAM");
		sa.setSetting_productfamily_list(pr);
		logger.info("save productfamily types payload given");
		Response res= end.saveproductfamilytypes(sa);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String data=res.jsonPath().get("data").toString();
		Assert.assertEquals(data,"Product Family Type Added Successfully.");
		logger.info("assertion for save product family types is done");
		
}
}
