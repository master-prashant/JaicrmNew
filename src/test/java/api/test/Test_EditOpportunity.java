package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.editOpportunity_payload;
import api.payloads.fetchopportunity_payload;
import io.restassured.response.Response;

public class Test_EditOpportunity {
	
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	editOpportunity_payload eo=new editOpportunity_payload();
	
	@Test(priority=1)
	public void editopportunity_withValidData(){
		eo.setBusiness_line("Software");
		eo.setClosure_date("16/12/2023");
		eo.setCompany_id("647eaa713f33a4f60f8fab23");
		eo.setContact_id("6492b37fd65ee1904c0c9546");
		eo.setOpportunity_id("649963654ba313fc90c1ee0e");
		eo.setOpportunity_name("Need 100 laptops");
		eo.setOpportunity_type("Positive");
		eo.setOrder_type("ITServices");
		eo.setProduct_family("Laptops");
		eo.setService_opportunityid("874558774");
		eo.setService_provider("Dell");
		eo.setProduct("Inspirion 3537");
		eo.setSummary("when lead is creating even product is selected then also select product error message showingwhen dfin dfnivdf dnfnvifd");
		logger.info("payload for edit opportunity list is provided");
		Response res= end.editOpportunity(eo);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String name=res.jsonPath().get("data.value[0]").toString();
		Assert.assertEquals(name, "Inspirion 3537");
		logger.info("assertion for edit opportunity is done");
}

}
