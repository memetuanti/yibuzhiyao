package edu.zut.cs.javaee.dream.homework.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "HomeWorkNote")
@Entity
public class HomeWork extends BaseEntity {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 4196637559889532496L;
	
	@GeneratedValue
	@Id
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column
	String HomeWork_name;

	@Column
	Date HomeWork_BeginTime;

	@Column
	Date HomeWork_EndTime;

	@Column
	String HomeWork_State;

	public String getHomeWork_name() {
		return HomeWork_name;
	}

	public void setHomeWork_name(String homeWork_name) {
		HomeWork_name = homeWork_name;
	}

	public Date getHomeWork_BeginTime() {
		return HomeWork_BeginTime;
	}

	public void setHomeWork_BeginTime(Date homeWork_BeginTime) {
		HomeWork_BeginTime = homeWork_BeginTime;
	}

	public Date getHomeWork_EndTime() {
		return HomeWork_EndTime;
	}

	public void setHomeWork_EndTime(Date homeWork_EndTime) {
		HomeWork_EndTime = homeWork_EndTime;
	}

	public String getHomeWork_State() {
		return HomeWork_State;
	}

	public void setHomeWork_State(String homeWork_State) {
		HomeWork_State = homeWork_State;
	}

}
