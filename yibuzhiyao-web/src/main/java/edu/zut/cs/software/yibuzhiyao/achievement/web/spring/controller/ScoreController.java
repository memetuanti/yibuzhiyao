package edu.zut.cs.software.yibuzhiyao.achievement.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.software.yibuzhiyao.achievement.domain.Score;
import edu.zut.cs.software.yibuzhiyao.achievement.service.ScoreManager;
import edu.zut.cs.software.yibuzhiyao.base.web.spring.controller.GenericController;


@Controller
@RequestMapping("/score")
public class ScoreController  extends GenericController<Score, Long, ScoreManager>{
	ScoreManager scoreManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/score/index";
		return result;
	}
	@Autowired
	public void setScoreManager(ScoreManager scoreManager) {
		this.scoreManager = scoreManager;
		this.manager = this.scoreManager;
	}

}
