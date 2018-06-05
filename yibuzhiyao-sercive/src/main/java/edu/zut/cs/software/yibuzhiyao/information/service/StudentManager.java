package edu.zut.cs.software.yibuzhiyao.information.service;

import java.util.List;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;
/**
 * 
 * @author yibuzhiyao
 *
 */
public interface StudentManager  extends GenericManager<Student, Long>{
	
	/**
	 * get student list by given code
	 *
	 * @param num
	 * @return
	 */
	List<Student> findByNum(String num);

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<Student> findByName(String name);
}
