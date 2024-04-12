package com.teachersdunet.javaintermediaire;

public class TP2 {
	public static void main(String[] args) {
		Lampe lampe = new Lampe(false);
		Interrupteur interrupeteur = new Interrupteur(lampe);
		
		System.out.println(lampe.estAllume());
		System.out.println(interrupeteur.getPosition());
		
		interrupeteur.changerPostion();

		System.out.println(lampe.estAllume());
		System.out.println(interrupeteur.getPosition());
	}
	
}
