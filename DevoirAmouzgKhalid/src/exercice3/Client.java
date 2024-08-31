package exercice3;

import java.util.ArrayList;

public class Client {
	private int num;
	private String nom;
	private String adresse;
	private ArrayList<Facture> listeFacture;
	public Client(int num, String nom, String adresse) {
		this.num=num;
		this.nom=nom;
		this.adresse=adresse;
		this.listeFacture=new ArrayList<Facture>();
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public ArrayList<Facture> getListeFacture() {
		return listeFacture;
	}
	public void setListeFacture(ArrayList<Facture> listeFacture) {
		this.listeFacture = listeFacture;
	}
	public void ajouterFacture(Facture f) {
		listeFacture.add(f);
	}
	public void afficheClient() {
		System.out.println("Client : "+nom+"\n"+"adresse : "+adresse);
	}
	

}
