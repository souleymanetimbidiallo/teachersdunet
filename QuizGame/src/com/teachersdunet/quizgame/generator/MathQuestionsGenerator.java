package com.teachersdunet.quizgame.generator;

import java.util.ArrayList;
import java.util.Random;

import com.teachersdunet.quizgame.Question;

public class MathQuestionsGenerator extends QuestionsGenerator {

	public MathQuestionsGenerator(int nbreQuestions) {
		super(nbreQuestions);
	}

	@Override
	public ArrayList<Question> generate() {
		ArrayList<Question> questions = new ArrayList<>();
		Random random = new Random();
		char[] operators = {'+', '-', '*', '/'};
		for (int i = 0; i < nbreQuestions; i++) {
			int nbre1 = random.nextInt(15);
			int nbre2 = random.nextInt(15) + 1;
			char operator = operators[random.nextInt(operators.length)];
			String questionText = String.format("%d %c %d = ?", nbre1, operator, nbre2);
			questions.add(new Question(questionText, calulate(operator,nbre1, nbre2)));
		}
		return questions;
	}

	private String calulate(char operator, int nbre1, int nbre2) {
		String response = null; 
		switch (operator) {
		case '+':
			response = String.valueOf(nbre1+nbre2);
			break;
		case '-':
			response = String.valueOf(nbre1-nbre2);
			break;
		case '*':
			response = String.valueOf(nbre1*nbre2);
		break;
		case '/':
			response = String.valueOf(nbre1/nbre2);
			break;
		}
		return response;
	}

}
