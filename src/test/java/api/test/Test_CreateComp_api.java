package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createcompany_payload;
import io.restassured.response.Response;

public class Test_CreateComp_api {
	All_endpoint end;
	createcompany_payload cr=new createcompany_payload();
	public static Logger log= LogManager.getLogger();
	@Test()
	public void cratecomp_withvalidData() {
		cr.setBrand("");
		cr.setCin("");
		cr.setCompany_type("private ltd");
		cr.setDoi("2023-03-28T08:54:51.788Z");
		cr.setIndustry_type("ltd");
		cr.setName("rahul");
		cr.setPan("IFJNM5466D");
		cr.setSummary("hgjgkk kbkbkb kbkbkb kjjkbjkb vnjvkdfnk dfnvndfkv fdvkfd hgjgkk kbkbkb kbkbkb kjjkbjkb vnjvkdfnk dfnvndfkv");
		cr.setTan("");
		cr.setTurnover("2");
		cr.setTurnoverondate("2023-03-28T08:54:51.788Z");
		cr.setWebsite("www.rahul.com");
		log.info("valid input send in create comp payload");
		Response res=end.createcompany(cr);
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String msg=res.jsonPath().get("data.msg").toString();
		Assert.assertEquals(msg, "Company created successfully..");
		log.info("assertion done");
	}
}
