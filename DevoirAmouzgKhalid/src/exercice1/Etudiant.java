package exercice1;

import java.util.Scanner;

public class Etudiant extends Personne {
	private String diplome;
	private static int nbEtudiant;
	private int numero;
	
	 public Etudiant(String nom,String prenom,String adresse,String diplome) {
			super(nom, prenom, adresse);
			this.diplome=diplome;
			numero = nbEtudiant++;
	}
	 
	 
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public static int getNbEtudiant() {
		return nbEtudiant;
	}
	public String getCategorie() {
		return "etudiant";
	}
	public String toString() {
	   return"L'etudiant "+nom+" "+prenom+" de l'adresse "+adresse+" est en cours de preparer "+diplome;
} }

	
	
	
	
	
	
	
	
	
	
	
