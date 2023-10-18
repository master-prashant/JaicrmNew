package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.editlead_payload;
import api.payloads.userlist_payload;
import io.restassured.response.Response;

public class Test_UserList {

	userlist_payload us=new userlist_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void userlist_blankRole(){
		us.setRole("");
		logger.info("payload for userlist is provided");
		Response res= end.userlist(us);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String rec=res.jsonPath().get("data[0].firstname").toString();
		Assert.assertEquals(rec, "Vrushali");
		logger.info("assertion for edit lead is done");
}
	@Test(priority=2)
	public void userlist_withvalidRole(){
		us.setRole("EXECUTIVE");				//set any data then also getting all role data
		logger.info("payload for userlist is provided");
		Response res= end.userlist(us);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String rec=res.jsonPath().get("data[0].firstname").toString();
		Assert.assertEquals(rec, "Vrushali");
		logger.info("assertion for edit lead is done");
}
}
