package edu.zut.cs.software.yibuzhiyao.achievement.service;

import java.util.List;

import edu.zut.cs.software.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.software.yibuzhiyao.base.service.GenericManager;


public interface ScoreManager extends GenericManager<Score, Long> {

	List<Score> findAll();
	Score findbyScorename(String scorename);

}
