package api.payloads;

public class createtask_payload {
//	assigned_to: "64770dadf47b3f55513b6aa7"
//	closing_remark: ""
//	end_date: "2023-08-23T18:29:59.999Z"
//	missing_deadline: ""
//	operationmode: "create"
//	start_date: "2023-08-23T10:18:48.007Z"
//	status:"Assigned"
//	subject: "opportunity id is not clickable from task list pageopportunity id is not clickable from task list page"
//	task_for: "Opportunity"
//	task_for_id	: "64e58906d218405230ab3dc9"
//	task_type: "Customer Followup"
	String assigned_to;
	String closing_remark;
	String end_date;
	String missing_deadline;
	String operationmode;
	String start_date;
	String status;
	String subject;
	String task_for;
	String task_for_id;
	String task_type;
	String taskid;
	
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public String getAssigned_to() {
		return assigned_to;
	}
	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}
	public String getClosing_remark() {
		return closing_remark;
	}
	public void setClosing_remark(String closing_remark) {
		this.closing_remark = closing_remark;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getMissing_deadline() {
		return missing_deadline;
	}
	public void setMissing_deadline(String missing_deadline) {
		this.missing_deadline = missing_deadline;
	}
	public String getOperationmode() {
		return operationmode;
	}
	public void setOperationmode(String operationmode) {
		this.operationmode = operationmode;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTask_for() {
		return task_for;
	}
	public void setTask_for(String task_for) {
		this.task_for = task_for;
	}
	public String getTask_for_id() {
		return task_for_id;
	}
	public void setTask_for_id(String task_for_id) {
		this.task_for_id = task_for_id;
	}
	public String getTask_type() {
		return task_type;
	}
	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}
	
}
