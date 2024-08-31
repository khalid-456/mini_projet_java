package tp3ex5;

public class CompteBoncaire {

	public static void main(String[] args) {
		Client c1 = new Client(123848,"Ismail ZAHIR", "KSAR SET TINEJDAD");
		
		c1.creerCompte(new Compte(500, 0));
		c1.creerCompte(new Compte(400, 102));
		//c1.creerCompte(new Compte());
		System.out.println(c1);
		System.out.println("***************************");

		System.out.println("le decouvert du compte est: "+
		c1.getComptes().get(0).getDecouvertMax());
		
		c1.getComptes().get(0).retirerMontant(1000);
		c1.afficherInfoCompte();
		

		}

	}

