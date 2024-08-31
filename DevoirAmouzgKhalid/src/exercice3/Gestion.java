package exercice3;

public class Gestion {

	public static void main(String[] args) {
		Client c = new Client(77, "hamid", "Boutalamine, Errachidia");
		Produit p1 = new Produit(11, "table", 3000);
		Produit p2 = new Produit(22, "chaise", 250);
		Produit p3 = new Produit(33, "pc", 9000);
		
        Facture f = new Facture(1234, " 20/11/2019", 20);
       
        LigneCommande l1 = new LigneCommande(f, p1, 5);
        LigneCommande l2 = new LigneCommande(f, p2, 8);
        LigneCommande l3 = new LigneCommande(f, p3, 2);
        
      
        f.ajouterLigneCommande(l1);
        f.ajouterLigneCommande(l2);
       f.ajouterLigneCommande(l3);
       
       
        c.ajouterFacture(f);
        // Affichage;
        
        System.out.println("Facture numero : "+f.getNumFac()+"\t\t\t\t\t"+"Date : "+f.getDate());
        c.afficheClient();
        f.afficherFacture();
        
        
        
        
        
        
        
}
}