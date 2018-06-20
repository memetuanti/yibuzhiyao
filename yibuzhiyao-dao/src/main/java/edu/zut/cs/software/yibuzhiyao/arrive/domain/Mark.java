package edu.zut.cs.software.yibuzhiyao.arrive.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.yibuzhiyao.base.domain.BaseEntity;


@Table(name= "Arrive_Mark")
@Entity
public class Mark extends BaseEntity{
	
	
	@Column(name = "name")
	String name;
	
	
	@Column(name = "myclass")
	String myclass;
	
	@Column(name = "num")
	String num;
	
	@Column(name = "attdent1")
	String attdent1;

	@Column(name = "attdent2")
	String attdent2;
	
	@Column(name = "attdent3")
	String attdent3;
	
	@Column(name = "attdent4")
	String attdent4;
	
	@Column(name = "attdent5")
	String attdent5;
	
	@Column(name = "score")
	int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMyclass() {
		return myclass;
	}

	public void setMyclass(String myclass) {
		this.myclass = myclass;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAttdent1() {
		return attdent1;
	}

	public void setAttdent1(String attdent1) {
		this.attdent1 = attdent1;
	}

	public String getAttdent2() {
		return attdent2;
	}

	public void setAttdent2(String attdent2) {
		this.attdent2 = attdent2;
	}

	public String getAttdent3() {
		return attdent3;
	}

	public void setAttdent3(String attdent3) {
		this.attdent3 = attdent3;
	}

	public String getAttdent4() {
		return attdent4;
	}

	public void setAttdent4(String attdent4) {
		this.attdent4 = attdent4;
	}

	public String getAttdent5() {
		return attdent5;
	}

	public void setAttdent5(String attdent5) {
		this.attdent5 = attdent5;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

}
