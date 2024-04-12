package com.teachersdunet.javaintermediaire;

import javax.swing.JOptionPane;

public class TP1 {

	public static void main(String[] args) {
		String valeur; 
		valeur = JOptionPane.showInputDialog("Entrer le premier nombre: ");
		int nbre1 = Integer.parseInt(valeur);
		valeur = JOptionPane.showInputDialog("Entrer le second nombre: ");
		int nbre2 = Integer.parseInt(valeur);
		String message = String.format("La somme de %d et %d est: %d", nbre1, nbre2, (nbre1+nbre2));
		JOptionPane.showMessageDialog(null, message);
		
	}
}
