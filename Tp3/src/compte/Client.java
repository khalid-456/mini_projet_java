package tp3ex5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Client {
	private long numeroClient;
	private String nom;
	private String adresse;
	private ArrayList<Compte> comptes;
	// constructor
	public Client(long numeroClient, String nom, String adresse){
	this.numeroClient = numeroClient;
	this.nom = nom;
	this.adresse = adresse;
	this.comptes = new ArrayList<Compte>();
	}
	
// getters
	public long getNumeroClient() {
	return numeroClient;
	}
	public String getNom() {
	return nom;
	}
	public String getAdresse() {
	return adresse;
	}
	public ArrayList<Compte> getComptes(){
	return this.comptes;
	}
	// toString
	public String toString(){
	return "Numéro du client: "+ this.numeroClient +"\nNom du client: "+this.nom +
	"\nAdresse du client: "+ this.adresse;
	}
	// les methodes
	public void creerCompte(Compte cmp){
	this.comptes.add(cmp);
	}
	public void afficherInfoCompte(){
	for (Compte cmp : comptes) {
	System.out.println("Compte "+(comptes.indexOf(cmp)+1) +":"+ cmp);
	}
	}
}

