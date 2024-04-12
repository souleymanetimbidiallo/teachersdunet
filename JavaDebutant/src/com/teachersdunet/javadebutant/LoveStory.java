package com.teachersdunet.javadebutant;

import java.util.Random;

public class LoveStory {

	public static void main(String[] args) {
		System.out.println("Do you know that I love you my honey?");
		Random random = new Random();
		boolean success = random.nextBoolean();
		System.out.println("Hmmm...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(success){
			System.out.println("I love you too honey");
		}else{
			System.out.println("What are you saying? How dare you?");
		}
		
	}

}
