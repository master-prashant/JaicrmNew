package api.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import io.restassured.response.Response;

public class Test_Get_Industry_Types {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	
	@Test()
	public void get_industry_type() {
		Response res=end.getindustrytypes();
		res.then().assertThat().statusCode(200).log().all();
		String values=res.jsonPath().get("data.value").toString();
		System.out.println(values);
		String expval="LTD";
	
		if(values.contains(expval)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
