package edu.zut.cs.software.yibuzhiyao.task.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.yibuzhiyao.base.domain.BaseEntity;



@Table(name = "TASK_MANAGEMENT")
@Entity
public class Management extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "teskname")
	String taskname;
	
	@Column(name = "starttime")
	int starttime;
	
	@Column(name = "endtime")
	int endtime;

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public int getStarttime() {
		return starttime;
	}

	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}

	public int getEndtime() {
		return endtime;
	}

	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}








}
