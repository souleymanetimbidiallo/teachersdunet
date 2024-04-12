package com.teachersdunet.javadebutant;

import java.util.Scanner;

public class DurationTest {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		long startTime = System.currentTimeMillis();
		clavier.nextLine();
		long endTime = System.currentTimeMillis();
		long timeElapsedInSecond = (endTime - startTime) / 1000;
		System.out.println("Le temps ecoule est: " + timeElapsedInSecond + " secondes");
		
		clavier.close();
	}

}
