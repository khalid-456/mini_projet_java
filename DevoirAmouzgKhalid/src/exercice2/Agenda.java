package exercice2;
import java.util.*;
public class Agenda {
private String nom;
private String prenom;
private ArrayList<Evenement> evenements;
public Agenda(String nom,String prenom) {
	this.nom=nom;
	this.prenom=prenom;
    this.evenements=new ArrayList<>();
}//getters setters
public void ajouterEvenement(Evenement e) throws ExceptionRecontreEvenement {
	for(Evenement ev : evenements) {
	if(e.getLieu()==ev.getLieu() && e.getHeureDebut()==ev.getHeureDebut() && e.getJourMois()==ev.getJourMois() && e.getAnnee()== ev.getAnnee())
		throw new ExceptionRecontreEvenement();
	}
	evenements.add(e);
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public void supprimerEvenement(Evenement e) throws ExceptionListeVide {
	if(evenements==null) throw new ExceptionListeVide();
	evenements.remove(e);

}
 
public void afficheEvenementDuJour(int annee, String jour) {
	for(Evenement ev :evenements) {
		if(ev.getAnnee()== annee && ev.getJour()==jour) System.out.println(ev);
			
	}}
	public void afficheTousLesEvenements() {
		for(Evenement ev :evenements) {
			 System.out.println(ev);
				
	}}
	public void afficheEvenementsPonctuel() {
		for(Evenement ev :evenements) {
			if(ev.getTypeEvenement()== "Evenement ponctuel") System.out.println(ev);
				
	}}
	public void afficheEvenementsChronique() {
		for(Evenement ev :evenements) {
			if(ev.getTypeEvenement()== "Evenement chronique") System.out.println(ev);
				
	}
	
	


}}
