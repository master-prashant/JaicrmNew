package api.payloads;

public class opportunityApproved_payload {
	String user_id;
	String opportunity_id;
	String opportunity_stage;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getOpportunity_id() {
		return opportunity_id;
	}
	public void setOpportunity_id(String opportunity_id) {
		this.opportunity_id = opportunity_id;
	}
	public String getOpportunity_stage() {
		return opportunity_stage;
	}
	public void setOpportunity_stage(String opportunity_stage) {
		this.opportunity_stage = opportunity_stage;
	}
	

}
