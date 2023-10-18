package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createlead_payload;
import api.payloads.editlead_payload;
import io.restassured.response.Response;

public class Test_EDIT_Lead {
	editlead_payload cr=new editlead_payload();
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void editlead_withvalidData(){
		cr.setAddress_id("647eb2323f33a4f60f8fab25");
		cr.setCompany_id("647eaa713f33a4f60f8fab23");
		cr.setContact_id("647eac763f33a4f60f8fab24");
		cr.setData_source("mobigic");
		cr.setLead_name("testing api for edit lead");
		cr.setLead_source("ExistingCustomer");
		cr.setProduct("Cloud");
		cr.setProduct_family("Cloud services");
		cr.setService_provider("HCL");
		cr.setSummary("need to check payload for create lead\\ndkjnjnfdv f d nvnfd dfn vfd fdnvndf df\\ndfkjnvkndf dfknkvndfkv fd vnfdkv");
		cr.setType("Hot");
		cr.setLead_id("64c75b32d3b6783494e89602");
		logger.info("payload for edit lead is provided");
		Response res= end.editlead(cr);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String rec=res.jsonPath().get("data.msg").toString();
		Assert.assertEquals(rec, "Lead updated successfully..");
		logger.info("assertion for edit lead is done");
}

}
