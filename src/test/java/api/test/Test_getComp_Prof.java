package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createcompany_payload;
import io.restassured.response.Response;

public class Test_getComp_Prof {
	All_endpoint end;
	public static Logger log= LogManager.getLogger();
	
	@Test()
	public void GetcompProfile() {
		Response res=end.getcompProffromID();
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String comname=res.jsonPath().get("data.company.company_name").toString();
		Assert.assertEquals(comname, "RAHUL");
		log.info("assertion done");
	}

}
