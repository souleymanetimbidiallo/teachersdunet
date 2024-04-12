package com.teachersdunet.javadebutant;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class CapitalesGame {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		final int NUMBER_OF_QUESTIONS = 3;
		int index, score = 0;
		String pays, capitale, userAnswer;
		ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();
		char replayAnswer;
		String[][] data = getData();//récuperer les pays et capitales
		
		do {
			indexesAlreadyTaken.clear();			
			for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
				
				//Choisir un pays de maniere aléatoire
				do{					
					Random random = new Random();
					index = random.nextInt(data.length);
				} while (indexesAlreadyTaken.contains(index));
				indexesAlreadyTaken.add(index);
				pays = data[index][0];
				capitale = data[index][1];
				
				//Demander à l'utilisateur d'entrer la capitale de ce pays
				System.out.printf("Quelle est la capitale de ce pays: %s?\n", pays);
				userAnswer = clavier.nextLine();
				
				//Comparer les réponses
				if(capitale.equalsIgnoreCase(userAnswer)){
					System.out.println("Bonne réponse!");
					score++;
				}else{
					System.out.printf("Mauvaise réponse! Il fallait répondre %s\n", capitale);
				}
				System.out.println();
			}
			//Afficher le verdict
			System.out.printf("\nQuiz terminé. << Le score est: %d/%s \n>>", score, NUMBER_OF_QUESTIONS);
			
			do {
				System.out.println("Voulez-vous rejouer? (O/N)");
				replayAnswer = clavier.nextLine().toLowerCase().charAt(0);
				System.out.println();
			} while (replayAnswer != 'o' && replayAnswer != 'n');
		} while (replayAnswer == 'o');
		
		System.out.println("Bye Bye...");
		System.out.println("Appuyer sur la touche <Entree> pour quitter.");
		clavier.nextLine();
		clavier.close();
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