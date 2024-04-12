package com.teachersdunet.javaintermediaire;

import javax.swing.JOptionPane;

public class BoiteDialogueTest {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Bonjour les amis ...");
		String nom = JOptionPane.showInputDialog("Quel est votre nom:");
		String message = String.format("Salut %s ! et Bienvenue sur mon App", nom);
		JOptionPane.showMessageDialog(null, message);
		
	}

}
