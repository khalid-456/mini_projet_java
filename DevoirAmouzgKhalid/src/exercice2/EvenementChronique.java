package exercice2;

public class EvenementChronique extends Evenement {
	private int periode;
	private int nbreSeances;

	public EvenementChronique(String titre, String lieu, int annee, String jour, String jourMois, float heureDebut,
			float heureFin, Agenda agenda, int periode, int nbreSeances) {
		super(titre, lieu, annee, jour, jourMois, heureDebut, heureFin, agenda);
		this.periode=periode;
		this.nbreSeances=nbreSeances;
	}

	public int getPeriode() {
		return periode;
	}

	public void setPeriode(int periode) {
		this.periode = periode;
	}

	public int getNbreSeances() {
		return nbreSeances;
	}

	public void setNbreSeances(int nbreSeances) {
		this.nbreSeances = nbreSeances;
	}
	public String getTypeEvenement() {
		return"Evenement chronique";
		
	}
	public String toString() {
		return super.toString()+"\n"+
	"Periode:"+periode+" semaines"+"\n"+
	"nombre de seances par semaines:"+nbreSeances;
	}

}
