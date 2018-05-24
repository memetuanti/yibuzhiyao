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
	
	@Column(name = "attdent")
	String attdent;

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

	public String getAttdent() {
		return attdent;
	}

	public void setAttdent(String attdent) {
		this.attdent = attdent;
	}
	
	

}
