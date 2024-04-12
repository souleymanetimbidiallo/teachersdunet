package com.teachersdunet.javaintermediaire;

public class CompteBancaire{
	private String nom;
	private String code;
	private int solde;
	
	public CompteBancaire(){
		this.nom = "inconnu";
		this.code = "CBXX";
		this.solde = 0;
	}
	public CompteBancaire(String nom, String code, int solde){
		this.nom = nom;
		this.code = code;
		this.solde = solde;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		
		return String.format("Compte bancaire: %s appartenant à %s de "
				+ "solde actuel: %d FG", code, nom, solde);
	}
}