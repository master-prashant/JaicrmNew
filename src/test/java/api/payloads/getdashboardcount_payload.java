package api.payloads;

public class getdashboardcount_payload {
	//{start_date: "2023-07-01", end_date: "2023-08-03T18:29:59.999Z"}
	String start_date;
	String end_date;
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

}
