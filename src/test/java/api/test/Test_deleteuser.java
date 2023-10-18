package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.create_user;
import api.payloads.delete_user;
import io.restassured.response.Response;

public class Test_deleteuser {
	All_endpoint crus;
	delete_user dl=new delete_user();
	
	@Test(priority=1)
	public void setupdata() {
		dl.setUserid("64c0fef05bbe835f1ad495f8");
	}
	
	
	@Test(priority=2)
	public void createuserapi() {
		Response response=crus.deleteuser(dl);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String truemsg=response.jsonPath().get("data.data").toString();
		Assert.assertEquals(truemsg, "true");
	}	
	
	

}
