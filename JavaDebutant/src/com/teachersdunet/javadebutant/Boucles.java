package com.teachersdunet.javadebutant;

import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrer un nombre: ");
		int nb = clavier.nextInt();
		
		//Boucle for:
		for(int i=1; i<=10; i++){
			System.out.println(nb+" * "+i+" = "+(nb*i));
		}
		
		//Boucle while:
		int i=1;
		while(i<=10){
			System.out.println(nb+" * "+i+" = "+(nb*i));
			i++;
		}
		
		//Boucle do...while:
		int j = 1;
		do{
			System.out.println(nb+" * "+j+" = "+(nb*j));
			j++;
		}while(j<=10);
		clavier.close();
	}

}
