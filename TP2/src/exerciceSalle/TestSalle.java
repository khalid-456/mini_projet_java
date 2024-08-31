package exerciceSalle;

public class TestSalle {

	public static void main(String[] args) {
	Salle s = new Salle ("prison",60,70);
	s.vendrePlaces(20, true);
	s.vendrePlaces(10, false);
	System.out.println(s);
	System.out.println();
	s.remiseAzero();
	System.out.println(s);

	}

}
