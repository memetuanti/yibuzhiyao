package edu.zut.cs.javaee.dream.admin.service.impl;

import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.admin.domain.Role;
import edu.zut.cs.javaee.dream.admin.service.RoleManager;
import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;

@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager {

}
