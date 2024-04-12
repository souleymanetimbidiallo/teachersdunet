package com.teachersdunet.javadebutant;

import java.util.Scanner;

public class Angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Entrer l'angle en dégré: ");
		int degre = clavier.nextInt();
		double radian = degre *(Math.PI/180);
		
		
		System.out.println("Le sinus de " + degre + "° est: " + Math.sin(radian));
		System.out.println("Le cosinus de " + degre + "° est : " + Math.cos(radian));
		
		clavier.close();
	}

}
