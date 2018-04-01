package edu.zut.cs.javaee.dream.base.service;

import java.io.Serializable;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;

import edu.zut.cs.javaee.dream.base.domain.BaseTreeEntityDomain;

public abstract class GenericTreeManagerTestCase<PK extends Serializable, T extends BaseTreeEntityDomain<T>, M extends GenericTreeManager<T, PK>>
		extends GenericManagerTestCase<PK, T, M> {

	public GenericTreeManagerTestCase(Class<T> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(GenericTreeManagerTestCase.class);

	@Test
	public void testGetRoot() {
		List<T> result = this.manager.getRoot();
		if (logger.isInfoEnabled()) {
			logger.info("testGetRoot() - List<T> result=" + result); //$NON-NLS-1$
		}

	}

}
