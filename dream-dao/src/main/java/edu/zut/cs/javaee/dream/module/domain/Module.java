package edu.zut.cs.javaee.dream.module.domain;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseTreeEntity;

@Entity
@Table(name = "T_MODULE")
@NamedQueries({ @NamedQuery(name = "Module.getRoot", query = "select m from Module m where m.parent is null") })
public class Module extends BaseTreeEntity<Module> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1945866957570000331L;

}
