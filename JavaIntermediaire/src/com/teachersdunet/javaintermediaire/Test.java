package com.teachersdunet.javaintermediaire;

import java.util.ArrayList;

public class Test {
	
	public static ArrayList<String> importantData;
	public int b;
	
		static {
			importantData = getDataFromInternet();
		}
	
	public Test() {
		b = 3;
	}

	private static ArrayList<String> getDataFromInternet() {
		System.out.println("Dowloading data from internet...");
		ArrayList<String> data = new ArrayList<>();
		data.add("Google");
		data.add("Facebook");
		data.add("Twitter");
		data.add("Youtube");
		return data;
	}
}