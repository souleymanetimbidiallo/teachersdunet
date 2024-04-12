package com.teachersdunet.javaintermediaire;

public class PersonneTest {

	public static void main(String[] args) {
		Personne p1 = new Personne("Diallo", "Souleymane");
		Personne p2 = new Personne("Bah", "Fatoumata");
		//System.out.println(Personne.getNombreTotalDePersonnes()+" personnes");
		//System.out.println(Personne.NOMBRE_MAX_YEUX);
		System.out.println(p2.full_name("Je m'appelle"));
		try {
			p1.setAge(19);
		} catch (IllegalArgumentException e) {
			System.out.println("Erreur: "+e.getMessage());
		}
		
	}

}
