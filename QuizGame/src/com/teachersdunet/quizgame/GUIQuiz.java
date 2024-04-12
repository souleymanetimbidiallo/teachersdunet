package com.teachersdunet.quizgame;

import javax.swing.JOptionPane;

import com.teachersdunet.quizgame.generator.QuestionsGenerator;

public class GUIQuiz extends Quiz{

	public GUIQuiz(QuestionsGenerator generator) {
		super(generator);
	}

	@Override
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public String retrieveAnswer(String prompt) {
		return JOptionPane.showInputDialog(prompt);
	}

}
