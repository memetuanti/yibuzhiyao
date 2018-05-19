package edu.zut.cs.yibuzhiyao.base.dao;

import java.io.Serializable;

import edu.zut.cs.yibuzhiyao.base.domain.BaseTreeEntity;

public class GenericTreeDaoTestCase<PK extends Serializable, T extends BaseTreeEntity<T>, M extends GenericTreeDao<T, PK>>
extends GenericDaoTestCase<PK, T, M> {

}
