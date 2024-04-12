package com.teachersdunet.javadebutant;

import java.util.Scanner;

public class JeuPlusOuMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		int nombre_secret, nombre_saisi;
		nombre_secret = (int) (Math.random()*99)+1;
		do{
			System.out.print("Entrer un nombre (1-100) : ");
			nombre_saisi = clavier.nextInt();
			if(nombre_saisi>nombre_secret){
				System.out.println("Votre nombre est trop grand...");
			}else if(nombre_saisi<nombre_secret){
				System.out.println("Votre nombre est trop petit...");
			}else{
				System.out.println("Félicitations!");
			}
		}while(nombre_saisi != nombre_secret);
		
		clavier.close();
	}

}
