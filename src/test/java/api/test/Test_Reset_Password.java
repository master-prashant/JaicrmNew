package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.passwaord_reset;
import io.restassured.response.Response;

public class Test_Reset_Password {
	passwaord_reset pass=new passwaord_reset();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void resetpassword_valid() {
		pass.setReset_email("somnath@mobigic.com");
		logger.info("sending payload for resetpassword");
		Response response=end.resetpassword(pass);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		logger.info("respose successfull for password reset request");
		String succmess=response.jsonPath().get("data").toString();
		Assert.assertEquals(succmess, "Password reset request email sent on somnath@mobigic.com");
		logger.info("email sent to somanath");
	}
	
	@Test(priority=2)
	public void resetpassword_notexistuser() {
		pass.setReset_email("hvhgvh@gnjd.com");
		logger.info("sending payload for resetpassword");
		Response response=end.resetpassword(pass);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		logger.info("respose successfull for password reset request");
//		String succmess=response.jsonPath().get("errormsg").toString();
//		Assert.assertEquals(succmess, "Email Id is not registered with us");
//		logger.info("error message shown");
	}
	
	@Test(priority=3)
	public void resetpassword_withblankemail() {
		pass.setReset_email("");
		logger.info("sending payload for resetpassword");
		Response response=end.resetpassword(pass);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		logger.info("respose successfull for password reset request");
		String succmess=response.jsonPath().get("errormsg").toString();
		Assert.assertEquals(succmess, "Input requires an email id");
		logger.info("error message shown");
	}
	
	@Test(priority=4)
	public void resetpassword_invalidmail() {
		pass.setReset_email("hvhgvh");
		logger.info("sending payload for resetpassword");
		Response response=end.resetpassword(pass);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		logger.info("respose successfull for password reset request");
		String succmess=response.jsonPath().get("errormsg").toString();
		Assert.assertEquals(succmess, "Email Id is not registered with us");
		logger.info("error message shown");
}
}
