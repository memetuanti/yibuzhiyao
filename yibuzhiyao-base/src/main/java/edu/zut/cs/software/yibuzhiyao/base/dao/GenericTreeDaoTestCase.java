package edu.zut.cs.software.yibuzhiyao.base.dao;

import java.io.Serializable;

import edu.zut.cs.software.yibuzhiyao.base.domain.BaseTreeEntity;
/**
 * 
 * @author yibuzhiyao
 *
 * @param <PK>
 * @param <T>
 * @param <M>
 */
public class GenericTreeDaoTestCase<PK extends Serializable, T extends BaseTreeEntity<T>, M extends GenericTreeDao<T, PK>>
extends GenericDaoTestCase<PK, T, M> {

}
