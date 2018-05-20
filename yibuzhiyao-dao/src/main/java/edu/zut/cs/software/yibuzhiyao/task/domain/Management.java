package edu.zut.cs.software.yibuzhiyao.task.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.yibuzhiyao.base.domain.BaseEntity;



@Table(name = "TASK_MANAGEMENT")
@Entity
public class Management extends BaseEntity{
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "name")
	String name;

	//@Id
	@Column(name = "num")
	//@GeneratedValue
	String num;

	@Column(name = "age")
	int age;
	
	@Column(name = "sex")
	String sex;
	
	@Column(name = "score")
	int score;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
