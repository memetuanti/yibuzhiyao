package edu.zut.cs.software.yibuzhiyao.grouping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.yibuzhiyao.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.yibuzhiyao.grouping.dao.GroupDao;
import edu.zut.cs.software.yibuzhiyao.grouping.domain.Group;
import edu.zut.cs.software.yibuzhiyao.grouping.service.GroupManager;

@Component
public class GroupManagerImpl extends GenericManagerImpl<Group,Long> implements GroupManager {

	GroupDao groupdao;


	@Override
	public List<Group> findByg_snum(String g_snum) {
		// 创建查询条件数据对象
		Group queryObject=new Group();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setg_snum(g_snum);
		// 创建匹配器，即如何使用查询条件
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
				.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
				.withMatcher("g_snum", GenericPropertyMatchers.startsWith()); // 地址采用“开始匹配”的方式查询
		// 创建实例并查询
		Example<Group> ex = Example.of(queryObject, matcher);
		List<Group> result = dao.findAll(ex);
		return result;
	}
	@Override
	public List<Group> findByg_name(String g_name) {
		// 创建查询条件数据对象
		Group queryObject=new Group();
		queryObject.setg_name(g_name);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("g_name", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<Group> ex = Example.of(queryObject, matcher);
		List<Group> result = dao.findAll(ex);
		return result;
	}
	
	@Autowired
	public void setGroupDao(GroupDao groupdao)
	{
		this.groupdao=groupdao;
		this.dao=this.groupdao;
	}
}