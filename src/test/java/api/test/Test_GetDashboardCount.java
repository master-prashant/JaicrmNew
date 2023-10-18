package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.editcontact_payload;
import api.payloads.getdashboardcount_payload;
import io.restassured.response.Response;

public class Test_GetDashboardCount {
	getdashboardcount_payload get=new getdashboardcount_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	
	@Test(priority=1)
	public void getdashboard_count(){
	
		get.setEnd_date("2023-08-03T18:29:59.999Z");
		get.setStart_date("2023-07-01");
		logger.info("get dashboard_count payload is provided");
		Response res= end.getdashboardcount(get);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String data=res.jsonPath().get("data.won_oppo").toString();
		Assert.assertEquals(data, "2");
		logger.info("assertion for get dashboard_count is done");
}
}
