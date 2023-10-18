package api.payloads;

import java.util.ArrayList;
import java.util.List;

public class saveindustrytypes_payload {
	List<String> setting_industrytype_list=new ArrayList<String>();

	public List<String> getSetting_industrytype_list() {
		return setting_industrytype_list;
	}

	public void setSetting_industrytype_list(List<String> setting_industrytype_list) {
		this.setting_industrytype_list = setting_industrytype_list;
	}	

}
