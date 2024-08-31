package exerciceSalle;

public class Salle {

private String titre;
private double prixBillet;
private int nbPlaces;
private int nbPlaceTN;
private int nbPlaceTR;

public Salle(String titre,int nbPlaces,double prixBillet) {
	this.titre=titre;
	this.nbPlaces=nbPlaces;
	this.prixBillet=prixBillet;
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public double getPrixBillet() {
	return prixBillet;
}

public void setPrixBillet(double prixBillet) {
	this.prixBillet = prixBillet;
}

public int getNbPlaces() {
	return nbPlaces;
}

public void setNbPlaces(int nbPlaces) {
	this.nbPlaces = nbPlaces;
}
public int nbPlacesDispo() {
	
return  nbPlaces-nbPlaceTR-nbPlaceTN;
	
}
public void vendrePlaces(int nbre,boolean tarifRed) {
	double prixT;

	if( nbre>nbPlacesDispo()) {
		System.out.println("la vente est impossible");
	}else {
		
	if(tarifRed==true) {
		
		prixT=nbre*prixBillet*0.8;
		System.out.println("le prix totale à payer est:"+prixT);
		nbPlaceTN+=nbre;
	}
	else {
		
		prixT=nbre*prixBillet;
        System.out.println("le prix totale à payer est:"+prixT);
        nbPlaceTR+=nbre;
        }
	}
	}
	public void remiseAzero() {

		nbPlaceTN=0;
		nbPlaceTR=0;
		}
	public double chiffreAff() {
		return(nbPlaceTN+nbPlaceTR)*prixBillet;
	}
	public double tauxRemplissage() {
		return 100*(nbPlaceTN+nbPlaceTR)/nbPlaces;
		
	}
	public String toString() {
		
	
		return "film joué:"+titre+"\n"+
		"prix du billet:"+prixBillet+"\n"+
				"nombre de plces:"+nbPlaces+"\n"+
		"nombre places tarif normal:"+nbPlaceTN+"\n"+
				"nombre places tarif reduit:"+nbPlaceTR+"\n"+
		"places disponibles:"+nbPlacesDispo()+"\n"+
				"taux de remplissage:"+tauxRemplissage()+"\n"+
		"chiffre d'affaires:"+chiffreAff();
	}
}	
	
		 
		
	
		
		
		
	


