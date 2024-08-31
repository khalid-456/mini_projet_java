package exercice2;
import java.util.*;
public class MonAgenda {

	public static void main(String[] args) {
      Agenda ag = new Agenda("Khalid", "Amouzg");
      Evenement a = new EvenementChronique("Entretien", "cabinet", 2023, "Mardi", "10 janvier",(float) 10.3, 12, ag, 3, 2);
      Evenement b = new EvenementChronique("visite", "centre", 2023, "lundi","11 janvier", 9, 11, ag, 2, 2);
      Evenement c = new EvenementChronique("activiteSsport","casa",  2023, "dimanche", "12 janvier", 7, 8, ag, 3, 2);
      Evenement d = new EvenementPonctuel("anniv","agadir", 2023, "jeudi","13 janvier", 17, 18, ag);
      Evenement e = new EvenementPonctuel("occasion","la maison", 2023, "mercredi","14 janvier", 16, 19, ag);
     
   
     
     
      try {
       	  ag.ajouterEvenement(a);
       	     System.out.println("ajoute confirmer");
       	      }
       	     catch(ExceptionRecontreEvenement er) {
       	    	 er.afficheErreur();
       	     }      
         try {
    	     ag.ajouterEvenement(b);
    	     System.out.println("ajoute confirmer");
    	      }
    	     catch(ExceptionRecontreEvenement er) {
    	    	 er.afficheErreur();
    	     }   
         try {
    	     ag.ajouterEvenement(c);
    	     System.out.println("ajoute confirmer");
    	      }
    	     catch(ExceptionRecontreEvenement er) {
    	    	 er.afficheErreur();
    	     }      
         try {
     	     ag.ajouterEvenement(d);
     	     System.out.println("ajoute confirmer");
     	      }
     	     catch(ExceptionRecontreEvenement er) {
     	    	 er.afficheErreur();
     	     }   
          try {
     	     ag.ajouterEvenement(e);
     	     System.out.println("ajoute confirmer");
     	      }
     	     catch(ExceptionRecontreEvenement er) {
     	    	 er.afficheErreur();
     	     } 
      try {
   	      ag.supprimerEvenement(b);
   	      System.out.println("suppression effectuer");
   	      }
   	      catch(ExceptionListeVide er) {
   	    	  er.afficheErreur();  
	}
    
      ag.afficheEvenementsChronique();
       ag.afficheEvenementsPonctuel(); 
       System.out.println("affichage evenement cherchere");
      
      ag.afficheEvenementDuJour( 2023, "dimanche");
      
      }}
	

