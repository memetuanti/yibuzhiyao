package edu.zut.cs.software.yibuzhiyao.arrive.service;

import java.util.List;

import edu.zut.cs.software.yibuzhiyao.arrive.domain.Mark;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;

/**
 * 
 * @author yibuzhiyao
 *
 */
public interface MarkManager extends GenericManager<Mark,Long>{
	
	/**
	 * get student list by given code
	 *
	 * @param num
	 * @return
	 */
	List<Mark> findbyNum(String num);
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	List<Mark> findbyName(String name);
}
