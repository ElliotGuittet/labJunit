package labJunit.app;

public class CompteBancaire {
    public double soldeCompte;

    public CompteBancaire(double solde) {
        soldeCompte = solde;
    }

    public double debiterSolde(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant ne peut pas être négatif");
        } else {
            double newSolde = soldeCompte - montant;

            return newSolde;
        }
    }

    public double crediterSolde(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant ne peut pas être négatif");
        } else {
            double newSolde = soldeCompte + montant;

            return newSolde;
        }
    }
}
