package edu.zut.cs.javaee.dream.base.service;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.javaee.dream.base.BaseAbstractTestCase;
import edu.zut.cs.javaee.dream.base.domain.BaseEntityDomain;



@ContextConfiguration(locations = {
		"classpath:/applicationContextTest-resources.xml",
		"classpath:/applicationContext-dao.xml",
		"classpath:/applicationContext-service.xml" })
@RunWith(value = SpringJUnit4ClassRunner.class)
@Transactional
public abstract class GenericManagerTestCase<PK extends Serializable, T extends BaseEntityDomain, M extends GenericManager<T, PK>>
		extends BaseAbstractTestCase {

	protected T entity;

	protected List<T> list;

	/**
	 * A simple logger
	 */
	protected final Logger log = Logger.getLogger(this.getClass());

	protected M manager;

	private Class<T> persistentClass;

	public GenericManagerTestCase(final Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Before
	public void setUp() throws Exception {
		this.entity = this.persistentClass.newInstance();

	}

	@Test
	public void testSave() {
		if (this.entity == null) {
			try {
				this.entity = this.persistentClass.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		this.entity = this.manager.save(this.entity);
	}

}
