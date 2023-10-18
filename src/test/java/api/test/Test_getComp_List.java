package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createcompany_payload;
import io.restassured.response.Response;

public class Test_getComp_List {
	All_endpoint end;
	public static Logger log= LogManager.getLogger();
	
	@Test()
	public void Getcomplist() {
		Response res=end.getcomplist();
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String health=res.jsonPath().get("data[0].company_health").toString();
		Assert.assertEquals(health, "Well");
		log.info("assertion done");
	}

}
