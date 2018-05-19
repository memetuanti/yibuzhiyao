package edu.zut.cs.yibuzhiyao.achievement.service;

import java.util.List;


import edu.zut.cs.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.yibuzhiyao.base.service.GenericManager;

public interface ScoreManager extends GenericManager<Score, Long>{
	List<Score> findAll();

	Score findbyFootname(String footname);
}
