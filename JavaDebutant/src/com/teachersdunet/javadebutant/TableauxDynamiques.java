package com.teachersdunet.javadebutant;

import java.util.ArrayList;
import java.util.Scanner;

public class TableauxDynamiques {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		/*Déclaration d'un tableau dynamique*/
		ArrayList<Integer> tab = new ArrayList<>();
		
		//Utilisation d'un type évolué:
		System.out.println(Double.parseDouble("48.64"));
		
		//Affiche la taille du tableau:
		System.out.println(tab.size());
		
		//Ajoute un élément au tableau en connaissant l'indice:
		tab.add(10);
		tab.add(20);
		tab.add(30);
		tab.add(40);
		
		//Modifie un élément du tableau en connaissant l'indice:
		tab.set(0, 14);
		
		//Afficher un élément du tableau en connaissant l'indice:
		System.out.println(tab.get(2));
		for(int elem: tab)
			System.out.println(elem);
		
		//Vérifier si le tableau est vide:
		if(tab.isEmpty()){
			System.out.println("le tableau est vide");
		}else{
			System.out.println(tab.get(2));
		}
		
		//Vérifier si une valeur existe dans le tabeau:
		System.out.println(tab.contains(20));
		
		//Recuperer l'indice de la 1ere occurence de la valeur:
		System.out.println(tab.indexOf(40));
		
		//supprimer un élément du tableau en connaissant l'indice:
		tab.remove(1);
		
		//Supprimer tous les éléments d'un tableau:
		tab.clear();
	}

}
