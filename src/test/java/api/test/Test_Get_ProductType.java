package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.All_endpoint;
import api.payloads.getordertype_payload;
import api.payloads.getproducttype_payload;
import io.restassured.response.Response;

public class Test_Get_ProductType {
	All_endpoint end;
	public static Logger logger=LogManager.getLogger();
	getproducttype_payload or=new getproducttype_payload();
	
	@Test(priority=1)
	public void GetProductType_WithValidInput(){
		or.setSelected_productfamily("DellLaptops");
		logger.info("payload for get Product type is provided");
		Response res= end.getProducttype(or);
		res.then().assertThat().statusCode(200).log().all();
		logger.info("status code 200");
		String name=res.jsonPath().get("data.value[0]").toString();
		Assert.assertEquals(name, "Inspirion 3537");
		logger.info("assertion for get Product type is done");
}
	

}
