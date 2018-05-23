package edu.zut.cs.software.yibuzhiyao.homework.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.yibuzhiyao.base.domain.BaseEntity;
@Table(name = "Homework_list")
@Entity
public class Homework extends BaseEntity{
	
	private static final long serialVersionUID = -4376674977047164142L;
		@Column(name = "Homework_list_name")
		String Homework_list_name;
		
		@Column(name = "Homework_teacher")
		String Homework_teacher;
		
		@Column(name = "Homework_end_time")
		Date Homework_end_time;
		
		@Column(name = "Homework_state")
		Boolean Homework_state;
		
		@Column(name = "Homework_score")
		int Homework_score;

		public String getHomework_list_name() {
			return Homework_list_name;
		}

		public void setHomework_list_name(String homework_list_name) {
			Homework_list_name = homework_list_name;
		}

		public String getHomework_teacher() {
			return Homework_teacher;
		}

		public void setHomework_teacher(String homework_teacher) {
			Homework_teacher = homework_teacher;
		}

		public Date getHomework_end_time() {
			return Homework_end_time;
		}

		public void setHomework_end_time(Date homework_end_time) {
			Homework_end_time = homework_end_time;
		}

		public Boolean getHomework_state() {
			return Homework_state;
		}

		public void setHomework_state(Boolean homework_state) {
			Homework_state = homework_state;
		}

		public int getHomework_score() {
			return Homework_score;
		}

		public void setHomework_score(int homework_score) {
			Homework_score = homework_score;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
		
		
		
}
