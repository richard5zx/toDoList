package entity;

public class Task {
	private Integer taskid;
	private Integer userid;
	private String description;
	
	
	public Task() {
		super();
	}

	public Task(Integer taskid, Integer userid, String description) {
		super();
		this.userid = userid;
		this.description = description;
	}
	
	public Integer getTaskid() {
		return taskid;
	}
	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
