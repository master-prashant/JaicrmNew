package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.contactstatuschange_payload;
import api.payloads.opportunityassign_payload;
import io.restassured.response.Response;

public class Test_contactstatuschange {
		contactstatuschange_payload co=new contactstatuschange_payload();
		All_endpoint end;
		public static Logger logger=LogManager.getLogger();
		
		@Test(priority=1)
		public void contactstatus_statuschange(){
			co.setContactid("64b75f2e9af87533b0a0b6a5");
			co.setSet_contact_status("true");
			logger.info("contact status change payload is provided");
			Response res= end.contactstatus(co);
			res.then().assertThat().statusCode(200).log().all();
			logger.info("status code 200");
			String data=res.jsonPath().get("data.enabled").toString();
			Assert.assertEquals(data, "true");
			String id=res.jsonPath().get("data.id").toString();
			Assert.assertEquals(id, "64b75f2e9af87533b0a0b6a5");
			logger.info("assertion for contact status change is done");
			
	}

}

