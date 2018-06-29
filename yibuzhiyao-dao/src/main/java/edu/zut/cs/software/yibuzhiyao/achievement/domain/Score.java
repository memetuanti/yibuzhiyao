package edu.zut.cs.software.yibuzhiyao.achievement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.yibuzhiyao.base.domain.BaseEntity;

@Table(name = "achievement_Score")
@Entity
public class Score extends BaseEntity{
	
	private static final long serialVersionUID = -4376674977047164142L;
	//@Id
		@Column(name = "name")
		String name;
		
		@Column(name = "num")
		String num;
		
		@Column(name = "first")
		int first;
		
		@Column(name = "second")
		int second;
		
		@Column(name = "third")
		int third;
		
		@Column(name = "fourth")
		int fourth;
		
		@Column(name = "fifth")
		int fifth;
		
		@Column(name = "attendance")
		int attendance;
		
		@Column(name = "j2design")
		int j2design;
	
		@Column(name = "total")
		int total;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
		}

		public int getFirst() {
			return first;
		}

		public void setFirst(int first) {
			this.first = first;
		}

		public int getSecond() {
			return second;
		}

		public void setSecond(int second) {
			this.second = second;
		}

		public int getThird() {
			return third;
		}

		public void setThird(int third) {
			this.third = third;
		}

		public int getFourth() {
			return fourth;
		}

		public void setFourth(int fourth) {
			this.fourth = fourth;
		}

		public int getFifth() {
			return fifth;
		}

		public void setFifth(int fifth) {
			this.fifth = fifth;
		}

		public int getAttendance() {
			return attendance;
		}

		public void setAttendance(int attendance) {
			this.attendance = attendance;
		}

		public int getJ2design() {
			return j2design;
		}

		public void setJ2design(int j2design) {
			this.j2design = j2design;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		
		
}
