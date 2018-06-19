package edu.zut.cs.software.yibuzhiyao.homework.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.yibuzhiyao.base.domain.BaseEntity;
@Table(name = "homework_list")
@Entity
public class Homework extends BaseEntity{
	
	private static final long serialVersionUID = -4376674977047164142L;
		
		@Column(name = "num")
		String num;
		
		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
		}

		public String getHomework_list_name() {
			return homework_list_name;
		}

		public void setHomework_list_name(String homework_list_name) {
			this.homework_list_name = homework_list_name;
		}

		public String getHomework_teacher() {
			return homework_teacher;
		}

		public void setHomework_teacher(String homework_teacher) {
			this.homework_teacher = homework_teacher;
		}

		public Date getHomework_end_time() {
			return homework_end_time;
		}

		public void setHomework_end_time(Date homework_end_time) {
			this.homework_end_time = homework_end_time;
		}

		public Boolean getHomework_state() {
			return homework_state;
		}

		public void setHomework_state(Boolean homework_state) {
			this.homework_state = homework_state;
		}

		public int getHomework_score() {
			return homework_score;
		}

		public void setHomework_score(int homework_score) {
			this.homework_score = homework_score;
		}

		@Column(name = "homework_list_name")
		String homework_list_name;
		
		@Column(name = "homework_teacher")
		String homework_teacher;
		
		@Column(name = "homework_end_time")
		Date homework_end_time;
		
		@Column(name = "homework_state")
		Boolean homework_state;
		
		@Column(name = "homework_score")
		int homework_score;

		
		
}
