 package edu.zut.cs.software.yibuzhiyao.task.domain;



import java.util.Date;

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
	Date starttime;
	
	@Column(name = "endtime")
	Date endtime;

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}









}
