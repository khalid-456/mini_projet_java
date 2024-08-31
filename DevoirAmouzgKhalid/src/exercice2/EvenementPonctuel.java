package exercice2;

public class EvenementPonctuel extends Evenement {

	public EvenementPonctuel(String titre, String lieu, int annee, String jour, String jourMois, float heureDebut,
			float heureFin, Agenda agenda) {
		super(titre, lieu, annee, jour, jourMois, heureDebut, heureFin, agenda);
		
	}
public String getTypeEvenement() {
	return"Evenement ponctuel";
	
}
}
