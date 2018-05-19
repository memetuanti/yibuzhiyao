package edu.zut.cs.yibuzhiyao.achievement.service.lmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.yibuzhiyao.achievement.dao.ScoreDao;
import edu.zut.cs.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.yibuzhiyao.achievement.service.ScoreManager;
import edu.zut.cs.yibuzhiyao.base.service.impl.GenericManagerImpl;



@Component
public class ScoreManagerImpl extends GenericManagerImpl<Score, Long> implements ScoreManager{

	ScoreDao scoreDao;
	@Autowired
	public void setUserDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
		this.dao = this.scoreDao;
	}
	
	public Score findbyScorename(String scorename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Score findbyFootname(String footname) {
		// TODO Auto-generated method stub
		return null;
	}

}
