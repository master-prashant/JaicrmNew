package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.fetchlead_payload;
import api.payloads.verifycompanyname;
import io.restassured.response.Response;

public class Test_FetchLead {
	fetchlead_payload fele=new fetchlead_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void fetchlead_setlength(){
		fele.setFilterlead("");
		fele.setLength("100");
		fele.setSearch("");
		fele.setStart("0");
		logger.info("payload for fetch lead is provided");
		Response res= end.fetchlead(fele);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String rec=res.jsonPath().get("recordsFiltered").toString();
		Assert.assertEquals(rec, "100");
		logger.info("assertion for setlength in fetchlead is done");
}
	@Test(priority=2)
	public void fetchlead_setfilter(){
		fele.setFilterlead("Open");
		fele.setLength("");
		fele.setSearch("");
		fele.setStart("0");
		logger.info("payload for fetch lead is provided");
		Response res= end.fetchlead(fele);
		res.then().assertThat().statusCode(200).log().all();
		String open=res.jsonPath().get("data[0].status").toString();
		Assert.assertEquals(open, "Open");		
}
	@Test(priority=3)
	public void fetchlead_searchLead(){
		fele.setFilterlead("");
		fele.setLength("");
		fele.setSearch("LD-00249");
		fele.setStart("0");
		logger.info("payload for fetch lead is provided");
		Response res= end.fetchlead(fele);
		res.then().assertThat().statusCode(200).log().all();
		String search=res.jsonPath().get("data[0].lead_name").toString();
		Assert.assertEquals(search, "test the lead");		
}
	@Test(priority=4)
	public void fetchlead_searchuser(){
		fele.setFilterlead("");
		fele.setLength("");
		fele.setSearch("Jayesh joshi");
		fele.setStart("0");
		logger.info("payload for fetch lead is provided");
		Response res= end.fetchlead(fele);
		res.then().assertThat().statusCode(200).log().all();
		String id=res.jsonPath().get("all_user_id[0]").toString();
		Assert.assertEquals(id, "645a26b8f77665c5dfa93b3e");	//6450cc77f5614c9a92e929bc	//not understtof
}
}
