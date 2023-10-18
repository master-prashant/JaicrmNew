package api.test;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import api.endpoints.Routes;
import api.endpoints.All_endpoint;
import api.payloads.create_user;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test_createuserapivalidation {
	All_endpoint crus;
	create_user cr=new create_user() ;
	public static Logger logger=LogManager.getLogger();
	
	@Test(priority=1)
	public void existinphoneno() {
		cr.setFirstname("Ramesh");
		cr.setLastname("Sontkke");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("rameso2nt@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("8755224333");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Phone Number is already Registered");
	}
	
	@Test(priority=2)
	public void existingemail() {
		cr.setFirstname("Rami");
		cr.setLastname("Sontkke");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("ramesont@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("9997552243");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Email address is already Registered");
	}
	
	@Test(priority=3)
	public void missingname() {
		cr.setFirstname("");
		cr.setLastname("Sontkke");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("rames1o2nt@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("9997552243");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Missing data in request, kindly recheck");
	}
	
	@Test(priority=4)
	public void missingLastname() {
		cr.setFirstname("rai");
		cr.setLastname("");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("rames1on2t@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("9997552243");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Missing data in request, kindly recheck");
	}
	
	@Test(priority=5)
	public void missingDOB() {
		cr.setFirstname("rai");
		cr.setLastname("bdjbvj");
		cr.setBirth_date("");
		cr.setUsercreate_email("rames1o2nt@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("9997552243");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Missing data in request, kindly recheck");
	}
	
	@Test(priority=6)
	public void missingEmail() {
		cr.setFirstname("rai");
		cr.setLastname("bdjbvj");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("9997552243");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Missing data in request, kindly recheck");
	}
	
	@Test(priority=7)
	public void missingPrimPhone() {
		cr.setFirstname("rai");
		cr.setLastname("bdjbvj");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("edhj566e@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Missing data in request, kindly recheck");
	}
	
	@Test(priority=8)
	public void missingReportingto() {
		cr.setFirstname("rai");
		cr.setLastname("bdjbvj");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("edhj566e@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("8245455452");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Missing data in request, kindly recheck");
	}
	
	@Test(priority=9)
	public void missingRoleID() {
		cr.setFirstname("rai");
		cr.setLastname("bdjbvj");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("edhddje@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("8245455452");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("");
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String phoneerror=response.jsonPath().get("errormsg");
		Assert.assertEquals(phoneerror, "Missing data in request, kindly recheck");
	}
	
//	@Test(priority=10)
//	public void missingPassword() {
//		cr.setFirstname("rai");
//		cr.setLastname("bdjbvj");
//		cr.setBirth_date("1990-03-28T08:43:16.362Z");
//		cr.setUsercreate_email("edhje@gmail.com");
//		cr.setUsercreate_password("");
//		cr.setUsercreate_primaryphone("8884554521");
//		cr.setUsercreate_secondaryphone("6755224333");
//		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
//		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
//		
//		Response response=crus.createuser(cr);
//		response.then().log().all();
//		response.then().assertThat().statusCode(200);
//		String phoneerror=response.jsonPath().get("errormsg");
//		Assert.assertEquals(phoneerror, "Missing data in request, kindly recheck");
//	}
//	
//	@Test(priority=11)
//	public void invalidAltPhoneNo() {
//		cr.setFirstname("rai");
//		cr.setLastname("bdjbvj");
//		cr.setBirth_date("1990-03-28T08:43:16.362Z");
//		cr.setUsercreate_email("edhj555561e@gmail.com");
//		cr.setUsercreate_password("Admin@123");
//		cr.setUsercreate_primaryphone("8909554521");
//		cr.setUsercreate_secondaryphone("54562");
//		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
//		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
//		
//		Response response=crus.createuser(cr);
//		response.then().log().all();
//		response.then().assertThat().statusCode(200);
//		String phoneerror=response.jsonPath().get("errormsg");
//		Assert.assertEquals(phoneerror, "Missing data in request, kindly recheck");
//	}

	
}
