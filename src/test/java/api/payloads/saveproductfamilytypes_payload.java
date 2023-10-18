package api.payloads;

import java.util.ArrayList;
import java.util.List;

public class saveproductfamilytypes_payload {
	String selected_serviceprovider;
	List<String>setting_productfamily_list=new ArrayList<String>();
	public String getSelected_serviceprovider() {
		return selected_serviceprovider;
	}
	public void setSelected_serviceprovider(String selected_serviceprovider) {
		this.selected_serviceprovider = selected_serviceprovider;
	}
	public List<String> getSetting_productfamily_list() {
		return setting_productfamily_list;
	}
	public void setSetting_productfamily_list(List<String> setting_productfamily_list) {
		this.setting_productfamily_list = setting_productfamily_list;
	}
	

}
