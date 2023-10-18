package api.test;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import api.endpoints.Routes;
import api.endpoints.All_endpoint;
import api.payloads.create_user;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test_createuserapi {
	All_endpoint crus;
	create_user cr=new create_user() ;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void setupdata() {
		cr.setFirstname("Ramesh");
		cr.setLastname("Sontkke");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("ramesont@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("8755224333");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
		logger.info("all the payload provided");
	}
	
	
	@Test(priority=2)
	public void createuserapi() {
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Phone Number is already Registered");
		logger.info("errormessage verified for create user");
	}

	
}
