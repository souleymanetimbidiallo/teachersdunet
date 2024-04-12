package com.teachersdunet.javaintermediaire;

public class Lampe {
	private boolean etat;
	
	public Lampe(boolean etat){
		this.etat = etat;
	}
	
	public boolean estAllume(){
		return etat;
	}
	public void modifierEtat(){
		this.etat = !this.etat;
	}
}
