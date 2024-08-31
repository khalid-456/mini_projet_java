package exercice1;

import java.util.Scanner;

public class Enseignant extends Personne {
	private String specialite;
	private static int nbEnseignant;
	private int numero;
	
public Enseignant(String nom,String prenom,String adresse,String specialite) {
	super(nom, prenom, adresse);
	this.specialite=specialite;
	numero=nbEnseignant++;
}

public String getSpecialite() {
	return specialite;
}

public void setSpecialite(String specialite) {
	this.specialite = specialite;
}

public static int getNbEnseignant() {
	return nbEnseignant;
}
public String getCategorie() {
	return "enseignant";
}
public String toString() {
   return"L'enseignant "+nom+" "+prenom+" de l'adresse "+adresse+" enseigne la "+specialite;

}
}


