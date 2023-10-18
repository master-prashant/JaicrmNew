package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.delete_user;
import io.restassured.response.Response;

public class Test_Get_allRoles {
	public static Logger logger=LogManager.getLogger();
	All_endpoint crus;	
	@Test(priority=1)
	public void GetallROllapi() {
		Response response=crus.getallroles();
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String rolename=response.jsonPath().get("data[1].role").toString();
		Assert.assertEquals(rolename, "Executive");
		logger.info("executive role verified from getall roles api");
	}	

}
