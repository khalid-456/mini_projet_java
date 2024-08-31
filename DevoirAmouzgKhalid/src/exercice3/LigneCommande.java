package exercice3;

public class LigneCommande {
	private int quantite;
	private Facture f;
	private Produit p;
	public LigneCommande(Facture f,Produit p, int quantite  ){
		this.f=f;
		this.p=p;
		this.quantite=quantite;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Facture getF() {
		return f;
	}
	public void setF(Facture f) {
		this.f = f;
	}
	public Produit getP() {
		return p;
	}
	public void setP(Produit p) {
		this.p = p;
	}
	public double getPrixTTC() {
		return p.getPrix()*quantite+((p.getPrix()*quantite*f.getStaticTva())/100);
	}
	public void afficherCommande() {
		System.out.println(p.getCode()+"\t "+p.getNom()+"\t\t "+p.getPrix()+"\t\t "+quantite+"\t\t "+this.getPrixTTC());
		
		
		
	}	
	
		
		
		
		
		
		
		
		
		


	}

