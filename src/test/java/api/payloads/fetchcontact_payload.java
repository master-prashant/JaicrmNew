package api.payloads;

public class fetchcontact_payload {
	
	String col_sort;
	String length;
	String order;
	String search;
	String start;
	public String getCol_sort() {
		return col_sort;
	}
	public void setCol_sort(String col_sort) {
		this.col_sort = col_sort;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
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
