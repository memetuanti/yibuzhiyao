package edu.zut.cs.javaee.dream.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "T_ADMIN_USER")
@Entity

public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "USERNAME")
	String username;

	@Column(name = "PASSWORD")
	String password;

	@Column(name = "EMAIL")
	String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
