package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import io.restassured.response.Response;

public class Test_GetCompanyLead_fromCompID {
	public static Logger log=LogManager.getLogger();
	All_endpoint end;
	@Test
	public void getcompanyleadsfromid() {
		Response res=end.getcompanyleadsfromid();
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code 200");
		
	}

}
