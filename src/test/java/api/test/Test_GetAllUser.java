package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.getall_user;
import io.restassured.response.Response;

public class Test_GetAllUser {
	public static Logger logger=LogManager.getLogger();
	All_endpoint crus;
	getall_user ge=new getall_user();
	
	@Test(priority=1)
	public void getsingleuser() {
		ge.setFilterRole("");
		ge.setLength("46");
		ge.setSearch("jayesh");
		ge.setStart("0");
		logger.info("payload for search user provided");
		Response response=crus.getalluser(ge);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		logger.info("got data of searched user");
		String firstname=response.jsonPath().get("data[0].firstname").toString();
		Assert.assertEquals(firstname, "Jayesh");
		logger.info("firstname is matching");
	}
	
	@Test(priority=2)
	public void getalluser() {
		ge.setFilterRole("");
		ge.setLength("");
		ge.setSearch("");
		ge.setStart("0");
		logger.info("payload for getalluser provided");
		Response response=crus.getalluser(ge);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		logger.info("got data of searched user");
		String firstname=response.jsonPath().get("data[0].firstname").toString();
		Assert.assertEquals(firstname, "Somnath");
		logger.info("firstname is matching");
	}
	
	@Test(priority=3)
	public void getalluserbyrole() {
		ge.setFilterRole("Executive");
		ge.setLength("");
		ge.setSearch("");
		ge.setStart("0");
		logger.info("payload for filterrole provided");
		Response response=crus.getalluser(ge);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		logger.info("got data of filtered role");
		String firstname=response.jsonPath().get("data[0].firstname").toString();
		Assert.assertEquals(firstname, "Vipul");
		logger.info("firstname is matching");
	}
}
