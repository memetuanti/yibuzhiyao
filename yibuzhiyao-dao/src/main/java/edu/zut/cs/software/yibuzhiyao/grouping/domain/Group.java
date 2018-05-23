package edu.zut.cs.software.yibuzhiyao.grouping.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.yibuzhiyao.base.domain.BaseEntity;

@Table(name="G_form")
@Entity
public class Group  extends BaseEntity {

	
	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name="G_name")
	String G_name;
	
	@Column(name="G_snum")
	String G_snum;
	
	@Column(name="G_age")
	int G_age;
	
	@Column(name="G_sex")
	String G_sex;
	
	@Column(name="G_cla")
	String G_cla;
	public String getG_name()
	{
		return G_name;
	}
	public void setG_name(String G_name)
	{
		this.G_name=G_name;
	}
	public String getG_sex()
	{
		return G_sex;
	}
	public void setG_sex(String G_sex)
	{
		this.G_sex=G_sex;
	}
	public String getG_snum()
	{
		return G_snum;
	}
	public void setG_snum(String G_snum)
	{
		this.G_snum=G_snum;
	}
	public int getG_sage()
	{
		return G_age;
	}
	public void setG_age(int G_age)
	{
		this.G_age=G_age;
	}
	public String getG_cla()
	{
		return G_cla;
	}
	public void setG_cla(String G_cla)
	{
		this.G_cla=G_cla;
	}
	
}
