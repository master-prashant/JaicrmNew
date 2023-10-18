package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createtask_payload;
import api.payloads.editcontact_payload;
import io.restassured.response.Response;

public class Test_CreateTask {
	createtask_payload cr=new createtask_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void createtask_noOppid(){
//		assigned_to: "64770dadf47b3f55513b6aa7"
//		closing_remark: ""
//		end_date: "2023-08-23T18:29:59.999Z"
//		missing_deadline: ""
//		operationmode: "create"
//		start_date: "2023-08-23T10:18:48.007Z"
//		status:"Assigned"
//		subject: "opportunity id is not clickable from task list pageopportunity id is not clickable from task list page"
//		task_for: "Opportunity"
//		task_for_id	: "64e58906d218405230ab3dc9"
//		task_type: "Customer Followup"
		cr.setAssigned_to("64770dadf47b3f55513b6aa7");
		cr.setClosing_remark("");
		cr.setEnd_date("2023-08-30T18:29:59.999Z");
		cr.setMissing_deadline("");
		cr.setOperationmode("create");
		cr.setStart_date("2023-08-23T10:18:48.007Z");
		cr.setStatus("Assigned");
		cr.setSubject("jkdf fdjvknfd nfdnvkndfnvkfd vfdvnkdfnk vfd vnfdnvkdfnkvfd mvfdvkndfkv dfvndfkvnkfdkvkdf vfdvnkdfnkvnkdf");
		cr.setTask_for("Opportunity");
		cr.setTask_for_id("64770dadf47b3f55513b6aa7");
		cr.setTask_type("Customer Followup");
		logger.info("create task payload is provided");
		Response res= end.createtask(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String msg=res.jsonPath().get("data.msg").toString();
		Assert.assertEquals(msg, "Task added successfully.");
		logger.info("assertion for create task is done");
}
	@Test(priority=2)
	public void closetask_noOppid(){
	cr.setAssigned_to("64770dadf47b3f55513b6aa7");
	cr.setClosing_remark("api");
	cr.setEnd_date("2023-08-30T18:29:59.999Z");
	cr.setMissing_deadline("");
	cr.setOperationmode("edit");
	cr.setStart_date("2023-08-23T10:18:48.007Z");
	cr.setStatus("Assigned");
	cr.setSubject("jkdf fdjvknfd nfdnvkndfnvkfd vfdvnkdfnk vfd vnfdnvkdfnkvfd mvfdvkndfkv dfvndfkvnkfdkvkdf vfdvnkdfnkvnkdf");
	cr.setTask_for("Opportunity");
	cr.setTask_for_id("64770dadf47b3f55513b6aa7");
	cr.setTask_type("Customer Followup");
	cr.setTaskid("64e5e9692f86e95f1afec796");
	logger.info("close task payload is provided");
	Response res= end.createtask(cr);
	res.then().assertThat().statusCode(200).log().all();
	logger.info("status code 200");
	String msg=res.jsonPath().get("data.msg").toString();
	Assert.assertEquals(msg, "Task added successfully.");
	logger.info("assertion for close task is done");
}

}
