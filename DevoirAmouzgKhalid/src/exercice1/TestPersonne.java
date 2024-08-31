package exercice1;
import java.util.*;
public class TestPersonne {
	public static void main(String[] args) throws ExceptionListVide {
		Personne a = new Enseignant("sadki","hssain","hay errachidia","language");
		Personne b = new Etudiant("ali","ansari","hay warda","licence");
		Personne c = new Secritaire("anissa","jamila","hay saada",17);
		Personne d = new Secritaire("anissa","fatiha","hay nahda",18);
		
		
		
        Personne.nbPersonneCategorie();
		
		Personne.affichePersonnes();
	
//			
		
			try {
			c.supprimerPersonne(c);
				 System.out.println("supression effectuer");
				}
					
				
						catch(ExceptionListVide er) {
							er.afficheErreur();
						}
				catch(ExceptionPersonneNonTrouve e) {
					e.afficheErreur();
				}
			try {
				c.supprimerPersonne(c);
					 System.out.println("supression effectuer");
					}
						
					
							catch(ExceptionListVide er) {
								er.afficheErreur();
							}
					catch(ExceptionPersonneNonTrouve e) {
						e.afficheErreur();
					}
				
			
//		
//		Personne.affichePersonnes();
//			
//			Personne.afficheEtudiantDiplome("licence");
//			
//			
//	       Personne.afficheEnseignantSpecialite("language");

}}
