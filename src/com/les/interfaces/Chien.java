package com.les.interfaces;

public class Chien extends Canin implements Rintintin {
	
	Chien(){		
	}
	
	Chien(String couleur, int poids){
		this.couleur=couleur;
		this.poinds=poids;
	}
	
	void crier() {
		System.out.println("Je hurle à la Lune en faisant ouhouh !"); 
	}
	
	 public void faireCalin() {
		    System.out.println("Je te fais un GROS CÂLIN");               
		  }

	 public void faireLeBeau() {
		    System.out.println("Je fais le beau !");
		  }

	 public void faireLechouille() {
		    System.out.println("Je fais de grosses léchouilles...");
		  } 
}
	
