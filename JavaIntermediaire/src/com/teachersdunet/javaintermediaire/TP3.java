package com.teachersdunet.javaintermediaire;

public class TP3 {
	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.additionner(6, 4);
		calculatrice.soustraire(2, 3);
		calculatrice.multiplier(2, 3);
		System.out.println(calculatrice.getResultat());
	}
}