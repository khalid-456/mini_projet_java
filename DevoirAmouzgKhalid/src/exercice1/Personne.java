package exercice1;
import java.util.*;
public abstract class Personne {
    protected String nom;
	protected String prenom;
	protected String adresse;
	protected static int nbPersonnes;
	protected int numero;
    public static ArrayList<Personne> listePersonnes=new ArrayList<>();
	
	public Personne(String nom,String prenom,String adresse){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		listePersonnes.add(this);
		numero=nbPersonnes++;
	}
	public static ArrayList<Personne> getListePersonnes() {
		return listePersonnes;
	}
	public static void setListePersonnes(ArrayList<Personne> listePersonnes) {
		Personne.listePersonnes = listePersonnes;
	}
	public abstract String getCategorie();
	public static void nbPersonneCategorie() {
		nbPersonnes=Etudiant.getNbEtudiant()+Enseignant.getNbEnseignant()+Secritaire.getNbSecritaire();
		
		System.out.println("le nombre totale des personnes est "+nbPersonnes);
		System.out.println(Etudiant.getNbEtudiant()+" etudiants"+"\n"+Enseignant.getNbEnseignant()+" enseignants"+"\n"+Secritaire.getNbSecritaire()+" secritaire");
			
	}
	public void ajouterPersonne(Personne p) {
		listePersonnes.add(p);
	}
    public void supprimerPersonne(Personne p) throws ExceptionListVide, ExceptionPersonneNonTrouve{
   
    	if(listePersonnes.isEmpty() == true) throw new ExceptionListVide(); 
    	if(listePersonnes.contains(p)==false)  throw new ExceptionPersonneNonTrouve();    
    	
    	
    	
    	listePersonnes.remove(p);
    	}   
	
    public static void affichePersonnes() {
    	for(Personne pe : listePersonnes) {
			System.out.println(pe);}
    	
    }
    public static void afficheEtudiantDiplome(String diplome) {
    	for(Personne pe: listePersonnes) {
    		if(pe instanceof Etudiant)
        	    if(((Etudiant)pe).getDiplome().equalsIgnoreCase(diplome)) System.out.println(pe);
    	
    	}}
    public static void afficheEnseignantSpecialite(String specialite) {
    	for(Personne pe: listePersonnes) {
    		if(pe instanceof Enseignant)
    	    if(((Enseignant)pe).getSpecialite().equalsIgnoreCase(specialite)) System.out.println(pe);
    	
    }
    	
    }
	
		
		
		
}
