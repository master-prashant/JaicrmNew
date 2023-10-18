package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.editcontact_payload;
import api.payloads.fetchcontact_payload;
import io.restassured.response.Response;

public class Test_FecthContact {
	fetchcontact_payload fe=new fetchcontact_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void fetchContact_setlength(){
		fe.setCol_sort("createdAt");
		fe.setLength("10");
		fe.setOrder("ASC");
		fe.setSearch("");
		fe.setStart("0");
		logger.info("payload for fetch contact provided");
		Response res= end.fetchcontactlist(fe);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String length=res.jsonPath().get("data.recordsFiltered").toString();
		Assert.assertEquals(length, "10");
		logger.info("assertion for fetch contact is done");
}
	@Test(priority=2)
	public void fetchContact_SetSearch_withvalidName(){
		fe.setCol_sort("createdAt");
		fe.setLength("");
		fe.setOrder("ASC");
		fe.setSearch("Naval");
		fe.setStart("0");
		logger.info("payload for fetch contact provided");
		Response res= end.fetchcontactlist(fe);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String name=res.jsonPath().get("data.data[0].first_name").toString();
		Assert.assertEquals(name, "NAVAL");
		logger.info("assertion for fetch contact is done");
}
	@Test(priority=3)
	public void fetchContact_SetOrder(){
		fe.setCol_sort("createdAt");
		fe.setLength("10");
		fe.setOrder("DSC");
		fe.setSearch("");
		fe.setStart("0");
		logger.info("payload for fetch contact provided");
		Response res= end.fetchcontactlist(fe);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String name=res.jsonPath().get("data.data[0].first_name").toString();
		Assert.assertEquals(name, "NAVAL");
		logger.info("assertion for fetch contact is done");
}

}
