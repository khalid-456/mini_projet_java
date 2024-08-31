package exercice3;

import java.util.*;

public class Facture {
	private int numFac;
	private String date;
	private static double staticTva;
	private ArrayList<LigneCommande> listComm = new ArrayList<LigneCommande>();
	public Facture(int numFac, String date, double staticTva) {
		this.numFac=numFac;
		this.date=date;
		this.staticTva=staticTva;
		
		
		
		
	}
	public ArrayList<LigneCommande> getListComm() {
		return listComm;
	}
	public void setListComm(ArrayList<LigneCommande> listComm) {
		this.listComm = listComm;
	}
	public int getNumFac() {
		return numFac;
	}
	public void setNumFac(int numFac) {
		this.numFac = numFac;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public static double getStaticTva() {
		return staticTva;
	}
	public static void setStaticTva(double staticTva) {
		Facture.staticTva = staticTva;
	}
	
	public void ajouterLigneCommande(LigneCommande lc) {
		
		listComm.add(lc);
}
    public void afficherFacture() {
      
       System.out.println("\t\t\t\t\t\t\t"+"TVA :"+staticTva);
       System.out.println("------------------------------------------------------------------------------");
       System.out.println("Code \t Designation \t Prix HT \t Quantite \t PrixTTC");
       System.out.println("------------------------------------------------------------------------------");
       double s=0;
       for(LigneCommande cc : listComm ) {
    	   cc.afficherCommande();
    	    s += cc.getPrixTTC();
    	   }
       System.out.println("------------------------------------------------------------------------------");
       System.out.println("\t\t\t\t\t "+"Totale :\t "+s);
       System.out.println("------------------------------------------------------------------------------");
    	   
       }
       
    
    
		
	}
	
