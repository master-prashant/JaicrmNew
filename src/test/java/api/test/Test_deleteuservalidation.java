package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.delete_user;
import io.restassured.response.Response;

public class Test_deleteuservalidation {
	public static Logger logger=LogManager.getLogger();
	All_endpoint crus;
	delete_user dl=new delete_user() ;
	
	@Test(priority=1)
	public void setupdata() {
		dl.setUserid("64c0b0b25bbe835f1ad495c9");
		logger.info("payload is given for delete user");
	}
	
	
	@Test(priority=2)
	public void deleteuser_notpresent() {
		Response response=crus.deleteuser(dl);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String errormsg=response.jsonPath().get("errormsg");
		Assert.assertEquals(errormsg, "Either the user does not exist or an internal error occured");
		logger.info("user not exist message got ");
	}

}
