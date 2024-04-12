package com.teachersdunet.quizgame;

import com.teachersdunet.quizgame.generator.MathQuestionsGenerator;

public class DriverQuiz {

	public static void main(String[] args) {
		Quiz quiz = new GUIQuiz(new MathQuestionsGenerator(2));
		quiz.start();
		quiz.displayResults();

	}

}
