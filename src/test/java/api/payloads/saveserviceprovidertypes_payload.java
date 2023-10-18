package api.payloads;

import java.util.ArrayList;
import java.util.List;

public class saveserviceprovidertypes_payload {

	List<String>setting_serviceprovider_list=new ArrayList<String>();

	public List<String> getSetting_serviceprovider_list() {
		return setting_serviceprovider_list;
	}

	public void setSetting_serviceprovider_list(List<String> setting_serviceprovider_list) {
		this.setting_serviceprovider_list = setting_serviceprovider_list;
	}
	
}
