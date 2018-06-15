package edu.zut.cs.software.yibuzhiyao.achievement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.software.yibuzhiyao.achievement.dao.ScoreDao;
import edu.zut.cs.software.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.software.yibuzhiyao.achievement.service.ScoreManager;
import edu.zut.cs.software.yibuzhiyao.base.service.impl.GenericManagerImpl;

@Component
public class ScoreManagerlmpl extends GenericManagerImpl<Score, Long> implements ScoreManager {
	ScoreDao scoreDao;
	@Autowired
	public void setUserDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
		this.dao = this.scoreDao;
	}
	@Override
	public Score findbyScorename(String scorename) {
		// TODO Auto-generated method stub
		return null;
	}

}
