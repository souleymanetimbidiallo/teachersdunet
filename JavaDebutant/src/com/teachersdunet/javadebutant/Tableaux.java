package com.teachersdunet.javadebutant;

public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Déclaration d'un tableau:
		int[] tab1;
		
		//Déclaration et initialisation
		int tabInt[] = {10, 40, 25, 70};
		char[] tabChar = {'a' ,'s', 't'};
		double[] tabDouble = new double[4];
		
		//Manipulation:
		
		System.out.println(tabInt[2]);
		
		tabInt[0]=37;
		System.out.println(tabInt);
		for(int i = 0; i<tabInt.length; i++){
			System.out.println("L'element N°"+(i+1)+" est:"+tabInt[i]);
		}
		//Boucle for...in
		for(char var : tabChar){
			System.out.println(var);
		}
	}

}
