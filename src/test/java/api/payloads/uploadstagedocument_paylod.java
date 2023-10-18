package api.payloads;

import java.io.File;

public class uploadstagedocument_paylod {
	String opportunity_id;
	String opportunity_stage;
	File file;
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
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
}
