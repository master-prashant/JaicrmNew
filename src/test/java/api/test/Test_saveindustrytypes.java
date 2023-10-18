package api.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.contactstatuschange_payload;
import api.payloads.saveindustrytypes_payload;
import io.restassured.response.Response;

public class Test_saveindustrytypes {
	List<String> list=new ArrayList<String>();
	saveindustrytypes_payload sa=new saveindustrytypes_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void saveindustrytypes(){
		list.add("Corporation");
		list.add("Manufacturing");
		list.add("Government");
		logger.info("save industrytypes payload is provided");
		sa.setSetting_industrytype_list(list);
		Response res= end.saveindustrytypes(sa);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String data=res.jsonPath().get("data").toString();
		Assert.assertEquals(data, "Industry Type Added Successfully.");
		logger.info("assertion for save Industry Type is done");
		
}

}
