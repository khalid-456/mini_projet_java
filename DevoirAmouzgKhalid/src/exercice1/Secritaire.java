package exercice1;

import java.util.Scanner;

public class Secritaire extends Personne {
	private int numeroBureau;
	private static int nbSecritaire;
	private int numero;
	
public Secritaire(String nom,String prenom,String adresse,int numeroBureau) {
	super(nom, prenom, adresse);
	this.numeroBureau=numeroBureau;
	numero=nbSecritaire++;
}


public int getNumeroBureau() {
	return numeroBureau;
}


public void setNumeroBureau(int numeroBureau) {
	this.numeroBureau = numeroBureau;
}


public static int getNbSecritaire() {
	return nbSecritaire;
}

public String getCategorie() {
	return "Secritaire";
}
public String toString() {
   return"la secritaire "+nom+" "+prenom+" de l'adresse "+adresse+" son numero de Bureau "+numeroBureau;

}
}
