package compte;



	import java.util.Scanner;
	public class Compte {
	private static int compteur = 1000;
	private int numeroCompte;
	private double soldeCompte;
	private static double decouvertMax , debitMax;
	static {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrer le decouvert maximal du compte:");
	decouvertMax = sc.nextDouble();
	System.out.println("Entrer le debit maximal autoris� du compte");
	debitMax = sc.nextDouble();
	sc.close();

	decouvertMax = 2000;
	debitMax = 4000;
	} 
	// constructor
	public Compte(){
		
	this.soldeCompte = 0;
	
	}
	// constructor
	public Compte(double soldeCompte , int numeroCompte){
		this.numeroCompte = compteur++;
	this.soldeCompte = soldeCompte;
	}
	// getters
	public int getNumeroCompte(){
	return this.numeroCompte;
	}
	public double getSoldeCompte(){
	return this.soldeCompte;
	}
	public static double getDecouvertMax() {
	return decouvertMax;
	}
	public static double getDebitMax() {
	return debitMax;
	}
	// methodes
	public double decouvertCompte(){
	if (this.soldeCompte >= 0){
	return 0;
	}else{
	return Math.abs(this.soldeCompte);
	}
	}
	public void ajouterMontant(double montant){
	if (montant>0 ){
	this.soldeCompte += montant;
	}else{
	System.out.println("Le montant entr� est n�gatif ou nul !");
	}
	}
	public void retirerMontant(double montant){
	if (montant>0 ){
	if(soldeCompte-montant <= decouvertMax){
	this.soldeCompte -= montant;
	}else{
		System.out.println("Vous avez d�passer le d�couvert maximal");
		}
		}else{
		System.out.println("Le montant entr� est n�gatif ou nul !");
		}
		}
		public String toString(){
		return "Numero du compte :  "+this.numeroCompte +" -- Solde du compte : "+this.soldeCompte +" DH";
		
		}
		}
