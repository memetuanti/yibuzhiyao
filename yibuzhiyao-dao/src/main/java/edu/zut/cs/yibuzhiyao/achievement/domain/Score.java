package edu.zut.cs.yibuzhiyao.achievement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.yibuzhiyao.base.domain.BaseEntity;
import edu.zut.cs.yibuzhiyao.information.domain.Group;

@Table(name = "Achievement_Score")
@Entity
public class Score extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "name")
	String name;

	//@Id
	@Column(name = "num")
	//@GeneratedValue
	String num;
	
	
	@Column(name = "math")
	int math;
	@Column(name = "DB")
	int DB;
	@Column(name = "javaee")
	int javaee;
	@ManyToOne
	@JoinColumn(name = "group_name")
	Group group;
	
	public String getName() {
		return name;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
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
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getDB() {
		return DB;
	}
	public void setDB(int dB) {
		DB = dB;
	}
	public int getJavaee() {
		return javaee;
	}
	public void setJavaee(int javaee) {
		this.javaee = javaee;
	}
	
}





