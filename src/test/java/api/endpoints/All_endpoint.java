package api.endpoints;

import static io.restassured.RestAssured.given;

import java.io.File;

import api.payloads.Edit_USER;
import api.payloads.contactstatuschange_payload;
import api.payloads.create_user;
import api.payloads.createbranch_payload;
import api.payloads.createcompany_payload;
import api.payloads.createcontact_payload;
import api.payloads.createfeasibility_paylod;
import api.payloads.createlead_payload;
import api.payloads.createopportunity_payload;
import api.payloads.createtask_payload;
import api.payloads.delete_user;
import api.payloads.editComp_payload;
import api.payloads.editOpportunity_payload;
import api.payloads.editbranch_payload;
import api.payloads.editcontact_payload;
import api.payloads.editlead_payload;
import api.payloads.fetchcontact_payload;
import api.payloads.fetchdashboardlead_payload;
import api.payloads.fetchlead_payload;
import api.payloads.fetchopportunity_payload;
import api.payloads.fetchtask_payload;
import api.payloads.getall_user;
import api.payloads.getdashboardcount_payload;
import api.payloads.getordertype_payload;
import api.payloads.getproductfamilytype_payload;
import api.payloads.getproducttype_payload;
import api.payloads.leadassigned_payload;
import api.payloads.opportunityApproved_payload;
import api.payloads.opportunityRejected_payload;
import api.payloads.opportunityassign_payload;
import api.payloads.passwaord_reset;
import api.payloads.saveindustrytypes_payload;
import api.payloads.saveproductfamilytypes_payload;
import api.payloads.saveserviceprovidertypes_payload;
import api.payloads.uploadstagedocument_paylod;
import api.payloads.user;
import api.payloads.userlist_payload;
import api.payloads.verifycompanyname;
import api.test.Test_logintest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.Matchers.*;

public class All_endpoint extends Test_logintest{
	public static Logger logger=LogManager.getLogger();
	public static Response createuser(create_user payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.createuser);
		logger.info("create user api called");
		return response;
		
	}
	
	public static Response deleteuser(delete_user payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.deleteuser);
		logger.info("delete user api called");
		return response;
		
	}
	
	public static Response getalluser(getall_user payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.getalluser);
		logger.info("getall user api called");
		return response;
		
	}
	
	public static Response getallroles(){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.when()
				.get(Routes.getallroles);
		logger.info("getall roles api called");
		return response;
		
	}
	
	public static Response resetpassword(passwaord_reset payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.passwordrequest_post);
		logger.info("reset passwaord req api called");
		return response;
		
	}
	
	public static Response Edit_user(Edit_USER payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.editUser);
		logger.info("edit user api called");
		return response;
		
	}
	
	public static Response verify_companyname(verifycompanyname payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.verifycompanyname);
		logger.info("verify company name api called");
		return response;
		
	}
	
	public static Response getindustrytypes(){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.when()
				.get(Routes.getindustrytype);
		logger.info("get industry type api called");
		return response;
		
	}
	
	public static Response createcompany(createcompany_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.createcompany);
		logger.info("post create company api called");
		return response;
		
	}
	
	public static Response getcomplist(){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.when()
				.get(Routes.getcomlist);
		logger.info("get company list api called");
		return response;
		
	}
	
	public static Response getcompProffromID(){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.when()
				.get(Routes.getcompproffromid);
		logger.info("get company profile from id api called");
		return response;
		
	}
	
	public static Response editcomp(editComp_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.editCompany);
		logger.info("post edit company api called");
		return response;
		
	}
	
	public static Response fetchlead(fetchlead_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.fetchlead);
		logger.info("fetch lead api called");
		return response;
		
	}
	
	public static Response createlead(createlead_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.createlead);
		logger.info("create lead api called");
		return response;
		
	}
	
	public static Response editlead(editlead_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.editlead);
		logger.info("edit lead api called");
		return response;
		
	}
	
	public static Response userlist(userlist_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.userlist);
		logger.info("userlist api called");
		return response;
		
	}
	
	public static Response createbranch(createbranch_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.createbranch);
		logger.info("createbranch api called");
		return response;
		
	}
	
	public static Response editbranch(editbranch_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.editbranch);
		logger.info("edit branch api called");
		return response;
		
	}
	
	public static Response createcontact(createcontact_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.createcontact);
		logger.info("create contact api called");
		return response;
		
	}
	
	public static Response editcontact(editcontact_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.contactedit);
		logger.info("edit contact api called");
		return response;
		
	}
	
	public static Response fetchcontactlist(fetchcontact_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.fetchcontactlist);
		logger.info("get contact list api called");
		return response;
		
	}
	
	public static Response getcontatlist(){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.when()
				.get(Routes.Getcontactlist);
		logger.info("get contact list from company id api called");
		return response;
		
	}
	
	public static Response leadassigned(leadassigned_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.leadAssigned);
		logger.info("lead assigned api called");
		return response;
		
	}
	public static Response getcompanyleadsfromid(){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.when()
				.get(Routes.getcompanyleadsfromid);
		logger.info("get company leads from company id api called");
		return response;
		
	}
	
	public static Response getordertype(getordertype_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.getordertype);
		logger.info("get order type api called");
		return response;
		
	}
	
	public static Response getProducttype(getproducttype_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.getproducttype);
		logger.info("get Product type api called");
		return response;
		
	}
	
	public static Response createopportunity(createopportunity_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.createopportunity);
		logger.info("create opportunity api called");
		return response;
		
	}
	
	public static Response fetchopportunity(fetchopportunity_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.fetchopportunitylist);
		logger.info("fetch opportunity list api called");
		return response;
		
	}
	
	public static Response editOpportunity(editOpportunity_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.opportunityedit);
		logger.info("edit Opportunity api called");
		return response;
		
	}
	
	public static Response getdashboardcount(getdashboardcount_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.getdashboardcount);
		logger.info("get dashboard count api called");
		return response;
	}
	
	public static Response opportunityassigned(opportunityassign_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.opportunityAssigned);
		logger.info("opportunity Assignedapi called");
		return response;
	}
	
	public static Response contactstatus(contactstatuschange_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.contactstatuschange);
		logger.info("contactstatuschange api called");
		return response;
	}
	
	public static Response saveindustrytypes(saveindustrytypes_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.saveindustrytypes);
		logger.info("saveindustry types api called");
		return response;
	}
	
	public static Response saveserviceprovidertypes(saveserviceprovidertypes_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.saveserviceprovidertypes);
		logger.info("save service provider types api called");
		return response;
	}
	public static Response getserviceprovidertype(){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.when()
				.get(Routes.getserviceprovidertype);
		logger.info("get service provider type api called");
		return response;
		
	}
	public static Response getproductfamilytype(getproductfamilytype_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.getproductfamilytype);
		logger.info("get service provider type api called");
		return response;
		
	}
	public static Response saveproductfamilytypes(saveproductfamilytypes_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.saveproductfamilytypes);
		logger.info("save service provider type api called");
		return response;
		
	}
	public static Response fetchdashboardlead(fetchdashboardlead_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.fetchdashboardlead);
		logger.info("fetch dashboard lead api called");
		return response;
		
	}
	public static Response leaddetails(){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.when()
				.get(Routes.leaddetails);
		logger.info("lead details api called");
		return response;
		
	}
	public static Response getoppodetails(){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.when()
				.get(Routes.oppodetails);
		logger.info("get company profile from id api called");
		return response;
		
	}
	public static Response opportunityApproved(opportunityApproved_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.opportunityApproved);
		logger.info("opportunity Approved api called");
		return response;
		
	}
	public static Response opportunityRejected(opportunityRejected_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.opportunityRejected);
		logger.info("opportunity rejected api called");
		return response;
		
	}
	public static Response createfeasibility(createfeasibility_paylod payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given().header("Content-Type", "application/json")
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.createfeasibility);
		logger.info("create feasibility api called");
		return response;
		
	}
	public static Response uploadstagedocument(){
		Test_logintest lo=new  Test_logintest();
		File fi=new File(System.getProperty("user.dir")+"//testdata//doc.pdf");
		Response response=(Response) given()
				.header("Authorization", "Bearer "+lo.testlogin())
				.multiPart("opportunity_id","64d4c09ee3851f0894b31e06")
				.multiPart("opportunity_stage","Feasible")
				.multiPart("file",fi)
				.when()
				.post(Routes.uploadstagedocument);
		logger.info("upload stage document api called");
		return response;
		
	}
	public static Response createtask(createtask_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given()
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.createtask);
		logger.info("create task api called");
		return response;
		
	}
	public static Response fetchtasklist(fetchtask_payload payload){
		Test_logintest lo=new  Test_logintest();
		Response response=(Response) given()
				.header("Authorization", "Bearer "+lo.testlogin())
				.body(payload)
				.when()
				.post(Routes.fetchtasklist);
		logger.info("fetch task list api called");
		return response;
		
	}
}
