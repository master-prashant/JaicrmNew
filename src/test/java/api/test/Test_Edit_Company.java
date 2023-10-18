package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.editComp_payload;
import io.restassured.response.Response;

public class Test_Edit_Company {

	All_endpoint end;
	editComp_payload ed=new editComp_payload();
	public static Logger log= LogManager.getLogger();
	
	@Test(priority=1)
	public void editcomp_withblank_fields() {
		ed.setBrand("");
		ed.setCin("");
		ed.setCompany_type("");
		ed.setDoi("1679993691788");
		ed.setId("64c38d4be466b805fb6ba0ca");
		ed.setIndustry_type("LTD");
		ed.setName("RAHUL");
		ed.setPan("");	//IFJNM5466D
		ed.setSummary("");
		ed.setTan("");
		ed.setTurnover("");
		ed.setTurnoverondate("1679993691788");
		ed.setWebsite("");
		Response res=end.editcomp(ed);
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String errmsg=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(errmsg, "Mismatch Credentials, Please Input PAN attached GST NO.");
		log.info("assertion done");
	
	}
	
	@Test(priority=2)
	public void editcomp_with_validInput() {
		ed.setBrand("mobigic");
		ed.setCin("");
		ed.setCompany_type("private ltd");
		ed.setDoi("1679993691788");
		ed.setId("64c38d4be466b805fb6ba0ca");
		ed.setIndustry_type("LTD");
		ed.setName("RAHUL");
		ed.setPan("IFJNM5466D");	//IFJNM5466D
		ed.setSummary("hgjgkk kbkbkb kbkbkb kjjkbjkb vnjvkdfnk dfnvndfkv fdvkfd hgjgkk kbkbkb kbkbkb kjjkbjkb vnjvkdfnk dfnvndfkv");
		ed.setTan("");
		ed.setTurnover("2");
		ed.setTurnoverondate("1679993691788");
		ed.setWebsite("www.rahul.com");
		Response res=end.editcomp(ed);
		res.then().assertThat().statusCode(200).log().all();
		log.info("status code matched");
		String errmsg=res.jsonPath().get("errormsg").toString();
		Assert.assertEquals(errmsg, " NO.");
		log.info("assertion done");
	
	}
	
	
}
