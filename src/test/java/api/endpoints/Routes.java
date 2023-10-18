package api.endpoints;

public class Routes {

	public static String base_url="https://jaicrm1.orderbookings.com";
	
	//user module
	public static String login_post= base_url+"/login";										//1
	public static String passwordrequest_post= base_url+"/passwordresetreq";				//2	
	public static String createuser=base_url+"/usercreate";									//3
	public static String deleteuser=base_url+"/userdelete";									//4
	public static String getalluser=base_url+"/getalluser";									//5
	public static String getallroles=base_url+"/getallroles";								//6
	public static String editUser=base_url+"/useredit";										//7	
	public static String verifycompanyname=base_url+"/verifycompanyname";					//8
	public static String getindustrytype=base_url+"/getindustrytype";						//9	
	public static String createcompany=base_url+"/createCompany";							//10
	public static String getcomlist=base_url+"/companylist";								//11	
	public static String getcompproffromid=base_url+"/companyprofile/64c38d4be466b805fb6ba0ca";	//12
	public static String editCompany=base_url+"/companyedit";								//13
	public static String fetchlead=base_url+"/fetchleadlist";								//14
	public static String createlead=base_url+"/createlead";									//15
	public static String editlead=base_url+"/leadedit";										//16
	public static String userlist=base_url+"/userlist";										//17
	public static String createbranch=base_url+"/createbranch";								//18
	public static String editbranch=base_url+"/branchedit";									//19
	public static String createcontact=base_url+"/createcontact";							//20
	public static String contactedit=base_url+"/contactedit";								//21	
	public static String fetchcontactlist=base_url+"/fetchcontactlist";						//22
	public static String Getcontactlist=base_url+"/contactlist/647eaa713f33a4f60f8fab23";	//23
	public static String leadAssigned=base_url+"/leadAssigned";								//24
	public static String getcompanyleadsfromid=base_url+"/getcompanyleads/647eaa713f33a4f60f8fab23";//25
	public static String getordertype=base_url+"/getordertype";								//26
	public static String getproducttype=base_url+"/getproducttype";							//27
	public static String createopportunity=base_url+"/createopportunity";					//28    not done
	public static String fetchopportunitylist=base_url+"/fetchopportunitylist";				//29
	public static String opportunityedit=base_url+"/opportunityedit";						//30  not done
	public static String getdashboardcount=base_url+"/getdashboardcount";					//31
	public static String opportunityAssigned=base_url+"/opportunityAssigned";				//32	
	public static String contactstatuschange=base_url+"/contactstatuschange";				//33	
	public static String saveindustrytypes=base_url+"/saveindustrytypes";					//34 	
	public static String saveserviceprovidertypes=base_url+"/saveserviceprovidertypes";		//35 
	public static String getserviceprovidertype=base_url+"/getserviceprovidertype";			//36 
	public static String saveproductfamilytypes=base_url+"/saveproductfamilytypes";			//37 
	public static String getproductfamilytype=base_url+"/getproductfamilytype";				//38 
	public static String fetchdashboardlead=base_url+"/fetchdashboardlead";				    //39 
	public static String leaddetails=base_url+"/leaddetails/64d30c51d7f6a2de15d835b0";		//40
	public static String oppodetails=base_url+"/oppodetails/64d4c09ee3851f0894b31e06";		//41
	public static String opportunityApproved=base_url+"/opportunityApproved";				//42 
	public static String opportunityRejected=base_url+"/opportunityRejected";				//43 
	public static String createfeasibility=base_url+"/createfeasibility";					//44 
	public static String uploadstagedocument=base_url+"/uploadstagedocument";				//45 
	public static String createtask=base_url+"/mixinmanagetask";							//46
	public static String fetchtasklist=base_url+"/fetchtasklist";							//47
	}
