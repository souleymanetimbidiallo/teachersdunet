package com.teachersdunet.javadebutant;

import java.util.Scanner;


public class AstucesPrecisions {

	public static void main(String[] args) {
		int a = 1_000_000;
		System.out.println(a);
		Scanner clavier = new Scanner(System.in);
		
		/*Astuce pour la gerer la saisie d'une chaine apr�s un entier en java*/
		int n = 0;
		String str1 = "", str2 = "";
		System.out.print("Entrer un nombre: ");
		n = clavier.nextInt();
		clavier.nextLine();	//Mettre clavier.nextLine avant la saisie d'une chaine de caractere
		System.out.print("Entrer une chaine: ");
		str1 = clavier.nextLine();
		System.out.print("Entrer une chaine: ");
		str2 = clavier.nextLine();
		System.out.println("n = "+n);
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		
	}

}
