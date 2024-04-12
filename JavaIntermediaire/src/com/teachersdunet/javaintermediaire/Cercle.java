package com.teachersdunet.javaintermediaire;

public class Cercle extends Forme {
	private double rayon = 5;
	
	@Override
	public double aire() {
		return Math.PI * rayon * rayon;
	}
}
