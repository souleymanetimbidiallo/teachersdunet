package com.teachersdunet.javaintermediaire;

public class Triangle extends Forme {
	private double base = 4;
	private double hauteur = 2;
	
	@Override
	public double aire() {
		return base * hauteur * 0.5;
	}
	
}