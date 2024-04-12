package com.teachersdunet.javadebutant;

public class Conditions {
	public static void main(String[] args){
		int a=4,b=4,c=7;
		
		/*Les conditions:*/
		if(a==b){
			if(b==c)
				System.out.println("Les trois valeurs sont identiques");
			else
				System.out.println("La valeur de b est différente de c");
		}else
			System.out.println("La valeur de a est différent de b");
		
		/*les opérateurs logiques*/
		if(a==b||b==c){
			System.out.println("Deux valeurs sont au moins identitique");
		}
		
		/*utilisations des booléens*/
		int x =5, y=5;
		boolean test1 = x == y;
		boolean test2 = x != y;
		System.out.println(test1);
		System.out.println(test2);
		
		/*l'utilisation de switch:*/
	}

}
