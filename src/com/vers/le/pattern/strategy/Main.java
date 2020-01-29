package com.vers.le.pattern.strategy;

public class Main {
public static void main(String[] args) {
	  Personnage[] tPers = {new Guerrier(), new Civil(), new Sniper(), new Medecin()};
	  String[] tArmes = {"pistolet", "couteau", "fusil à pompe", "couteau"}; 

	  for(int i = 0; i < tPers.length; i++){
	    System.out.println("\nInstance de " + tPers[i].getClass().getName());
	    System.out.println("*****************************************");
	    tPers[i].combattre();
	    tPers[i].setArmes(tArmes[i]);
	    tPers[i].combattre();
	    tPers[i].seDeplacer();
	    tPers[i].soigner();
	  
/*Trop de code dupliqué dans certaines classes ! En plus, nous n'arrêtons pas 
 de modifier nos classes. */
	    }		
	}
}