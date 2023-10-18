package api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.payloads.create_user;
import api.payloads.user;
import api.test.Test_logintest;
import io.restassured.http.ContentType;;

//created for crud operation (create,read,update,delete)
public class Login_endpoints {
	
	public static Response login(user Payload){
		Response response=(Response) given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(Payload)
				.when()
				.post(Routes.login_post);
		return response;
	}
}
