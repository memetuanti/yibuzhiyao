package edu.zut.cs.software.yibuzhiyao.information.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.yibuzhiyao.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.yibuzhiyao.information.dao.StudentDao;
import edu.zut.cs.software.yibuzhiyao.information.domain.Student;
import edu.zut.cs.software.yibuzhiyao.information.service.StudentManager;

@Component
public class StudentManagerImpl extends GenericManagerImpl<Student, Long> implements StudentManager{

	
	StudentDao studentDao;

	@Override
	public List<Student> findByNum(String num) {
		// 创建查询条件数据对象
				Student queryObject = new Student();
				queryObject.setDateCreated(null);
				queryObject.setDateModified(null);
				queryObject.setNum(num);;
				// 创建匹配器，即如何使用查询条件
				// 创建匹配器，即如何使用查询条件
				ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
						.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
						.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
						.withMatcher("num", GenericPropertyMatchers.startsWith()); // 地址采用“开始匹配”的方式查询
				// 创建实例并查询
				Example<Student> ex = Example.of(queryObject, matcher);
				List<Student> result = dao.findAll(ex);
				return result;
	}

	@Override
	public List<Student> findByName(String name) {
		// 创建查询条件数据对象
				Student queryObject = new Student();
				queryObject.setName(name);
				// 创建匹配器，即如何使用查询条件
				ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
						.withMatcher("name", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
						.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
				// 创建实例并查询
				Example<Student> ex = Example.of(queryObject, matcher);
				List<Student> result = dao.findAll(ex);
				return result;
	}
	
	@Autowired
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
		this.dao = this.studentDao;
	}

}