package com.teachersdunet.quizgame;

import com.teachersdunet.quizgame.generator.QuestionsGenerator;
import com.teachersdunet.quizgame.utils.TimeConverter;

public abstract class Quiz {
	private int score;
	private long timeElapsed;
	private QuestionsGenerator generator;
	private boolean done = false;

	public Quiz(QuestionsGenerator generator) {
		this.generator = generator;
	}

	public abstract void displayMessage(String message);

	public abstract String retrieveAnswer(String prompt);

	public void start() {
		try {
			long startTime = System.currentTimeMillis();

			askQuestions();

			done = true;
			long endTime = System.currentTimeMillis();
			timeElapsed = endTime - startTime;
		} catch (Exception e) {
			done = false;
			System.out.println(e.getMessage());
		}
	}

	private void askQuestions() throws Exception {
		for (Question question : generator.generate()) {

			String userAnswer = retrieveAnswer(question.getText());

			if (userAnswer.equalsIgnoreCase(question.getResponse())) {
				score++;
				displayMessage("Bonne reponse!");
			} else {
				displayMessage("Oops... Mauvaise reponse!\nLa bonne reponse etait: "
						+ question.getResponse());
			}
		}
	}

	public void displayResults() {
		if (done) {
			displayScore();
			displayTimeElapsed();
		}
	}
	
	private void displayTimeElapsed() {
		displayMessage(String.format("Il vous a fallu %d secondes pour repondre aux %d questions.\n",
						TimeConverter.toSeconds(timeElapsed),generator.getNbreQuestions()));

	}

	private void displayScore() {
		displayMessage(String.format("Votre score final est: %d/%d.\n", score,
				generator.getNbreQuestions()));

	}
}
