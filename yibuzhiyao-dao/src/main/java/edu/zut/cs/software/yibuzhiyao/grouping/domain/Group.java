package edu.zut.cs.software.yibuzhiyao.grouping.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.yibuzhiyao.base.domain.BaseEntity;

@Table(name="Group_form")
@Entity
public class Group  extends BaseEntity {

	
	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name="g_name")
	String g_name;
	@Column(name="g_Major")
	String g_Major;
	@Column(name="g_snum")
	String g_snum;
	@Column(name="g_age")
	int g_age;
	@Column(name="g_sex")
	String g_sex;
	@Column(name="g_cla")
	String g_cla;
	public String getg_name()
	{
		return g_name;
	}
	public void setg_name(String g_name)
	{
		this.g_name=g_name;
	}
	public String getg_sex()
	{
		return g_sex;
	}
	public void setg_sex(String g_sex)
	{
		this.g_sex=g_sex;
	}
	public String getg_snum()
	{
		return g_snum;
	}
	public void setg_snum(String g_snum)
	{
		this.g_snum=g_snum;
	}
	public int getg_age()
	{
		return g_age;
	}
	public void setg_age(int g_age)
	{
		this.g_age=g_age;
	}
	public String getg_cla()
	{
		return g_cla;
	}
	public void setg_cla(String g_cla)
	{
		this.g_cla=g_cla;
	}
	public String getg_Major()
	{
		return g_Major;
	}
	public void setg_Major(String g_Major)
	{
		this.g_Major=g_Major;
	}

}
