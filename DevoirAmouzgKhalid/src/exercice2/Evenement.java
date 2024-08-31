package exercice2;

public abstract class  Evenement {
	protected String titre;
	protected String lieu;
	protected int annee;
	protected String jour;
	protected String jourMois;
	protected float heureDebut;
	protected float heureFin;
	protected Agenda agenda;
	public Evenement( String titre, String lieu, int annee, String jour,String jourMois, float heureDebut, float heureFin, Agenda agenda ){
	this.titre=titre;
	this.lieu=lieu;
	this.annee=annee;
	this.jour=jour;
	this.jourMois=jourMois;
	this.heureDebut=heureDebut;
    this.heureFin=heureFin;
    this.agenda=agenda;
    
	}
 // getters setters
	public abstract String getTypeEvenement();
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getJourMois() {
		return jourMois;
	}
	public void setJourMois(String jourMois) {
		this.jourMois = jourMois;
	}
	public float getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(float heureDebut) {
		this.heureDebut = heureDebut;
	}
	public String toString() {
		return "Titre:"+titre+"("+getTypeEvenement()+")"+"\n"+
	    "Lieu:"+lieu+"\n"+
		"Date:"+jour+""+jourMois+""+annee+"\n"+
	    "Heure debut:"+heureDebut+"\n"+
		"Heure fin:"+heureFin;
	
		
	
	
}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}}
    
    
    
    
    
    
    