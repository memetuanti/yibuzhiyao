package edu.zut.cs.javaee.dream.base.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@MappedSuperclass
public class BaseEntityDomain extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6163675075289529459L;

	@Column(name = "ENTITY_NAME")
	String entityName;

	/**
	 * 实体创建时间
	 * 1.日期：

@Temporal(TemporalType.DATE)
 @Column(name = "applyDate", nullable = false, length = 10)
 public Date getApplyDate() {
  return applyDate;
 }

在页面端取值：2011-04-12

 

 

 2.时间：

@Temporal(TemporalType.TIME)

在页面端取值：22:50:30

 3.日期和时间(默认)：

@Temporal(TemporalType.TIMESTAMP) 
在页面端取值：2011-04-12 22:51:34.0
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATECREATED")
	protected Date dateCreated = new Date();

	/**
	 * 实体修改时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATEMODIFED")
	protected Date dateModified = new Date();

	/**
	 * 实体是否被删除
	 */
	@Column(name = "DELETED")
	protected Boolean deleted = false;

	/**
	 * 实体主键
	 * 
	 * 
	 * 这个是JPA
		这句下面应该有个getId方法吧？
		象这样
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		public String getId() {
	  	return id;
 		}

		这是说Id是个自增主键，映射到你这个类中的String id
		
		
	 */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	@Override
	public boolean equals(Object obj) {
		if (null != obj) {
			if (obj instanceof BaseEntityDomain) {
				BaseEntityDomain domain = (BaseEntityDomain) obj;
				if (this.id == domain.id) {
					return true;
				}
			}
		}
		return false;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		if (this.id == null) {
			this.id = Long.valueOf(0);
		}
		return HashCodeBuilder.reflectionHashCode(this.id);
	}

	public Boolean isDeleted() {
		return deleted;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
