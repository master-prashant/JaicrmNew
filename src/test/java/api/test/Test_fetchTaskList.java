package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createtask_payload;
import api.payloads.fetchtask_payload;
import io.restassured.response.Response;

public class Test_fetchTaskList {
	fetchtask_payload cr=new fetchtask_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	@Test(priority=1)
	public void search_task(){
		cr.setCol_sort("");
		cr.setFiltertask("");
		cr.setLength("");
		cr.setOrder("");
		cr.setSearch("TSK-23-00170");
		cr.setStart("");
		logger.info("fetch task list payload is provided");
	Response res= end.fetchtasklist(cr);
	res.then().assertThat().statusCode(200).log().all();
	logger.info("status code 200");
//	String msg=res.jsonPath().get("data.msg").toString();
//	Assert.assertEquals(msg, "Task added successfully.");
//	logger.info("assertion for create task is done");
}


}
