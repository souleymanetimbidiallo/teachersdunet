package com.teachersdunet.javadebutant;

public class MethodePrintf {

	public static void main(String[] args) {
		System.out.printf("un entier: %d \n", 4);
		System.out.printf("en octal pour un entier: %o \n", 10);
		System.out.printf("en hexadecimal pour un entier: %x \n", 255);
		System.out.println();
		System.out.printf("un reel: %.2f \n", 4.5896);
		System.out.printf("en hexadecimal pour un reel: %a \n", 4.5);
		System.out.println();
		System.out.printf("une notation scientifique: %e \n", 345.6);
		System.out.printf("une notation meilleure pour les reels: %g \n", 345.6);
		System.out.println();
		System.out.printf("une caractere : %c \n", '+');
		System.out.printf("une caractere en Majuscules : %S \n", 'v');
		System.out.println();
		System.out.printf("une chaine en Minuscules : %s \n", "ma chaine de caracteres");
		System.out.printf("une chaine en Majuscules : %S \n", "ma chaine de caracteres");
		System.out.println();
		System.out.printf("Chargement � %d%% \n", 75);
	}

}
