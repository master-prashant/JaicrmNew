package api.payloads;

public class getall_user {
	String filterRole;
	String length;
	String search;
	String start;
	public String getFilterRole() {
		return filterRole;
	}
	public void setFilterRole(String filterRole) {
		this.filterRole = filterRole;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}

}
