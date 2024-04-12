package com.teachersdunet.quizgame.generator;

import java.util.ArrayList;
import java.util.Random;

import com.teachersdunet.quizgame.Question;

public class CapitalCityQuestionsGenerator extends QuestionsGenerator{
	
	public CapitalCityQuestionsGenerator(int nbreQuestions) {
		super(nbreQuestions);
	}

	public ArrayList<Question> generate(){
		String[][] data = getData();//récuperer les pays et capitales
		
		if(nbreQuestions > data.length){
			throw new IllegalArgumentException("On ne peut générer que " +data.length+ " questions maximum.");
		}
		
		ArrayList<Question> questions = new ArrayList<>();
		
		int index;
		
		ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();
			
		for (int i = 0; i < nbreQuestions; i++) {
			//Choisir un pays de maniere aléatoire
			do{					
				Random random = new Random();
				index = random.nextInt(data.length);
			} while (indexesAlreadyTaken.contains(index));
			
			indexesAlreadyTaken.add(index);
			
			String pays = data[index][0];
			String capitale = data[index][1];
				
			//Demander à l'utilisateur d'entrer la capitale de ce pays
			String questionText = String.format("Quelle est la capitale de ce pays: %s?", pays);
			questions.add(new Question(questionText, capitale));
		}
		
		return questions;
	}
	
	static String[][] getData(){
		String[][] data = {
			{"Guinée", "Conakry"},
			{"Sénégal", "Dakar"},
			{"Côte d'ivoire", "Yamoussoukro"},
			{"Mali", "Bamako"},
			{"Sierra leone", "Freetown"},
			{"Liberia", "Monrovia"},
			{"Gambie", "Banjul"},
			{"Guinée-Bissau", "Bissau"}
		};
		return data;
	}
}
