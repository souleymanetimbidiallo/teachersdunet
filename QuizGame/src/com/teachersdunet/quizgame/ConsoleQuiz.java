package com.teachersdunet.quizgame;

import java.util.Scanner;

import com.teachersdunet.quizgame.generator.QuestionsGenerator;

public class ConsoleQuiz extends Quiz{
	
	Scanner clavier = new Scanner(System.in);
	
	public ConsoleQuiz(QuestionsGenerator generator) {
		super(generator);
	}
		
	@Override
	public void displayMessage(String message) {
		System.out.println(message);
		
	}

	@Override
	public String retrieveAnswer(String prompt) {
		displayMessage(prompt);
		return clavier.nextLine();
	}
	
}
