package api.test;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import api.payloads.create_user;

import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class test_test {
	create_user cr=new create_user() ;
	String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY0NTBjYjM4ZjU2MTRjOWE5MmU5MjliYiIsImVtYWlsIjoic29tbmF0aEBtb2JpZ2ljLmNvbSIsImlhdCI6MTY5MDM0ODc2MiwiZXhwIjoxNjkwNDM1MTYyfQ.mzU5vYILoq_rlt10pSM82RS1avNybPifgsBvLnlSsdY";
	@Test(priority=1)
	public void setupdata() {
		cr.setFirstname("Ramesh");
		cr.setLastname("Sontkke");
		cr.setBirth_date("1990-03-28T08:43:16.362Z");
		cr.setUsercreate_email("ramesont@gmail.com");
		cr.setUsercreate_password("Admin@123");
		cr.setUsercreate_primaryphone("8755224333");
		cr.setUsercreate_secondaryphone("6755224333");
		cr.setUsercreate_reportingTo("6475c45943c504ed95895e93");
		cr.setUsercreate_role_id("6475c45943c504ed95895e93");
	}
	
	@Test(priority=2)
	public void test() {
		Response response=(Response) given()
		.headers("Authorization","Bearer "+token)
		.body(cr)
		.when()
		.post("https://jaicrm1.orderbookings.com/usercreate")
		.then()
		.log().all();
	}
	

}
