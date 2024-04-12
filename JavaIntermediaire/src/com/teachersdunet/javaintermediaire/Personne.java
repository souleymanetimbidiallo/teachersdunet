package com.teachersdunet.javaintermediaire;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private static int nombreTotalDePersonnes = 0;// Variable statique
	public static final int NOMBRE_MAX_YEUX = 2; //Constante

	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
		nombreTotalDePersonnes++;
	}

	public String full_name(String debut){
		return debut+" "+nom+" "+prenom;
	}

	public String full_name(){
		return "Je suis "+nom+" "+prenom;
	}
	
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if(age<18){
			throw new IllegalArgumentException("Interdit au moins de 18 ans !");
		}else{
			this.age = age;
		}
	}
}