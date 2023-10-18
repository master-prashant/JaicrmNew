package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.create_user;
import api.utilities.dataprovider;
import io.restassured.response.Response;

public class Test_data_drivencreateuser {
	All_endpoint crus;
	@Test(priority=1,dataProvider="Data",dataProviderClass=dataprovider.class)
	public void testpostuser(String name,String lastname,String dob,String email,String passw,String priphn,String optno,String repto,String roleid) 
	{
		create_user cr=new create_user();
		cr.setFirstname(name);
		cr.setLastname(lastname);
		cr.setBirth_date(dob);
		cr.setUsercreate_email(email);
		cr.setUsercreate_password(passw);
		cr.setUsercreate_primaryphone(priphn);
		cr.setUsercreate_secondaryphone(optno);
		cr.setUsercreate_reportingTo(repto);
		cr.setUsercreate_role_id(roleid);
		
		Response response=crus.createuser(cr);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		String sucessmsg=response.jsonPath().get("data");
		Assert.assertEquals(sucessmsg, "User created successfully.");
	}

}
