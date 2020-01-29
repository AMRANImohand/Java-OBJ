package com.classes.abstraites;

abstract class Animal {
	protected int poinds;
	protected String couleur;  
	
	protected void manger() {
	System.out.println("Je mange de la viande."); 
	}
	
	protected void boire() {
	System.out.println("Je bois du l'eau."); 
		}

	abstract void deplacement(); 
	
	abstract void crier();
	
	public String toString() {	
	String str = "Je suis un objet de la classe" + this.getClass() + "Je suis " + this.couleur + "je pèse" + this.poinds;
	return str;
		
	}
			
}
