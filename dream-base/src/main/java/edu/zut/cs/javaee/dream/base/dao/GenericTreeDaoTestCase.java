package edu.zut.cs.javaee.dream.base.dao;

import java.io.Serializable;

import edu.zut.cs.javaee.dream.base.domain.BaseTreeEntityDomain;

public class GenericTreeDaoTestCase<PK extends Serializable, T extends BaseTreeEntityDomain<T>, M extends GenericTreeDao<T, PK>>
		extends GenericDaoTestCase<PK, T, M> {

}
