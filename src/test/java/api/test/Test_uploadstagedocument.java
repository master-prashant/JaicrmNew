package api.test;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.opportunityApproved_payload;
import api.payloads.uploadstagedocument_paylod;
import io.restassured.response.Response;

public class Test_uploadstagedocument {
	uploadstagedocument_paylod up=new uploadstagedocument_paylod();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	String path=System.getProperty("user.dir")+"//testdata//doc.pdf";
	File fi=new File(path);

	@Test(priority=1)
	public void uploadstagedocument(){
		
		Response res= end.uploadstagedocument();
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
//		String rec=res.jsonPath().get("data.msg").toString();
//		Assert.assertEquals(rec, "Lead updated successfully..");
//		logger.info("assertion for edit lead is done");
}
}
