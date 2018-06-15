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
		
		@Column(name = "math")
		int math;
		
		@Column(name = "DB")
		int DB;
		
		@Column(name = "javaee")
		int javaee;

		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int math) {
			this.math = math;
		}

		public int getDB() {
			return DB;
		}

		public void setDB(int DB) {
			this.DB = DB;
		}

		public int getJavaee() {
			return javaee;
		}

		public void setJavaee(int javaee) {
			this.javaee = javaee;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
}
