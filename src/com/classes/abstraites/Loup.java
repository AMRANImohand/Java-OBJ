package com.classes.abstraites;

public class Loup extends Canin {
	
	Loup(){		
	}
	
	Loup(String couleur, int poids){
		this.couleur=couleur;
		this.poinds=poids;
	}
	
	void crier() {
		System.out.println("Je hurle à la Lune en faisant ouhouh !"); 
	}

}
