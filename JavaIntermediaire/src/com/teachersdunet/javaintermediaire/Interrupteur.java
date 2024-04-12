package com.teachersdunet.javaintermediaire;

public class Interrupteur {
	private boolean position;
	private Lampe lampe;
	
	public Interrupteur(Lampe lampe){
		this.lampe = lampe;
		this.position = lampe.estAllume();
	}
	
	public String getPosition(){
		if(position == true){
			return "On";
		}else{
			return "Off";
		}
	}
	
	public void changerPostion(){
		lampe.modifierEtat();
		position = lampe.estAllume();
	}
}
