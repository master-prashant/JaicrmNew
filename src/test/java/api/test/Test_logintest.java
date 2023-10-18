package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import api.endpoints.Login_endpoints;
import api.payloads.user;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Test_logintest {
	user user =new user();
	Login_endpoints ue;
	public static Logger logger=LogManager.getLogger();
	
	/*@BeforeClass
	public void setupdata() {
		user.setUsername("somnath@mobigic.com");
		user.setPassword("Admin@123");
	}*/
	
	@BeforeTest
	public String testlogin() {
		logger=LogManager.getLogger(this.getClass());
		user.setUsername("somnath@mobigic.com");
		user.setPassword("Admin@123");
		logger.info("payload for login given");
		Response response=ue.login(user);
		response.then().assertThat().statusCode(200);
		//JsonPath jsonPathEvaluator = response.jsonPath();
		//jsonPathEvaluator.getJsonObject(null)
		String body=response.body().asPrettyString();
		Assert.assertEquals(body.contains("somnath@mobigic.com"), true);
		Assert.assertEquals(body.contains("6450cb38f5614c9a92e929bb"),true);
		Assert.assertEquals(response.getStatusCode(), 200);
		String phone=response.jsonPath().get("data.user.primary_phone").toString();
		Assert.assertEquals(phone,"9175751125");
		String access=response.jsonPath().get("data.accessToken").toString();
		logger.info("login is done and sending token");
		//System.out.println(access);
		return access;
	}
}
	
