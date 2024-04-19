package labJunit.app;

public class Main {

	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();
		CompteBancaire cb = new CompteBancaire(150);
		
		double s = c.somme(10, 20);
		System.out.println("La somme de 10 et 20 : " + s);
		
		double p = c.produit(10, 20);
		System.out.println("Le produit de 10 et 20 : " + p);

		double sd = cb.debiterSolde(15);
		System.out.println("Le nouveau solde est de : " + sd);

		double sc = cb.crediterSolde(50);
		System.out.println("Le nouveau solde est de : " + sc);

	}

}
