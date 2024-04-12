package com.teachersdunet.quizgame.generator;

import java.util.ArrayList;

import com.teachersdunet.quizgame.Question;

public abstract class QuestionsGenerator {
	protected int nbreQuestions;
	
	public QuestionsGenerator(int nbreQuestions) {
		this.nbreQuestions = nbreQuestions;
	}
	
	 public abstract ArrayList<Question> generate() throws Exception;
	
	public int getNbreQuestions() {
		return nbreQuestions;
	}
}
