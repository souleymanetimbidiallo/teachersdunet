package com.teachersdunet.javaintermediaire;

import java.util.Scanner;

public class HeritageTest {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		Carre c = new Carre("soul", 5);
		System.out.println(c.aire());
		clavier.close();
	}
}
