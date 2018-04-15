package edu.zut.cs.javaee.dream.module.service;

import java.util.List;

public interface MudoleManager {

	List<Module> findByName(String module_name);
}
