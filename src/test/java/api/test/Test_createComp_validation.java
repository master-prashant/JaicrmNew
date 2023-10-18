package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.createcompany_payload;
import io.restassured.response.Response;

public class Test_createComp_validation {
	All_endpoint end;
	createcompany_payload cr=new createcompany_payload();
	public static Logger log= LogManager.getLogger();
	
	@Test(priority=1)
	public void cratecomp_with_blankdata() {
		cr.setBrand("");
		cr.setCin("");
		cr.setCompany_type("");
		cr.setDoi("");
		cr.setIndustry_type("");
		cr.setName("");
		cr.setPan("");
		cr.setSummary("");
		cr.setTan("");
		cr.setTurnover("");
		cr.setTurnoverondate("");
		cr.setWebsite("");
		log.info("blank values send in create comp payload");
		Response res=end.createcompany(cr);
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String errmsg=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(errmsg, "Missing data in request, kindly recheck");
		log.info("assertion done");
	}
	

	
	@Test(priority=2)
	public void cratecomp_withexsting_email() {
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
		log.info("blank values send in create comp payload");
		Response res=end.createcompany(cr);
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String msg=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(msg, "Website Already Registered.");
		log.info("assertion done");
	}
	
	@Test(priority=3)
	public void cratecomp_withexsting_pan() {
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
		cr.setWebsite("www.rahul12.com");
		log.info("blank values send in create comp payload");
		Response res=end.createcompany(cr);
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String msg=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(msg, "PAN Already Registered.");
		log.info("assertion done");
	}
	
	@Test(priority=4)
	public void cratecomp_withexsting_tan() {
		cr.setBrand("");
		cr.setCin("");
		cr.setCompany_type("private ltd");
		cr.setDoi("2023-03-28T08:54:51.788Z");
		cr.setIndustry_type("ltd");
		cr.setName("rahul");
		cr.setPan("IOJNM5466D");
		cr.setSummary("hgjgkk kbkbkb kbkbkb kjjkbjkb vnjvkdfnk dfnvndfkv fdvkfd hgjgkk kbkbkb kbkbkb kjjkbjkb vnjvkdfnk dfnvndfkv");
		cr.setTan("WEHS12345N");
		cr.setTurnover("2");
		cr.setTurnoverondate("2023-03-28T08:54:51.788Z");
		cr.setWebsite("www.rahul12.com");
		log.info("blank values send in create comp payload");
		Response res=end.createcompany(cr);
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String msg=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(msg, "TAN Already Registered.");
		log.info("assertion done");
	}
	
	@Test(priority=5)
	public void cratecomp_withexsting_cin() {
		cr.setBrand("");
		cr.setCin("U74899DL1987PTC030001");
		cr.setCompany_type("private ltd");
		cr.setDoi("2023-03-28T08:54:51.788Z");
		cr.setIndustry_type("ltd");
		cr.setName("rahul");
		cr.setPan("IOJNM5466D");
		cr.setSummary("hgjgkk kbkbkb kbkbkb kjjkbjkb vnjvkdfnk dfnvndfkv fdvkfd hgjgkk kbkbkb kbkbkb kjjkbjkb vnjvkdfnk dfnvndfkv");
		cr.setTan("WEHS12345N");
		cr.setTurnover("2");
		cr.setTurnoverondate("2023-03-28T08:54:51.788Z");
		cr.setWebsite("www.rahul12.com");
		log.info("blank values send in create comp payload");
		Response res=end.createcompany(cr);
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String msg=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(msg, "CIN Already Registered.");
		log.info("assertion done");
	}


}
